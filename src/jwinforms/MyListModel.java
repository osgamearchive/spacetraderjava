package jwinforms;
import javax.swing.DefaultListModel;


public class MyListModel extends DefaultListModel<Object> {
  private static final long serialVersionUID = 1L;
//TODO inline method, use super-class.

  public void add(Object obj) {
    this.addElement(obj);
  }
}
