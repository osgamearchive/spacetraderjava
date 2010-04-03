package spacetrader.gui;

import java.awt.Color;
import java.awt.Point;

import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.AlertType;
import spacetrader.enums.StarSystemId;
import spacetrader.guifacade.GuiFacade;
import spacetrader.util.Util;

/*
 * Aviv, aug 09:
 *
 * - fixed tracking to work (was string==, changed with .equals)
 *
 * - extracted cheats to class
 *
 * - replaced Game with SystemTracker where possible.
 */
public class GalacticChart extends jwinforms.GroupBox
{
	private SystemTracker systemTracker = null;
	private GameController controller = null;
	private Commander commander;
	private GameCheats cheats;

	void setGame(Game game, GameController controller, Commander commander)
	{
		systemTracker = game;
		this.controller = controller;
		this.commander = commander;
		cheats = game == null ? null : game.Cheats();
	}

	private final SpaceTrader mainWindow;

	public GalacticChart(SpaceTrader mainWindow, jwinforms.ImageList images)
	{
		this.mainWindow = mainWindow;
		ilChartImages = images;
	}

	private jwinforms.Label lblWormhole;
	private jwinforms.Label lblWormholeLabel;
	private jwinforms.Button btnJump;
	private jwinforms.Button btnFind;
	private jwinforms.PictureBox picGalacticChart;
	private final jwinforms.ImageList ilChartImages;

	private final int OFF_X = ChartsGraphicsConsts.OFF_X;
	private final int OFF_Y = ChartsGraphicsConsts.OFF_Y;
	private final int OFF_X_WORM = ChartsGraphicsConsts.OFF_X_WORM;
	private final int IMG_G_N = ChartsGraphicsConsts.IMG_G_N;
	private final int IMG_G_V = ChartsGraphicsConsts.IMG_G_V;
	private final int IMG_G_W = ChartsGraphicsConsts.IMG_G_W;
	private final int IMG_S_N = ChartsGraphicsConsts.IMG_S_N;
	private final int IMG_S_NS = ChartsGraphicsConsts.IMG_S_NS;
	private final int IMG_S_V = ChartsGraphicsConsts.IMG_S_V;
	private final int IMG_S_VS = ChartsGraphicsConsts.IMG_S_VS;
	private final int IMG_S_W = ChartsGraphicsConsts.IMG_S_W;
	private final Pen DEFAULT_PEN = new Pen(Color.black);
	private final Brush DEFAULT_BRUSH = new SolidBrush(Color.white);

