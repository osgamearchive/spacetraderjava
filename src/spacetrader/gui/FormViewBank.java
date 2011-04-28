package spacetrader.gui;
import java.util.Arrays;
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
import jwinforms.Label;
import jwinforms.FormSize;
import jwinforms.WinformForm;
import spacetrader.Commander;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Strings;
import spacetrader.enums.AlertType;


public class FormViewBank extends WinformForm {
  private Button btnGetLoan;
  private Button btnBuyInsurance;
  private Button btnPayBack;
  private Button btnClose;
  private Container components = null;
  private Label lblLoan;
  private Label lblCurrentDebtLabel;
  private Label lblMaxLoanLabel;
  private Label lblCurrentDebt;
  private Label lblMaxLoan;
  private Label lblNoClaim;
  private Label lblShipValue;
  private Label lblNoClaimLabel;
  private Label lblShipValueLabel;
  private Label lblInsurance;
  private Label lblInsAmt;
  private Label lblInsAmtLabel;
  private Label lblMaxNoClaim;
  private Game game = Game.CurrentGame();
  private Commander cmdr = Game.CurrentGame().Commander();
  private int MaxLoan = Game.CurrentGame().Commander().getPoliceRecordScore() >= Consts.PoliceRecordScoreClean
      ? Math.min(25000, Math.max(1000, Game.CurrentGame().Commander().Worth() / 5000 * 500)) : 500;

