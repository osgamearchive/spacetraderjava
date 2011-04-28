package spacetrader.gui;
import java.util.Arrays;
import jwinforms.Button;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.ISupportInitialize;
import jwinforms.Label;
import jwinforms.NumericUpDown;
import jwinforms.FormSize;
import jwinforms.WinformForm;
import spacetrader.Commander;
import spacetrader.Game;


public class FormBuyFuel extends WinformForm {
  private Button btnOk;
  private Button btnMax;
  private Button btnNothing;
  private Label lblQuestion;
  private NumericUpDown numAmount;
  private Game game = Game.CurrentGame();

  public FormBuyFuel() {
    InitializeComponent();
    Commander cmdr = game.Commander();
    numAmount.setMaximum(Math.min(cmdr.getCash(), (cmdr.getShip().FuelTanks() - cmdr.getShip().getFuel()) * cmdr.getShip().getFuelCost()));
    numAmount.setValue(numAmount.getMaximum());
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblQuestion = new Label();
    this.numAmount = new NumericUpDown();
    this.btnOk = new Button();
    this.btnMax = new Button();
    this.btnNothing = new Button();
    ((ISupportInitialize)(this.numAmount)).BeginInit();
    this.SuspendLayout();
    //
    // lblQuestion
    //
    this.lblQuestion.setAutoSize(true);
    this.lblQuestion.setLocation(new java.awt.Point(8, 8));
    this.lblQuestion.setName("lblQuestion");
    this.lblQuestion.setSize(new FormSize(211, 13));
    this.lblQuestion.setTabIndex(3);
    this.lblQuestion.setText("How much do you want to spend on fuel?");
    //
    // numAmount
    //
    this.numAmount.setLocation(new java.awt.Point(216, 6));
    this.numAmount.setMaximum(999);
    this.numAmount.setMinimum(1);
    this.numAmount.setName("numAmount");
    this.numAmount.setSize(new FormSize(44, 20));
    this.numAmount.setTabIndex(1);
    this.numAmount.setValue(888);
    //
    // btnOk
    //
    this.btnOk.setDialogResult(DialogResult.OK);
    this.btnOk.setFlatStyle(FlatStyle.Flat);
    this.btnOk.setLocation(new java.awt.Point(61, 32));
    this.btnOk.setName("btnOk");
    this.btnOk.setSize(new FormSize(41, 22));
    this.btnOk.setTabIndex(2);
    this.btnOk.setText("Ok");
    //
    // btnMax
    //
    this.btnMax.setDialogResult(DialogResult.OK);
    this.btnMax.setFlatStyle(FlatStyle.Flat);
    this.btnMax.setLocation(new java.awt.Point(109, 32));
    this.btnMax.setName("btnMax");
    this.btnMax.setSize(new FormSize(41, 22));
    this.btnMax.setTabIndex(3);
    this.btnMax.setText("Max");
    this.btnMax.setClick(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnMax_Click(sender, e);
      }
    });
    //
    // btnNothing
    //
    this.btnNothing.setDialogResult(DialogResult.Cancel);
    this.btnNothing.setFlatStyle(FlatStyle.Flat);
    this.btnNothing.setLocation(new java.awt.Point(157, 32));
    this.btnNothing.setName("btnNothing");
    this.btnNothing.setSize(new FormSize(53, 22));
    this.btnNothing.setTabIndex(4);
    this.btnNothing.setText("Nothing");
    //
    // FormBuyFuel
    //
    this.setAcceptButton(this.btnOk);
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnNothing);
    this.setClientSize(new FormSize(270, 63));
    this.setControlBox(false);
    this.Controls.addAll(Arrays.asList(this.btnNothing, this.btnMax, this.btnOk, this.numAmount, this.lblQuestion));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setName("FormBuyFuel");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Buy Fuel");
    ((ISupportInitialize)(this.numAmount)).EndInit();
    this.ResumeLayout(false);
  }

  private void btnMax_Click(Object sender, EventArgs e) {
    numAmount.setValue(numAmount.getMaximum());
  }

  public int Amount() {
    return numAmount.getValue();
  }
}
