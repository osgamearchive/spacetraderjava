package jwinforms;
import java.awt.Component;


public interface WinformPane {
  void setResult(DialogResult dialogResult);

  void dispose();

  Component asSwingObject();
}
