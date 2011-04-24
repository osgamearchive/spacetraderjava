package swingextra;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JStatusBar extends JPanel {
  private static final long serialVersionUID = 1L;

  public JStatusBar() {
    super(new GridBagLayout());
  }

  public void addSection(JStatusBarSection section, boolean stretch) {
    GridBagConstraints c = new GridBagConstraints();
    if(stretch) {
      c.fill = GridBagConstraints.HORIZONTAL;
      c.weightx = 1.0;
    } else {
      c.fill = GridBagConstraints.NONE;
      c.weightx = 0.0;
    }

    this.add(section, c);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JStatusBar panel = new JStatusBar();

    Container pane = frame.getContentPane();
    pane.add(panel, BorderLayout.SOUTH);

    panel.addSection(new JStatusBarSection("eastest!"), false);
    panel.addSection(new JStatusBarSection("Foo bar!"), false);
    panel.addSection(new JStatusBarSection("--fill--"), true);

//		panel.addSection(new JStatusBarSection("Foo bar!"), false);
//		panel.addSection(new JStatusBarSection("westest"), false);

    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(3);
    frame.setVisible(true);
  }
}
