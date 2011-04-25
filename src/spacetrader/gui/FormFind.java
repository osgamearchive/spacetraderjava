package spacetrader.gui;
import jwinforms.Button;
import jwinforms.CheckBox;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.Label;
import jwinforms.Size;
import jwinforms.TextBox;
import jwinforms.WinformForm;


public class FormFind extends WinformForm {
  private static String text = "";
  private static boolean boxChecked = false;
  private Button btnOk;
  private Button btnCancel;
  private CheckBox chkTrack;
  private Label lblText;
  private TextBox txtSystem;

  public FormFind() {
    InitializeComponent();
    txtSystem.setText(text);
    chkTrack.setChecked(boxChecked);
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblText = new Label();
    this.btnOk = new Button();
    this.btnCancel = new Button();
    this.txtSystem = new TextBox();
    this.chkTrack = new CheckBox();
    this.SuspendLayout();
    // lblText
    this.lblText.setAutoSize(true);
    this.lblText.setLocation(new java.awt.Point(8, 8));
    this.lblText.setName("lblText");
    this.lblText.setSize(new Size(177, 13));
    this.lblText.setTabIndex(3);
    this.lblText.setText("Which system are you looking for?");
    // btnOk
    this.btnOk.setDialogResult(DialogResult.OK);
    this.btnOk.setFlatStyle(FlatStyle.Flat);
    this.btnOk.setLocation(new java.awt.Point(43, 68));
    this.btnOk.setName("btnOk");
    this.btnOk.setSize(new Size(40, 22));
    this.btnOk.setTabIndex(3);
    this.btnOk.setText("Ok");
    // btnCancel
    this.btnCancel.setDialogResult(DialogResult.Cancel);
    this.btnCancel.setFlatStyle(FlatStyle.Flat);
    this.btnCancel.setLocation(new java.awt.Point(91, 68));
    this.btnCancel.setName("btnCancel");
    this.btnCancel.setSize(new Size(50, 22));
    this.btnCancel.setTabIndex(4);
    this.btnCancel.setText("Cancel");
    // txtSystem
    this.txtSystem.setLocation(new java.awt.Point(8, 24));
    this.txtSystem.setName("txtSystem");
    this.txtSystem.setSize(new Size(168, 20));
    this.txtSystem.setTabIndex(1);
    this.txtSystem.setText("");
    // chkTrack
    this.chkTrack.setLocation(new java.awt.Point(8, 48));
    this.chkTrack.setName("chkTrack");
    this.chkTrack.setSize(new Size(112, 16));
    this.chkTrack.setTabIndex(2);
    this.chkTrack.setText("Track this system");
    // FormFind
    this.setAcceptButton(this.btnOk);
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setCancelButton(this.btnCancel);
    this.setClientSize(new Size(184, 97));
    this.setControlBox(false);
    this.Controls.addAll(this.chkTrack, this.txtSystem, this.btnCancel, this.btnOk, this.lblText);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setName("FormFind");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Find System");
    this.Closed = new EventHandler<Object, EventArgs>() {
      @Override
      public void handle(Object sender, EventArgs e) {
        FormFind_Closed(sender, e);
      }
    };
    this.ResumeLayout(false);
  }

  private void FormFind_Closed(Object sender, EventArgs e) {
    text = txtSystem.getText();
    boxChecked = chkTrack.isChecked();
  }

  public String SystemName() {
    return txtSystem.getText();
  }

  public boolean TrackSystem() {
    return chkTrack.isChecked();
  }
}