	void InitializeComponent()
	{
		picGalacticChart = new jwinforms.PictureBox();
		lblWormhole = new jwinforms.Label();
		lblWormholeLabel = new jwinforms.Label();
		btnJump = new jwinforms.Button();
		btnFind = new jwinforms.Button();

		picGalacticChart.setBackColor(Color.white);
		picGalacticChart.setLocation(new Point(8, 16));
		picGalacticChart.setName("picGalacticChart");
		picGalacticChart.setSize(new jwinforms.Size(160, 116));
		picGalacticChart.setTabIndex(0);
		picGalacticChart.setTabStop(false);
		picGalacticChart.setPaint(new jwinforms.EventHandler<Object, PaintEventArgs>()
		{
			@Override
			public void handle(Object sender, PaintEventArgs e)
			{
				picGalacticChart_Paint(sender, e);
			}
		});
		picGalacticChart.setMouseDown(new jwinforms.EventHandler<Object, MouseEventArgs>()
		{
			@Override
			public void handle(Object sender, MouseEventArgs e)
			{
				picGalacticChart_MouseDown(sender, e);
			}
		});

		//
		// boxGalacticChart
		//
		Anchor = (((jwinforms.AnchorStyles.Top_Right)));
		setBackColor(jwinforms.SystemColors.Control);
		Controls.add(lblWormhole);
		Controls.add(lblWormholeLabel);
		Controls.add(btnJump);
		Controls.add(btnFind);
		Controls.add(picGalacticChart);
		setName("boxGalacticChart");
		setSize(new jwinforms.Size(176, 168));
		setTabIndex(5);
		setTabStop(false);
		setText("Galactic Chart");
		//
		// lblWormhole
		//
		lblWormhole.setLocation(new Point(8, 148));
		lblWormhole.setName("lblWormhole");
		lblWormhole.setSize(new jwinforms.Size(72, 13));
		lblWormhole.setTabIndex(29);
		lblWormhole.setText("Tarchannen");
		//
		// lblWormholeLabel
		//
		lblWormholeLabel.setLocation(new Point(8, 135));
		lblWormholeLabel.setName("lblWormholeLabel");
		lblWormholeLabel.setSize(new jwinforms.Size(72, 13));
		lblWormholeLabel.setTabIndex(28);
		lblWormholeLabel.setText("Wormhole to");
		//
		// btnJump
		//
		btnJump.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnJump.setLocation(new Point(81, 138));
		btnJump.setName("btnJump");
		btnJump.setSize(new jwinforms.Size(42, 22));
		btnJump.setTabIndex(55);
		btnJump.setText("Jump");
		btnJump.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnJump_Click(sender, e);
			}
		});
		//
		// btnFind
		//
		btnFind.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnFind.setLocation(new Point(132, 138));
		btnFind.setName("btnFind");
		btnFind.setSize(new jwinforms.Size(36, 22));
		btnFind.setTabIndex(56);
		btnFind.setText("Find");
		btnFind.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnFind_Click();
			}
		});

	}

	private void picGalacticChart_MouseDown(Object sender, jwinforms.MouseEventArgs e)
	{
		if (e.Button != MouseButtons.Left || systemTracker == null)
			return;

		StarSystem[] universe = systemTracker.Universe();

		boolean clickedSystem = false;

		for (int i = 0; i < universe.length && !clickedSystem; i++)
		{
			int x = universe[i].X() + OFF_X;
			int y = universe[i].Y() + OFF_Y;

			if (e.X >= x - 2 && e.X <= x + 2 && e.Y >= y - 2 && e.Y <= y + 2)
			{
				clickedSystem = true;
				systemTracker.SelectedSystemId(StarSystemId.FromInt(i));
			} else if (Functions.WormholeExists(i, -1))
			{
				int xW = x + OFF_X_WORM;

				if (e.X >= xW - 2 && e.X <= xW + 2 && e.Y >= y - 2 && e.Y <= y + 2)
				{
					clickedSystem = true;
					systemTracker.selectTargetWormholeFrom(StarSystemId.FromInt(i));
				}
			}
		}

		if (clickedSystem)
			// todo inline when done
			mainWindow.UpdateAll();
	}

	private void picGalacticChart_Paint(Object sender, jwinforms.PaintEventArgs e)
	{
		if (systemTracker == null)
		{
			e.Graphics.FillRectangle(DEFAULT_BRUSH, 0, 0, picGalacticChart.getWidth(), picGalacticChart.getHeight());
			return;
		}

		StarSystem[] universe = systemTracker.Universe();
		int[] wormholes = systemTracker.Wormholes();
		StarSystem targetSys = systemTracker.SelectedSystem();
		StarSystem curSys = commander.getCurrentSystem();
		int fuel = commander.getShip().getFuel();

		if (fuel > 0)
			e.Graphics.DrawEllipse(DEFAULT_PEN, curSys.X() + OFF_X - fuel, curSys.Y() + OFF_Y - fuel, fuel * 2,
					fuel * 2);

		int index = systemTracker.SelectedSystemId().CastToInt();
		if (systemTracker.TargetWormhole())
		{
			int dest = wormholes[(Util.BruteSeek(wormholes, index) + 1) % wormholes.length];
			StarSystem destSys = universe[dest];
			e.Graphics.DrawLine(DEFAULT_PEN, targetSys.X() + OFF_X_WORM + OFF_X, targetSys.Y() + OFF_Y, destSys.X()
					+ OFF_X, destSys.Y() + OFF_Y);
		}

		for (int i = 0; i < universe.length; i++)
		{
			int imageIndex = universe[i].Visited() ? IMG_S_V : IMG_S_N;
			if (universe[i] == systemTracker.WarpSystem())
				imageIndex++;
			Image image = ilChartImages.getImages()[imageIndex];

			if (universe[i] == systemTracker.TrackedSystem())
			{
				e.Graphics.DrawLine(DEFAULT_PEN, universe[i].X(), universe[i].Y(), universe[i].X() + image.getWidth()
						- 1, universe[i].Y() + image.getHeight() - 1);
				e.Graphics.DrawLine(DEFAULT_PEN, universe[i].X(), universe[i].Y() + image.getHeight() - 1, universe[i]
						.X()
						+ image.getWidth() - 1, universe[i].Y());
			}

			ilChartImages.Draw(e.Graphics, universe[i].X(), universe[i].Y(), imageIndex);

			if (Functions.WormholeExists(i, -1))
				ilChartImages.Draw(e.Graphics, universe[i].X() + OFF_X_WORM, universe[i].Y(), IMG_S_W);
		}
	}

	private void btnJump_Click(Object sender, jwinforms.EventArgs e)
	{
		if (FormAlert.Alert(AlertType.ChartJump, systemTracker.WarpSystem().Name()) == DialogResult.Yes)
			systemTracker.jumpWithSingularity();
	}

	private void btnFind_Click()
	{
		FormFind form = new FormFind();
		if (form.ShowDialog(mainWindow) == DialogResult.OK)
		{
			String[] words = form.SystemName().split(" ");

			boolean tryToFind = cheats.ConsiderCheat(words, controller);

			if (tryToFind)
				systemTracker.setSelectedSystemByName(form.SystemName(), form.TrackSystem());

			mainWindow.UpdateAll();
		}
	}

	void Refresh()
	{
		picGalacticChart.Refresh();
		if (systemTracker == null)
		{
			lblWormholeLabel.setVisible(false);
			lblWormhole.setVisible(false);
			btnJump.setVisible(false);
			btnFind.setVisible(false);
		} else
		{
			if (systemTracker.TargetWormhole())
			{
				lblWormholeLabel.setVisible(true);
				lblWormhole.setVisible(true);
				lblWormhole.setText(systemTracker.WarpSystem().Name());
			} else
			{
				lblWormholeLabel.setVisible(false);
				lblWormhole.setVisible(false);
			}
			btnJump.setVisible(systemTracker.getCanSuperWarp());
			btnFind.setVisible(true);
		}
	}

	@Override
	public int getWidth()
	{
		return picGalacticChart.getWidth();
	}

	@Override
	public int getHeight()
	{
		return picGalacticChart.getHeight();
	}
}
