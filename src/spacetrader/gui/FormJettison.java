package spacetrader.gui;
import java.util.Arrays;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.Label;
import jwinforms.FormSize;
import jwinforms.WinformForm;
import spacetrader.Game;
import spacetrader.Ship;


public class FormJettison extends WinformForm {
  private Button btnJettisonAll9;
  private Button btnJettisonQty9;
  private Button btnJettisonAll8;
  private Button btnJettisonQty8;
  private Button btnJettisonAll7;
  private Button btnJettisonQty7;
  private Button btnJettisonAll6;
  private Button btnJettisonQty6;
  private Button btnJettisonAll5;
  private Button btnJettisonQty5;
  private Button btnJettisonAll4;
  private Button btnJettisonQty4;
  private Button btnJettisonAll3;
  private Button btnJettisonQty3;
  private Button btnJettisonAll2;
  private Button btnJettisonQty2;
  private Button btnJettisonAll1;
  private Button btnJettisonQty1;
  private Button btnJettisonAll0;
  private Button btnJettisonQty0;
  private Label lblTradeCmdty9;
  private Label lblTradeCmdty8;
  private Label lblTradeCmdty2;
  private Label lblTradeCmdty0;
  private Label lblTradeCmdty1;
  private Label lblTradeCmdty6;
  private Label lblTradeCmdty5;
  private Label lblTradeCmdty4;
  private Label lblTradeCmdty3;
  private Label lblTradeCmdty7;
  private Label lblBaysLabel;
  private Label lblBays;
  private Button btnDone;
  private Container components = null;
  private Button[] btnJettisonQty;
  private Button[] btnJettisonAll;
  private Game game = Game.CurrentGame();

