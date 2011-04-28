package spacetrader.gui;
import jwinforms.Button;
import jwinforms.Container;
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
import org.gts.bst.cargo.CargoSellOp;
import spacetrader.Commander;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Strings;


public class FormCargoSell extends WinformForm {
  private Button btnOk;
  private Button btnAll;
  private Button btnNone;
  private Label lblStatement;
  private Label lblQuestion;
  private Label lblPaid;
  private Label lblProfit;
  private NumericUpDown numAmount;
  private Container components = null;
  private Game game = Game.CurrentGame();

  public FormCargoSell(int item, int maxAmount, CargoSellOp op, int price) {
    InitializeComponent();
    Commander cmdr = game.Commander();
    int cost = cmdr.PriceCargo()[item] / cmdr.getShip().Cargo()[item];
    numAmount.setMaximum(maxAmount);
    numAmount.setValue(numAmount.getMinimum());
    this.setText(Functions.StringVars(Strings.CargoTitle, Strings.CargoSellOps[op.CastToInt()], Consts.TradeItems[item].Name()));
    lblQuestion.setText(Functions.StringVars(Strings.CargoSellQuestion, Strings.CargoSellOps[op.CastToInt()].toLowerCase()));
    lblPaid.setText(Functions.StringVars(op == CargoSellOp.SellTrader
        ? Strings.CargoSellPaidTrader : Strings.CargoSellPaid, Functions.FormatMoney(cost), Functions.Multiples(maxAmount, Strings.CargoUnit)));
    lblProfit.setText(Functions.StringVars(Strings.CargoSellProfit, price >= cost
        ? "profit" : "loss", Functions.FormatMoney(price >= cost ? price - cost : cost - price)));
    // Override defaults for some ops.
    switch(op) {
      case Dump:
        lblStatement.setText(Functions.StringVars(
            Strings.CargoSellStatementDump,
            Strings.CargoSellOps[op.CastToInt()].toLowerCase(),
            Functions.FormatNumber(maxAmount)));
        lblProfit.setText(Functions.StringVars(Strings.CargoSellDumpCost, Functions.FormatMoney(-price)));
        break;
      case Jettison:
        lblStatement.setText(Functions.StringVars(
            Strings.CargoSellStatementDump,
            Strings.CargoSellOps[op.CastToInt()].toLowerCase(),
            Functions.FormatNumber(maxAmount)));
        break;
      case SellSystem:
        lblStatement.setText(Functions.StringVars(
            Strings.CargoSellStatement, Functions.FormatNumber(maxAmount), Functions.FormatMoney(price)));
        break;
      case SellTrader:
        lblStatement.setText(Functions.StringVars(
            Strings.CargoSellStatementTrader,
            Consts.TradeItems[item].Name(), Functions.FormatMoney(price)));
        break;
    }
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblQuestion = new Label();
    this.lblStatement = new Label();
    this.numAmount = new NumericUpDown();
    this.btnOk = new Button();
    this.btnAll = new Button();
    this.btnNone = new Button();
    this.lblPaid = new Label();
    this.lblProfit = new Label();
    ((ISupportInitialize)(this.numAmount)).BeginInit();
    this.SuspendLayout();
    // lblQuestion
    this.lblQuestion.setLocation(new java.awt.Point(8, 50));
    this.lblQuestion.setName("lblQuestion");
    this.lblQuestion.setSize(new FormSize(160, 13));
    this.lblQuestion.setTabIndex(1);
    this.lblQuestion.setText("How many do you want to sell?");
    // lblStatement
    this.lblStatement.setLocation(new java.awt.Point(8, 8));
    this.lblStatement.setName("lblStatement");
    this.lblStatement.setSize(new FormSize(302, 13));
    this.lblStatement.setTabIndex(3);
    this.lblStatement.setText("The trader wants to by Machines, and offers 8,888 cr. each.");
    // numAmount
    this.numAmount.setLocation(new java.awt.Point(168, 48));
    this.numAmount.setMinimum(1);
    this.numAmount.setName("numAmount");
    this.numAmount.setSize(new FormSize(38, 20));
    this.numAmount.setTabIndex(1);
    this.numAmount.setValue(88);
    // btnOk
    this.btnOk.setDialogResult(DialogResult.OK);
    this.btnOk.setFlatStyle(FlatStyle.Flat);
    this.btnOk.setLocation(new java.awt.Point(83, 74));
    this.btnOk.setName("btnOk");
    this.btnOk.setSize(new FormSize(41, 22));
    this.btnOk.setTabIndex(2);
    this.btnOk.setText("Ok");
    // btnAll
    this.btnAll.setDialogResult(DialogResult.OK);
    this.btnAll.setFlatStyle(FlatStyle.Flat);
    this.btnAll.setLocation(new java.awt.Point(131, 74));
    this.btnAll.setName("btnAll");
    this.btnAll.setSize(new FormSize(41, 22));
    this.btnAll.setTabIndex(3);
    this.btnAll.setText("All");
    this.btnAll.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnAll_Click(sender, e);
      }
    });
    // btnNone
    this.btnNone.setDialogResult(DialogResult.Cancel);
    this.btnNone.setFlatStyle(FlatStyle.Flat);
    this.btnNone.setLocation(new java.awt.Point(179, 74));
    this.btnNone.setName("btnNone");
    this.btnNone.setSize(new FormSize(41, 22));
    this.btnNone.setTabIndex(4);
    this.btnNone.setText("None");
    // lblPaid
    this.lblPaid.setLocation(new java.awt.Point(8, 21));
    this.lblPaid.setName("lblPaid");
    this.lblPaid.setSize(new FormSize(280, 13));
    this.lblPaid.setTabIndex(5);
    this.lblPaid.setText("You paid about 8,888 cr. per unit, and can sell 88 units.");
    // lblProfit
    this.lblProfit.setLocation(new java.awt.Point(8, 34));
    this.lblProfit.setName("lblProfit");
    this.lblProfit.setSize(new FormSize(200, 13));
    this.lblProfit.setTabIndex(6);
    this.lblProfit.setText("It costs 8,888 cr. per unit for disposal.");
    // FormCargoSell
    this.setAcceptButton(this.btnOk);
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnNone);
    this.setClientSize(new FormSize(302, 105));
    this.setControlBox(false);
    this.Controls.add(this.lblProfit);
    this.Controls.add(this.lblPaid);
    this.Controls.add(this.btnNone);
    this.Controls.add(this.btnAll);
    this.Controls.add(this.btnOk);
    this.Controls.add(this.numAmount);
    this.Controls.add(this.lblQuestion);
    this.Controls.add(this.lblStatement);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setName("FormCargoSell");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Sell Xxxxxxxxxx");
    ((ISupportInitialize)(this.numAmount)).EndInit();
    this.ResumeLayout(false);
  }

  private void btnAll_Click(Object sender, EventArgs e) {
    numAmount.setValue(numAmount.getMaximum());
  }

  public int Amount() {
    return numAmount.getValue();
  }
}
