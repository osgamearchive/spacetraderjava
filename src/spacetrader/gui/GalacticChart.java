package spacetrader.gui;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.AlertType;
import spacetrader.enums.CrewMemberId;
import spacetrader.enums.StarSystemId;
import spacetrader.enums.VeryRareEncounter;
import spacetrader.util.Util;

public class GalacticChart extends jwinforms.GroupBox
{
	private Game game = null;
	private GameController controller = null;

	void setGame(Game game, GameController controller)
	{
		this.game = game;
		this.controller = controller;
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
		setLocation(new Point(180, 306));
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
				btnFind_Click(sender, e);
			}
		});

	}

	private void picGalacticChart_MouseDown(Object sender, jwinforms.MouseEventArgs e)
	{
		if (e.Button == MouseButtons.Left && game != null)
		{
			StarSystem[] universe = game.Universe();

			boolean clickedSystem = false;

			for (int i = 0; i < universe.length && !clickedSystem; i++)
			{
				int x = universe[i].X() + OFF_X;
				int y = universe[i].Y() + OFF_Y;

				if (e.X >= x - 2 && e.X <= x + 2 && e.Y >= y - 2 && e.Y <= y + 2)
				{
					clickedSystem = true;
					game.SelectedSystemId(StarSystemId.FromInt(i));
				} else if (Functions.WormholeExists(i, -1))
				{
					int xW = x + OFF_X_WORM;

					if (e.X >= xW - 2 && e.X <= xW + 2 && e.Y >= y - 2 && e.Y <= y + 2)
					{
						clickedSystem = true;
						game.SelectedSystemId(StarSystemId.FromInt(i));
						game.TargetWormhole(true);
					}
				}
			}

			if (clickedSystem)
				// todo inline when done
				mainWindow.UpdateAll();
		}
	}

	private void picGalacticChart_Paint(Object sender, jwinforms.PaintEventArgs e)
	{
		if (game != null)
		{
			StarSystem[] universe = game.Universe();
			int[] wormholes = game.Wormholes();
			StarSystem targetSys = game.SelectedSystem();
			StarSystem curSys = game.Commander().CurrentSystem();
			int fuel = game.Commander().getShip().getFuel();

			if (fuel > 0)
				e.Graphics.DrawEllipse(DEFAULT_PEN, curSys.X() + OFF_X - fuel, curSys.Y() + OFF_Y - fuel, fuel * 2,
						fuel * 2);

			int index = game.SelectedSystemId().CastToInt();
			if (game.TargetWormhole())
			{
				int dest = wormholes[(Util.BruteSeek(wormholes, index) + 1) % wormholes.length];
				StarSystem destSys = universe[dest];
				e.Graphics.DrawLine(DEFAULT_PEN, targetSys.X() + OFF_X_WORM + OFF_X, targetSys.Y() + OFF_Y, destSys.X()
						+ OFF_X, destSys.Y() + OFF_Y);
			}

			for (int i = 0; i < universe.length; i++)
			{
				int imageIndex = universe[i].Visited() ? IMG_S_V : IMG_S_N;
				if (universe[i] == game.WarpSystem())
					imageIndex++;
				Image image = ilChartImages.getImages()[imageIndex];

				if (universe[i] == game.TrackedSystem())
				{
					e.Graphics.DrawLine(DEFAULT_PEN, universe[i].X(), universe[i].Y(), universe[i].X()
							+ image.getWidth() - 1, universe[i].Y() + image.getHeight() - 1);
					e.Graphics.DrawLine(DEFAULT_PEN, universe[i].X(), universe[i].Y() + image.getHeight() - 1,
							universe[i].X() + image.getWidth() - 1, universe[i].Y());
				}

				ilChartImages.Draw(e.Graphics, universe[i].X(), universe[i].Y(), imageIndex);

				if (Functions.WormholeExists(i, -1))
					ilChartImages.Draw(e.Graphics, universe[i].X() + OFF_X_WORM, universe[i].Y(), IMG_S_W);
			}
		} else
			e.Graphics.FillRectangle(DEFAULT_BRUSH, 0, 0, picGalacticChart.getWidth(), picGalacticChart.getHeight());
	}

	private void btnJump_Click(Object sender, jwinforms.EventArgs e)
	{
		if (game.WarpSystem() == null)
			FormAlert.Alert(AlertType.ChartJumpNoSystemSelected, mainWindow);
		else if (game.WarpSystem() == game.Commander().CurrentSystem())
			FormAlert.Alert(AlertType.ChartJumpCurrent, mainWindow);
		else if (FormAlert.Alert(AlertType.ChartJump, mainWindow, game.WarpSystem().Name()) == DialogResult.Yes)
		{
			game.setCanSuperWarp(false);
			try
			{
				if (game.getAutoSave())
					controller.SaveGame(SpaceTrader.SAVE_DEPARTURE, false);

				game.Warp(true);

				if (game.getAutoSave())
					controller.SaveGame(SpaceTrader.SAVE_ARRIVAL, false);
			} catch (GameEndException ex)
			{
				controller.GameEnd();
			}
			// todo inline when done
			mainWindow.UpdateAll();
		}
	}

	private void btnFind_Click(Object sender, jwinforms.EventArgs e)
	{
		FormFind form = new FormFind();
		if (form.ShowDialog(mainWindow) == DialogResult.OK)
		{
			Ship ship = game.Commander().getShip();

			String[] words = form.SystemName().split(" ");

			String first = words.length > 0 ? words[0] : "";
			String second = words.length > 1 ? words[1] : "";
			String third = words.length > 2 ? words[2] : "";
			int num1 = Functions.IsInt(second) ? Integer.parseInt(second) : 0;
			int num2 = Functions.IsInt(third) ? Integer.parseInt(third) : 0;

			boolean find = false;

			if (game.getCheatEnabled())
			{
				switch (SomeStringsForSwitch.find(first))
				{
				case Bazaar:
					game.setChanceOfTradeInOrbit(Math.max(0, Math.min(1000, num1)));
					break;
				case Cover:
					if (num1 >= 0 && num1 < ship.Shields().length && num2 >= 0 && num2 < Consts.Shields.length)
						ship.Shields()[num1] = (Shield)Consts.Shields[num2].Clone();
					break;
				case DeLorean:
					game.Commander().setDays(Math.max(0, num1));
					break;
				case Diamond:
					ship.setHullUpgraded(!ship.getHullUpgraded());
					break;
				case Energize:
					game.setCanSuperWarp(!game.getCanSuperWarp());
					break;
				case Events:
					if (second == "Reset")
						game.ResetVeryRareEncounters();
					else
					{
						String text = "";
						for (Iterator<VeryRareEncounter> list = game.VeryRareEncounters().iterator(); list.hasNext();)
							text += Strings.VeryRareEncounters[list.next().CastToInt()] + Strings.newline;
						text = text.trim();

						FormAlert.Alert(AlertType.Alert, mainWindow, "Remaining Very Rare Encounters", text);
					}
					break;
				case Fame:
					game.Commander().setReputationScore(Math.max(0, num1));
					break;
				case Go:
					game.setSelectedSystemByName(second);
					if (game.SelectedSystem().Name().toLowerCase() == second.toLowerCase())
					{
						if (game.getAutoSave())
							controller.SaveGame(SpaceTrader.SAVE_DEPARTURE, false);

						game.WarpDirect();

						if (game.getAutoSave())
							controller.SaveGame(SpaceTrader.SAVE_ARRIVAL, false);
					}
					break;
				case Ice:
				{
					switch (SomeStringsForSwitch.find(second))
					{
					case Pirate:
						game.Commander().setKillsPirate(Math.max(0, num2));
						break;
					case Police:
						game.Commander().setKillsPolice(Math.max(0, num2));
						break;
					case Trader:
						game.Commander().setKillsTrader(Math.max(0, num2));
						break;
					}
				}
					break;
				case Indemnity:
					game.Commander().NoClaim(Math.max(0, num1));
					break;
				case IOU:
					game.Commander().setDebt(Math.max(0, num1));
					break;
				case Iron:
					if (num1 >= 0 && num1 < ship.Weapons().length && num2 >= 0 && num2 < Consts.Weapons.length)
						ship.Weapons()[num1] = (Weapon)Consts.Weapons[num2].Clone();
					break;
				case Juice:
					ship.setFuel(Math.max(0, Math.min(ship.FuelTanks(), num1)));
					break;
				case Knack:
					if (num1 >= 0 && num1 < game.Mercenaries().length)
					{
						String[] skills = third.split(",");
						for (int i = 0; i < game.Mercenaries()[num1].Skills().length && i < skills.length; i++)
						{
							if (Functions.IsInt(skills[i]))
								game.Mercenaries()[num1].Skills()[i] = Math.max(1, Math.min(Consts.MaxSkill, Integer
										.parseInt(skills[i])));
						}
					}
					break;
				case L_Engle:
					game.setFabricRipProbability(Math.max(0, Math.min(Consts.FabricRipInitialProbability, num1)));
					break;
				case LifeBoat:
					ship.setEscapePod(!ship.getEscapePod());
					break;
				case MonsterCom:
					(new FormMonster()).ShowDialog(mainWindow);
					break;
				case PlanB:
					game.setAutoSave(true);
					break;
				case Posse:
					if (num1 > 0 && num1 < ship.Crew().length && num2 > 0 && num2 < game.Mercenaries().length
							&& !Util.ArrayContains(Consts.SpecialCrewMemberIds, (CrewMemberId.FromInt(num2))))
					{
						int skill = ship.Trader();
						ship.Crew()[num1] = game.Mercenaries()[num2];
						if (ship.Trader() != skill)
							game.RecalculateBuyPrices(game.Commander().CurrentSystem());
					}
					break;
				case RapSheet:
					game.Commander().setPoliceRecordScore(num1);
					break;
				case Rarity:
					game.setChanceOfVeryRareEncounter(Math.max(0, Math.min(1000, num1)));
					break;
				case Scratch:
					game.Commander().setCash(Math.max(0, num1));
					break;
				case Skin:
					ship.setHull(Math.max(0, Math.min(ship.HullStrength(), num1)));
					break;
				case Status:
				{
					switch (SomeStringsForSwitch.find(second))
					{
					case Artifact:
						game.setQuestStatusArtifact(Math.max(0, num2));
						break;
					case Dragonfly:
						game.setQuestStatusDragonfly(Math.max(0, num2));
						break;
					case Experiment:
						game.setQuestStatusExperiment(Math.max(0, num2));
						break;
					case Gemulon:
						game.setQuestStatusGemulon(Math.max(0, num2));
						break;
					case Japori:
						game.setQuestStatusJapori(Math.max(0, num2));
						break;
					case Jarek:
						game.setQuestStatusJarek(Math.max(0, num2));
						break;
					case Moon:
						game.setQuestStatusMoon(Math.max(0, num2));
						break;
					case Reactor:
						game.setQuestStatusReactor(Math.max(0, num2));
						break;
					case Princess:
						game.setQuestStatusPrincess(Math.max(0, num2));
						break;
					case Scarab:
						game.setQuestStatusScarab(Math.max(0, num2));
						break;
					case Sculpture:
						game.setQuestStatusSculpture(Math.max(0, num2));
						break;
					case SpaceMonster:
						game.setQuestStatusSpaceMonster(Math.max(0, num2));
						break;
					case Wild:
						game.setQuestStatusWild(Math.max(0, num2));
						break;
					default:
						String text = "Artifact: " + game.getQuestStatusArtifact() + Strings.newline + "Dragonfly: "
								+ game.getQuestStatusDragonfly() + Strings.newline + "Experiment: "
								+ game.getQuestStatusExperiment() + Strings.newline + "Gemulon: "
								+ game.getQuestStatusGemulon() + Strings.newline + "Japori: "
								+ game.getQuestStatusJapori() + Strings.newline + "Jarek: "
								+ game.getQuestStatusJarek() + Strings.newline + "Moon: " + game.getQuestStatusMoon()
								+ Strings.newline + "Princess: " + game.getQuestStatusPrincess() + Strings.newline
								+ "Reactor: " + game.getQuestStatusReactor() + Strings.newline + "Scarab: "
								+ game.getQuestStatusScarab() + Strings.newline + "Sculpture: "
								+ game.getQuestStatusSculpture() + Strings.newline + "SpaceMonster: "
								+ game.getQuestStatusSpaceMonster() + Strings.newline + "Wild: "
								+ game.getQuestStatusWild();

						FormAlert.Alert(AlertType.Alert, mainWindow, "Status of Quests", text);
						break;
					}
				}
					break;
				case Swag:
					if (num1 >= 0 && num1 < ship.Cargo().length)
						ship.Cargo()[num1] = Math.max(0, Math.min(ship.FreeCargoBays() + ship.Cargo()[num1], num2));
					break;
				case Test:
					(new FormTest()).ShowDialog(mainWindow);
					break;
				case Tool:
					if (num1 >= 0 && num1 < ship.Gadgets().length && num2 >= 0 && num2 < Consts.Gadgets.length)
						ship.Gadgets()[num1] = (Gadget)Consts.Gadgets[num2].Clone();
					break;
				case Varmints:
					ship.setTribbles(Math.max(0, num1));
					break;
				case Yellow:
					game.setEasyEncounters(true);
					break;
				default:
					find = true;
					break;
				}
			} else
			{
				switch (SomeStringsForSwitch.find(first))
				{
				case Cheetah:
					FormAlert.Alert(AlertType.Cheater, mainWindow);
					game.setCheatEnabled(true);
					break;
				default:
					find = true;
					break;
				}
			}

			if (find)
			{
				game.setSelectedSystemByName(form.SystemName());
				if (form.TrackSystem() && game.SelectedSystem().Name().toLowerCase() == form.SystemName().toLowerCase())
					game.setTrackedSystemId(game.SelectedSystemId());
			}

			// todo inline when done
			mainWindow.UpdateAll();
		}
	}

	void Refresh()
	{
		picGalacticChart.Refresh();
		if (game == null)
		{
			lblWormholeLabel.setVisible(false);
			lblWormhole.setVisible(false);
			btnJump.setVisible(false);
			btnFind.setVisible(false);
		} else
		{
			if (game.TargetWormhole())
			{
				lblWormholeLabel.setVisible(true);
				lblWormhole.setVisible(true);
				lblWormhole.setText(game.WarpSystem().Name());
			} else
			{
				lblWormholeLabel.setVisible(false);
				lblWormhole.setVisible(false);
			}
			btnJump.setVisible(game.getCanSuperWarp());
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
