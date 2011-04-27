package spacetrader.gui;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.Label;
import jwinforms.Size;
import jwinforms.WinformForm;
import spacetrader.Game;
import spacetrader.Ship;


public class FormPlunder extends WinformForm {
  private Button btnPlunderAll9;
  private Button btnPlunderQty9;
  private Button btnPlunderAll8;
  private Button btnPlunderQty8;
  private Button btnPlunderAll7;
  private Button btnPlunderQty7;
  private Button btnPlunderAll6;
  private Button btnPlunderQty6;
  private Button btnPlunderAll5;
  private Button btnPlunderQty5;
  private Button btnPlunderAll4;
  private Button btnPlunderQty4;
  private Button btnPlunderAll3;
  private Button btnPlunderQty3;
  private Button btnPlunderAll2;
  private Button btnPlunderQty2;
  private Button btnPlunderAll1;
  private Button btnPlunderQty1;
  private Button btnPlunderAll0;
  private Button btnPlunderQty0;
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
  private Button btnJettison;
  private Container components = null;
  private Button[] btnPlunderQty;
  private Button[] btnPlunderAll;
  private Game game = Game.CurrentGame();

  public FormPlunder() {
    InitializeComponent();
    btnPlunderQty = new Button[] {
          btnPlunderQty0,
          btnPlunderQty1,
          btnPlunderQty2,
          btnPlunderQty3,
          btnPlunderQty4,
          btnPlunderQty5,
          btnPlunderQty6,
          btnPlunderQty7,
          btnPlunderQty8,
          btnPlunderQty9
        };
    btnPlunderAll = new Button[] {
          btnPlunderAll0,
          btnPlunderAll1,
          btnPlunderAll2,
          btnPlunderAll3,
          btnPlunderAll4,
          btnPlunderAll5,
          btnPlunderAll6,
          btnPlunderAll7,
          btnPlunderAll8,
          btnPlunderAll9
        };
    UpdateAll();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnPlunderAll9 = new Button();
    this.btnPlunderQty9 = new Button();
    this.btnPlunderAll8 = new Button();
    this.btnPlunderQty8 = new Button();
    this.btnPlunderAll7 = new Button();
    this.btnPlunderQty7 = new Button();
    this.btnPlunderAll6 = new Button();
    this.btnPlunderQty6 = new Button();
    this.btnPlunderAll5 = new Button();
    this.btnPlunderQty5 = new Button();
    this.btnPlunderAll4 = new Button();
    this.btnPlunderQty4 = new Button();
    this.btnPlunderAll3 = new Button();
    this.btnPlunderQty3 = new Button();
    this.btnPlunderAll2 = new Button();
    this.btnPlunderQty2 = new Button();
    this.btnPlunderAll1 = new Button();
    this.btnPlunderQty1 = new Button();
    this.btnPlunderAll0 = new Button();
    this.btnPlunderQty0 = new Button();
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
    this.btnJettison = new Button();
    this.SuspendLayout();
    // btnPlunderAll9
    this.btnPlunderAll9.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll9.setLocation(new java.awt.Point(100, 220));
    this.btnPlunderAll9.setName("btnPlunderAll9");
    this.btnPlunderAll9.setSize(new Size(32, 22));
    this.btnPlunderAll9.setTabIndex(141);
    this.btnPlunderAll9.setText("All");
    this.btnPlunderAll9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty9
    this.btnPlunderQty9.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty9.setLocation(new java.awt.Point(68, 220));
    this.btnPlunderQty9.setName("btnPlunderQty9");
    this.btnPlunderQty9.setSize(new Size(28, 22));
    this.btnPlunderQty9.setTabIndex(140);
    this.btnPlunderQty9.setText("88");
    this.btnPlunderQty9.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll8
    this.btnPlunderAll8.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll8.setLocation(new java.awt.Point(100, 196));
    this.btnPlunderAll8.setName("btnPlunderAll8");
    this.btnPlunderAll8.setSize(new Size(32, 22));
    this.btnPlunderAll8.setTabIndex(139);
    this.btnPlunderAll8.setText("All");
    this.btnPlunderAll8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty8
    this.btnPlunderQty8.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty8.setLocation(new java.awt.Point(68, 196));
    this.btnPlunderQty8.setName("btnPlunderQty8");
    this.btnPlunderQty8.setSize(new Size(28, 22));
    this.btnPlunderQty8.setTabIndex(138);
    this.btnPlunderQty8.setText("88");
    this.btnPlunderQty8.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll7
    this.btnPlunderAll7.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll7.setLocation(new java.awt.Point(100, 172));
    this.btnPlunderAll7.setName("btnPlunderAll7");
    this.btnPlunderAll7.setSize(new Size(32, 22));
    this.btnPlunderAll7.setTabIndex(137);
    this.btnPlunderAll7.setText("All");
    this.btnPlunderAll7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty7
    this.btnPlunderQty7.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty7.setLocation(new java.awt.Point(68, 172));
    this.btnPlunderQty7.setName("btnPlunderQty7");
    this.btnPlunderQty7.setSize(new Size(28, 22));
    this.btnPlunderQty7.setTabIndex(136);
    this.btnPlunderQty7.setText("88");
    this.btnPlunderQty7.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll6
    this.btnPlunderAll6.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll6.setLocation(new java.awt.Point(100, 148));
    this.btnPlunderAll6.setName("btnPlunderAll6");
    this.btnPlunderAll6.setSize(new Size(32, 22));
    this.btnPlunderAll6.setTabIndex(135);
    this.btnPlunderAll6.setText("All");
    this.btnPlunderAll6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty6
    this.btnPlunderQty6.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty6.setLocation(new java.awt.Point(68, 148));
    this.btnPlunderQty6.setName("btnPlunderQty6");
    this.btnPlunderQty6.setSize(new Size(28, 22));
    this.btnPlunderQty6.setTabIndex(134);
    this.btnPlunderQty6.setText("88");
    this.btnPlunderQty6.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll5
    this.btnPlunderAll5.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll5.setLocation(new java.awt.Point(100, 124));
    this.btnPlunderAll5.setName("btnPlunderAll5");
    this.btnPlunderAll5.setSize(new Size(32, 22));
    this.btnPlunderAll5.setTabIndex(133);
    this.btnPlunderAll5.setText("All");
    this.btnPlunderAll5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty5
    this.btnPlunderQty5.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty5.setLocation(new java.awt.Point(68, 124));
    this.btnPlunderQty5.setName("btnPlunderQty5");
    this.btnPlunderQty5.setSize(new Size(28, 22));
    this.btnPlunderQty5.setTabIndex(132);
    this.btnPlunderQty5.setText("88");
    this.btnPlunderQty5.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll4
    this.btnPlunderAll4.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll4.setLocation(new java.awt.Point(100, 100));
    this.btnPlunderAll4.setName("btnPlunderAll4");
    this.btnPlunderAll4.setSize(new Size(32, 22));
    this.btnPlunderAll4.setTabIndex(131);
    this.btnPlunderAll4.setText("All");
    this.btnPlunderAll4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty4
    this.btnPlunderQty4.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty4.setLocation(new java.awt.Point(68, 100));
    this.btnPlunderQty4.setName("btnPlunderQty4");
    this.btnPlunderQty4.setSize(new Size(28, 22));
    this.btnPlunderQty4.setTabIndex(130);
    this.btnPlunderQty4.setText("88");
    this.btnPlunderQty4.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll3
    this.btnPlunderAll3.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll3.setLocation(new java.awt.Point(100, 76));
    this.btnPlunderAll3.setName("btnPlunderAll3");
    this.btnPlunderAll3.setSize(new Size(32, 22));
    this.btnPlunderAll3.setTabIndex(129);
    this.btnPlunderAll3.setText("All");
    this.btnPlunderAll3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty3
    this.btnPlunderQty3.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty3.setLocation(new java.awt.Point(68, 76));
    this.btnPlunderQty3.setName("btnPlunderQty3");
    this.btnPlunderQty3.setSize(new Size(28, 22));
    this.btnPlunderQty3.setTabIndex(128);
    this.btnPlunderQty3.setText("88");
    this.btnPlunderQty3.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll2
    this.btnPlunderAll2.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll2.setLocation(new java.awt.Point(100, 52));
    this.btnPlunderAll2.setName("btnPlunderAll2");
    this.btnPlunderAll2.setSize(new Size(32, 22));
    this.btnPlunderAll2.setTabIndex(127);
    this.btnPlunderAll2.setText("All");
    this.btnPlunderAll2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty2
    this.btnPlunderQty2.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty2.setLocation(new java.awt.Point(68, 52));
    this.btnPlunderQty2.setName("btnPlunderQty2");
    this.btnPlunderQty2.setSize(new Size(28, 22));
    this.btnPlunderQty2.setTabIndex(126);
    this.btnPlunderQty2.setText("88");
    this.btnPlunderQty2.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll1
    this.btnPlunderAll1.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll1.setLocation(new java.awt.Point(100, 28));
    this.btnPlunderAll1.setName("btnPlunderAll1");
    this.btnPlunderAll1.setSize(new Size(32, 22));
    this.btnPlunderAll1.setTabIndex(125);
    this.btnPlunderAll1.setText("All");
    this.btnPlunderAll1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty1
    this.btnPlunderQty1.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty1.setLocation(new java.awt.Point(68, 28));
    this.btnPlunderQty1.setName("btnPlunderQty1");
    this.btnPlunderQty1.setSize(new Size(28, 22));
    this.btnPlunderQty1.setTabIndex(124);
    this.btnPlunderQty1.setText("88");
    this.btnPlunderQty1.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderAll0
    this.btnPlunderAll0.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderAll0.setLocation(new java.awt.Point(100, 4));
    this.btnPlunderAll0.setName("btnPlunderAll0");
    this.btnPlunderAll0.setSize(new Size(32, 22));
    this.btnPlunderAll0.setTabIndex(123);
    this.btnPlunderAll0.setText("All");
    this.btnPlunderAll0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // btnPlunderQty0
    this.btnPlunderQty0.setFlatStyle(FlatStyle.Flat);
    this.btnPlunderQty0.setLocation(new java.awt.Point(68, 4));
    this.btnPlunderQty0.setName("btnPlunderQty0");
    this.btnPlunderQty0.setSize(new Size(28, 22));
    this.btnPlunderQty0.setTabIndex(122);
    this.btnPlunderQty0.setText("88");
    this.btnPlunderQty0.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPlunder_Click(sender, e);
      }
    });
    // lblTradeCmdty9
    this.lblTradeCmdty9.setAutoSize(true);
    this.lblTradeCmdty9.setLocation(new java.awt.Point(8, 224));
    this.lblTradeCmdty9.setName("lblTradeCmdty9");
    this.lblTradeCmdty9.setSize(new Size(41, 13));
    this.lblTradeCmdty9.setTabIndex(151);
    this.lblTradeCmdty9.setText("Robots");
    // lblTradeCmdty8
    this.lblTradeCmdty8.setAutoSize(true);
    this.lblTradeCmdty8.setLocation(new java.awt.Point(8, 200));
    this.lblTradeCmdty8.setName("lblTradeCmdty8");
    this.lblTradeCmdty8.setSize(new Size(52, 13));
    this.lblTradeCmdty8.setTabIndex(150);
    this.lblTradeCmdty8.setText("Narcotics");
    // lblTradeCmdty2
    this.lblTradeCmdty2.setAutoSize(true);
    this.lblTradeCmdty2.setLocation(new java.awt.Point(8, 56));
    this.lblTradeCmdty2.setName("lblTradeCmdty2");
    this.lblTradeCmdty2.setSize(new Size(31, 13));
    this.lblTradeCmdty2.setTabIndex(149);
    this.lblTradeCmdty2.setText("Food");
    // lblTradeCmdty0
    this.lblTradeCmdty0.setAutoSize(true);
    this.lblTradeCmdty0.setLocation(new java.awt.Point(8, 8));
    this.lblTradeCmdty0.setName("lblTradeCmdty0");
    this.lblTradeCmdty0.setSize(new Size(36, 13));
    this.lblTradeCmdty0.setTabIndex(148);
    this.lblTradeCmdty0.setText("Water");
    // lblTradeCmdty1
    this.lblTradeCmdty1.setAutoSize(true);
    this.lblTradeCmdty1.setLocation(new java.awt.Point(8, 32));
    this.lblTradeCmdty1.setName("lblTradeCmdty1");
    this.lblTradeCmdty1.setSize(new Size(27, 13));
    this.lblTradeCmdty1.setTabIndex(147);
    this.lblTradeCmdty1.setText("Furs");
    // lblTradeCmdty6
    this.lblTradeCmdty6.setAutoSize(true);
    this.lblTradeCmdty6.setLocation(new java.awt.Point(8, 152));
    this.lblTradeCmdty6.setName("lblTradeCmdty6");
    this.lblTradeCmdty6.setSize(new Size(50, 13));
    this.lblTradeCmdty6.setTabIndex(146);
    this.lblTradeCmdty6.setText("Medicine");
    // lblTradeCmdty5
    this.lblTradeCmdty5.setAutoSize(true);
    this.lblTradeCmdty5.setLocation(new java.awt.Point(8, 128));
    this.lblTradeCmdty5.setName("lblTradeCmdty5");
    this.lblTradeCmdty5.setSize(new Size(46, 13));
    this.lblTradeCmdty5.setTabIndex(145);
    this.lblTradeCmdty5.setText("Firearms");
    // lblTradeCmdty4
    this.lblTradeCmdty4.setAutoSize(true);
    this.lblTradeCmdty4.setLocation(new java.awt.Point(8, 104));
    this.lblTradeCmdty4.setName("lblTradeCmdty4");
    this.lblTradeCmdty4.setSize(new Size(40, 13));
    this.lblTradeCmdty4.setTabIndex(144);
    this.lblTradeCmdty4.setText("Games");
    // lblTradeCmdty3
    this.lblTradeCmdty3.setAutoSize(true);
    this.lblTradeCmdty3.setLocation(new java.awt.Point(8, 80));
    this.lblTradeCmdty3.setName("lblTradeCmdty3");
    this.lblTradeCmdty3.setSize(new Size(24, 13));
    this.lblTradeCmdty3.setTabIndex(143);
    this.lblTradeCmdty3.setText("Ore");
    // lblTradeCmdty7
    this.lblTradeCmdty7.setAutoSize(true);
    this.lblTradeCmdty7.setLocation(new java.awt.Point(8, 176));
    this.lblTradeCmdty7.setName("lblTradeCmdty7");
    this.lblTradeCmdty7.setSize(new Size(53, 13));
    this.lblTradeCmdty7.setTabIndex(142);
    this.lblTradeCmdty7.setText("Machines");
    // lblBaysLabel
    this.lblBaysLabel.setAutoSize(true);
    this.lblBaysLabel.setLocation(new java.awt.Point(144, 8));
    this.lblBaysLabel.setName("lblBaysLabel");
    this.lblBaysLabel.setSize(new Size(33, 13));
    this.lblBaysLabel.setTabIndex(152);
    this.lblBaysLabel.setText("Bays:");
    // lblBays
    this.lblBays.setLocation(new java.awt.Point(176, 8));
    this.lblBays.setName("lblBays");
    this.lblBays.setSize(new Size(48, 13));
    this.lblBays.setTabIndex(153);
    this.lblBays.setText("888/888");
    // btnDone
    this.btnDone.setDialogResult(DialogResult.Cancel);
    this.btnDone.setFlatStyle(FlatStyle.Flat);
    this.btnDone.setLocation(new java.awt.Point(87, 252));
    this.btnDone.setName("btnDone");
    this.btnDone.setSize(new Size(44, 22));
    this.btnDone.setTabIndex(154);
    this.btnDone.setText("Done");
    // btnJettison
    this.btnJettison.setFlatStyle(FlatStyle.Flat);
    this.btnJettison.setLocation(new java.awt.Point(150, 24));
    this.btnJettison.setName("btnJettison");
    this.btnJettison.setSize(new Size(53, 22));
    this.btnJettison.setTabIndex(155);
    this.btnJettison.setText("Jettison");
    this.btnJettison.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnJettison_Click(sender, e);
      }
    });
    // FormPlunder
    this.setAcceptButton(this.btnDone);
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setCancelButton(this.btnDone);
    this.setClientSize(new Size(230, 283));
    this.Controls.add(this.btnJettison);
    this.Controls.add(this.btnDone);
    this.Controls.add(this.lblBays);
    this.Controls.add(this.lblBaysLabel);
    this.Controls.add(this.lblTradeCmdty9);
    this.Controls.add(this.lblTradeCmdty8);
    this.Controls.add(this.lblTradeCmdty2);
    this.Controls.add(this.lblTradeCmdty0);
    this.Controls.add(this.lblTradeCmdty1);
    this.Controls.add(this.lblTradeCmdty6);
    this.Controls.add(this.lblTradeCmdty5);
    this.Controls.add(this.lblTradeCmdty4);
    this.Controls.add(this.lblTradeCmdty3);
    this.Controls.add(this.lblTradeCmdty7);
    this.Controls.add(this.btnPlunderAll9);
    this.Controls.add(this.btnPlunderQty9);
    this.Controls.add(this.btnPlunderAll8);
    this.Controls.add(this.btnPlunderQty8);
    this.Controls.add(this.btnPlunderAll7);
    this.Controls.add(this.btnPlunderQty7);
    this.Controls.add(this.btnPlunderAll6);
    this.Controls.add(this.btnPlunderQty6);
    this.Controls.add(this.btnPlunderAll5);
    this.Controls.add(this.btnPlunderQty5);
    this.Controls.add(this.btnPlunderAll4);
    this.Controls.add(this.btnPlunderQty4);
    this.Controls.add(this.btnPlunderAll3);
    this.Controls.add(this.btnPlunderQty3);
    this.Controls.add(this.btnPlunderAll2);
    this.Controls.add(this.btnPlunderQty2);
    this.Controls.add(this.btnPlunderAll1);
    this.Controls.add(this.btnPlunderQty1);
    this.Controls.add(this.btnPlunderAll0);
    this.Controls.add(this.btnPlunderQty0);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormPlunder");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Plunder Cargo");
    this.ResumeLayout(false);
    this.PerformLayout();
  }

  private void Plunder(int tradeItem, boolean all) {
    game.CargoPlunder(tradeItem, all, this);
    UpdateAll();
  }

  private void UpdateAll() {
    Ship ship = game.Commander().getShip();
    Ship opp = game.getOpponent();
    for(int i = 0; i < btnPlunderQty.length; i++) {
      btnPlunderQty[i].setText("" + opp.Cargo()[i]);
    }
    lblBays.setText(ship.FilledCargoBays() + "/" + ship.CargoBays());
  }

  private void btnJettison_Click(Object sender, EventArgs e) {
    (new FormJettison()).ShowDialog(this);
  }

  private void btnPlunder_Click(Object sender, EventArgs e) {
    String name = ((Button)sender).getName();
    boolean all = name.indexOf("Qty") < 0;
    int index = Integer.parseInt(name.substring(name.length() - 1));
    Plunder(index, all);
  }
}