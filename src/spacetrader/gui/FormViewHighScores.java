package spacetrader.gui;
import java.util.Arrays;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.Label;
import jwinforms.Size;
import jwinforms.WinformForm;
import spacetrader.Functions;
import spacetrader.HighScoreRecord;
import spacetrader.Strings;


public class FormViewHighScores extends WinformForm {
  private Button btnClose;
  private Label lblRank0;
  private Label lblRank2;
  private Label lblRank1;
  private Label lblScore0;
  private Label lblScore1;
  private Label lblScore2;
  private Label lblName0;
  private Label lblName1;
  private Label lblName2;
  private Label lblStatus0;
  private Label lblStatus1;
  private Label lblStatus2;
  private Container components = null;

  public FormViewHighScores() {
    InitializeComponent();
    Label[] lblName = new Label[] {lblName0, lblName1, lblName2};
    Label[] lblScore = new Label[] {lblScore0, lblScore1, lblScore2};
    Label[] lblStatus = new Label[] {lblStatus0, lblStatus1, lblStatus2};
    HighScoreRecord[] highScores = Functions.GetHighScores(this);
    for(int i = highScores.length - 1; i >= 0 && highScores[i] != null; i--) {
      lblName[2 - i].setText(highScores[i].Name());
      lblScore[2 - i].setText(Functions.FormatNumber(highScores[i].Score() / 10) + "." + highScores[i].Score() % 10);
      lblStatus[2 - i].setText(Functions.StringVars(Strings.HighScoreStatus, new String[] {
            Strings.GameCompletionTypes[highScores[i].Type().CastToInt()],
            Functions.Multiples(highScores[i].Days(), Strings.TimeUnit),
            Functions.Multiples(highScores[i].Worth(), Strings.MoneyUnit),
            Strings.DifficultyLevels[highScores[i].Difficulty().CastToInt()].toLowerCase()
          }));

      lblScore[2 - i].setVisible(true);
      lblStatus[2 - i].setVisible(true);
    }
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnClose = new Button();
    this.lblRank0 = new Label();
    this.lblRank2 = new Label();
    this.lblRank1 = new Label();
    this.lblScore0 = new Label();
    this.lblScore1 = new Label();
    this.lblScore2 = new Label();
    this.lblName0 = new Label();
    this.lblName1 = new Label();
    this.lblName2 = new Label();
    this.lblStatus0 = new Label();
    this.lblStatus1 = new Label();
    this.lblStatus2 = new Label();
    this.SuspendLayout();
    //
    // btnClose
    //
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new Size(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    //
    // lblRank0
    //
    this.lblRank0.setAutoSize(true);
    this.lblRank0.setLocation(new java.awt.Point(8, 8));
    this.lblRank0.setName("lblRank0");
    this.lblRank0.setSize(new Size(14, 13));
    this.lblRank0.setTabIndex(33);
    this.lblRank0.setText("1.");
    this.lblRank0.TextAlign = ContentAlignment.TopRight;
    //
    // lblRank2
    //
    this.lblRank2.setAutoSize(true);
    this.lblRank2.setLocation(new java.awt.Point(8, 136));
    this.lblRank2.setName("lblRank2");
    this.lblRank2.setSize(new Size(14, 13));
    this.lblRank2.setTabIndex(34);
    this.lblRank2.setText("3.");
    this.lblRank2.TextAlign = ContentAlignment.TopRight;
    //
    // lblRank1
    //
    this.lblRank1.setAutoSize(true);
    this.lblRank1.setLocation(new java.awt.Point(8, 72));
    this.lblRank1.setName("lblRank1");
    this.lblRank1.setSize(new Size(14, 13));
    this.lblRank1.setTabIndex(35);
    this.lblRank1.setText("2.");
    this.lblRank1.TextAlign = ContentAlignment.TopRight;
    //
    // lblScore0
    //
    this.lblScore0.setLocation(new java.awt.Point(168, 8));
    this.lblScore0.setName("lblScore0");
    this.lblScore0.setSize(new Size(43, 13));
    this.lblScore0.setTabIndex(36);
    this.lblScore0.setText("888.8%");
    this.lblScore0.TextAlign = ContentAlignment.TopRight;
    this.lblScore0.setVisible(false);
    //
    // lblScore1
    //
    this.lblScore1.setLocation(new java.awt.Point(168, 72));
    this.lblScore1.setName("lblScore1");
    this.lblScore1.setSize(new Size(43, 13));
    this.lblScore1.setTabIndex(37);
    this.lblScore1.setText("888.8%");
    this.lblScore1.TextAlign = ContentAlignment.TopRight;
    this.lblScore1.setVisible(false);
    //
    // lblScore2
    //
    this.lblScore2.setLocation(new java.awt.Point(168, 136));
    this.lblScore2.setName("lblScore2");
    this.lblScore2.setSize(new Size(43, 13));
    this.lblScore2.setTabIndex(38);
    this.lblScore2.setText("888.8%");
    this.lblScore2.TextAlign = ContentAlignment.TopRight;
    this.lblScore2.setVisible(false);
    //
    // lblName0
    //
    this.lblName0.setLocation(new java.awt.Point(24, 8));
    this.lblName0.setName("lblName0");
    this.lblName0.setSize(new Size(144, 13));
    this.lblName0.setTabIndex(39);
    this.lblName0.setText("Empty");
    //
    // lblName1
    //
    this.lblName1.setLocation(new java.awt.Point(24, 72));
    this.lblName1.setName("lblName1");
    this.lblName1.setSize(new Size(144, 13));
    this.lblName1.setTabIndex(40);
    this.lblName1.setText("Empty");
    //
    // lblName2
    //
    this.lblName2.setLocation(new java.awt.Point(24, 136));
    this.lblName2.setName("lblName2");
    this.lblName2.setSize(new Size(144, 13));
    this.lblName2.setTabIndex(41);
    this.lblName2.setText("Empty");
    //
    // lblStatus0
    //
    this.lblStatus0.setLocation(new java.awt.Point(24, 24));
    this.lblStatus0.setName("lblStatus0");
    this.lblStatus0.setSize(new Size(200, 26));
    this.lblStatus0.setTabIndex(42);
    this.lblStatus0.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
    this.lblStatus0.setVisible(false);
    //
    // lblStatus1
    //
    this.lblStatus1.setLocation(new java.awt.Point(24, 88));
    this.lblStatus1.setName("lblStatus1");
    this.lblStatus1.setSize(new Size(200, 26));
    this.lblStatus1.setTabIndex(43);
    this.lblStatus1.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
    this.lblStatus1.setVisible(false);
    //
    // lblStatus2
    //
    this.lblStatus2.setLocation(new java.awt.Point(24, 152));
    this.lblStatus2.setName("lblStatus2");
    this.lblStatus2.setSize(new Size(200, 26));
    this.lblStatus2.setTabIndex(44);
    this.lblStatus2.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
    this.lblStatus2.setVisible(false);
    //
    // FormViewHighScores
    //
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new Size(218, 191));
    this.Controls.addAll(Arrays.asList(
        this.lblStatus2,
        this.lblStatus1,
        this.lblStatus0,
        this.lblName2,
        this.lblName1,
        this.lblName0,
        this.lblScore2,
        this.lblScore1,
        this.lblScore0,
        this.lblRank1,
        this.lblRank2,
        this.lblRank0,
        this.btnClose));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormViewHighScores");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("High Scores");
    this.ResumeLayout(false);
  }
}
