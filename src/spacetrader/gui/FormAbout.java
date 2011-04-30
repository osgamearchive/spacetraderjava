package spacetrader.gui;
import java.awt.Point;
import javax.swing.UnsupportedLookAndFeelException;
import jwinforms.Button;
import jwinforms.ComponentResourceManager;
import jwinforms.enums.DialogResult;
import jwinforms.Font;
import jwinforms.enums.FontStyle;
import jwinforms.enums.FormBorderStyle;
import jwinforms.FormSize;
import jwinforms.enums.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.ISupportInitialize;
import jwinforms.Image;
import jwinforms.Label;
import jwinforms.PictureBox;
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
    btnClose = new Button();
    lblTitle = new Label();
    lblAbout = new Label();
    picLogo = new PictureBox();
    ((ISupportInitialize)(picLogo)).BeginInit();
    SuspendLayout();
    // btnClose
    btnClose.setDialogResult(DialogResult.Cancel);
    btnClose.setLocation(new Point(-32, -32));
    btnClose.setName("btnClose");
    btnClose.setSize(new FormSize(32, 32));
    btnClose.setTabIndex(32);
    btnClose.setTabStop(false);
    btnClose.setText("X");
    // lblTitle
    lblTitle.setAutoSize(true);
    lblTitle.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    lblTitle.setLocation(new Point(172, 8));
    lblTitle.setName("lblTitle");
    lblTitle.setSize(new FormSize(187, 13));
    lblTitle.setTabIndex(33);
    lblTitle.setText("Space Trader for Windows 2.01");
    // lblAbout
    lblAbout.setLocation(new Point(172, 32));
    lblAbout.setName("lblAbout");
    lblAbout.setSize(new FormSize(272, 160));
    lblAbout.setTabIndex(34);
    lblAbout.setText(resources.GetString("lblAbout.Text"));
    // picLogo
    picLogo.setImage(((Image)(resources.GetObject("picLogo.Image"))));
    picLogo.setLocation(new Point(8, 8));
    picLogo.setName("picLogo");
    picLogo.setSize(new FormSize(160, 160));
    picLogo.setTabIndex(35);
    picLogo.setTabStop(false);
    // FormAbout
    setAutoScaleBaseSize(new FormSize(5, 13));
    setCancelButton(btnClose);
    setClientSize(new FormSize(446, 191));
    Controls.add(picLogo);
    Controls.add(lblAbout);
    Controls.add(lblTitle);
    Controls.add(btnClose);
    setFormBorderStyle(FormBorderStyle.FixedDialog);
    setMaximizeBox(false);
    setMinimizeBox(false);
    setName("FormAbout");
    setShowInTaskbar(false);
    setStartPosition(FormStartPosition.CenterParent);
    setText("About Space Trader");
    ((ISupportInitialize)(picLogo)).EndInit();
    ResumeLayout(false);
    PerformLayout();
  }

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    Launcher.runForm(new FormAbout());
  }
}
