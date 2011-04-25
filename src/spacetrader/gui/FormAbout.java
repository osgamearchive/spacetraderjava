package spacetrader.gui;
import java.awt.Point;
import javax.swing.UnsupportedLookAndFeelException;
import jwinforms.Button;
import jwinforms.ComponentResourceManager;
import jwinforms.DialogResult;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.ISupportInitialize;
import jwinforms.Image;
import jwinforms.Label;
import jwinforms.PictureBox;
import jwinforms.Size;
import jwinforms.WinformForm;


public class FormAbout extends WinformForm {
  private Button btnClose;
  private Label lblAbout;
  private Label lblTitle;
  private PictureBox picLogo;

  public FormAbout() {
    InitializeComponent();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    ComponentResourceManager resources = new ComponentResourceManager(FormAbout.class);
    this.btnClose = new Button();
    this.lblTitle = new Label();
    this.lblAbout = new Label();
    this.picLogo = new PictureBox();
    ((ISupportInitialize)(this.picLogo)).BeginInit();
    this.SuspendLayout();
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new Size(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // lblTitle
    this.lblTitle.setAutoSize(true);
    this.lblTitle.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblTitle.setLocation(new Point(172, 8));
    this.lblTitle.setName("lblTitle");
    this.lblTitle.setSize(new Size(187, 13));
    this.lblTitle.setTabIndex(33);
    this.lblTitle.setText("Space Trader for Windows 2.01");
    // lblAbout
    this.lblAbout.setLocation(new Point(172, 32));
    this.lblAbout.setName("lblAbout");
    this.lblAbout.setSize(new Size(272, 160));
    this.lblAbout.setTabIndex(34);
    this.lblAbout.setText(resources.GetString("lblAbout.Text"));
    // picLogo
    this.picLogo.setImage(((Image)(resources.GetObject("picLogo.Image"))));
    this.picLogo.setLocation(new Point(8, 8));
    this.picLogo.setName("picLogo");
    this.picLogo.setSize(new Size(160, 160));
    this.picLogo.setTabIndex(35);
    this.picLogo.setTabStop(false);
    // FormAbout
    this.setAutoScaleBaseSize(new Size(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new Size(446, 191));
    this.Controls.add(this.picLogo);
    this.Controls.add(this.lblAbout);
    this.Controls.add(this.lblTitle);
    this.Controls.add(this.btnClose);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormAbout");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("About Space Trader");
    ((ISupportInitialize)(this.picLogo)).EndInit();
    this.ResumeLayout(false);
    this.PerformLayout();
  }

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    Launcher.runForm(new FormAbout());
  }
}
