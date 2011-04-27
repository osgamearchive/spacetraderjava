package spacetrader.gui;
import java.awt.Color;
import jwinforms.BorderStyle;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.IContainer;
import jwinforms.ImageList;
import jwinforms.ImageListStreamer;
import jwinforms.Label;
import jwinforms.PaintEventArgs;
import jwinforms.PictureBox;
import jwinforms.ResourceManager;
import jwinforms.Size;
import jwinforms.SystemColors;
import jwinforms.Timer;
import jwinforms.WinformForm;
import org.gts.bst.events.EncounterResult;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Ship;
import spacetrader.enums.AlertType;


public class FormEncounter extends WinformForm {
  private Button btnAttack;
  private Button btnFlee;
  private Button btnSubmit;
  private Button btnBribe;
  private Button btnSurrender;
  private Button btnIgnore;
  private Button btnTrade;
  private Button btnPlunder;
  private Button btnBoard;
  private Button btnMeet;
  private Button btnDrink;
  private Button btnInt;
  private Button btnYield;
  private ImageList ilContinuous;
  private ImageList ilEncounterType;
  private ImageList ilTribbles;
  private Label lblEncounter;
  private Label lblOpponentLabel;
  private Label lblYouLabel;
  private Label lblOpponentShip;
  private Label lblYouShip;
  private Label lblYouHull;
  private Label lblYouShields;
  private Label lblOpponentShields;
  private Label lblOpponentHull;
  private Label lblAction;
  private PictureBox picShipYou;
  private PictureBox picShipOpponent;
  private PictureBox picContinuous;
  private PictureBox picEncounterType;
  private PictureBox picTrib00;
  private PictureBox picTrib50;
  private PictureBox picTrib10;
  private PictureBox picTrib40;
  private PictureBox picTrib20;
  private PictureBox picTrib30;
  private PictureBox picTrib04;
  private PictureBox picTrib03;
  private PictureBox picTrib02;
  private PictureBox picTrib01;
  private PictureBox picTrib05;
  private PictureBox picTrib11;
  private PictureBox picTrib12;
  private PictureBox picTrib13;
  private PictureBox picTrib14;
  private PictureBox picTrib15;
  private PictureBox picTrib21;
  private PictureBox picTrib22;
  private PictureBox picTrib23;
  private PictureBox picTrib24;
  private PictureBox picTrib25;
  private PictureBox picTrib31;
  private PictureBox picTrib32;
  private PictureBox picTrib33;
  private PictureBox picTrib34;
  private PictureBox picTrib35;
  private PictureBox picTrib41;
  private PictureBox picTrib51;
  private PictureBox picTrib42;
  private PictureBox picTrib52;
  private PictureBox picTrib43;
  private PictureBox picTrib53;
  private PictureBox picTrib44;
  private PictureBox picTrib45;
  private PictureBox picTrib54;
  private PictureBox picTrib55;
  private Timer tmrTick;
  private IContainer components;
  private Button[] buttons;
  private final int ATTACK = 0;
  private final int BOARD = 1;
  private final int BRIBE = 2;
  private final int DRINK = 3;
  private final int FLEE = 4;
  private final int IGNORE = 5;
  private final int INT = 6;
  private final int MEET = 7;
  private final int PLUNDER = 8;
  private final int SUBMIT = 9;
  private final int SURRENDER = 10;
  private final int TRADE = 11;
  private final int YIELD = 12;
  private Game game = Game.CurrentGame();
  private Ship cmdrship = Game.CurrentGame().Commander().getShip();
  private Ship opponent = Game.CurrentGame().getOpponent();
  private int contImg = 1;
  private EncounterResult _result = EncounterResult.Continue;

