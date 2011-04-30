package jwinforms;
import jwinforms.enums.DialogResult;
import java.awt.Component;


public interface WinformPane {
  Component asSwingObject();

  void dispose();

  void setResult(DialogResult dialogResult);
}
