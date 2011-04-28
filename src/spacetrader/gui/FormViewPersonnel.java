package spacetrader.gui;
import jwinforms.BorderStyle;
import jwinforms.Button;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FlatStyle;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.GroupBox;
import jwinforms.Label;
import jwinforms.ListBox;
import jwinforms.FormSize;
import jwinforms.WinformForm;
import org.gts.bst.crew.CrewMemberId;
import spacetrader.CrewMember;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Strings;
import spacetrader.enums.AlertType;


public class FormViewPersonnel extends WinformForm {
  private Button btnClose;
  private Button btnHireFire;
  private GroupBox boxForHire;
  private GroupBox boxInfo;
  private GroupBox boxCurrentCrew;
  private Label lblRate;
  private Label lblName;
  private Label lblEngineer;
  private Label lblTrader;
  private Label lblFighter;
  private Label lblPilot;
  private Label lblEngineerLabel;
  private Label lblTraderLabel;
  private Label lblFighterLabel;
  private Label lblPilotLabel;
  private Label lblCrewNoQuarters;
  private Label lblForHireNone;
  private ListBox lstForHire;
  private ListBox lstCrew;
  private Game game = Game.CurrentGame();
  private CrewMember selectedCrewMember = null;
  private boolean handlingSelect = false;

  public FormViewPersonnel() {
    InitializeComponent();
    UpdateAll();
  }

