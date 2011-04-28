package spacetrader.gui;
import java.util.Arrays;
import jwinforms.BorderStyle;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.GroupBox;
import jwinforms.Label;
import jwinforms.PictureBox;
import jwinforms.FormSize;
import jwinforms.WinformControl;
import jwinforms.WinformForm;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.ShipSpec;
import spacetrader.SpecialEvent;
import spacetrader.Strings;
import spacetrader.enums.AlertType;


public class FormShipList extends WinformForm {
  private Button btnClose;
  private Button btnBuy0;
  private Label lblName0;
  private Button btnInfo0;
  private Label lblPrice0;
  private Label lblPrice1;
  private Button btnInfo1;
  private Label lblName1;
  private Button btnBuy1;
  private Label lblPrice2;
  private Button btnInfo2;
  private Label lblName2;
  private Button btnBuy2;
  private Label lblPrice3;
  private Button btnInfo3;
  private Label lblName3;
  private Button btnBuy3;
  private Label lblPrice4;
  private Button btnInfo4;
  private Label lblName4;
  private Button btnBuy4;
  private Label lblPrice5;
  private Button btnInfo5;
  private Label lblName5;
  private Button btnBuy5;
  private Label lblPrice6;
  private Button btnInfo6;
  private Label lblName6;
  private Button btnBuy6;
  private Label lblPrice7;
  private Button btnInfo7;
  private Label lblName7;
  private Button btnBuy7;
  private Label lblPrice8;
  private Button btnInfo8;
  private Label lblName8;
  private Button btnBuy8;
  private Label lblPrice9;
  private Button btnInfo9;
  private Label lblName9;
  private Button btnBuy9;
  private GroupBox boxShipInfo;
  private Label lblSizeLabel;
  private Label lblNameLabel;
  private Label lblBaysLabel;
  private Label lblRangeLabel;
  private Label lblHullLabel;
  private Label lblWeaponLabel;
  private Label lblShieldLabel;
  private Label lblCrewLabel;
  private Label lblGadgetLabel;
  private PictureBox picShip;
  private Label lblName;
  private Label lblSize;
  private Label lblBays;
  private Label lblRange;
  private Label lblHull;
  private Label lblWeapon;
  private Label lblShield;
  private Label lblGadget;
  private Label lblCrew;
  private Container components = null;
  private Label[] lblPrice;
  private Button[] btnBuy;
  private Game game = Game.CurrentGame();
  private int[] prices = new int[Consts.ShipSpecs.length];

