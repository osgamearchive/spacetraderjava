package spacetrader.gui;

import spacetrader.guifacade.DialogResult;
import spacetrader.guifacade.GuiWindow;
import jwinforms.Bitmap;
import jwinforms.Image;
import jwinforms.WinformPane;
import spacetrader.enums.AlertType;
import spacetrader.enums.CargoBuyOp;
import spacetrader.enums.CargoSellOp;
import spacetrader.enums.EncounterResult;
import spacetrader.enums.ShipType;
import spacetrader.guifacade.GuiEngine.AlertGui;
import spacetrader.guifacade.GuiEngine.CargoGui;
import spacetrader.guifacade.GuiEngine.CheatGui;
import spacetrader.guifacade.GuiEngine.ImageProvider;
import spacetrader.guifacade.GuiEngine.ImplementationProvider;

public class OriginalGuiImplementationProvider implements ImplementationProvider
{
	private final SpaceTrader spaceTrader;

	public OriginalGuiImplementationProvider(SpaceTrader spaceTrader)
	{
		super();
		this.spaceTrader = spaceTrader;
	}

	public ImageProvider getImageProvider()
	{
		return new ImageProvider()
		{
			public String getCustomShipImages()
			{
				return ShipImageMaker.describeCustomImages(spaceTrader.CustomShipImages());
			}

			public void setCustomShipImages(String descriptor)
			{
				spaceTrader.setCustomShipImages(ShipImageMaker.produceCustomImages(descriptor));
				UpdateCustomImageOffsetConstants();
			}

			public void UpdateCustomImageOffsetConstants()
			{
				Image image = spaceTrader.CustomShipImages()[0];
				int custIndex = ShipType.Custom.CastToInt();

				// Find the first column of pixels that has a non-white pixel for the X
				// value, and the last column for the width.
				int x = GetColumnOfFirstNonWhitePixel(image, 1);
				int width = GetColumnOfFirstNonWhitePixel(image, -1) - x + 1;
				Util.ShipImageOffsets[custIndex].X = Math.max(2, x);
				Util.ShipImageOffsets[custIndex].Width = Math.min(62 - Util.ShipImageOffsets[custIndex].X, width);
				System.out.println("Updates custom image: " + x + " " + width);
			}
		};
	}
	private static int GetColumnOfFirstNonWhitePixel(Image image, int direction)
	{
		Bitmap bitmap = new Bitmap(image);
		int step = direction < 0 ? -1 : 1;
		int col = step > 0 ? 0 : bitmap.getWidth() - 1;
		int stop = step > 0 ? bitmap.getWidth() : -1;

		for (; col != stop; col += step)
		{
			for (int row = 0; row < bitmap.getHeight(); row++)
			{
				if (bitmap.ToArgb(col, row) != 0)
					return col;
			}
		}

		return -1;
	}

	public CheatGui getCheatGuiProvider()
	{
		return new CheatGui()
		{
			public void showMonsterForm()
			{
				(new FormMonster()).Show();
			}

			public void showTestForm()
			{
				(new FormTest()).Show();
			}
		};
	}

	public AlertGui getAlertGuiProvider()
	{
		return new AlertGui()
		{
			public DialogResult alert(AlertType type)
			{
				return convert(FormAlert.Alert(type));
			}

			public DialogResult alert(AlertType type, String var1, String var2)
			{
				return convert(FormAlert.Alert(type, var1, var2));
			}

			public DialogResult alert(AlertType type, String var1, String var2, String var3)
			{
				return convert(FormAlert.Alert(type, var1, var2, var3));
			}

			public DialogResult alert(AlertType type, String[] args)
			{
				return convert(FormAlert.Alert(type, args));
			}

			public DialogResult alert(AlertType type, String var1)
			{
				return convert(FormAlert.Alert(type, var1));
			}

			DialogResult convert(jwinforms.DialogResult result)
			{
				if (result == null)
					return null;
				switch (result)
				{
					case Cancel:
						return DialogResult.Cancel;
					case No:
						return DialogResult.No;
					case None:
						return DialogResult.None;
					case OK:
						return DialogResult.OK;
					case Yes:
						return DialogResult.Yes;
					default:
						throw new RuntimeException("Unknown dialogResult: " + result);
				}
			}

		};
	}

	public CargoGui getCargoGuiProvider()
	{
		return new CargoGui()
		{
			public int queryAmountAcquire(int item, int maxAmount, CargoBuyOp op)
			{
				FormCargoBuy form = new FormCargoBuy(item, maxAmount, op);
				return form.Show() == jwinforms.DialogResult.OK ? form.Amount() : 0;
			}

			public int queryAmountRelease(int item, CargoSellOp op, int maxAmount, int price)
			{
				FormCargoSell form = new FormCargoSell(item, maxAmount, op, price);
				return form.Show() == jwinforms.DialogResult.OK ? form.Amount() : 0;
			}

			public void performPlundering()
			{
				(new FormPlunder()).Show();
			}

			public void performJettison()
			{
				(new FormJettison()).Show();
			}

			public EncounterResult performEncounter(GuiWindow parentWindow)
			{
				FormEncounter form = new FormEncounter();
				form.ShowDialog((WinformPane)parentWindow);
				return form.Result();
			}
		};
	}
}