  // Required method for Designer support - do not modify the contents of this method with the code editor.
  private void InitializeComponent() {
    this.btnClose = new Button();
    this.boxCurrentCrew = new GroupBox();
    this.lstCrew = new ListBox();
    this.boxForHire = new GroupBox();
    this.lstForHire = new ListBox();
    this.boxInfo = new GroupBox();
    this.btnHireFire = new Button();
    this.lblRate = new Label();
    this.lblName = new Label();
    this.lblEngineer = new Label();
    this.lblTrader = new Label();
    this.lblFighter = new Label();
    this.lblPilot = new Label();
    this.lblEngineerLabel = new Label();
    this.lblTraderLabel = new Label();
    this.lblFighterLabel = new Label();
    this.lblPilotLabel = new Label();
    this.lblCrewNoQuarters = new Label();
    this.lblForHireNone = new Label();
    this.boxCurrentCrew.SuspendLayout();
    this.boxForHire.SuspendLayout();
    this.boxInfo.SuspendLayout();
    this.SuspendLayout();
    // btnClose
    this.btnClose.setDialogResult(DialogResult.Cancel);
    this.btnClose.setLocation(new java.awt.Point(-32, -32));
    this.btnClose.setName("btnClose");
    this.btnClose.setSize(new FormSize(32, 32));
    this.btnClose.setTabIndex(32);
    this.btnClose.setTabStop(false);
    this.btnClose.setText("X");
    // boxCurrentCrew
    this.boxCurrentCrew.Controls.add(this.lblCrewNoQuarters);
    this.boxCurrentCrew.Controls.add(this.lstCrew);
    this.boxCurrentCrew.setLocation(new java.awt.Point(8, 8));
    this.boxCurrentCrew.setName("boxCurrentCrew");
    this.boxCurrentCrew.setSize(new FormSize(144, 114));
    this.boxCurrentCrew.setTabIndex(33);
    this.boxCurrentCrew.setTabStop(false);
    this.boxCurrentCrew.setText("Current Crew");
    // lstCrew
    this.lstCrew.setBorderStyle(BorderStyle.FixedSingle);
    this.lstCrew.setLocation(new java.awt.Point(8, 24));
    this.lstCrew.setName("lstCrew");
    this.lstCrew.setSize(new FormSize(126, 80));
    this.lstCrew.setTabIndex(6);
    this.lstCrew.setDoubleClick(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        HireFire(sender, e);
      }
    });
    this.lstCrew.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        SelectedIndexChanged(sender, e);
      }
    });
    // boxForHire
    this.boxForHire.Controls.add(this.lblForHireNone);
    this.boxForHire.Controls.add(this.lstForHire);
    this.boxForHire.setLocation(new java.awt.Point(160, 8));
    this.boxForHire.setName("boxForHire");
    this.boxForHire.setSize(new FormSize(144, 114));
    this.boxForHire.setTabIndex(34);
    this.boxForHire.setTabStop(false);
    this.boxForHire.setText("Mercenaries For Hire");
    // lstForHire
    this.lstForHire.setBorderStyle(BorderStyle.FixedSingle);
    this.lstForHire.setLocation(new java.awt.Point(8, 24));
    this.lstForHire.setName("lstForHire");
    this.lstForHire.setSize(new FormSize(126, 80));
    this.lstForHire.setTabIndex(5);
    this.lstForHire.setDoubleClick(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        HireFire(sender, e);
      }
    });
    this.lstForHire.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        SelectedIndexChanged(sender, e);
      }
    });
    // boxInfo
    this.boxInfo.Controls.add(this.btnHireFire);
    this.boxInfo.Controls.add(this.lblRate);
    this.boxInfo.Controls.add(this.lblName);
    this.boxInfo.Controls.add(this.lblEngineer);
    this.boxInfo.Controls.add(this.lblTrader);
    this.boxInfo.Controls.add(this.lblFighter);
    this.boxInfo.Controls.add(this.lblPilot);
    this.boxInfo.Controls.add(this.lblEngineerLabel);
    this.boxInfo.Controls.add(this.lblTraderLabel);
    this.boxInfo.Controls.add(this.lblFighterLabel);
    this.boxInfo.Controls.add(this.lblPilotLabel);
    this.boxInfo.setLocation(new java.awt.Point(312, 8));
    this.boxInfo.setName("boxInfo");
    this.boxInfo.setSize(new FormSize(168, 114));
    this.boxInfo.setTabIndex(35);
    this.boxInfo.setTabStop(false);
    this.boxInfo.setText("Mercenary Information");
    // btnHireFire
    this.btnHireFire.setFlatStyle(FlatStyle.Flat);
    this.btnHireFire.setLocation(new java.awt.Point(120, 80));
    this.btnHireFire.setName("btnHireFire");
    this.btnHireFire.setSize(new FormSize(36, 22));
    this.btnHireFire.setTabIndex(4);
    this.btnHireFire.setText("Hire");
    this.btnHireFire.setClick(new EventHandler<Object, EventArgs>()
		 {
      @Override
      public void handle(Object sender, EventArgs e) {
        HireFire(sender, e);
      }
    });
    // lblRate
    this.lblRate.setLocation(new java.awt.Point(104, 40));
    this.lblRate.setName("lblRate");
    this.lblRate.setSize(new FormSize(59, 13));
    this.lblRate.setTabIndex(97);
    this.lblRate.setText("88 cr. daily");
    // lblName
    this.lblName.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblName.setLocation(new java.awt.Point(12, 18));
    this.lblName.setName("lblName");
    this.lblName.setSize(new FormSize(72, 13));
    this.lblName.setTabIndex(96);
    this.lblName.setText("Xxxxxxxxxxx");
    // lblEngineer
    this.lblEngineer.setLocation(new java.awt.Point(64, 88));
    this.lblEngineer.setName("lblEngineer");
    this.lblEngineer.setSize(new FormSize(17, 13));
    this.lblEngineer.setTabIndex(95);
    this.lblEngineer.setText("88");
    // lblTrader
    this.lblTrader.setLocation(new java.awt.Point(64, 72));
    this.lblTrader.setName("lblTrader");
    this.lblTrader.setSize(new FormSize(17, 13));
    this.lblTrader.setTabIndex(94);
    this.lblTrader.setText("88");
    // lblFighter
    this.lblFighter.setLocation(new java.awt.Point(64, 56));
    this.lblFighter.setName("lblFighter");
    this.lblFighter.setSize(new FormSize(17, 13));
    this.lblFighter.setTabIndex(93);
    this.lblFighter.setText("88");
    // lblPilot
    this.lblPilot.setLocation(new java.awt.Point(64, 40));
    this.lblPilot.setName("lblPilot");
    this.lblPilot.setSize(new FormSize(17, 13));
    this.lblPilot.setTabIndex(92);
    this.lblPilot.setText("88");
    // lblEngineerLabel
    this.lblEngineerLabel.setAutoSize(true);
    this.lblEngineerLabel.setLocation(new java.awt.Point(12, 88));
    this.lblEngineerLabel.setName("lblEngineerLabel");
    this.lblEngineerLabel.setSize(new FormSize(53, 16));
    this.lblEngineerLabel.setTabIndex(91);
    this.lblEngineerLabel.setText("Engineer:");
    // lblTraderLabel
    this.lblTraderLabel.setAutoSize(true);
    this.lblTraderLabel.setLocation(new java.awt.Point(12, 72));
    this.lblTraderLabel.setName("lblTraderLabel");
    this.lblTraderLabel.setSize(new FormSize(41, 16));
    this.lblTraderLabel.setTabIndex(90);
    this.lblTraderLabel.setText("Trader:");
    // lblFighterLabel
    this.lblFighterLabel.setAutoSize(true);
    this.lblFighterLabel.setLocation(new java.awt.Point(12, 56));
    this.lblFighterLabel.setName("lblFighterLabel");
    this.lblFighterLabel.setSize(new FormSize(43, 16));
    this.lblFighterLabel.setTabIndex(89);
    this.lblFighterLabel.setText("Fighter:");
    // lblPilotLabel
    this.lblPilotLabel.setAutoSize(true);
    this.lblPilotLabel.setLocation(new java.awt.Point(12, 40));
    this.lblPilotLabel.setName("lblPilotLabel");
    this.lblPilotLabel.setSize(new FormSize(29, 16));
    this.lblPilotLabel.setTabIndex(88);
    this.lblPilotLabel.setText("Pilot:");
    // lblCrewNoQuarters
    this.lblCrewNoQuarters.setLocation(new java.awt.Point(16, 24));
    this.lblCrewNoQuarters.setName("lblCrewNoQuarters");
    this.lblCrewNoQuarters.setSize(new FormSize(120, 16));
    this.lblCrewNoQuarters.setTabIndex(7);
    this.lblCrewNoQuarters.setText("No quarters available");
    this.lblCrewNoQuarters.setVisible(false);
    // lblForHireNone
    this.lblForHireNone.setLocation(new java.awt.Point(16, 24));
    this.lblForHireNone.setName("lblForHireNone");
    this.lblForHireNone.setSize(new FormSize(120, 16));
    this.lblForHireNone.setTabIndex(8);
    this.lblForHireNone.setText("No one for hire");
    this.lblForHireNone.setVisible(false);
    // FormViewPersonnel
    this.setAutoScaleBaseSize(new FormSize(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new FormSize(488, 129));
    this.Controls.add(this.boxInfo);
    this.Controls.add(this.boxForHire);
    this.Controls.add(this.boxCurrentCrew);
    this.Controls.add(this.btnClose);
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormViewPersonnel");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Personnel");
    this.boxCurrentCrew.ResumeLayout(false);
    this.boxForHire.ResumeLayout(false);
    this.boxInfo.ResumeLayout(false);
    this.ResumeLayout(false);
  }

  private void DeselectAll() {
    lstForHire.clearSelected();
    lstCrew.clearSelected();
  }

  private void UpdateAll() {
    selectedCrewMember = null;
    UpdateForHire();
    UpdateCurrentCrew();
    UpdateInfo();
  }

  private void UpdateCurrentCrew() {
    CrewMember[] crew = game.Commander().getShip().Crew();
    lstCrew.Items.clear();
    for(int i = 1; i < crew.length; i++) {
      if(crew[i] == null) {
        lstCrew.Items.add(Strings.PersonnelVacancy);
      } else {
        lstCrew.Items.add(crew[i]);
      }
    }
    boolean entries = (lstCrew.Items.size() > 0);
    lstCrew.setVisible(entries);
    lblCrewNoQuarters.setVisible(!entries);
    if(entries) {
      lstCrew.setHeight(lstCrew.getItemHeight() * Math.min(lstCrew.Items.size(), 6) + 2);
    } else { // TODO: remove this when Strings are moved to resource.
      lblCrewNoQuarters.setText(Strings.PersonnelNoQuarters);
    }
  }

  private void UpdateForHire() {
    CrewMember[] mercs = game.Commander().CurrentSystem().MercenariesForHire();
    lstForHire.Items.clear();
    for(int i = 0; i < mercs.length; i++) {
      lstForHire.Items.add(mercs[i]);
    }
    boolean entries = (lstForHire.Items.size() > 0);
    lstForHire.setVisible(entries);
    lblForHireNone.setVisible(!entries);
    if(entries) {
      lstForHire.setHeight(lstForHire.getItemHeight() * Math.min(lstForHire.Items.size(), 6) + 2);
    } else { // TODO: remove this when Strings are moved to resource.
      lblForHireNone.setText(Strings.PersonnelNoMercenaries);
    }
  }

  private void UpdateInfo() {
    boolean visible = false;
    boolean rateVisible = false;
    boolean hireFireVisible = false;
    if(selectedCrewMember != null) {
      visible = true;
      if(selectedCrewMember.Rate() > 0) {
        rateVisible = true;
      }
      lblName.setText(selectedCrewMember.Name());
      lblRate.setText(Functions.StringVars(Strings.MoneyRateSuffix, Functions.FormatMoney(selectedCrewMember.Rate())));
      lblPilot.setText(selectedCrewMember.Pilot() + "");
      lblFighter.setText(selectedCrewMember.Fighter() + "");
      lblTrader.setText(selectedCrewMember.Trader() + "");
      lblEngineer.setText(selectedCrewMember.Engineer() + "");
      btnHireFire.setText(game.Commander().getShip().HasCrew(selectedCrewMember.Id()) ? Strings.MercenaryFire : Strings.MercenaryHire);
      hireFireVisible = rateVisible || selectedCrewMember.Id() == CrewMemberId.Zeethibal;
    }
    lblName.setVisible(visible);
    lblRate.setVisible(rateVisible);
    lblPilotLabel.setVisible(visible);
    lblFighterLabel.setVisible(visible);
    lblTraderLabel.setVisible(visible);
    lblEngineerLabel.setVisible(visible);
    lblPilot.setVisible(visible);
    lblFighter.setVisible(visible);
    lblTrader.setVisible(visible);
    lblEngineer.setVisible(visible);
    btnHireFire.setVisible(hireFireVisible);
  }

  private void HireFire(Object sender, EventArgs e) {
    if(selectedCrewMember != null && btnHireFire.getVisible()) {
      if(game.Commander().getShip().HasCrew(selectedCrewMember.Id())) {
        if(FormAlert.Alert(AlertType.CrewFireMercenary, this, selectedCrewMember.Name()) == DialogResult.Yes) {
          game.Commander().getShip().Fire(selectedCrewMember.Id());
          UpdateAll();
          game.getParentWindow().UpdateAll();
        }
      } else {
        if(game.Commander().getShip().FreeCrewQuarters() == 0) {
          FormAlert.Alert(AlertType.CrewNoQuarters, this, selectedCrewMember.Name());
        } else {
          game.Commander().getShip().Hire(selectedCrewMember);
          UpdateAll();
          game.getParentWindow().UpdateAll();
        }
      }
    }
  }

  private void SelectedIndexChanged(Object sender, EventArgs e) {
    if(!handlingSelect) {
      handlingSelect = true;
      Object obj = ((ListBox)sender).getSelectedItem();
      DeselectAll();
      if(obj instanceof CrewMember) {
        ((ListBox)sender).setSelectedItem(obj);
        selectedCrewMember = (CrewMember)obj;
      } else {
        selectedCrewMember = null;
      }
      handlingSelect = false;
      UpdateInfo();
    }
  }
}
