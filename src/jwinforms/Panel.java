package jwinforms;
import javax.swing.JPanel;


public class Panel extends WinformControl {
  public Panel Controls = this;
  public boolean AutoScroll;

  public Panel() {
    super(new JPanel());
  }

  public void add(WinformControl control) {
    ((JPanel)swingVersion).add(control.swingVersion);
  }
}
