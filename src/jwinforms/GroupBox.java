package jwinforms;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;


public class GroupBox extends WinformControl {
  private TitledBorder border;
  public final WinformJPanel Controls;
  public AnchorStyles Anchor;

  public GroupBox() {
    super(new WinformJPanel(null));
    Controls = (WinformJPanel)swingVersion;
    border = BorderFactory.createTitledBorder("");
    asJPanel().setBorder(border);
  }

  @Override
  public void SuspendLayout() {
    // TODO Auto-generated method stub
  }

  public void setText(String text) {
    border.setTitle(text);
  }

  public String getText() {
    return border.getTitle();
  }

  public WinformJPanel asJPanel() {
    return Controls;
  }
}