  public FormJettison() {
    InitializeComponent();
    btnJettisonQty = new Button[] {
          btnJettisonQty0,
          btnJettisonQty1,
          btnJettisonQty2,
          btnJettisonQty3,
          btnJettisonQty4,
          btnJettisonQty5,
          btnJettisonQty6,
          btnJettisonQty7,
          btnJettisonQty8,
          btnJettisonQty9
        };
    btnJettisonAll = new Button[] {
          btnJettisonAll0,
          btnJettisonAll1,
          btnJettisonAll2,
          btnJettisonAll3,
          btnJettisonAll4,
          btnJettisonAll5,
          btnJettisonAll6,
          btnJettisonAll7,
          btnJettisonAll8,
          btnJettisonAll9
        };
    UpdateAll();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnJettisonAll9 = new Button();
    this.btnJettisonQty9 = new Button();
    this.btnJettisonAll8 = new Button();
    this.btnJettisonQty8 = new Button();
    this.btnJettisonAll7 = new Button();
    this.btnJettisonQty7 = new Button();
    this.btnJettisonAll6 = new Button();
    this.btnJettisonQty6 = new Button();
    this.btnJettisonAll5 = new Button();
    this.btnJettisonQty5 = new Button();
    this.btnJettisonAll4 = new Button();
    this.btnJettisonQty4 = new Button();
    this.btnJettisonAll3 = new Button();
    this.btnJettisonQty3 = new Button();
    this.btnJettisonAll2 = new Button();
    this.btnJettisonQty2 = new Button();
    this.btnJettisonAll1 = new Button();
    this.btnJettisonQty1 = new Button();
    this.btnJettisonAll0 = new Button();
    this.btnJettisonQty0 = new Button();
    this.lblTradeCmdty9 = new Label();
    this.lblTradeCmdty8 = new Label();
    this.lblTradeCmdty2 = new Label();
    this.lblTradeCmdty0 = new Label();
    this.lblTradeCmdty1 = new Label();
    this.lblTradeCmdty6 = new Label();
    this.lblTradeCmdty5 = new Label();
    this.lblTradeCmdty4 = new Label();
    this.lblTradeCmdty3 = new Label();
    this.lblTradeCmdty7 = new Label();
    this.lblBaysLabel = new Label();
    this.lblBays = new Label();
    this.btnDone = new Button();
    this.SuspendLayout();
    // btnJettisonAll9
    this.btnJettisonAll9.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll9.setLocation(new java.awt.Point(100, 220));
    this.btnJettisonAll9.setName("btnJettisonAll9");
    this.btnJettisonAll9.setSize(new FormSize(32, 22));
    this.btnJettisonAll9.setTabIndex(141);
    this.btnJettisonAll9.setText("All");
    this.btnJettisonAll9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty9
    this.btnJettisonQty9.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty9.setLocation(new java.awt.Point(68, 220));
    this.btnJettisonQty9.setName("btnJettisonQty9");
    this.btnJettisonQty9.setSize(new FormSize(28, 22));
    this.btnJettisonQty9.setTabIndex(140);
    this.btnJettisonQty9.setText("88");
    this.btnJettisonQty9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll8
    this.btnJettisonAll8.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll8.setLocation(new java.awt.Point(100, 196));
    this.btnJettisonAll8.setName("btnJettisonAll8");
    this.btnJettisonAll8.setSize(new FormSize(32, 22));
    this.btnJettisonAll8.setTabIndex(139);
    this.btnJettisonAll8.setText("All");
    this.btnJettisonAll8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty8
    this.btnJettisonQty8.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty8.setLocation(new java.awt.Point(68, 196));
    this.btnJettisonQty8.setName("btnJettisonQty8");
    this.btnJettisonQty8.setSize(new FormSize(28, 22));
    this.btnJettisonQty8.setTabIndex(138);
    this.btnJettisonQty8.setText("88");
    this.btnJettisonQty8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll7
    this.btnJettisonAll7.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll7.setLocation(new java.awt.Point(100, 172));
    this.btnJettisonAll7.setName("btnJettisonAll7");
    this.btnJettisonAll7.setSize(new FormSize(32, 22));
    this.btnJettisonAll7.setTabIndex(137);
    this.btnJettisonAll7.setText("All");
    this.btnJettisonAll7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty7
    this.btnJettisonQty7.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty7.setLocation(new java.awt.Point(68, 172));
    this.btnJettisonQty7.setName("btnJettisonQty7");
    this.btnJettisonQty7.setSize(new FormSize(28, 22));
    this.btnJettisonQty7.setTabIndex(136);
    this.btnJettisonQty7.setText("88");
    this.btnJettisonQty7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll6
    this.btnJettisonAll6.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll6.setLocation(new java.awt.Point(100, 148));
    this.btnJettisonAll6.setName("btnJettisonAll6");
    this.btnJettisonAll6.setSize(new FormSize(32, 22));
    this.btnJettisonAll6.setTabIndex(135);
    this.btnJettisonAll6.setText("All");
    this.btnJettisonAll6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty6
    this.btnJettisonQty6.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty6.setLocation(new java.awt.Point(68, 148));
    this.btnJettisonQty6.setName("btnJettisonQty6");
    this.btnJettisonQty6.setSize(new FormSize(28, 22));
    this.btnJettisonQty6.setTabIndex(134);
    this.btnJettisonQty6.setText("88");
    this.btnJettisonQty6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll5
    this.btnJettisonAll5.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll5.setLocation(new java.awt.Point(100, 124));
    this.btnJettisonAll5.setName("btnJettisonAll5");
    this.btnJettisonAll5.setSize(new FormSize(32, 22));
    this.btnJettisonAll5.setTabIndex(133);
    this.btnJettisonAll5.setText("All");
    this.btnJettisonAll5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty5
    this.btnJettisonQty5.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty5.setLocation(new java.awt.Point(68, 124));
    this.btnJettisonQty5.setName("btnJettisonQty5");
    this.btnJettisonQty5.setSize(new FormSize(28, 22));
    this.btnJettisonQty5.setTabIndex(132);
    this.btnJettisonQty5.setText("88");
    this.btnJettisonQty5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll4
    this.btnJettisonAll4.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll4.setLocation(new java.awt.Point(100, 100));
    this.btnJettisonAll4.setName("btnJettisonAll4");
    this.btnJettisonAll4.setSize(new FormSize(32, 22));
    this.btnJettisonAll4.setTabIndex(131);
    this.btnJettisonAll4.setText("All");
    this.btnJettisonAll4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty4
    this.btnJettisonQty4.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty4.setLocation(new java.awt.Point(68, 100));
    this.btnJettisonQty4.setName("btnJettisonQty4");
    this.btnJettisonQty4.setSize(new FormSize(28, 22));
    this.btnJettisonQty4.setTabIndex(130);
    this.btnJettisonQty4.setText("88");
    this.btnJettisonQty4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll3
    this.btnJettisonAll3.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll3.setLocation(new java.awt.Point(100, 76));
    this.btnJettisonAll3.setName("btnJettisonAll3");
    this.btnJettisonAll3.setSize(new FormSize(32, 22));
    this.btnJettisonAll3.setTabIndex(129);
    this.btnJettisonAll3.setText("All");
    this.btnJettisonAll3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty3
    this.btnJettisonQty3.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty3.setLocation(new java.awt.Point(68, 76));
    this.btnJettisonQty3.setName("btnJettisonQty3");
    this.btnJettisonQty3.setSize(new FormSize(28, 22));
    this.btnJettisonQty3.setTabIndex(128);
    this.btnJettisonQty3.setText("88");
    this.btnJettisonQty3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll2
    this.btnJettisonAll2.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll2.setLocation(new java.awt.Point(100, 52));
    this.btnJettisonAll2.setName("btnJettisonAll2");
    this.btnJettisonAll2.setSize(new FormSize(32, 22));
    this.btnJettisonAll2.setTabIndex(127);
    this.btnJettisonAll2.setText("All");
    this.btnJettisonAll2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty2
    this.btnJettisonQty2.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty2.setLocation(new java.awt.Point(68, 52));
    this.btnJettisonQty2.setName("btnJettisonQty2");
    this.btnJettisonQty2.setSize(new FormSize(28, 22));
    this.btnJettisonQty2.setTabIndex(126);
    this.btnJettisonQty2.setText("88");
    this.btnJettisonQty2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll1
    this.btnJettisonAll1.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll1.setLocation(new java.awt.Point(100, 28));
    this.btnJettisonAll1.setName("btnJettisonAll1");
    this.btnJettisonAll1.setSize(new FormSize(32, 22));
    this.btnJettisonAll1.setTabIndex(125);
    this.btnJettisonAll1.setText("All");
    this.btnJettisonAll1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty1
    this.btnJettisonQty1.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty1.setLocation(new java.awt.Point(68, 28));
    this.btnJettisonQty1.setName("btnJettisonQty1");
    this.btnJettisonQty1.setSize(new FormSize(28, 22));
    this.btnJettisonQty1.setTabIndex(124);
    this.btnJettisonQty1.setText("88");
    this.btnJettisonQty1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonAll0
    this.btnJettisonAll0.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonAll0.setLocation(new java.awt.Point(100, 4));
    this.btnJettisonAll0.setName("btnJettisonAll0");
    this.btnJettisonAll0.setSize(new FormSize(32, 22));
    this.btnJettisonAll0.setTabIndex(123);
    this.btnJettisonAll0.setText("All");
    this.btnJettisonAll0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // btnJettisonQty0
    this.btnJettisonQty0.setFlatStyle(FlatStyle.Flat);
    this.btnJettisonQty0.setLocation(new java.awt.Point(68, 4));
    this.btnJettisonQty0.setName("btnJettisonQty0");
    this.btnJettisonQty0.setSize(new FormSize(28, 22));
    this.btnJettisonQty0.setTabIndex(122);
    this.btnJettisonQty0.setText("88");
    this.btnJettisonQty0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // lblTradeCmdty9
    this.lblTradeCmdty9.setAutoSize(true);
    this.lblTradeCmdty9.setLocation(new java.awt.Point(8, 224));
    this.lblTradeCmdty9.setName("lblTradeCmdty9");
    this.lblTradeCmdty9.setSize(new FormSize(40, 13));
    this.lblTradeCmdty9.setTabIndex(151);
    this.lblTradeCmdty9.setText("Robots");
    // lblTradeCmdty8
    this.lblTradeCmdty8.setAutoSize(true);
    this.lblTradeCmdty8.setLocation(new java.awt.Point(8, 200));
    this.lblTradeCmdty8.setName("lblTradeCmdty8");
    this.lblTradeCmdty8.setSize(new FormSize(51, 13));
    this.lblTradeCmdty8.setTabIndex(150);
    this.lblTradeCmdty8.setText("Narcotics");
    // lblTradeCmdty2
    this.lblTradeCmdty2.setAutoSize(true);
    this.lblTradeCmdty2.setLocation(new java.awt.Point(8, 56));
    this.lblTradeCmdty2.setName("lblTradeCmdty2");
    this.lblTradeCmdty2.setSize(new FormSize(30, 13));
    this.lblTradeCmdty2.setTabIndex(149);
    this.lblTradeCmdty2.setText("Food");
    // lblTradeCmdty0
    this.lblTradeCmdty0.setAutoSize(true);
    this.lblTradeCmdty0.setLocation(new java.awt.Point(8, 8));
    this.lblTradeCmdty0.setName("lblTradeCmdty0");
    this.lblTradeCmdty0.setSize(new FormSize(34, 13));
    this.lblTradeCmdty0.setTabIndex(148);
    this.lblTradeCmdty0.setText("Water");
    // lblTradeCmdty1
    this.lblTradeCmdty1.setAutoSize(true);
    this.lblTradeCmdty1.setLocation(new java.awt.Point(8, 32));
    this.lblTradeCmdty1.setName("lblTradeCmdty1");
    this.lblTradeCmdty1.setSize(new FormSize(27, 13));
    this.lblTradeCmdty1.setTabIndex(147);
    this.lblTradeCmdty1.setText("Furs");
    // lblTradeCmdty6
    this.lblTradeCmdty6.setAutoSize(true);
    this.lblTradeCmdty6.setLocation(new java.awt.Point(8, 152));
    this.lblTradeCmdty6.setName("lblTradeCmdty6");
    this.lblTradeCmdty6.setSize(new FormSize(50, 13));
    this.lblTradeCmdty6.setTabIndex(146);
    this.lblTradeCmdty6.setText("Medicine");
    // lblTradeCmdty5
    this.lblTradeCmdty5.setAutoSize(true);
    this.lblTradeCmdty5.setLocation(new java.awt.Point(8, 128));
    this.lblTradeCmdty5.setName("lblTradeCmdty5");
    this.lblTradeCmdty5.setSize(new FormSize(49, 13));
    this.lblTradeCmdty5.setTabIndex(145);
    this.lblTradeCmdty5.setText("Firearms");
    // lblTradeCmdty4
    this.lblTradeCmdty4.setAutoSize(true);
    this.lblTradeCmdty4.setLocation(new java.awt.Point(8, 104));
    this.lblTradeCmdty4.setName("lblTradeCmdty4");
    this.lblTradeCmdty4.setSize(new FormSize(41, 13));
    this.lblTradeCmdty4.setTabIndex(144);
    this.lblTradeCmdty4.setText("Games");
    // lblTradeCmdty3
    this.lblTradeCmdty3.setAutoSize(true);
    this.lblTradeCmdty3.setLocation(new java.awt.Point(8, 80));
    this.lblTradeCmdty3.setName("lblTradeCmdty3");
    this.lblTradeCmdty3.setSize(new FormSize(23, 13));
    this.lblTradeCmdty3.setTabIndex(143);
    this.lblTradeCmdty3.setText("Ore");
    // lblTradeCmdty7
    this.lblTradeCmdty7.setAutoSize(true);
    this.lblTradeCmdty7.setLocation(new java.awt.Point(8, 176));
    this.lblTradeCmdty7.setName("lblTradeCmdty7");
    this.lblTradeCmdty7.setSize(new FormSize(53, 13));
    this.lblTradeCmdty7.setTabIndex(142);
    this.lblTradeCmdty7.setText("Machines");
    // lblBaysLabel
    this.lblBaysLabel.setAutoSize(true);
    this.lblBaysLabel.setLocation(new java.awt.Point(144, 8));
    this.lblBaysLabel.setName("lblBaysLabel");
    this.lblBaysLabel.setSize(new FormSize(33, 13));
    this.lblBaysLabel.setTabIndex(152);
    this.lblBaysLabel.setText("Bays:");
    // lblBays
    this.lblBays.setLocation(new java.awt.Point(176, 8));
    this.lblBays.setName("lblBays");
    this.lblBays.setSize(new FormSize(33, 13));
    this.lblBays.setTabIndex(153);
    this.lblBays.setText("88/88");
    // btnDone
    this.btnDone.setDialogResult(DialogResult.Cancel);
    this.btnDone.setFlatStyle(FlatStyle.Flat);
    this.btnDone.setLocation(new java.awt.Point(87, 252));
    this.btnDone.setName("btnDone");
    this.btnDone.setSize(new FormSize(44, 22));
    this.btnDone.setTabIndex(154);
    this.btnDone.setText("Done");
    // FormJettison
    this.setAcceptButton(this.btnDone);
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnDone);
    this.setClientSize(new FormSize(218, 283));
    this.Controls.addAll(Arrays.asList(
        this.btnDone,
        this.lblBays,
        this.lblBaysLabel,
        this.lblTradeCmdty9,
        this.lblTradeCmdty8,
        this.lblTradeCmdty2,
        this.lblTradeCmdty0,
        this.lblTradeCmdty1,
        this.lblTradeCmdty6,
        this.lblTradeCmdty5,
        this.lblTradeCmdty4,
        this.lblTradeCmdty3,
        this.lblTradeCmdty7,
        this.btnJettisonAll9,
        this.btnJettisonQty9,
        this.btnJettisonAll8,
        this.btnJettisonQty8,
        this.btnJettisonAll7,
        this.btnJettisonQty7,
        this.btnJettisonAll6,
        this.btnJettisonQty6,
        this.btnJettisonAll5,
        this.btnJettisonQty5,
        this.btnJettisonAll4,
        this.btnJettisonQty4,
        this.btnJettisonAll3,
        this.btnJettisonQty3,
        this.btnJettisonAll2,
        this.btnJettisonQty2,
        this.btnJettisonAll1,
        this.btnJettisonQty1,
        this.btnJettisonAll0,
        this.btnJettisonQty0));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormJettison");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Jettison Cargo");
    this.ResumeLayout(false);
  }

  private void Jettison(int tradeItem, boolean all) {
    game.CargoJettison(tradeItem, all, this);
    UpdateAll();
  }

  private void UpdateAll() {
    Ship ship = game.Commander().getShip();
    for(int i = 0; i < btnJettisonQty.length; i++) {
      btnJettisonQty[i].setText("" + ship.Cargo()[i]);
    }
    lblBays.setText(ship.FilledCargoBays() + "/" + ship.CargoBays());
  }

  private void btnJettison_Click(Object sender, EventArgs e) {
    String name = ((Button)sender).getName();
    boolean all = name.indexOf("Qty") < 0;
    int index = Integer.parseInt(name.substring(name.length() - 1));
    Jettison(index, all);
  }
}
