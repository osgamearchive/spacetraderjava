package spacetrader.guifacade;

import spacetrader.enums.AlertType;
import spacetrader.enums.CargoSellOp;
import spacetrader.enums.CargoBuyOp;
import spacetrader.enums.EncounterResult;

/**
 * Install your GUI implementation here. At run-time. todo install default implementation
 * TODO mive this installation to CTOR of GAME.
 *
 * @author Aviv
 */
public class GuiEngine
{
	// todo assert only called once by the user?
	static public void installImplementation(ImplementationProvider impl)
	{
		imageProvider = impl.getImageProvider();
		cheat = impl.getCheatGuiProvider();
		alert = impl.getAlertGuiProvider();
		cargo = impl.getCargoGuiProvider();
	}

	public static ImageProvider imageProvider;
	public static CheatGui cheat;
	public static AlertGui alert;
	public static CargoGui cargo;

	// note - internal interfaces are implicitlystatic. see section 8.5.2 in the spec.
	public interface ImageProvider
	{
		void setCustomShipImages(String descriptor);

		String getCustomShipImages();
	}

	public interface CheatGui
	{
		void showMonsterForm();

		void showTestForm();
	}

	public interface AlertGui
	{
		DialogResult alert(AlertType type);

		DialogResult alert(AlertType type, String var1, String var2);

		DialogResult alert(AlertType type, String var1, String var2, String var3);

		DialogResult alert(AlertType type, String var1);

		DialogResult alert(AlertType type, String[] args);
	}

	public interface ImplementationProvider
	{
		ImageProvider getImageProvider();

		CargoGui getCargoGuiProvider();

		CheatGui getCheatGuiProvider();

		AlertGui getAlertGuiProvider();
	}

	public interface CargoGui
	{
		/**
	 * Asks the user for how many items to buy (or steal).
	 *
	 * @return amount selected by the user to buy; 0 if clicked Cancel.
	 */int queryAmountAcquire(int item, int amount, CargoBuyOp operation);

		/**
	 * Asks the user for how many items to sell.
	 *
	 * @return amount selected by the user to buy; 0 if clicked Cancel.
	 */int queryAmountRelease(int item, CargoSellOp op, int maxAmount, int price);

		/**
	 * Lets the user Plunder an un-opposing ship. The gui handles the what and the how
	 * much of it.
	 *
	 * todo smells like there's too much game code in that form.
	 */void performPlundering();

	/**
	 * Lets the user get rid of items. The gui handles the what and the how much of it.
	 *
	 * todo smells like there's too much game code in that form.
	 */	void performJettison();

		// TODO move to someplace (less un-) appropriate.
		/**
	 * Starts an encounter - note that the GUI apperantly decides which kind.
	 *
	 * todo smells like there's too much game code in that form.
	 */EncounterResult performEncounter(GuiWindow parentWindow);
	}
}