  public FormViewBank() {
    InitializeComponent();
    UpdateAll();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblLoan = new Label();
    this.lblCurrentDebtLabel = new Label();
    this.lblMaxLoanLabel = new Label();
    this.lblCurrentDebt = new Label();
    this.lblMaxLoan = new Label();
    this.btnGetLoan = new Button();
    this.btnBuyInsurance = new Button();
    this.lblNoClaim = new Label();
    this.lblShipValue = new Label();
    this.lblNoClaimLabel = new Label();
    this.lblShipValueLabel = new Label();
    this.lblInsurance = new Label();
    this.lblInsAmt = new Label();
    this.lblInsAmtLabel = new Label();
    this.btnPayBack = new Button();
    this.btnClose = new Button();
    this.lblMaxNoClaim = new Label();
    this.SuspendLayout();
    // lblLoan
    this.lblLoan.setAutoSize(true);
    this.lblLoan.setFont(new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblLoan.setLocation(new java.awt.Point(8, 8));
    this.lblLoan.setName("lblLoan");
    this.lblLoan.setSize(new FormSize(44, 19));
    this.lblLoan.setTabIndex(1);
    this.lblLoan.setText("Loan");
    // lblCurrentDebtLabel
    this.lblCurrentDebtLabel.setAutoSize(true);
    this.lblCurrentDebtLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblCurrentDebtLabel.setLocation(new java.awt.Point(16, 32));
    this.lblCurrentDebtLabel.setName("lblCurrentDebtLabel");
    this.lblCurrentDebtLabel.setSize(new FormSize(75, 13));
    this.lblCurrentDebtLabel.setTabIndex(2);
    this.lblCurrentDebtLabel.setText("Current Debt:");
    // lblMaxLoanLabel
    this.lblMaxLoanLabel.setAutoSize(true);
    this.lblMaxLoanLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblMaxLoanLabel.setLocation(new java.awt.Point(16, 52));
    this.lblMaxLoanLabel.setName("lblMaxLoanLabel");
    this.lblMaxLoanLabel.setSize(new FormSize(88, 13));
    this.lblMaxLoanLabel.setTabIndex(3);
    this.lblMaxLoanLabel.setText("Maximum Loan:");
    // lblCurrentDebt
    this.lblCurrentDebt.setLocation(new java.awt.Point(136, 32));
    this.lblCurrentDebt.setName("lblCurrentDebt");
    this.lblCurrentDebt.setSize(new FormSize(56, 13));
    this.lblCurrentDebt.setTabIndex(4);
    this.lblCurrentDebt.setText("88,888 cr.");
    this.lblCurrentDebt.TextAlign = ContentAlignment.TopRight;
    // lblMaxLoan
    this.lblMaxLoan.setLocation(new java.awt.Point(136, 52));
    this.lblMaxLoan.setName("lblMaxLoan");
    this.lblMaxLoan.setSize(new FormSize(56, 13));
    this.lblMaxLoan.setTabIndex(5);
    this.lblMaxLoan.setText("88,888 cr.");
    this.lblMaxLoan.TextAlign = ContentAlignment.TopRight;
    // btnGetLoan
    this.btnGetLoan.setFlatStyle(FlatStyle.Flat);
    this.btnGetLoan.setLocation(new java.awt.Point(16, 72));
    this.btnGetLoan.setName("btnGetLoan");
    this.btnGetLoan.setSize(new FormSize(61, 22));
    this.btnGetLoan.setTabIndex(1);
    this.btnGetLoan.setText("Get Loan");
    this.btnGetLoan.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnGetLoan_Click(sender, e);
      }
    });
    // btnBuyInsurance
    this.btnBuyInsurance.setFlatStyle(FlatStyle.Flat);
    this.btnBuyInsurance.setLocation(new java.awt.Point(16, 196));
    this.btnBuyInsurance.setName("btnBuyInsurance");
    this.btnBuyInsurance.setSize(new FormSize(90, 22));
    this.btnBuyInsurance.setTabIndex(3);
    this.btnBuyInsurance.setText("Stop Insurance");
    this.btnBuyInsurance.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnBuyInsurance_Click(sender, e);
      }
    });
    // lblNoClaim
    this.lblNoClaim.setLocation(new java.awt.Point(154, 156));
    this.lblNoClaim.setName("lblNoClaim");
    this.lblNoClaim.setSize(new FormSize(32, 13));
    this.lblNoClaim.setTabIndex(27);
    this.lblNoClaim.setText("88%");
    this.lblNoClaim.TextAlign = ContentAlignment.TopRight;
    // lblShipValue
    this.lblShipValue.setLocation(new java.awt.Point(136, 136));
    this.lblShipValue.setName("lblShipValue");
    this.lblShipValue.setSize(new FormSize(56, 13));
    this.lblShipValue.setTabIndex(26);
    this.lblShipValue.setText("88,888 cr.");
    this.lblShipValue.TextAlign = ContentAlignment.TopRight;
    // lblNoClaimLabel
    this.lblNoClaimLabel.setAutoSize(true);
    this.lblNoClaimLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblNoClaimLabel.setLocation(new java.awt.Point(16, 156));
    this.lblNoClaimLabel.setName("lblNoClaimLabel");
    this.lblNoClaimLabel.setSize(new FormSize(106, 13));
    this.lblNoClaimLabel.setTabIndex(25);
    this.lblNoClaimLabel.setText("No-Claim Discount:");
    // lblShipValueLabel
    this.lblShipValueLabel.setAutoSize(true);
    this.lblShipValueLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblShipValueLabel.setLocation(new java.awt.Point(16, 136));
    this.lblShipValueLabel.setName("lblShipValueLabel");
    this.lblShipValueLabel.setSize(new FormSize(65, 13));
    this.lblShipValueLabel.setTabIndex(24);
    this.lblShipValueLabel.setText("Ship Value:");
    // lblInsurance
    this.lblInsurance.setAutoSize(true);
    this.lblInsurance.setFont(new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblInsurance.setLocation(new java.awt.Point(8, 112));
    this.lblInsurance.setName("lblInsurance");
    this.lblInsurance.setSize(new FormSize(81, 19));
    this.lblInsurance.setTabIndex(23);
    this.lblInsurance.setText("Insurance");
    // lblInsAmt
    this.lblInsAmt.setLocation(new java.awt.Point(136, 176));
    this.lblInsAmt.setName("lblInsAmt");
    this.lblInsAmt.setSize(new FormSize(82, 13));
    this.lblInsAmt.setTabIndex(30);
    this.lblInsAmt.setText("8,888 cr. daily");
    this.lblInsAmt.TextAlign = ContentAlignment.TopRight;
    // lblInsAmtLabel
    this.lblInsAmtLabel.setAutoSize(true);
    this.lblInsAmtLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblInsAmtLabel.setLocation(new java.awt.Point(16, 176));
    this.lblInsAmtLabel.setName("lblInsAmtLabel");
    this.lblInsAmtLabel.setSize(new FormSize(38, 13));
    this.lblInsAmtLabel.setTabIndex(29);
    this.lblInsAmtLabel.setText("Costs:");
    // btnPayBack
    this.btnPayBack.setFlatStyle(FlatStyle.Flat);
    this.btnPayBack.setLocation(new java.awt.Point(88, 72));
    this.btnPayBack.setName("btnPayBack");
    this.btnPayBack.setSize(new FormSize(90, 22));
    this.btnPayBack.setTabIndex(2);
    this.btnPayBack.setText("Pay Back Loan");
    this.btnPayBack.setClick(new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        btnPayBack_Click(sender, e);
      }
    });
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new FormSize(26, 27));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // lblMaxNoClaim
    this.lblMaxNoClaim.setAutoSize(true);
    this.lblMaxNoClaim.setLocation(new java.awt.Point(182, 156));
    this.lblMaxNoClaim.setName("lblMaxNoClaim");
    this.lblMaxNoClaim.setSize(new FormSize(33, 13));
    this.lblMaxNoClaim.setTabIndex(33);
    this.lblMaxNoClaim.setText("(max)");
    this.lblMaxNoClaim.setVisible(false);
    // FormViewBank
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new FormSize(226, 231));
    this.Controls.addAll(Arrays.asList(
        this.lblMaxNoClaim,
        this.btnClose,
        this.btnPayBack,
        this.lblInsAmt,
        this.lblInsAmtLabel,
        this.lblNoClaimLabel,
        this.lblShipValueLabel,
        this.lblInsurance,
        this.lblMaxLoanLabel,
        this.lblCurrentDebtLabel,
        this.lblLoan,
        this.btnBuyInsurance,
        this.lblNoClaim,
        this.lblShipValue,
        this.btnGetLoan,
        this.lblMaxLoan,
        this.lblCurrentDebt));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormViewBank");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Bank");
    this.ResumeLayout(false);
  }

  private void UpdateAll() {
    // Loan Info
    lblCurrentDebt.setText(Functions.FormatMoney(cmdr.getDebt()));
    lblMaxLoan.setText(Functions.FormatMoney(MaxLoan));
    btnPayBack.setVisible((cmdr.getDebt() > 0));
    // Insurance Info
    lblShipValue.setText(Functions.FormatMoney(cmdr.getShip().BaseWorth(true)));
    lblNoClaim.setText(Functions.FormatPercent(cmdr.NoClaim()));
    lblMaxNoClaim.setVisible((cmdr.NoClaim() == Consts.MaxNoClaim));
    lblInsAmt.setText(Functions.StringVars(Strings.MoneyRateSuffix, Functions.FormatMoney(game.InsuranceCosts())));
    btnBuyInsurance.setText(Functions.StringVars(Strings.BankInsuranceButtonText, cmdr.getInsurance()
        ? Strings.BankInsuranceButtonStop : Strings.BankInsuranceButtonBuy));
  }

  private void btnGetLoan_Click(Object sender, EventArgs e) {
    if(cmdr.getDebt() >= MaxLoan) {
      FormAlert.Alert(AlertType.DebtTooLargeLoan, this);
    } else {
      FormGetLoan form = new FormGetLoan(MaxLoan - cmdr.getDebt());
      if(form.ShowDialog(this) == DialogResult.OK) {
        cmdr.setCash(cmdr.getCash() + form.Amount());
        cmdr.setDebt(cmdr.getDebt() + form.Amount());
        UpdateAll();
        game.getParentWindow().UpdateAll();
      }
    }
  }

  private void btnPayBack_Click(Object sender, EventArgs e) {
    if(cmdr.getDebt() == 0) {
      FormAlert.Alert(AlertType.DebtNone, this);
    } else {
      FormPayBackLoan form = new FormPayBackLoan();
      if(form.ShowDialog(this) == DialogResult.OK) {
        cmdr.setCash(cmdr.getCash() - form.Amount());
        cmdr.setDebt(cmdr.getDebt() - form.Amount());
        UpdateAll();
        game.getParentWindow().UpdateAll();
      }
    }
  }

  private void btnBuyInsurance_Click(Object sender, EventArgs e) {
    if(cmdr.getInsurance()) {
      if(FormAlert.Alert(AlertType.InsuranceStop, this) == DialogResult.Yes) {
        cmdr.setInsurance(false);
        cmdr.NoClaim(0);
      }
    } else if(!cmdr.getShip().getEscapePod()) {
      FormAlert.Alert(AlertType.InsuranceNoEscapePod, this);
    } else {
      cmdr.setInsurance(true);
      cmdr.NoClaim(0);
    }
    UpdateAll();
    game.getParentWindow().UpdateAll();
  }
}
