package spacetrader.gui;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.Label;
import jwinforms.PictureBox;
import jwinforms.FormSize;
import jwinforms.WinformForm;
import spacetrader.Functions;
import spacetrader.Game;


public class FormCosts extends WinformForm {
  private Button btnClose;
  private Label lblMerc;
  private Label lblIns;
  private Label lblInt;
  private Label lblTax;
  private Label lblTotal;
  private Label lblTotalLabel;
  private Label lblTaxLabel;
  private Label lblIntLabel;
  private Label lblMercLabel;
  private Label lblInsLabel;
  private PictureBox picLine;
  private Container components = null;
  private Game game = Game.CurrentGame();

  public FormCosts() {
    InitializeComponent();
    lblMerc.setText(Functions.FormatMoney(game.MercenaryCosts()));
    lblIns.setText(Functions.FormatMoney(game.InsuranceCosts()));
    lblInt.setText(Functions.FormatMoney(game.InterestCosts()));
    lblTax.setText(Functions.FormatMoney(game.WormholeCosts()));
    lblTotal.setText(Functions.FormatMoney(game.CurrentCosts()));
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnClose = new Button();
    this.lblMerc = new Label();
    this.lblIns = new Label();
    this.lblInt = new Label();
    this.lblTax = new Label();
    this.lblTotal = new Label();
    this.lblTotalLabel = new Label();
    this.lblTaxLabel = new Label();
    this.lblIntLabel = new Label();
    this.lblMercLabel = new Label();
    this.lblInsLabel = new Label();
    this.picLine = new PictureBox();
    this.SuspendLayout();
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new FormSize(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // lblMerc
    this.lblMerc.setLocation(new java.awt.Point(104, 8));
    this.lblMerc.setName("lblMerc");
    this.lblMerc.setSize(new FormSize(39, 13));
    this.lblMerc.setTabIndex(36);
    this.lblMerc.setText("888 cr.");
    this.lblMerc.TextAlign = ContentAlignment.TopRight;
    // lblIns
    this.lblIns.setLocation(new java.awt.Point(104, 24));
    this.lblIns.setName("lblIns");
    this.lblIns.setSize(new FormSize(39, 13));
    this.lblIns.setTabIndex(40);
    this.lblIns.setText("888 cr.");
    this.lblIns.TextAlign = ContentAlignment.TopRight;
    // lblInt
    this.lblInt.setLocation(new java.awt.Point(104, 40));
    this.lblInt.setName("lblInt");
    this.lblInt.setSize(new FormSize(39, 13));
    this.lblInt.setTabIndex(44);
    this.lblInt.setText("888 cr.");
    this.lblInt.TextAlign = ContentAlignment.TopRight;
    // lblTax
    this.lblTax.setLocation(new java.awt.Point(104, 56));
    this.lblTax.setName("lblTax");
    this.lblTax.setSize(new FormSize(39, 13));
    this.lblTax.setTabIndex(48);
    this.lblTax.setText("888 cr.");
    this.lblTax.TextAlign = ContentAlignment.TopRight;
    // lblTotal
    this.lblTotal.setLocation(new java.awt.Point(104, 79));
    this.lblTotal.setName("lblTotal");
    this.lblTotal.setSize(new FormSize(39, 13));
    this.lblTotal.setTabIndex(52);
    this.lblTotal.setText("888 cr.");
    this.lblTotal.TextAlign = ContentAlignment.TopRight;
    // lblTotalLabel
    this.lblTotalLabel.setAutoSize(true);
    this.lblTotalLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblTotalLabel.setLocation(new java.awt.Point(8, 79));
    this.lblTotalLabel.setName("lblTotalLabel");
    this.lblTotalLabel.setSize(new FormSize(34, 13));
    this.lblTotalLabel.setTabIndex(7);
    this.lblTotalLabel.setText("Total:");
    // lblTaxLabel
    this.lblTaxLabel.setAutoSize(true);
    this.lblTaxLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblTaxLabel.setLocation(new java.awt.Point(8, 56));
    this.lblTaxLabel.setName("lblTaxLabel");
    this.lblTaxLabel.setSize(new FormSize(84, 13));
    this.lblTaxLabel.setTabIndex(6);
    this.lblTaxLabel.setText("Wormhole Tax:");
    // lblIntLabel
    this.lblIntLabel.setAutoSize(true);
    this.lblIntLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblIntLabel.setLocation(new java.awt.Point(8, 40));
    this.lblIntLabel.setName("lblIntLabel");
    this.lblIntLabel.setSize(new FormSize(47, 13));
    this.lblIntLabel.setTabIndex(5);
    this.lblIntLabel.setText("Interest:");
    // lblMercLabel
    this.lblMercLabel.setAutoSize(true);
    this.lblMercLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblMercLabel.setLocation(new java.awt.Point(8, 8));
    this.lblMercLabel.setName("lblMercLabel");
    this.lblMercLabel.setSize(new FormSize(72, 13));
    this.lblMercLabel.setTabIndex(4);
    this.lblMercLabel.setText("Mercenaries:");
    // lblInsLabel
    this.lblInsLabel.setAutoSize(true);
    this.lblInsLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblInsLabel.setLocation(new java.awt.Point(8, 24));
    this.lblInsLabel.setName("lblInsLabel");
    this.lblInsLabel.setSize(new FormSize(59, 13));
    this.lblInsLabel.setTabIndex(3);
    this.lblInsLabel.setText("Insurance:");
    // picLine
    this.picLine.setBackColor(java.awt.Color.darkGray);
    this.picLine.setLocation(new java.awt.Point(6, 73));
    this.picLine.setName("picLine");
    this.picLine.setSize(new FormSize(138, 1));
    this.picLine.setTabIndex(134);
    this.picLine.setTabStop(false);
    // FormCosts
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new FormSize(148, 99));
    this.Controls.addAll(this.picLine, this.lblTotal, this.lblTax, this.lblInt, this.lblIns, this.lblMerc, this.btnClose,
                         this.lblInsLabel, this.lblTotalLabel, this.lblTaxLabel, this.lblIntLabel, this.lblMercLabel);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormCosts");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Cost Specification");
    this.ResumeLayout(false);
  }
}