  public FormShipList() {
    InitializeComponent();
    lblPrice = new Label[] {
          lblPrice0,
          lblPrice1,
          lblPrice2,
          lblPrice3,
          lblPrice4,
          lblPrice5,
          lblPrice6,
          lblPrice7,
          lblPrice8,
          lblPrice9,};
    btnBuy = new Button[] {
          btnBuy0,
          btnBuy1,
          btnBuy2,
          btnBuy3,
          btnBuy4,
          btnBuy5,
          btnBuy6,
          btnBuy7,
          btnBuy8,
          btnBuy9,};
    UpdateAll();
    Info(game.Commander().getShip().Type().CastToInt());
    if(game.Commander().getShip().getTribbles() > 0 && !game.getTribbleMessage()) {
      FormAlert.Alert(AlertType.TribblesTradeIn, this);
      game.setTribbleMessage(true);
    }
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnClose = new Button();
    this.btnBuy0 = new Button();
    this.lblName0 = new Label();
    this.btnInfo0 = new Button();
    this.lblPrice0 = new Label();
    this.lblPrice1 = new Label();
    this.btnInfo1 = new Button();
    this.lblName1 = new Label();
    this.btnBuy1 = new Button();
    this.lblPrice2 = new Label();
    this.btnInfo2 = new Button();
    this.lblName2 = new Label();
    this.btnBuy2 = new Button();
    this.lblPrice3 = new Label();
    this.btnInfo3 = new Button();
    this.lblName3 = new Label();
    this.btnBuy3 = new Button();
    this.lblPrice4 = new Label();
    this.btnInfo4 = new Button();
    this.lblName4 = new Label();
    this.btnBuy4 = new Button();
    this.lblPrice5 = new Label();
    this.btnInfo5 = new Button();
    this.lblName5 = new Label();
    this.btnBuy5 = new Button();
    this.lblPrice6 = new Label();
    this.btnInfo6 = new Button();
    this.lblName6 = new Label();
    this.btnBuy6 = new Button();
    this.lblPrice7 = new Label();
    this.btnInfo7 = new Button();
    this.lblName7 = new Label();
    this.btnBuy7 = new Button();
    this.lblPrice8 = new Label();
    this.btnInfo8 = new Button();
    this.lblName8 = new Label();
    this.btnBuy8 = new Button();
    this.lblPrice9 = new Label();
    this.btnInfo9 = new Button();
    this.lblName9 = new Label();
    this.btnBuy9 = new Button();
    this.boxShipInfo = new GroupBox();
    this.lblCrew = new Label();
    this.lblGadget = new Label();
    this.lblShield = new Label();
    this.lblWeapon = new Label();
    this.lblHull = new Label();
    this.lblRange = new Label();
    this.lblBays = new Label();
    this.lblSize = new Label();
    this.lblName = new Label();
    this.picShip = new PictureBox();
    this.lblGadgetLabel = new Label();
    this.lblCrewLabel = new Label();
    this.lblShieldLabel = new Label();
    this.lblWeaponLabel = new Label();
    this.lblHullLabel = new Label();
    this.lblRangeLabel = new Label();
    this.lblBaysLabel = new Label();
    this.lblNameLabel = new Label();
    this.lblSizeLabel = new Label();
    this.boxShipInfo.SuspendLayout();
    this.SuspendLayout();
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new FormSize(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // btnBuy0
    this.btnBuy0.setFlatStyle(FlatStyle.Flat);
    this.btnBuy0.setLocation(new java.awt.Point(8, 8));
    this.btnBuy0.setName("btnBuy0");
    this.btnBuy0.setSize(new FormSize(35, 22));
    this.btnBuy0.setTabIndex(1);
    this.btnBuy0.setText("Buy");
    this.btnBuy0.setVisible(false);
    this.btnBuy0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName0
    this.lblName0.setLocation(new java.awt.Point(48, 12));
    this.lblName0.setName("lblName0");
    this.lblName0.setSize(new FormSize(70, 13));
    this.lblName0.setTabIndex(34);
    this.lblName0.setText("Flea");
    // btnInfo0
    this.btnInfo0.setFlatStyle(FlatStyle.Flat);
    this.btnInfo0.setLocation(new java.awt.Point(120, 8));
    this.btnInfo0.setName("btnInfo0");
    this.btnInfo0.setSize(new FormSize(34, 22));
    this.btnInfo0.setTabIndex(11);
    this.btnInfo0.setText("Info");
    this.btnInfo0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice0
    this.lblPrice0.setLocation(new java.awt.Point(160, 12));
    this.lblPrice0.setName("lblPrice0");
    this.lblPrice0.setSize(new FormSize(64, 13));
    this.lblPrice0.setTabIndex(36);
    this.lblPrice0.setText("-888,888 cr.");
    this.lblPrice0.TextAlign = ContentAlignment.TopRight;
    // lblPrice1
    this.lblPrice1.setLocation(new java.awt.Point(160, 36));
    this.lblPrice1.setName("lblPrice1");
    this.lblPrice1.setSize(new FormSize(64, 13));
    this.lblPrice1.setTabIndex(40);
    this.lblPrice1.setText("-888,888 cr.");
    this.lblPrice1.TextAlign = ContentAlignment.TopRight;
    // btnInfo1
    this.btnInfo1.setFlatStyle(FlatStyle.Flat);
    this.btnInfo1.setLocation(new java.awt.Point(120, 32));
    this.btnInfo1.setName("btnInfo1");
    this.btnInfo1.setSize(new FormSize(34, 22));
    this.btnInfo1.setTabIndex(12);
    this.btnInfo1.setText("Info");
    this.btnInfo1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName1
    this.lblName1.setLocation(new java.awt.Point(48, 36));
    this.lblName1.setName("lblName1");
    this.lblName1.setSize(new FormSize(70, 13));
    this.lblName1.setTabIndex(38);
    this.lblName1.setText("Gnat");
    // btnBuy1
    this.btnBuy1.setFlatStyle(FlatStyle.Flat);
    this.btnBuy1.setLocation(new java.awt.Point(8, 32));
    this.btnBuy1.setName("btnBuy1");
    this.btnBuy1.setSize(new FormSize(35, 22));
    this.btnBuy1.setTabIndex(2);
    this.btnBuy1.setText("Buy");
    this.btnBuy1.setVisible(false);
    this.btnBuy1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice2
    this.lblPrice2.setLocation(new java.awt.Point(160, 60));
    this.lblPrice2.setName("lblPrice2");
    this.lblPrice2.setSize(new FormSize(64, 13));
    this.lblPrice2.setTabIndex(44);
    this.lblPrice2.setText("-888,888 cr.");
    this.lblPrice2.TextAlign = ContentAlignment.TopRight;
    // btnInfo2
    this.btnInfo2.setFlatStyle(FlatStyle.Flat);
    this.btnInfo2.setLocation(new java.awt.Point(120, 56));
    this.btnInfo2.setName("btnInfo2");
    this.btnInfo2.setSize(new FormSize(34, 22));
    this.btnInfo2.setTabIndex(13);
    this.btnInfo2.setText("Info");
    this.btnInfo2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName2
    this.lblName2.setLocation(new java.awt.Point(48, 60));
    this.lblName2.setName("lblName2");
    this.lblName2.setSize(new FormSize(70, 13));
    this.lblName2.setTabIndex(42);
    this.lblName2.setText("Firefly");
    // btnBuy2
    this.btnBuy2.setFlatStyle(FlatStyle.Flat);
    this.btnBuy2.setLocation(new java.awt.Point(8, 56));
    this.btnBuy2.setName("btnBuy2");
    this.btnBuy2.setSize(new FormSize(35, 22));
    this.btnBuy2.setTabIndex(3);
    this.btnBuy2.setText("Buy");
    this.btnBuy2.setVisible(false);
    this.btnBuy2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice3
    this.lblPrice3.setLocation(new java.awt.Point(160, 84));
    this.lblPrice3.setName("lblPrice3");
    this.lblPrice3.setSize(new FormSize(64, 13));
    this.lblPrice3.setTabIndex(48);
    this.lblPrice3.setText("-888,888 cr.");
    this.lblPrice3.TextAlign = ContentAlignment.TopRight;
    // btnInfo3
    this.btnInfo3.setFlatStyle(FlatStyle.Flat);
    this.btnInfo3.setLocation(new java.awt.Point(120, 80));
    this.btnInfo3.setName("btnInfo3");
    this.btnInfo3.setSize(new FormSize(34, 22));
    this.btnInfo3.setTabIndex(14);
    this.btnInfo3.setText("Info");
    this.btnInfo3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName3
    this.lblName3.setLocation(new java.awt.Point(48, 84));
    this.lblName3.setName("lblName3");
    this.lblName3.setSize(new FormSize(70, 13));
    this.lblName3.setTabIndex(46);
    this.lblName3.setText("Mosquito");
    // btnBuy3
    this.btnBuy3.setFlatStyle(FlatStyle.Flat);
    this.btnBuy3.setLocation(new java.awt.Point(8, 80));
    this.btnBuy3.setName("btnBuy3");
    this.btnBuy3.setSize(new FormSize(35, 22));
    this.btnBuy3.setTabIndex(4);
    this.btnBuy3.setText("Buy");
    this.btnBuy3.setVisible(false);
    this.btnBuy3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice4
    this.lblPrice4.setLocation(new java.awt.Point(160, 108));
    this.lblPrice4.setName("lblPrice4");
    this.lblPrice4.setSize(new FormSize(64, 13));
    this.lblPrice4.setTabIndex(52);
    this.lblPrice4.setText("-888,888 cr.");
    this.lblPrice4.TextAlign = ContentAlignment.TopRight;
    // btnInfo4
    this.btnInfo4.setFlatStyle(FlatStyle.Flat);
    this.btnInfo4.setLocation(new java.awt.Point(120, 104));
    this.btnInfo4.setName("btnInfo4");
    this.btnInfo4.setSize(new FormSize(34, 22));
    this.btnInfo4.setTabIndex(15);
    this.btnInfo4.setText("Info");
    this.btnInfo4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName4
    this.lblName4.setLocation(new java.awt.Point(48, 108));
    this.lblName4.setName("lblName4");
    this.lblName4.setSize(new FormSize(70, 13));
    this.lblName4.setTabIndex(50);
    this.lblName4.setText("Bumblebee");
    // btnBuy4
    this.btnBuy4.setFlatStyle(FlatStyle.Flat);
    this.btnBuy4.setLocation(new java.awt.Point(8, 104));
    this.btnBuy4.setName("btnBuy4");
    this.btnBuy4.setSize(new FormSize(35, 22));
    this.btnBuy4.setTabIndex(5);
    this.btnBuy4.setText("Buy");
    this.btnBuy4.setVisible(false);
    this.btnBuy4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice5
    this.lblPrice5.setLocation(new java.awt.Point(160, 132));
    this.lblPrice5.setName("lblPrice5");
    this.lblPrice5.setSize(new FormSize(64, 13));
    this.lblPrice5.setTabIndex(56);
    this.lblPrice5.setText("got one");
    this.lblPrice5.TextAlign = ContentAlignment.TopRight;
    // btnInfo5
    this.btnInfo5.setFlatStyle(FlatStyle.Flat);
    this.btnInfo5.setLocation(new java.awt.Point(120, 128));
    this.btnInfo5.setName("btnInfo5");
    this.btnInfo5.setSize(new FormSize(34, 22));
    this.btnInfo5.setTabIndex(16);
    this.btnInfo5.setText("Info");
    this.btnInfo5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName5
    this.lblName5.setLocation(new java.awt.Point(48, 132));
    this.lblName5.setName("lblName5");
    this.lblName5.setSize(new FormSize(70, 13));
    this.lblName5.setTabIndex(54);
    this.lblName5.setText("Beetle");
    // btnBuy5
    this.btnBuy5.setFlatStyle(FlatStyle.Flat);
    this.btnBuy5.setLocation(new java.awt.Point(8, 128));
    this.btnBuy5.setName("btnBuy5");
    this.btnBuy5.setSize(new FormSize(35, 22));
    this.btnBuy5.setTabIndex(6);
    this.btnBuy5.setText("Buy");
    this.btnBuy5.setVisible(false);
    this.btnBuy5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice6
    this.lblPrice6.setLocation(new java.awt.Point(160, 156));
    this.lblPrice6.setName("lblPrice6");
    this.lblPrice6.setSize(new FormSize(64, 13));
    this.lblPrice6.setTabIndex(60);
    this.lblPrice6.setText("-888,888 cr.");
    this.lblPrice6.TextAlign = ContentAlignment.TopRight;
    // btnInfo6
    this.btnInfo6.setFlatStyle(FlatStyle.Flat);
    this.btnInfo6.setLocation(new java.awt.Point(120, 152));
    this.btnInfo6.setName("btnInfo6");
    this.btnInfo6.setSize(new FormSize(34, 22));
    this.btnInfo6.setTabIndex(17);
    this.btnInfo6.setText("Info");
    this.btnInfo6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName6
    this.lblName6.setLocation(new java.awt.Point(48, 156));
    this.lblName6.setName("lblName6");
    this.lblName6.setSize(new FormSize(70, 13));
    this.lblName6.setTabIndex(58);
    this.lblName6.setText("Hornet");
    // btnBuy6
    this.btnBuy6.setFlatStyle(FlatStyle.Flat);
    this.btnBuy6.setLocation(new java.awt.Point(8, 152));
    this.btnBuy6.setName("btnBuy6");
    this.btnBuy6.setSize(new FormSize(35, 22));
    this.btnBuy6.setTabIndex(7);
    this.btnBuy6.setText("Buy");
    this.btnBuy6.setVisible(false);
    this.btnBuy6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice7
    this.lblPrice7.setLocation(new java.awt.Point(160, 180));
    this.lblPrice7.setName("lblPrice7");
    this.lblPrice7.setSize(new FormSize(64, 13));
    this.lblPrice7.setTabIndex(64);
    this.lblPrice7.setText("-888,888 cr.");
    this.lblPrice7.TextAlign = ContentAlignment.TopRight;
    // btnInfo7
    this.btnInfo7.setFlatStyle(FlatStyle.Flat);
    this.btnInfo7.setLocation(new java.awt.Point(120, 176));
    this.btnInfo7.setName("btnInfo7");
    this.btnInfo7.setSize(new FormSize(34, 22));
    this.btnInfo7.setTabIndex(18);
    this.btnInfo7.setText("Info");
    this.btnInfo7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName7
    this.lblName7.setLocation(new java.awt.Point(48, 180));
    this.lblName7.setName("lblName7");
    this.lblName7.setSize(new FormSize(70, 13));
    this.lblName7.setTabIndex(62);
    this.lblName7.setText("Grasshopper");
    // btnBuy7
    this.btnBuy7.setFlatStyle(FlatStyle.Flat);
    this.btnBuy7.setLocation(new java.awt.Point(8, 176));
    this.btnBuy7.setName("btnBuy7");
    this.btnBuy7.setSize(new FormSize(35, 22));
    this.btnBuy7.setTabIndex(8);
    this.btnBuy7.setText("Buy");
    this.btnBuy7.setVisible(false);
    this.btnBuy7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice8
    this.lblPrice8.setLocation(new java.awt.Point(160, 204));
    this.lblPrice8.setName("lblPrice8");
    this.lblPrice8.setSize(new FormSize(64, 13));
    this.lblPrice8.setTabIndex(68);
    this.lblPrice8.setText("-888,888 cr.");
    this.lblPrice8.TextAlign = ContentAlignment.TopRight;
    // btnInfo8
    this.btnInfo8.setFlatStyle(FlatStyle.Flat);
    this.btnInfo8.setLocation(new java.awt.Point(120, 200));
    this.btnInfo8.setName("btnInfo8");
    this.btnInfo8.setSize(new FormSize(34, 22));
    this.btnInfo8.setTabIndex(19);
    this.btnInfo8.setText("Info");
    this.btnInfo8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName8
    this.lblName8.setLocation(new java.awt.Point(48, 204));
    this.lblName8.setName("lblName8");
    this.lblName8.setSize(new FormSize(70, 13));
    this.lblName8.setTabIndex(66);
    this.lblName8.setText("Termite");
    // btnBuy8
    this.btnBuy8.setFlatStyle(FlatStyle.Flat);
    this.btnBuy8.setLocation(new java.awt.Point(8, 200));
    this.btnBuy8.setName("btnBuy8");
    this.btnBuy8.setSize(new FormSize(35, 22));
    this.btnBuy8.setTabIndex(9);
    this.btnBuy8.setText("Buy");
    this.btnBuy8.setVisible(false);
    this.btnBuy8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblPrice9
    this.lblPrice9.setLocation(new java.awt.Point(160, 228));
    this.lblPrice9.setName("lblPrice9");
    this.lblPrice9.setSize(new FormSize(64, 13));
    this.lblPrice9.setTabIndex(72);
    this.lblPrice9.setText("not sold");
    this.lblPrice9.TextAlign = ContentAlignment.TopRight;
    // btnInfo9
    this.btnInfo9.setFlatStyle(FlatStyle.Flat);
    this.btnInfo9.setLocation(new java.awt.Point(120, 224));
    this.btnInfo9.setName("btnInfo9");
    this.btnInfo9.setSize(new FormSize(34, 22));
    this.btnInfo9.setTabIndex(20);
    this.btnInfo9.setText("Info");
    this.btnInfo9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // lblName9
    this.lblName9.setLocation(new java.awt.Point(48, 228));
    this.lblName9.setName("lblName9");
    this.lblName9.setSize(new FormSize(70, 13));
    this.lblName9.setTabIndex(70);
    this.lblName9.setText("Wasp");
    // btnBuy9
    this.btnBuy9.setFlatStyle(FlatStyle.Flat);
    this.btnBuy9.setLocation(new java.awt.Point(8, 224));
    this.btnBuy9.setName("btnBuy9");
    this.btnBuy9.setSize(new FormSize(35, 22));
    this.btnBuy9.setTabIndex(10);
    this.btnBuy9.setText("Buy");
    this.btnBuy9.setVisible(false);
    this.btnBuy9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    // boxShipInfo
    this.boxShipInfo.Controls.addAll((new WinformControl[] {
          this.lblCrew,
          this.lblGadget,
          this.lblShield,
          this.lblWeapon,
          this.lblHull,
          this.lblRange,
          this.lblBays,
          this.lblSize,
          this.lblName,
          this.picShip,
          this.lblGadgetLabel,
          this.lblCrewLabel,
          this.lblShieldLabel,
          this.lblWeaponLabel,
          this.lblHullLabel,
          this.lblRangeLabel,
          this.lblBaysLabel,
          this.lblNameLabel,
          this.lblSizeLabel}));
    this.boxShipInfo.setLocation(new java.awt.Point(232, 0));
    this.boxShipInfo.setName("boxShipInfo");
    this.boxShipInfo.setSize(new FormSize(200, 248));
    this.boxShipInfo.setTabIndex(73);
    this.boxShipInfo.setTabStop(false);
    this.boxShipInfo.setText("Ship Information");
    // lblCrew
    this.lblCrew.setLocation(new java.awt.Point(96, 224));
    this.lblCrew.setName("lblCrew");
    this.lblCrew.setSize(new FormSize(10, 13));
    this.lblCrew.setTabIndex(43);
    this.lblCrew.setText("8");
    // lblGadget
    this.lblGadget.setLocation(new java.awt.Point(96, 208));
    this.lblGadget.setName("lblGadget");
    this.lblGadget.setSize(new FormSize(10, 13));
    this.lblGadget.setTabIndex(42);
    this.lblGadget.setText("8");
    // lblShield
    this.lblShield.setLocation(new java.awt.Point(96, 192));
    this.lblShield.setName("lblShield");
    this.lblShield.setSize(new FormSize(10, 13));
    this.lblShield.setTabIndex(41);
    this.lblShield.setText("8");
    // lblWeapon
    this.lblWeapon.setLocation(new java.awt.Point(96, 176));
    this.lblWeapon.setName("lblWeapon");
    this.lblWeapon.setSize(new FormSize(10, 13));
    this.lblWeapon.setTabIndex(40);
    this.lblWeapon.setText("8");
    // lblHull
    this.lblHull.setLocation(new java.awt.Point(96, 160));
    this.lblHull.setName("lblHull");
    this.lblHull.setSize(new FormSize(23, 13));
    this.lblHull.setTabIndex(39);
    this.lblHull.setText("888");
    // lblRange
    this.lblRange.setLocation(new java.awt.Point(96, 144));
    this.lblRange.setName("lblRange");
    this.lblRange.setSize(new FormSize(59, 13));
    this.lblRange.setTabIndex(38);
    this.lblRange.setText("88 parsecs");
    // lblBays
    this.lblBays.setLocation(new java.awt.Point(96, 128));
    this.lblBays.setName("lblBays");
    this.lblBays.setSize(new FormSize(17, 13));
    this.lblBays.setTabIndex(37);
    this.lblBays.setText("88");
    // lblSize
    this.lblSize.setLocation(new java.awt.Point(96, 112));
    this.lblSize.setName("lblSize");
    this.lblSize.setSize(new FormSize(45, 13));
    this.lblSize.setTabIndex(36);
    this.lblSize.setText("Medium");
    // lblName
    this.lblName.setLocation(new java.awt.Point(96, 96));
    this.lblName.setName("lblName");
    this.lblName.setSize(new FormSize(100, 13));
    this.lblName.setTabIndex(35);
    this.lblName.setText("Grasshopper");
    // picShip
    this.picShip.setBackColor(java.awt.Color.white);
    this.picShip.setBorderStyle(BorderStyle.FixedSingle);
    this.picShip.setLocation(new java.awt.Point(67, 25));
    this.picShip.setName("picShip");
    this.picShip.setSize(new FormSize(66, 54));
    this.picShip.setTabIndex(12);
    this.picShip.setTabStop(false);
    // lblGadgetLabel
    this.lblGadgetLabel.setAutoSize(true);
    this.lblGadgetLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblGadgetLabel.setLocation(new java.awt.Point(8, 208));
    this.lblGadgetLabel.setName("lblGadgetLabel");
    this.lblGadgetLabel.setSize(new FormSize(76, 13));
    this.lblGadgetLabel.setTabIndex(11);
    this.lblGadgetLabel.setText("Gadget Slots:");
    // lblCrewLabel
    this.lblCrewLabel.setAutoSize(true);
    this.lblCrewLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblCrewLabel.setLocation(new java.awt.Point(8, 224));
    this.lblCrewLabel.setName("lblCrewLabel");
    this.lblCrewLabel.setSize(new FormSize(84, 13));
    this.lblCrewLabel.setTabIndex(10);
    this.lblCrewLabel.setText("Crew Quarters:");
    // lblShieldLabel
    this.lblShieldLabel.setAutoSize(true);
    this.lblShieldLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblShieldLabel.setLocation(new java.awt.Point(8, 192));
    this.lblShieldLabel.setName("lblShieldLabel");
    this.lblShieldLabel.setSize(new FormSize(70, 13));
    this.lblShieldLabel.setTabIndex(9);
    this.lblShieldLabel.setText("Shield Slots:");
    // lblWeaponLabel
    this.lblWeaponLabel.setAutoSize(true);
    this.lblWeaponLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblWeaponLabel.setLocation(new java.awt.Point(8, 176));
    this.lblWeaponLabel.setName("lblWeaponLabel");
    this.lblWeaponLabel.setSize(new FormSize(81, 13));
    this.lblWeaponLabel.setTabIndex(8);
    this.lblWeaponLabel.setText("Weapon Slots:");
    // lblHullLabel
    this.lblHullLabel.setAutoSize(true);
    this.lblHullLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblHullLabel.setLocation(new java.awt.Point(8, 160));
    this.lblHullLabel.setName("lblHullLabel");
    this.lblHullLabel.setSize(new FormSize(73, 13));
    this.lblHullLabel.setTabIndex(7);
    this.lblHullLabel.setText("Hull Strength");
    // lblRangeLabel
    this.lblRangeLabel.setAutoSize(true);
    this.lblRangeLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblRangeLabel.setLocation(new java.awt.Point(8, 144));
    this.lblRangeLabel.setName("lblRangeLabel");
    this.lblRangeLabel.setSize(new FormSize(42, 13));
    this.lblRangeLabel.setTabIndex(6);
    this.lblRangeLabel.setText("Range:");
    // lblBaysLabel
    this.lblBaysLabel.setAutoSize(true);
    this.lblBaysLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblBaysLabel.setLocation(new java.awt.Point(8, 128));
    this.lblBaysLabel.setName("lblBaysLabel");
    this.lblBaysLabel.setSize(new FormSize(69, 13));
    this.lblBaysLabel.setTabIndex(5);
    this.lblBaysLabel.setText("Cargo Bays:");
    // lblNameLabel
    this.lblNameLabel.setAutoSize(true);
    this.lblNameLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblNameLabel.setLocation(new java.awt.Point(8, 96));
    this.lblNameLabel.setName("lblNameLabel");
    this.lblNameLabel.setSize(new FormSize(39, 13));
    this.lblNameLabel.setTabIndex(4);
    this.lblNameLabel.setText("Name:");
    // lblSizeLabel
    this.lblSizeLabel.setAutoSize(true);
    this.lblSizeLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblSizeLabel.setLocation(new java.awt.Point(8, 112));
    this.lblSizeLabel.setName("lblSizeLabel");
    this.lblSizeLabel.setSize(new FormSize(31, 13));
    this.lblSizeLabel.setTabIndex(3);
    this.lblSizeLabel.setText("Size:");
    // FormShipList
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new FormSize(438, 255));
    this.Controls.addAll(Arrays.asList(
        this.boxShipInfo,
        this.lblPrice9,
        this.btnInfo9,
        this.lblName9,
        this.btnBuy9,
        this.lblPrice8,
        this.btnInfo8,
        this.lblName8,
        this.btnBuy8,
        this.lblPrice7,
        this.btnInfo7,
        this.lblName7,
        this.btnBuy7,
        this.lblPrice6,
        this.btnInfo6,
        this.lblName6,
        this.btnBuy6,
        this.lblPrice5,
        this.btnInfo5,
        this.lblName5,
        this.btnBuy5,
        this.lblPrice4,
        this.btnInfo4,
        this.lblName4,
        this.btnBuy4,
        this.lblPrice3,
        this.btnInfo3,
        this.lblName3,
        this.btnBuy3,
        this.lblPrice2,
        this.btnInfo2,
        this.lblName2,
        this.btnBuy2,
        this.lblPrice1,
        this.btnInfo1,
        this.lblName1,
        this.btnBuy1,
        this.lblPrice0,
        this.btnInfo0,
        this.lblName0,
        this.btnBuy0,
        this.btnClose));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormShipList");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Ship List");
    this.boxShipInfo.ResumeLayout(false);
    this.ResumeLayout(false);
  }

  private void Buy(int id) {
    Info(id);
    if(game.Commander().TradeShip(Consts.ShipSpecs[id], prices[id], this)) {
      if(game.getQuestStatusScarab() == SpecialEvent.StatusScarabDone) {
        game.setQuestStatusScarab(SpecialEvent.StatusScarabNotStarted);
      }
      UpdateAll();
      game.getParentWindow().UpdateAll();
    }
  }

  private void Info(int id) {
    ShipSpec spec = Consts.ShipSpecs[id];
    picShip.setImage(spec.Image());
    lblName.setText(spec.Name());
    lblSize.setText(Strings.Sizes[spec.getSize().CastToInt()]);
    lblBays.setText(Functions.FormatNumber(spec.CargoBays()));
    lblRange.setText(Functions.Multiples(spec.FuelTanks(), Strings.DistanceUnit));
    lblHull.setText(Functions.FormatNumber(spec.HullStrength()));
    lblWeapon.setText(Functions.FormatNumber(spec.getWeaponSlots()));
    lblShield.setText(Functions.FormatNumber(spec.getShieldSlots()));
    lblGadget.setText(Functions.FormatNumber(spec.getGadgetSlots()));
    lblCrew.setText(Functions.FormatNumber(spec.getCrewQuarters()));
  }

  private void UpdateAll() {
    for(int i = 0; i < lblPrice.length; i++) {
      btnBuy[i].setVisible(false);
      if(Consts.ShipSpecs[i].MinimumTechLevel().CastToInt() > game.Commander().CurrentSystem().TechLevel().CastToInt()) {
        lblPrice[i].setText(Strings.CargoBuyNA);
      } else if(Consts.ShipSpecs[i].Type() == game.Commander().getShip().Type()) {
        lblPrice[i].setText(Strings.ShipBuyGotOne);
      } else {
        btnBuy[i].setVisible(true);
        prices[i] = Consts.ShipSpecs[i].getPrice() - game.Commander().getShip().Worth(false);
        lblPrice[i].setText(Functions.FormatMoney(prices[i]));
      }
    }
  }

  private void btnBuyInfo_Click(Object sender, EventArgs e) {
    String name = ((Button)sender).getName();
    int index = Integer.parseInt(name.substring(name.length() - 1));
    if(name.indexOf("Buy") < 0) {
      Info(index);
    } else {
      Buy(index);
    }
  }
}
