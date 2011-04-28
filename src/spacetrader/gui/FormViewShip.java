package spacetrader.gui;
import java.util.Arrays;
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.DialogResult;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.GroupBox;
import jwinforms.Label;
import jwinforms.FormSize;
import jwinforms.WinformControl;
import jwinforms.WinformForm;
import org.gts.bst.ship.equip.GadgetType;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Ship;
import spacetrader.SpecialEvent;
import spacetrader.Strings;
import spacetrader.stub.ArrayList;
import spacetrader.util.Util;


public class FormViewShip extends WinformForm {
  private Button btnClose;
  private GroupBox boxSpecialCargo;
  private Label lblTypeLabel;
  private Label lblType;
  private Label lblSpecialCargo;
  private Label lblEquipLabel;
  private Label lblEquip;
  private Container components = null;
  private Game game = Game.CurrentGame();
  private Ship ship = Game.CurrentGame().Commander().getShip();

  public FormViewShip() {
    InitializeComponent();
    lblType.setText(ship.Name());
    lblEquipLabel.setText("");
    lblEquip.setText("");
    DisplayEquipment();
    DisplaySpecialCargo();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.lblTypeLabel = new Label();
    this.lblType = new Label();
    this.btnClose = new Button();
    this.lblEquipLabel = new Label();
    this.lblEquip = new Label();
    this.boxSpecialCargo = new GroupBox();
    this.lblSpecialCargo = new Label();
    this.boxSpecialCargo.SuspendLayout();
    this.SuspendLayout();
    // lblTypeLabel
    this.lblTypeLabel.setAutoSize(true);
    this.lblTypeLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblTypeLabel.setLocation(new java.awt.Point(8, 8));
    this.lblTypeLabel.setName("lblTypeLabel");
    this.lblTypeLabel.setSize(new FormSize(34, 13));
    this.lblTypeLabel.setTabIndex(2);
    this.lblTypeLabel.setText("Type:");
    // lblType
    this.lblType.setLocation(new java.awt.Point(80, 8));
    this.lblType.setName("lblType");
    this.lblType.setSize(new FormSize(100, 13));
    this.lblType.setTabIndex(4);
    this.lblType.setText("Grasshopper");
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new FormSize(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // lblEquipLabel
    this.lblEquipLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblEquipLabel.setLocation(new java.awt.Point(8, 34));
    this.lblEquipLabel.setName("lblEquipLabel");
    this.lblEquipLabel.setSize(new FormSize(64, 176));
    this.lblEquipLabel.setTabIndex(43);
    this.lblEquipLabel.setText("Hull:\r\n\r\nEquipment:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nUnfilled:");
    // lblEquip
    this.lblEquip.setLocation(new java.awt.Point(80, 34));
    this.lblEquip.setName("lblEquip");
    this.lblEquip.setSize(new FormSize(120, 176));
    this.lblEquip.setTabIndex(44);
    this.lblEquip.setText("Hardened\r\n\r\n1 Military Laser\r\n1 Morgan\'s Laser\r\n1 Energy Shield\r\n1 Reflective Shi"
        + "eld\r\n1 Lightning Shield\r\nNavigating System\r\nAuto-Repair System\r\n10 Extra Cargo Bays\r\nAn Escape Pod\r\n"
        + "\r\n1 weapon slot\r\n1 gadget slot");
    // boxSpecialCargo
    this.boxSpecialCargo.Controls.addAll((new WinformControl[] {this.lblSpecialCargo}));
    this.boxSpecialCargo.setLocation(new java.awt.Point(192, 8));
    this.boxSpecialCargo.setName("boxSpecialCargo");
    this.boxSpecialCargo.setSize(new FormSize(200, 204));
    this.boxSpecialCargo.setTabIndex(64);
    this.boxSpecialCargo.setTabStop(false);
    this.boxSpecialCargo.setText("Special Cargo");
    // lblSpecialCargo
    this.lblSpecialCargo.setLocation(new java.awt.Point(8, 16));
    this.lblSpecialCargo.setName("lblSpecialCargo");
    this.lblSpecialCargo.setSize(new FormSize(190, 176));
    this.lblSpecialCargo.setTabIndex(0);
    this.lblSpecialCargo.setText("No special items.");
    // FormViewShip
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new FormSize(402, 219));
    this.Controls.addAll(Arrays.asList(this.boxSpecialCargo, this.lblEquip, this.lblEquipLabel, this.btnClose, this.lblTypeLabel, this.lblType));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormViewShip");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Current Ship");
    this.boxSpecialCargo.ResumeLayout(false);
    this.ResumeLayout(false);
  }

  private void DisplayEquipment() {
    if(game.getQuestStatusScarab() == SpecialEvent.StatusScarabDone) {
      lblEquipLabel.setText(lblEquipLabel.getText() + ("Hull:" + Strings.newline + Strings.newline));
      lblEquip.setText(lblEquip.getText() + ("Hardened" + Strings.newline + Strings.newline));
    }
    boolean equipPrinted = false;
    for(int i = 0; i < Consts.Weapons.length; i++) {
      int count = 0;
      for(int j = 0; j < ship.Weapons().length; j++) {
        if(ship.Weapons()[j] != null && ship.Weapons()[j].Type() == Consts.Weapons[i].Type()) {
          count++;
        }
      }
      if(count > 0) {
        lblEquipLabel.setText(lblEquipLabel.getText() + (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
        lblEquip.setText(lblEquip.getText() + (Functions.Multiples(count, Consts.Weapons[i].Name()) + Strings.newline));
        equipPrinted = true;
      }
    }
    for(int i = 0; i < Consts.Shields.length; i++) {
      int count = 0;
      for(int j = 0; j < ship.Shields().length; j++) {
        if(ship.Shields()[j] != null && ship.Shields()[j].Type() == Consts.Shields[i].Type()) {
          count++;
        }
      }
      if(count > 0) {
        lblEquipLabel.setText(lblEquipLabel.getText() + (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
        lblEquip.setText(lblEquip.getText() + (Functions.Multiples(count, Consts.Shields[i].Name()) + Strings.newline));
        equipPrinted = true;
      }
    }
    for(int i = 0; i < Consts.Gadgets.length; i++) {
      int count = 0;
      for(int j = 0; j < ship.Gadgets().length; j++) {
        if(ship.Gadgets()[j] != null && ship.Gadgets()[j].Type() == Consts.Gadgets[i].Type()) {
          count++;
        }
      }
      if(count > 0) {
        lblEquipLabel.setText(lblEquipLabel.getText() + (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
        if(i == GadgetType.ExtraCargoBays.asInteger() || i == GadgetType.HiddenCargoBays.asInteger()) {
          count *= 5;
          lblEquip.setText(lblEquip.getText() + (Functions.FormatNumber(count) + Consts.Gadgets[i].Name().substring(1) + Strings.newline));
        } else {
          lblEquip.setText(lblEquip.getText() + (Functions.Multiples(count, Consts.Gadgets[i].Name()) + Strings.newline));
        }
        equipPrinted = true;
      }
    }
    if(ship.getEscapePod()) {
      lblEquipLabel.setText(lblEquipLabel.getText() + (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
      lblEquip.setText(lblEquip.getText() + ("1 " + Strings.ShipInfoEscapePod + Strings.newline));
      equipPrinted = true;
    }
    if(ship.FreeSlots() > 0) {
      lblEquipLabel.setText(lblEquipLabel.getText() + ((equipPrinted ? Strings.newline : "") + "Unfilled:"));
      lblEquip.setText(lblEquip.getText() + (equipPrinted ? Strings.newline : ""));
      if(ship.FreeSlotsWeapon() > 0) {
        lblEquip.setText(lblEquip.getText() + (Functions.Multiples(ship.FreeSlotsWeapon(), "weapon slot") + Strings.newline));
      }
      if(ship.FreeSlotsShield() > 0) {
        lblEquip.setText(lblEquip.getText() + (Functions.Multiples(ship.FreeSlotsShield(), "shield slot") + Strings.newline));
      }
      if(ship.FreeSlotsGadget() > 0) {
        lblEquip.setText(lblEquip.getText() + (Functions.Multiples(ship.FreeSlotsGadget(), "gadget slot") + Strings.newline));
      }
    }
  }

  private void DisplaySpecialCargo() {
    ArrayList<String> specialCargo = new ArrayList<String>(12);
    if(ship.getTribbles() > 0) {
      if(ship.getTribbles() == Consts.MaxTribbles) {
        specialCargo.add(Strings.SpecialCargoTribblesInfest);
      } else {
        specialCargo.add(Functions.Multiples(ship.getTribbles(), Strings.SpecialCargoTribblesCute) + ".");
      }
    }
    if(game.getQuestStatusJapori() == SpecialEvent.StatusJaporiInTransit) {
      specialCargo.add(Strings.SpecialCargoJapori);
    }
    if(ship.ArtifactOnBoard()) {
      specialCargo.add(Strings.SpecialCargoArtifact);
    }
    if(game.getQuestStatusJarek() == SpecialEvent.StatusJarekDone) {
      specialCargo.add(Strings.SpecialCargoJarek);
    }
    if(ship.ReactorOnBoard()) {
      specialCargo.add(Strings.SpecialCargoReactor);
      specialCargo.add(Functions.Multiples(10 - ((game.getQuestStatusReactor() - 1) / 2), "bay") + Strings.SpecialCargoReactorBays);
    }
    if(ship.SculptureOnBoard()) {
      specialCargo.add(Strings.SpecialCargoSculpture);
    }
    if(game.getCanSuperWarp()) {
      specialCargo.add(Strings.SpecialCargoExperiment);
    }
    lblSpecialCargo.setText(specialCargo.size() == 0 ? Strings.SpecialCargoNone : Util.StringsJoin(Strings.newline + Strings.newline, Functions.ArrayListtoStringArray(specialCargo)));
  }
}