  public FormEncounter() {
    InitializeComponent();
    // Set up the Game encounter variables.
    game.EncounterBegin();
    // Enable the control box (the X button) if cheats are enabled.
    if(game.getEasyEncounters()) {
      setControlBox(true);
    }
    buttons = new Button[] {
          btnAttack, btnBoard, btnBribe, btnDrink, btnFlee, btnIgnore,
          btnInt, btnMeet, btnPlunder, btnSubmit, btnSurrender, btnTrade, btnYield
        };
    UpdateShipInfo();
    UpdateTribbles();
    UpdateButtons();
    if(game.EncounterImageIndex() >= 0) {
      picEncounterType.setImage(ilEncounterType.getImages()[game.EncounterImageIndex()]);
    } else {
      picEncounterType.setVisible(false);
    }
    lblEncounter.setText(game.EncounterTextInitial());
    lblAction.setText(game.EncounterActionInitial());
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.components = new Container();
    ResourceManager resources = new ResourceManager(FormEncounter.class);
    this.lblEncounter = new Label();
    this.picShipYou = new PictureBox();
    this.picShipOpponent = new PictureBox();
    this.lblAction = new Label();
    this.lblOpponentLabel = new Label();
    this.lblYouLabel = new Label();
    this.lblOpponentShip = new Label();
    this.lblYouShip = new Label();
    this.lblYouHull = new Label();
    this.lblYouShields = new Label();
    this.lblOpponentShields = new Label();
    this.lblOpponentHull = new Label();
    this.btnAttack = new Button();
    this.btnFlee = new Button();
    this.btnSubmit = new Button();
    this.btnBribe = new Button();
    this.btnSurrender = new Button();
    this.btnIgnore = new Button();
    this.btnTrade = new Button();
    this.btnPlunder = new Button();
    this.btnBoard = new Button();
    this.btnMeet = new Button();
    this.btnDrink = new Button();
    this.btnInt = new Button();
    this.btnYield = new Button();
    this.picContinuous = new PictureBox();
    this.ilContinuous = new ImageList(this.components);
    this.picEncounterType = new PictureBox();
    this.ilEncounterType = new ImageList(this.components);
    this.picTrib00 = new PictureBox();
    this.ilTribbles = new ImageList(this.components);
    this.picTrib50 = new PictureBox();
    this.picTrib10 = new PictureBox();
    this.picTrib40 = new PictureBox();
    this.picTrib20 = new PictureBox();
    this.picTrib30 = new PictureBox();
    this.picTrib04 = new PictureBox();
    this.picTrib03 = new PictureBox();
    this.picTrib02 = new PictureBox();
    this.picTrib01 = new PictureBox();
    this.picTrib05 = new PictureBox();
    this.picTrib11 = new PictureBox();
    this.picTrib12 = new PictureBox();
    this.picTrib13 = new PictureBox();
    this.picTrib14 = new PictureBox();
    this.picTrib15 = new PictureBox();
    this.picTrib21 = new PictureBox();
    this.picTrib22 = new PictureBox();
    this.picTrib23 = new PictureBox();
    this.picTrib24 = new PictureBox();
    this.picTrib25 = new PictureBox();
    this.picTrib31 = new PictureBox();
    this.picTrib32 = new PictureBox();
    this.picTrib33 = new PictureBox();
    this.picTrib34 = new PictureBox();
    this.picTrib35 = new PictureBox();
    this.picTrib41 = new PictureBox();
    this.picTrib51 = new PictureBox();
    this.picTrib42 = new PictureBox();
    this.picTrib52 = new PictureBox();
    this.picTrib43 = new PictureBox();
    this.picTrib53 = new PictureBox();
    this.picTrib44 = new PictureBox();
    this.picTrib45 = new PictureBox();
    this.picTrib54 = new PictureBox();
    this.picTrib55 = new PictureBox();
    this.tmrTick = new Timer(this.components);
    this.SuspendLayout();
    // lblEncounter
    this.lblEncounter.setLocation(new java.awt.Point(8, 152));
    this.lblEncounter.setName("lblEncounter");
    this.lblEncounter.setSize(new Size(232, 26));
    this.lblEncounter.setTabIndex(0);
    this.lblEncounter.setText("At 20 clicks from Tarchannen, you encounter the famous Captain Ahab.");
    // picShipYou
    this.picShipYou.setBackColor(java.awt.Color.white);
    this.picShipYou.setBorderStyle(BorderStyle.FixedSingle);
    this.picShipYou.setLocation(new java.awt.Point(26, 24));
    this.picShipYou.setName("picShipYou");
    this.picShipYou.setSize(new Size(70, 58));
    this.picShipYou.setTabIndex(13);
    this.picShipYou.setTabStop(false);
    this.picShipYou.setPaint(new EventHandler<Object, PaintEventArgs>() {
      @Override
      public void handle(Object sender, PaintEventArgs e) {
        picShipYou_Paint(sender, e);
      }
    });
    // picShipOpponent
    this.picShipOpponent.setBackColor(java.awt.Color.white);
    this.picShipOpponent.setBorderStyle(BorderStyle.FixedSingle);
    this.picShipOpponent.setLocation(new java.awt.Point(138, 24));
    this.picShipOpponent.setName("picShipOpponent");
    this.picShipOpponent.setSize(new Size(70, 58));
    this.picShipOpponent.setTabIndex(14);
    this.picShipOpponent.setTabStop(false);
    this.picShipOpponent.setPaint(new EventHandler<Object, PaintEventArgs>()
		  {
      @Override
      public void handle(Object sender, PaintEventArgs e) {
        picShipOpponent_Paint(sender, e);
      }
    });
    // lblAction
    this.lblAction.setLocation(new java.awt.Point(8, 192));
    this.lblAction.setName("lblAction");
    this.lblAction.setSize(new Size(232, 39));
    this.lblAction.setTabIndex(15);
    this.lblAction.setText("\"We know you removed illegal goods from the Marie Celeste. You must give them up at once!\"");
    // lblOpponentLabel
    this.lblOpponentLabel.setAutoSize(true);
    this.lblOpponentLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblOpponentLabel.setLocation(new java.awt.Point(141, 8));
    this.lblOpponentLabel.setName("lblOpponentLabel");
    this.lblOpponentLabel.setSize(new Size(59, 16));
    this.lblOpponentLabel.setTabIndex(16);
    this.lblOpponentLabel.setText("Opponent:");
    // lblYouLabel
    this.lblYouLabel.setAutoSize(true);
    this.lblYouLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblYouLabel.setLocation(new java.awt.Point(45, 8));
    this.lblYouLabel.setName("lblYouLabel");
    this.lblYouLabel.setSize(new Size(28, 16));
    this.lblYouLabel.setTabIndex(17);
    this.lblYouLabel.setText("You:");
    // lblOpponentShip
    this.lblOpponentShip.setLocation(new java.awt.Point(138, 88));
    this.lblOpponentShip.setName("lblOpponentShip");
    this.lblOpponentShip.setSize(new Size(80, 13));
    this.lblOpponentShip.setTabIndex(18);
    this.lblOpponentShip.setText("Space Monster");
    // lblYouShip
    this.lblYouShip.setLocation(new java.awt.Point(26, 88));
    this.lblYouShip.setName("lblYouShip");
    this.lblYouShip.setSize(new Size(100, 13));
    this.lblYouShip.setTabIndex(19);
    this.lblYouShip.setText("Grasshopper");
    // lblYouHull
    this.lblYouHull.setLocation(new java.awt.Point(26, 104));
    this.lblYouHull.setName("lblYouHull");
    this.lblYouHull.setSize(new Size(68, 13));
    this.lblYouHull.setTabIndex(20);
    this.lblYouHull.setText("Hull at 100%");
    // lblYouShields
    this.lblYouShields.setLocation(new java.awt.Point(26, 120));
    this.lblYouShields.setName("lblYouShields");
    this.lblYouShields.setSize(new Size(86, 13));
    this.lblYouShields.setTabIndex(21);
    this.lblYouShields.setText("Shields at 100%");
    // lblOpponentShields
    this.lblOpponentShields.setLocation(new java.awt.Point(138, 120));
    this.lblOpponentShields.setName("lblOpponentShields");
    this.lblOpponentShields.setSize(new Size(86, 13));
    this.lblOpponentShields.setTabIndex(23);
    this.lblOpponentShields.setText("Shields at 100%");
    // lblOpponentHull
    this.lblOpponentHull.setLocation(new java.awt.Point(138, 104));
    this.lblOpponentHull.setName("lblOpponentHull");
    this.lblOpponentHull.setSize(new Size(68, 13));
    this.lblOpponentHull.setTabIndex(22);
    this.lblOpponentHull.setText("Hull at 100%");
    // btnAttack
    this.btnAttack.setFlatStyle(FlatStyle.Flat);
    this.btnAttack.setLocation(new java.awt.Point(8, 240));
    this.btnAttack.setName("btnAttack");
    this.btnAttack.setSize(new Size(46, 22));
    this.btnAttack.setTabIndex(24);
    this.btnAttack.setText("Attack");
    this.btnAttack.setVisible(false);
    this.btnAttack.setClick(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnAttack_Click(sender, e);
      }
    });
    // btnFlee
    this.btnFlee.setFlatStyle(FlatStyle.Flat);
    this.btnFlee.setLocation(new java.awt.Point(62, 240));
    this.btnFlee.setName("btnFlee");
    this.btnFlee.setSize(new Size(36, 22));
    this.btnFlee.setTabIndex(25);
    this.btnFlee.setText("Flee");
    this.btnFlee.setVisible(false);
    this.btnFlee.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnFlee_Click(sender, e);
      }
    });
    // btnSubmit
    this.btnSubmit.setFlatStyle(FlatStyle.Flat);
    this.btnSubmit.setLocation(new java.awt.Point(106, 240));
    this.btnSubmit.setName("btnSubmit");
    this.btnSubmit.setSize(new Size(49, 22));
    this.btnSubmit.setTabIndex(26);
    this.btnSubmit.setText("Submit");
    this.btnSubmit.setVisible(false);
    this.btnSubmit.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnSubmit_Click(sender, e);
      }
    });
    // btnBribe
    this.btnBribe.setFlatStyle(FlatStyle.Flat);
    this.btnBribe.setLocation(new java.awt.Point(163, 240));
    this.btnBribe.setName("btnBribe");
    this.btnBribe.setSize(new Size(41, 22));
    this.btnBribe.setTabIndex(27);
    this.btnBribe.setText("Bribe");
    this.btnBribe.setVisible(false);
    this.btnBribe.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBribe_Click(sender, e);
      }
    });
    // btnSurrender
    this.btnSurrender.setFlatStyle(FlatStyle.Flat);
    this.btnSurrender.setLocation(new java.awt.Point(106, 240));
    this.btnSurrender.setName("btnSurrender");
    this.btnSurrender.setSize(new Size(65, 22));
    this.btnSurrender.setTabIndex(28);
    this.btnSurrender.setText("Surrender");
    this.btnSurrender.setVisible(false);
    this.btnSurrender.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnSurrender_Click(sender, e);
      }
    });
    // btnIgnore
    this.btnIgnore.setFlatStyle(FlatStyle.Flat);
    this.btnIgnore.setLocation(new java.awt.Point(62, 240));
    this.btnIgnore.setName("btnIgnore");
    this.btnIgnore.setSize(new Size(46, 22));
    this.btnIgnore.setTabIndex(29);
    this.btnIgnore.setText("Ignore");
    this.btnIgnore.setVisible(false);
    this.btnIgnore.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnIgnore_Click(sender, e);
      }
    });
    // btnTrade
    this.btnTrade.setFlatStyle(FlatStyle.Flat);
    this.btnTrade.setLocation(new java.awt.Point(116, 240));
    this.btnTrade.setName("btnTrade");
    this.btnTrade.setSize(new Size(44, 22));
    this.btnTrade.setTabIndex(30);
    this.btnTrade.setText("Trade");
    this.btnTrade.setVisible(false);
    this.btnTrade.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnTrade_Click(sender, e);
      }
    });
    // btnPlunder
    this.btnPlunder.setFlatStyle(FlatStyle.Flat);
    this.btnPlunder.setLocation(new java.awt.Point(62, 240));
    this.btnPlunder.setName("btnPlunder");
    this.btnPlunder.setSize(new Size(53, 22));
    this.btnPlunder.setTabIndex(31);
    this.btnPlunder.setText("Plunder");
    this.btnPlunder.setVisible(false);
    this.btnPlunder.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnBoard
    this.btnBoard.setFlatStyle(FlatStyle.Flat);
    this.btnBoard.setLocation(new java.awt.Point(8, 240));
    this.btnBoard.setName("btnBoard");
    this.btnBoard.setSize(new Size(44, 22));
    this.btnBoard.setTabIndex(32);
    this.btnBoard.setText("Board");
    this.btnBoard.setVisible(false);
    this.btnBoard.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBoard_Click(sender, e);
      }
    });
    // btnMeet
    this.btnMeet.setFlatStyle(FlatStyle.Flat);
    this.btnMeet.setLocation(new java.awt.Point(116, 240));
    this.btnMeet.setName("btnMeet");
    this.btnMeet.setSize(new Size(39, 22));
    this.btnMeet.setTabIndex(34);
    this.btnMeet.setText("Meet");
    this.btnMeet.setVisible(false);
    this.btnMeet.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnMeet_Click(sender, e);
      }
    });
    // btnDrink
    this.btnDrink.setFlatStyle(FlatStyle.Flat);
    this.btnDrink.setLocation(new java.awt.Point(8, 240));
    this.btnDrink.setName("btnDrink");
    this.btnDrink.setSize(new Size(41, 22));
    this.btnDrink.setTabIndex(35);
    this.btnDrink.setText("Drink");
    this.btnDrink.setVisible(false);
    this.btnDrink.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnDrink_Click(sender, e);
      }
    });
    // btnInt
    this.btnInt.setFlatStyle(FlatStyle.Flat);
    this.btnInt.setLocation(new java.awt.Point(179, 240));
    this.btnInt.setName("btnInt");
    this.btnInt.setSize(new Size(30, 22));
    this.btnInt.setTabIndex(36);
    this.btnInt.setText("Int.");
    this.btnInt.setVisible(false);
    this.btnInt.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnInt_Click(sender, e);
      }
    });
    // btnYield
    this.btnYield.setFlatStyle(FlatStyle.Flat);
    this.btnYield.setLocation(new java.awt.Point(106, 240));
    this.btnYield.setName("btnYield");
    this.btnYield.setSize(new Size(39, 22));
    this.btnYield.setTabIndex(37);
    this.btnYield.setText("Yield");
    this.btnYield.setVisible(false);
    this.btnYield.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnYield_Click(sender, e);
      }
    });
    // picContinuous
    this.picContinuous.setLocation(new java.awt.Point(214, 247));
    this.picContinuous.setName("picContinuous");
    this.picContinuous.setSize(new Size(9, 9));
    this.picContinuous.setTabIndex(38);
    this.picContinuous.setTabStop(false);
    this.picContinuous.setVisible(false);
    // ilContinuous
    this.ilContinuous.setImageSize(new Size(9, 9));
    this.ilContinuous.setImageStream(((ImageListStreamer)(resources.GetObject("ilContinuous.ImageStream"))));
    this.ilContinuous.setTransparentColor(java.awt.Color.white);
    // picEncounterType
    this.picEncounterType.setLocation(new java.awt.Point(220, 2));
    this.picEncounterType.setName("picEncounterType");
    this.picEncounterType.setSize(new Size(12, 12));
    this.picEncounterType.setTabIndex(39);
    this.picEncounterType.setTabStop(false);
    // ilEncounterType
    this.ilEncounterType.setImageSize(new Size(12, 12));
    this.ilEncounterType.setImageStream(((ImageListStreamer)(resources.GetObject("ilEncounterType.ImageStream"))));
    this.ilEncounterType.setTransparentColor(Color.white);
    // picTrib00
    this.picTrib00.setBackColor(SystemColors.Control);
    this.picTrib00.setLocation(new java.awt.Point(16, 16));
    this.picTrib00.setName("picTrib00");
    this.picTrib00.setSize(new Size(12, 12));
    this.picTrib00.setTabIndex(41);
    this.picTrib00.setTabStop(false);
    this.picTrib00.setVisible(false);
    this.picTrib00.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // ilTribbles
    this.ilTribbles.setImageSize(new Size(12, 12));
    this.ilTribbles.setImageStream(((ImageListStreamer)(resources.GetObject("ilTribbles.ImageStream"))));
    this.ilTribbles.setTransparentColor(java.awt.Color.white);
    // picTrib50
    this.picTrib50.setBackColor(SystemColors.Control);
    this.picTrib50.setLocation(new java.awt.Point(16, 224));
    this.picTrib50.setName("picTrib50");
    this.picTrib50.setSize(new Size(12, 12));
    this.picTrib50.setTabIndex(42);
    this.picTrib50.setTabStop(false);
    this.picTrib50.setVisible(false);
    this.picTrib50.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib10
    this.picTrib10.setBackColor(SystemColors.Control);
    this.picTrib10.setLocation(new java.awt.Point(8, 56));
    this.picTrib10.setName("picTrib10");
    this.picTrib10.setSize(new Size(12, 12));
    this.picTrib10.setTabIndex(43);
    this.picTrib10.setTabStop(false);
    this.picTrib10.setVisible(false);
    this.picTrib10.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib40
    this.picTrib40.setBackColor(SystemColors.Control);
    this.picTrib40.setLocation(new java.awt.Point(8, 184));
    this.picTrib40.setName("picTrib40");
    this.picTrib40.setSize(new Size(12, 12));
    this.picTrib40.setTabIndex(44);
    this.picTrib40.setTabStop(false);
    this.picTrib40.setVisible(false);
    this.picTrib40.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib20
    this.picTrib20.setBackColor(SystemColors.Control);
    this.picTrib20.setLocation(new java.awt.Point(8, 96));
    this.picTrib20.setName("picTrib20");
    this.picTrib20.setSize(new Size(12, 12));
    this.picTrib20.setTabIndex(45);
    this.picTrib20.setTabStop(false);
    this.picTrib20.setVisible(false);
    this.picTrib20.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib30
    this.picTrib30.setBackColor(SystemColors.Control);
    this.picTrib30.setLocation(new java.awt.Point(16, 136));
    this.picTrib30.setName("picTrib30");
    this.picTrib30.setSize(new Size(12, 12));
    this.picTrib30.setTabIndex(46);
    this.picTrib30.setTabStop(false);
    this.picTrib30.setVisible(false);
    this.picTrib30.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib04
    this.picTrib04.setBackColor(SystemColors.Control);
    this.picTrib04.setLocation(new java.awt.Point(176, 8));
    this.picTrib04.setName("picTrib04");
    this.picTrib04.setSize(new Size(12, 12));
    this.picTrib04.setTabIndex(47);
    this.picTrib04.setTabStop(false);
    this.picTrib04.setVisible(false);
    this.picTrib04.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib03
    this.picTrib03.setBackColor(SystemColors.Control);
    this.picTrib03.setLocation(new java.awt.Point(128, 8));
    this.picTrib03.setName("picTrib03");
    this.picTrib03.setSize(new Size(12, 12));
    this.picTrib03.setTabIndex(48);
    this.picTrib03.setTabStop(false);
    this.picTrib03.setVisible(false);
    this.picTrib03.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib02
    this.picTrib02.setBackColor(SystemColors.Control);
    this.picTrib02.setLocation(new java.awt.Point(96, 16));
    this.picTrib02.setName("picTrib02");
    this.picTrib02.setSize(new Size(12, 12));
    this.picTrib02.setTabIndex(49);
    this.picTrib02.setTabStop(false);
    this.picTrib02.setVisible(false);
    this.picTrib02.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib01
    this.picTrib01.setBackColor(SystemColors.Control);
    this.picTrib01.setLocation(new java.awt.Point(56, 8));
    this.picTrib01.setName("picTrib01");
    this.picTrib01.setSize(new Size(12, 12));
    this.picTrib01.setTabIndex(50);
    this.picTrib01.setTabStop(false);
    this.picTrib01.setVisible(false);
    this.picTrib01.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib05
    this.picTrib05.setBackColor(SystemColors.Control);
    this.picTrib05.setLocation(new java.awt.Point(208, 16));
    this.picTrib05.setName("picTrib05");
    this.picTrib05.setSize(new Size(12, 12));
    this.picTrib05.setTabIndex(51);
    this.picTrib05.setTabStop(false);
    this.picTrib05.setVisible(false);
    this.picTrib05.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib11
    this.picTrib11.setBackColor(SystemColors.Control);
    this.picTrib11.setLocation(new java.awt.Point(32, 80));
    this.picTrib11.setName("picTrib11");
    this.picTrib11.setSize(new Size(12, 12));
    this.picTrib11.setTabIndex(52);
    this.picTrib11.setTabStop(false);
    this.picTrib11.setVisible(false);
    this.picTrib11.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib12
    this.picTrib12.setBackColor(SystemColors.Control);
    this.picTrib12.setLocation(new java.awt.Point(88, 56));
    this.picTrib12.setName("picTrib12");
    this.picTrib12.setSize(new Size(12, 12));
    this.picTrib12.setTabIndex(53);
    this.picTrib12.setTabStop(false);
    this.picTrib12.setVisible(false);
    this.picTrib12.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib13
    this.picTrib13.setBackColor(SystemColors.Control);
    this.picTrib13.setLocation(new java.awt.Point(128, 40));
    this.picTrib13.setName("picTrib13");
    this.picTrib13.setSize(new Size(12, 12));
    this.picTrib13.setTabIndex(54);
    this.picTrib13.setTabStop(false);
    this.picTrib13.setVisible(false);
    this.picTrib13.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib14
    this.picTrib14.setBackColor(SystemColors.Control);
    this.picTrib14.setLocation(new java.awt.Point(192, 72));
    this.picTrib14.setName("picTrib14");
    this.picTrib14.setSize(new Size(12, 12));
    this.picTrib14.setTabIndex(55);
    this.picTrib14.setTabStop(false);
    this.picTrib14.setVisible(false);
    this.picTrib14.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib15
    this.picTrib15.setBackColor(SystemColors.Control);
    this.picTrib15.setLocation(new java.awt.Point(216, 48));
    this.picTrib15.setName("picTrib15");
    this.picTrib15.setSize(new Size(12, 12));
    this.picTrib15.setTabIndex(56);
    this.picTrib15.setTabStop(false);
    this.picTrib15.setVisible(false);
    this.picTrib15.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib21
    this.picTrib21.setBackColor(SystemColors.Control);
    this.picTrib21.setLocation(new java.awt.Point(56, 96));
    this.picTrib21.setName("picTrib21");
    this.picTrib21.setSize(new Size(12, 12));
    this.picTrib21.setTabIndex(57);
    this.picTrib21.setTabStop(false);
    this.picTrib21.setVisible(false);
    this.picTrib21.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib22
    this.picTrib22.setBackColor(SystemColors.Control);
    this.picTrib22.setLocation(new java.awt.Point(96, 80));
    this.picTrib22.setName("picTrib22");
    this.picTrib22.setSize(new Size(12, 12));
    this.picTrib22.setTabIndex(58);
    this.picTrib22.setTabStop(false);
    this.picTrib22.setVisible(false);
    this.picTrib22.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib23
    this.picTrib23.setBackColor(SystemColors.Control);
    this.picTrib23.setLocation(new java.awt.Point(136, 88));
    this.picTrib23.setName("picTrib23");
    this.picTrib23.setSize(new Size(12, 12));
    this.picTrib23.setTabIndex(59);
    this.picTrib23.setTabStop(false);
    this.picTrib23.setVisible(false);
    this.picTrib23.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib24
    this.picTrib24.setBackColor(SystemColors.Control);
    this.picTrib24.setLocation(new java.awt.Point(176, 104));
    this.picTrib24.setName("picTrib24");
    this.picTrib24.setSize(new Size(12, 12));
    this.picTrib24.setTabIndex(60);
    this.picTrib24.setTabStop(false);
    this.picTrib24.setVisible(false);
    this.picTrib24.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib25
    this.picTrib25.setBackColor(SystemColors.Control);
    this.picTrib25.setLocation(new java.awt.Point(216, 96));
    this.picTrib25.setName("picTrib25");
    this.picTrib25.setSize(new Size(12, 12));
    this.picTrib25.setTabIndex(61);
    this.picTrib25.setTabStop(false);
    this.picTrib25.setVisible(false);
    this.picTrib25.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib31
    this.picTrib31.setBackColor(SystemColors.Control);
    this.picTrib31.setLocation(new java.awt.Point(56, 128));
    this.picTrib31.setName("picTrib31");
    this.picTrib31.setSize(new Size(12, 12));
    this.picTrib31.setTabIndex(62);
    this.picTrib31.setTabStop(false);
    this.picTrib31.setVisible(false);
    this.picTrib31.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib32
    this.picTrib32.setBackColor(SystemColors.Control);
    this.picTrib32.setLocation(new java.awt.Point(96, 120));
    this.picTrib32.setName("picTrib32");
    this.picTrib32.setSize(new Size(12, 12));
    this.picTrib32.setTabIndex(63);
    this.picTrib32.setTabStop(false);
    this.picTrib32.setVisible(false);
    this.picTrib32.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib33
    this.picTrib33.setBackColor(SystemColors.Control);
    this.picTrib33.setLocation(new java.awt.Point(128, 128));
    this.picTrib33.setName("picTrib33");
    this.picTrib33.setSize(new Size(12, 12));
    this.picTrib33.setTabIndex(64);
    this.picTrib33.setTabStop(false);
    this.picTrib33.setVisible(false);
    this.picTrib33.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib34
    this.picTrib34.setBackColor(SystemColors.Control);
    this.picTrib34.setLocation(new java.awt.Point(168, 144));
    this.picTrib34.setName("picTrib34");
    this.picTrib34.setSize(new Size(12, 12));
    this.picTrib34.setTabIndex(65);
    this.picTrib34.setTabStop(false);
    this.picTrib34.setVisible(false);
    this.picTrib34.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib35
    this.picTrib35.setBackColor(SystemColors.Control);
    this.picTrib35.setLocation(new java.awt.Point(208, 128));
    this.picTrib35.setName("picTrib35");
    this.picTrib35.setSize(new Size(12, 12));
    this.picTrib35.setTabIndex(66);
    this.picTrib35.setTabStop(false);
    this.picTrib35.setVisible(false);
    this.picTrib35.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib41
    this.picTrib41.setBackColor(SystemColors.Control);
    this.picTrib41.setLocation(new java.awt.Point(48, 176));
    this.picTrib41.setName("picTrib41");
    this.picTrib41.setSize(new Size(12, 12));
    this.picTrib41.setTabIndex(67);
    this.picTrib41.setTabStop(false);
    this.picTrib41.setVisible(false);
    this.picTrib41.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib51
    this.picTrib51.setBackColor(SystemColors.Control);
    this.picTrib51.setLocation(new java.awt.Point(64, 216));
    this.picTrib51.setName("picTrib51");
    this.picTrib51.setSize(new Size(12, 12));
    this.picTrib51.setTabIndex(68);
    this.picTrib51.setTabStop(false);
    this.picTrib51.setVisible(false);
    this.picTrib51.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib42
    this.picTrib42.setBackColor(SystemColors.Control);
    this.picTrib42.setLocation(new java.awt.Point(88, 168));
    this.picTrib42.setName("picTrib42");
    this.picTrib42.setSize(new Size(12, 12));
    this.picTrib42.setTabIndex(69);
    this.picTrib42.setTabStop(false);
    this.picTrib42.setVisible(false);
    this.picTrib42.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib52
    this.picTrib52.setBackColor(SystemColors.Control);
    this.picTrib52.setLocation(new java.awt.Point(96, 224));
    this.picTrib52.setName("picTrib52");
    this.picTrib52.setSize(new Size(12, 12));
    this.picTrib52.setTabIndex(70);
    this.picTrib52.setTabStop(false);
    this.picTrib52.setVisible(false);
    this.picTrib52.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib43
    this.picTrib43.setBackColor(SystemColors.Control);
    this.picTrib43.setLocation(new java.awt.Point(136, 176));
    this.picTrib43.setName("picTrib43");
    this.picTrib43.setSize(new Size(12, 12));
    this.picTrib43.setTabIndex(71);
    this.picTrib43.setTabStop(false);
    this.picTrib43.setVisible(false);
    this.picTrib43.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib53
    this.picTrib53.setBackColor(SystemColors.Control);
    this.picTrib53.setLocation(new java.awt.Point(144, 216));
    this.picTrib53.setName("picTrib53");
    this.picTrib53.setSize(new Size(12, 12));
    this.picTrib53.setTabIndex(72);
    this.picTrib53.setTabStop(false);
    this.picTrib53.setVisible(false);
    this.picTrib53.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib44
    this.picTrib44.setBackColor(SystemColors.Control);
    this.picTrib44.setLocation(new java.awt.Point(184, 184));
    this.picTrib44.setName("picTrib44");
    this.picTrib44.setSize(new Size(12, 12));
    this.picTrib44.setTabIndex(73);
    this.picTrib44.setTabStop(false);
    this.picTrib44.setVisible(false);
    this.picTrib44.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib45
    this.picTrib45.setBackColor(SystemColors.Control);
    this.picTrib45.setLocation(new java.awt.Point(216, 176));
    this.picTrib45.setName("picTrib45");
    this.picTrib45.setSize(new Size(12, 12));
    this.picTrib45.setTabIndex(74);
    this.picTrib45.setTabStop(false);
    this.picTrib45.setVisible(false);
    this.picTrib45.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib54
    this.picTrib54.setBackColor(SystemColors.Control);
    this.picTrib54.setLocation(new java.awt.Point(176, 224));
    this.picTrib54.setName("picTrib54");
    this.picTrib54.setSize(new Size(12, 12));
    this.picTrib54.setTabIndex(75);
    this.picTrib54.setTabStop(false);
    this.picTrib54.setVisible(false);
    this.picTrib54.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // picTrib55
    this.picTrib55.setBackColor(SystemColors.Control);
    this.picTrib55.setLocation(new java.awt.Point(208, 216));
    this.picTrib55.setName("picTrib55");
    this.picTrib55.setSize(new Size(12, 12));
    this.picTrib55.setTabIndex(76);
    this.picTrib55.setTabStop(false);
    this.picTrib55.setVisible(false);
    this.picTrib55.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        picTrib_Click(sender, e);
      }
    });
    // tmrTick
    this.tmrTick.setInterval(1000);
    this.tmrTick.Tick = new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        tmrTick_Tick(sender, e);
      }
    };
    // FormEncounter
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setClientSize(new Size(234, 271));
    this.setControlBox(false);
    this.Controls.add(this.picTrib55);
    this.Controls.add(this.picTrib54);
    this.Controls.add(this.picTrib45);
    this.Controls.add(this.picTrib44);
    this.Controls.add(this.picTrib53);
    this.Controls.add(this.picTrib43);
    this.Controls.add(this.picTrib52);
    this.Controls.add(this.picTrib42);
    this.Controls.add(this.picTrib51);
    this.Controls.add(this.picTrib41);
    this.Controls.add(this.picTrib35);
    this.Controls.add(this.picTrib34);
    this.Controls.add(this.picTrib33);
    this.Controls.add(this.picTrib32);
    this.Controls.add(this.picTrib31);
    this.Controls.add(this.picTrib25);
    this.Controls.add(this.picTrib24);
    this.Controls.add(this.picTrib23);
    this.Controls.add(this.picTrib22);
    this.Controls.add(this.picTrib21);
    this.Controls.add(this.picTrib15);
    this.Controls.add(this.picTrib14);
    this.Controls.add(this.picTrib13);
    this.Controls.add(this.picTrib12);
    this.Controls.add(this.picTrib11);
    this.Controls.add(this.picTrib05);
    this.Controls.add(this.picTrib01);
    this.Controls.add(this.picTrib02);
    this.Controls.add(this.picTrib03);
    this.Controls.add(this.picTrib04);
    this.Controls.add(this.picTrib30);
    this.Controls.add(this.picTrib20);
    this.Controls.add(this.picTrib40);
    this.Controls.add(this.picTrib10);
    this.Controls.add(this.picTrib50);
    this.Controls.add(this.picTrib00);
    this.Controls.add(this.picEncounterType);
    this.Controls.add(this.picContinuous);
    this.Controls.add(this.btnYield);
    this.Controls.add(this.btnInt);
    this.Controls.add(this.btnMeet);
    this.Controls.add(this.btnPlunder);
    this.Controls.add(this.btnTrade);
    this.Controls.add(this.btnIgnore);
    this.Controls.add(this.btnSurrender);
    this.Controls.add(this.btnBribe);
    this.Controls.add(this.btnSubmit);
    this.Controls.add(this.btnFlee);
    this.Controls.add(this.lblOpponentShields);
    this.Controls.add(this.lblOpponentHull);
    this.Controls.add(this.lblYouShields);
    this.Controls.add(this.lblYouHull);
    this.Controls.add(this.lblYouShip);
    this.Controls.add(this.lblOpponentShip);
    this.Controls.add(this.lblYouLabel);
    this.Controls.add(this.lblOpponentLabel);
    this.Controls.add(this.lblAction);
    this.Controls.add(this.picShipOpponent);
    this.Controls.add(this.picShipYou);
    this.Controls.add(this.lblEncounter);
    this.Controls.add(this.btnDrink);
    this.Controls.add(this.btnBoard);
    this.Controls.add(this.btnAttack);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormEncounter");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Encounter");
    this.ResumeLayout(false);
  }

  private void DisableAuto() {
    tmrTick.Stop();
    game.setEncounterContinueFleeing(false);
    game.setEncounterContinueAttacking(false);
    btnInt.setVisible(false);
    picContinuous.setVisible(false);
  }

  private void ExecuteAction() {
    _result = game.EncounterExecuteAction(this);
    if(_result == EncounterResult.Continue) {
      UpdateButtons();
      UpdateShipStats();
      lblEncounter.setText(game.EncounterText());
      lblAction.setText(game.EncounterAction());
      if(game.getEncounterContinueFleeing() || game.getEncounterContinueAttacking()) {
        tmrTick.Start();
      }
    } else {
      Close();
    }
  }

  private void Exit(EncounterResult result) {
    _result = result;
    Close();
  }

  private void UpdateButtons() {
    boolean[] visible = new boolean[buttons.length];
    switch(game.getEncounterType()) {
      case BottleGood:
      case BottleOld:
        visible[DRINK] = true;
        visible[IGNORE] = true;
        btnIgnore.setLeft(btnDrink.getLeft() + btnDrink.getWidth() + 8);
        break;
      case CaptainAhab:
      case CaptainConrad:
      case CaptainHuie:
        visible[ATTACK] = true;
        visible[IGNORE] = true;
        visible[MEET] = true;
        break;
      case DragonflyAttack:
      case FamousCaptainAttack:
      case ScorpionAttack:
      case SpaceMonsterAttack:
      case TraderAttack:
        visible[ATTACK] = true;
        visible[FLEE] = true;
        btnInt.setLeft(btnFlee.getLeft() + btnFlee.getWidth() + 8);
        break;
      case DragonflyIgnore:
      case FamousCaptDisabled:
      case PoliceDisabled:
      case PoliceFlee:
      case PoliceIgnore:
      case PirateFlee:
      case PirateIgnore:
      case ScarabIgnore:
      case ScorpionIgnore:
      case SpaceMonsterIgnore:
      case TraderFlee:
      case TraderIgnore:
        visible[ATTACK] = true;
        visible[IGNORE] = true;
        break;
      case MarieCeleste:
        visible[BOARD] = true;
        visible[IGNORE] = true;
        btnIgnore.setLeft(btnBoard.getLeft() + btnBoard.getWidth() + 8);
        break;
      case MarieCelestePolice:
        visible[ATTACK] = true;
        visible[FLEE] = true;
        visible[YIELD] = true;
        visible[BRIBE] = true;
        btnBribe.setLeft(btnYield.getLeft() + btnYield.getWidth() + 8);
        break;
      case PirateAttack:
      case PoliceAttack:
      case PoliceSurrender:
      case ScarabAttack:
        visible[ATTACK] = true;
        visible[FLEE] = true;
        visible[SURRENDER] = true;
        btnInt.setLeft(btnSurrender.getLeft() + btnSurrender.getWidth() + 8);
        break;
      case PirateDisabled:
      case PirateSurrender:
      case TraderDisabled:
      case TraderSurrender:
        visible[ATTACK] = true;
        visible[PLUNDER] = true;
        break;
      case PoliceInspect:
        visible[ATTACK] = true;
        visible[FLEE] = true;
        visible[SUBMIT] = true;
        visible[BRIBE] = true;
        break;
      case TraderBuy:
      case TraderSell:
        visible[ATTACK] = true;
        visible[IGNORE] = true;
        visible[TRADE] = true;
        break;
    }
    if(game.getEncounterContinueAttacking() || game.getEncounterContinueFleeing()) {
      visible[INT] = true;
    }
    for(int i = 0; i < visible.length; i++) {
      if(visible[i] != buttons[i].getVisible()) {
        buttons[i].setVisible(visible[i]);
        if(i == INT) {
          picContinuous.setVisible(visible[i]);
        }
      }
    }
    if(picContinuous.getVisible()) {
      picContinuous.setImage(ilContinuous.getImages()[contImg = (contImg + 1) % 2]);
    }
  }

  private void UpdateShipInfo() {
    lblYouShip.setText(cmdrship.Name());
    lblOpponentShip.setText(opponent.Name());
    UpdateShipStats();
  }

  private void UpdateShipStats() {
    lblYouHull.setText(cmdrship.HullText());
    lblYouShields.setText(cmdrship.ShieldText());
    lblOpponentHull.setText(opponent.HullText());
    lblOpponentShields.setText(opponent.ShieldText());
    picShipYou.Refresh();
    picShipOpponent.Refresh();
  }

  private void UpdateTribbles() {
    PictureBox[] tribbles = new PictureBox[] {
      picTrib00, picTrib01, picTrib02, picTrib03, picTrib04, picTrib05,
      picTrib10, picTrib11, picTrib12, picTrib13, picTrib14, picTrib15,
      picTrib20, picTrib21, picTrib22, picTrib23, picTrib24, picTrib25,
      picTrib30, picTrib31, picTrib32, picTrib33, picTrib34, picTrib35,
      picTrib40, picTrib41, picTrib42, picTrib43, picTrib44, picTrib45,
      picTrib50, picTrib51, picTrib52, picTrib53, picTrib54, picTrib55
    };
    int toShow = Math.min(tribbles.length, (int)Math.sqrt(cmdrship.getTribbles() / Math.ceil(Consts.MaxTribbles / Math.pow(tribbles.length + 1, 2))));
    for(int i = 0; i < toShow; i++) {
      int index = Functions.GetRandom(tribbles.length);
      while(tribbles[index].getVisible()) {
        index = (index + 1) % tribbles.length;
      }
      tribbles[index].setImage(ilTribbles.getImages()[Functions.GetRandom(ilTribbles.getImages().length)]);
      tribbles[index].setVisible(true);
    }
  }

  private void btnAttack_Click(Object sender, EventArgs e) {
    DisableAuto();
    if(game.EncounterVerifyAttack(this)) {
      ExecuteAction();
    }
  }

  private void btnBoard_Click(Object sender, EventArgs e) {
    if(game.EncounterVerifyBoard(this)) {
      Exit(EncounterResult.Normal);
    }
  }

  private void btnBribe_Click(Object sender, EventArgs e) {
    if(game.EncounterVerifyBribe(this)) {
      Exit(EncounterResult.Normal);
    }
  }

  private void btnDrink_Click(Object sender, EventArgs e) {
    game.EncounterDrink(this);
    Exit(EncounterResult.Normal);
  }

  private void btnFlee_Click(Object sender, EventArgs e) {
    DisableAuto();
    if(game.EncounterVerifyFlee(this)) {
      ExecuteAction();
    }
  }

  private void btnIgnore_Click(Object sender, EventArgs e) {
    DisableAuto();
    Exit(EncounterResult.Normal);
  }

  private void btnInt_Click(Object sender, EventArgs e) {
    DisableAuto();
  }

  private void btnMeet_Click(Object sender, EventArgs e) {
    game.EncounterMeet(this);
    Exit(EncounterResult.Normal);
  }

  private void btnPlunder_Click(Object sender, EventArgs e) {
    DisableAuto();
    game.EncounterPlunder(this);
    Exit(EncounterResult.Normal);
  }

  private void btnSubmit_Click(Object sender, EventArgs e) {
    if(game.EncounterVerifySubmit(this)) {
      Exit(cmdrship.IllegalSpecialCargo() ? EncounterResult.Arrested : EncounterResult.Normal);
    }
  }

  private void btnSurrender_Click(Object sender, EventArgs e) {
    DisableAuto();
    _result = game.EncounterVerifySurrender(this);
    if(_result != EncounterResult.Continue) {
      Close();
    }
  }

  private void btnTrade_Click(Object sender, EventArgs e) {
    game.EncounterTrade(this);
    Exit(EncounterResult.Normal);
  }

  private void btnYield_Click(Object sender, EventArgs e) {
    _result = game.EncounterVerifyYield(this);
    if(_result != EncounterResult.Continue) {
      Close();
    }
  }

  private void picShipOpponent_Paint(Object sender, PaintEventArgs e) {
    Functions.PaintShipImage(opponent, e.Graphics, picShipOpponent.getBackColor());
  }

  private void picShipYou_Paint(Object sender, PaintEventArgs e) {
    Functions.PaintShipImage(cmdrship, e.Graphics, picShipYou.getBackColor());
  }

  private void picTrib_Click(Object sender, EventArgs e) {
    FormAlert.Alert(AlertType.TribblesSqueek, this);
  }

  private void tmrTick_Tick(Object sender, EventArgs e) {
    DisableAuto();
    ExecuteAction();
  }

  public EncounterResult Result() {
    return _result;
  }
}