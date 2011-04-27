package spacetrader.gui;
import java.util.Arrays;
import jwinforms.Button;
import jwinforms.ComboBox;
import jwinforms.ComboBoxStyle;
import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.HorizontalAlignment;
import jwinforms.ISupportInitialize;
import jwinforms.Label;
import jwinforms.NumericUpDown;
import jwinforms.Size;
import jwinforms.TextBox;
import jwinforms.WinformForm;
import org.gts.bst.difficulty.Difficulty;


public class FormNewCommander extends WinformForm {
  private Button btnClose;
  private Button btnOk;
  private ComboBox selDifficulty;
  private Label lblName;
  private Label lblDifficulty;
  private Label lblSkillPoints;
  private Label lblPilot;
  private Label lblFighter;
  private Label lblTrader;
  private Label lblEngineer;
  private Label lblPointsRemaining;
  private Label lblPoints;
  private NumericUpDown numFighter;
  private NumericUpDown numTrader;
  private NumericUpDown numEngineer;
  private NumericUpDown numPilot;
  private TextBox txtName;

  public FormNewCommander() {
    InitializeComponent();
    selDifficulty.setSelectedIndex(2);
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblName = new Label();
    this.txtName = new TextBox();
    this.btnClose = new Button();
    this.lblDifficulty = new Label();
    this.lblSkillPoints = new Label();
    this.lblPilot = new Label();
    this.lblFighter = new Label();
    this.lblTrader = new Label();
    this.lblEngineer = new Label();
    this.selDifficulty = new ComboBox();
    this.numPilot = new NumericUpDown();
    this.numFighter = new NumericUpDown();
    this.numTrader = new NumericUpDown();
    this.numEngineer = new NumericUpDown();
    this.btnOk = new Button();
    this.lblPointsRemaining = new Label();
    this.lblPoints = new Label();
    ((ISupportInitialize)(this.numPilot)).BeginInit();
    ((ISupportInitialize)(this.numFighter)).BeginInit();
    ((ISupportInitialize)(this.numTrader)).BeginInit();
    ((ISupportInitialize)(this.numEngineer)).BeginInit();
    this.SuspendLayout();
    // lblName
    this.lblName.setAutoSize(true);
    this.lblName.setLocation(new java.awt.Point(8, 8));
    this.lblName.setName("lblName");
    this.lblName.setSize(new Size(38, 13));
    this.lblName.setTabIndex(0);
    this.lblName.setText("Name:");
    // txtName
    this.txtName.setLocation(new java.awt.Point(72, 5));
    this.txtName.setName("txtName");
    this.txtName.setSize(new Size(120, 20));
    this.txtName.setTabIndex(1);
    this.txtName.setText("");
    this.txtName.setTextChanged(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        txtName_TextChanged(sender, e);
      }
    });
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new Size(30, 31));
    this.btnClose.setTabIndex(33);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // lblDifficulty
    this.lblDifficulty.setAutoSize(true);
    this.lblDifficulty.setLocation(new java.awt.Point(8, 40));
    this.lblDifficulty.setName("lblDifficulty");
    this.lblDifficulty.setSize(new Size(50, 13));
    this.lblDifficulty.setTabIndex(34);
    this.lblDifficulty.setText("Difficulty:");
    // lblSkillPoints
    this.lblSkillPoints.setAutoSize(true);
    this.lblSkillPoints.setLocation(new java.awt.Point(8, 72));
    this.lblSkillPoints.setName("lblSkillPoints");
    this.lblSkillPoints.setSize(new Size(63, 13));
    this.lblSkillPoints.setTabIndex(35);
    this.lblSkillPoints.setText("Skill Points:");
    // lblPilot
    this.lblPilot.setAutoSize(true);
    this.lblPilot.setLocation(new java.awt.Point(16, 96));
    this.lblPilot.setName("lblPilot");
    this.lblPilot.setSize(new Size(29, 13));
    this.lblPilot.setTabIndex(36);
    this.lblPilot.setText("Pilot:");
    // lblFighter
    this.lblFighter.setAutoSize(true);
    this.lblFighter.setLocation(new java.awt.Point(16, 120));
    this.lblFighter.setName("lblFighter");
    this.lblFighter.setSize(new Size(43, 13));
    this.lblFighter.setTabIndex(37);
    this.lblFighter.setText("Fighter:");
    // lblTrader
    this.lblTrader.setAutoSize(true);
    this.lblTrader.setLocation(new java.awt.Point(16, 144));
    this.lblTrader.setName("lblTrader");
    this.lblTrader.setSize(new Size(41, 13));
    this.lblTrader.setTabIndex(38);
    this.lblTrader.setText("Trader:");
    // lblEngineer
    this.lblEngineer.setAutoSize(true);
    this.lblEngineer.setLocation(new java.awt.Point(16, 168));
    this.lblEngineer.setName("lblEngineer");
    this.lblEngineer.setSize(new Size(53, 13));
    this.lblEngineer.setTabIndex(39);
    this.lblEngineer.setText("Engineer:");
    // selDifficulty
    this.selDifficulty.DropDownStyle = ComboBoxStyle.DropDownList;
    this.selDifficulty.Items.AddRange(new Object[] {"Beginner", "Easy", "Normal", "Hard", "Impossible"});
    this.selDifficulty.setLocation(new java.awt.Point(72, 37));
    this.selDifficulty.setName("selDifficulty");
    this.selDifficulty.setSize(new Size(120, 21));
    this.selDifficulty.setTabIndex(2);
    // numPilot
    this.numPilot.setLocation(new java.awt.Point(72, 94));
    this.numPilot.setMaximum(10);
    this.numPilot.setMinimum(1);
    this.numPilot.setName("numPilot");
    this.numPilot.setSize(new Size(36, 20));
    this.numPilot.setTabIndex(3);
    this.numPilot.TextAlign = HorizontalAlignment.Center;
    this.numPilot.setValue(1);
    this.numPilot.setEnter(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueEnter(sender, e);
      }
    });
    this.numPilot.setValueChanged(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    this.numPilot.setLeave(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    // numFighter
    this.numFighter.setLocation(new java.awt.Point(72, 118));
    this.numFighter.setMaximum(10);
    this.numFighter.setMinimum(1);
    this.numFighter.setName("numFighter");
    this.numFighter.setSize(new Size(36, 20));
    this.numFighter.setTabIndex(4);
    this.numFighter.TextAlign = HorizontalAlignment.Center;
    this.numFighter.setValue(1);
    this.numFighter.setEnter(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueEnter(sender, e);
      }
    });
    this.numFighter.setValueChanged(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    this.numFighter.setLeave(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    // numTrader
    this.numTrader.setLocation(new java.awt.Point(72, 142));
    this.numTrader.setMaximum(10);
    this.numTrader.setMinimum(1);
    this.numTrader.setName("numTrader");
    this.numTrader.setSize(new Size(36, 20));
    this.numTrader.setTabIndex(5);
    this.numTrader.TextAlign = HorizontalAlignment.Center;
    this.numTrader.setValue(1);
    this.numTrader.setEnter(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueEnter(sender, e);
      }
    });
    this.numTrader.setValueChanged(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    this.numTrader.setLeave(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    // numEngineer
    this.numEngineer.setLocation(new java.awt.Point(72, 166));
    this.numEngineer.setMaximum(10);
    this.numEngineer.setMinimum(1);
    this.numEngineer.setName("numEngineer");
    this.numEngineer.setSize(new Size(36, 20));
    this.numEngineer.setTabIndex(6);
    this.numEngineer.TextAlign = HorizontalAlignment.Center;
    this.numEngineer.setValue(1);
    this.numEngineer.setEnter(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueEnter(sender, e);
      }
    });
    this.numEngineer.setValueChanged(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    this.numEngineer.setLeave(new EventHandler<Object, EventArgs>()
		  {
      @Override
      public void handle(Object sender, EventArgs e) {
        num_ValueChanged(sender, e);
      }
    });
    // btnOk
    this.btnOk.setDialogResult(DialogResult.OK);
    this.btnOk.setEnabled(false);
    this.btnOk.setFlatStyle(FlatStyle.Flat);
    this.btnOk.setLocation(new java.awt.Point(83, 200));
    this.btnOk.setName("btnOk");
    this.btnOk.setSize(new Size(36, 22));
    this.btnOk.setTabIndex(7);
    this.btnOk.setText("Ok");
    this.btnOk.setEnabled(false);
    // lblPointsRemaining
    this.lblPointsRemaining.setAutoSize(true);
    this.lblPointsRemaining.setLocation(new java.awt.Point(91, 72));
    this.lblPointsRemaining.setName("lblPointsRemaining");
    this.lblPointsRemaining.setSize(new Size(90, 13));
    this.lblPointsRemaining.setTabIndex(40);
    this.lblPointsRemaining.setText("points remaining.");
    // lblPoints
    this.lblPoints.setLocation(new java.awt.Point(73, 72));
    this.lblPoints.setName("lblPoints");
    this.lblPoints.setSize(new Size(17, 13));
    this.lblPoints.setTabIndex(41);
    this.lblPoints.setText("16");
    this.lblPoints.TextAlign = ContentAlignment.TopRight;
    // FormNewCommander
    this.setAcceptButton(this.btnOk);
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new Size(202, 231));
    this.Controls.addAll(Arrays.asList(
        this.lblPoints, this.lblPointsRemaining, this.lblEngineer, this.lblTrader,
        this.lblFighter, this.lblPilot, this.lblSkillPoints, this.lblDifficulty, this.lblName, this.btnOk,
        this.numEngineer, this.numTrader, this.numFighter, this.numPilot, this.selDifficulty, this.btnClose,
        this.txtName));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormNewCommander");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("New Commander");
    ((ISupportInitialize)(this.numPilot)).EndInit();
    ((ISupportInitialize)(this.numFighter)).EndInit();
    ((ISupportInitialize)(this.numTrader)).EndInit();
    ((ISupportInitialize)(this.numEngineer)).EndInit();
    this.ResumeLayout(false);
  }

  private void UpdateOkEnabled() {
    btnOk.setEnabled(lblPoints.getText().equals("0") && txtName.getText().length() > 0);
  }

  private void num_ValueChanged(Object sender, EventArgs e) {
    int points = 20 - (Pilot() + Fighter() + Trader() + Engineer());
    lblPoints.setText("" + points);
    numPilot.setMaximum(Math.min(10, Pilot() + points));
    numFighter.setMaximum(Math.min(10, Fighter() + points));
    numTrader.setMaximum(Math.min(10, Trader() + points));
    numEngineer.setMaximum(Math.min(10, Engineer() + points));
    UpdateOkEnabled();
  }

  private void num_ValueEnter(Object sender, EventArgs e) {
    ((NumericUpDown)sender).Select(0, ("" + ((NumericUpDown)sender).getValue()).length());
  }

  private void txtName_TextChanged(Object sender, EventArgs e) {
    UpdateOkEnabled();
  }

  public String CommanderName() {
    return txtName.getText();
  }

  public Difficulty Difficulty() {
    return Difficulty.FromInt(selDifficulty.getSelectedIndex());
  }

  public int Pilot() {
    return numPilot.getValue();
  }

  public int Fighter() {
    return numFighter.getValue();
  }

  public int Trader() {
    return numTrader.getValue();
  }

  public int Engineer() {
    return numEngineer.getValue();
  }
}