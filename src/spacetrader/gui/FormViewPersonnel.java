/*******************************************************************************
 *
 * Space Trader for Windows 2.00
 *
 * Copyright (C) 2005 Jay French, All Rights Reserved
 *
 * Additional coding by David Pierron Original coding by Pieter Spronck, Sam Anderson, Samuel Goldstein, Matt Lee
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * If you'd like a copy of the GNU General Public License, go to http://www.gnu.org/copyleft/gpl.html.
 *
 * You can contact the author at spacetrader@frenchfryz.com
 *
 ******************************************************************************/
// using System;
// using System.Drawing;
// using System.Collections;
// using System.ComponentModel;
// using System.Windows.Forms;
package spacetrader.gui;

import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.*;
import spacetrader.guifacade.GuiFacade;

public class FormViewPersonnel extends SpaceTraderForm
{
	//#region Control Declarations

	private jwinforms.Button btnClose;
	private jwinforms.GroupBox boxForHire;
	private jwinforms.GroupBox boxInfo;
	private jwinforms.GroupBox boxCurrentCrew;
	private jwinforms.Button btnHireFire;
	private jwinforms.Label lblRate;
	private jwinforms.Label lblName;
	private jwinforms.Label lblEngineer;
	private jwinforms.Label lblTrader;
	private jwinforms.Label lblFighter;
	private jwinforms.Label lblPilot;
	private jwinforms.Label lblEngineerLabel;
	private jwinforms.Label lblTraderLabel;
	private jwinforms.Label lblFighterLabel;
	private jwinforms.Label lblPilotLabel;
	private jwinforms.ListBox lstForHire;
	private jwinforms.ListBox lstCrew;
	private jwinforms.Label lblCrewNoQuarters;
	private jwinforms.Label lblForHireNone;
	private final Game game = Game.CurrentGame();
	private CrewMember selectedCrewMember = null;
	private boolean handlingSelect = false;

	//#endregion

	//#region Methods

	public FormViewPersonnel()
	{
		InitializeComponent();

		UpdateAll();
	}

	//#region Windows Form Designer generated code
	/// <summary>
	/// Required method for Designer support - do not modify
	/// the contents of this method with the code editor.
	/// </summary>
	private void InitializeComponent()
	{
		btnClose = new jwinforms.Button();
		boxCurrentCrew = new jwinforms.GroupBox();
		lstCrew = new jwinforms.ListBox();
		boxForHire = new jwinforms.GroupBox();
		lstForHire = new jwinforms.ListBox();
		boxInfo = new jwinforms.GroupBox();
		btnHireFire = new jwinforms.Button();
		lblRate = new jwinforms.Label();
		lblName = new jwinforms.Label();
		lblEngineer = new jwinforms.Label();
		lblTrader = new jwinforms.Label();
		lblFighter = new jwinforms.Label();
		lblPilot = new jwinforms.Label();
		lblEngineerLabel = new jwinforms.Label();
		lblTraderLabel = new jwinforms.Label();
		lblFighterLabel = new jwinforms.Label();
		lblPilotLabel = new jwinforms.Label();
		lblCrewNoQuarters = new jwinforms.Label();
		lblForHireNone = new jwinforms.Label();
		boxCurrentCrew.SuspendLayout();
		boxForHire.SuspendLayout();
		boxInfo.SuspendLayout();
		this.SuspendLayout();
		//
		// btnClose
		//
		btnClose.setDialogResult(DialogResult.Cancel);
		btnClose.setLocation(new java.awt.Point(-32, -32));
		btnClose.setName("btnClose");
		btnClose.setSize(new jwinforms.Size(32, 32));
		btnClose.setTabIndex(32);
		btnClose.setTabStop(false);
		btnClose.setText("X");
		//
		// boxCurrentCrew
		//
		boxCurrentCrew.Controls.add(lblCrewNoQuarters);
		boxCurrentCrew.Controls.add(lstCrew);
		boxCurrentCrew.setLocation(new java.awt.Point(8, 8));
		boxCurrentCrew.setName("boxCurrentCrew");
		boxCurrentCrew.setSize(new jwinforms.Size(144, 114));
		boxCurrentCrew.setTabIndex(33);
		boxCurrentCrew.setTabStop(false);
		boxCurrentCrew.setText("Current Crew");
		//
		// lstCrew
		//
		lstCrew.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstCrew.setLocation(new java.awt.Point(8, 24));
		lstCrew.setName("lstCrew");
		lstCrew.setSize(new jwinforms.Size(126, 80));
		lstCrew.setTabIndex(6);
		lstCrew.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				HireFire(sender, e);
			}
		});
		lstCrew.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// boxForHire
		//
		boxForHire.Controls.add(lblForHireNone);
		boxForHire.Controls.add(lstForHire);
		boxForHire.setLocation(new java.awt.Point(160, 8));
		boxForHire.setName("boxForHire");
		boxForHire.setSize(new jwinforms.Size(144, 114));
		boxForHire.setTabIndex(34);
		boxForHire.setTabStop(false);
		boxForHire.setText("Mercenaries For Hire");
		//
		// lstForHire
		//
		lstForHire.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstForHire.setLocation(new java.awt.Point(8, 24));
		lstForHire.setName("lstForHire");
		lstForHire.setSize(new jwinforms.Size(126, 80));
		lstForHire.setTabIndex(5);
		lstForHire.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				HireFire(sender, e);
			}
		});
		lstForHire.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// boxInfo
		//
		boxInfo.Controls.add(btnHireFire);
		boxInfo.Controls.add(lblRate);
		boxInfo.Controls.add(lblName);
		boxInfo.Controls.add(lblEngineer);
		boxInfo.Controls.add(lblTrader);
		boxInfo.Controls.add(lblFighter);
		boxInfo.Controls.add(lblPilot);
		boxInfo.Controls.add(lblEngineerLabel);
		boxInfo.Controls.add(lblTraderLabel);
		boxInfo.Controls.add(lblFighterLabel);
		boxInfo.Controls.add(lblPilotLabel);
		boxInfo.setLocation(new java.awt.Point(312, 8));
		boxInfo.setName("boxInfo");
		boxInfo.setSize(new jwinforms.Size(168, 114));
		boxInfo.setTabIndex(35);
		boxInfo.setTabStop(false);
		boxInfo.setText("Mercenary Information");
		//
		// btnHireFire
		//
		btnHireFire.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnHireFire.setLocation(new java.awt.Point(120, 80));
		btnHireFire.setName("btnHireFire");
		btnHireFire.setSize(new jwinforms.Size(36, 22));
		btnHireFire.setTabIndex(4);
		btnHireFire.setText("Hire");
		btnHireFire.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				HireFire(sender, e);
			}
		});
		//
		// lblRate
		//
		lblRate.setLocation(new java.awt.Point(104, 40));
		lblRate.setName("lblRate");
		lblRate.setSize(new jwinforms.Size(59, 13));
		lblRate.setTabIndex(97);
		lblRate.setText("88 cr. daily");
		//
		// lblName
		//
		lblName.setFont(FontCollection.bold825);
		lblName.setLocation(new java.awt.Point(12, 18));
		lblName.setName("lblName");
		lblName.setSize(new jwinforms.Size(72, 13));
		lblName.setTabIndex(96);
		lblName.setText("Xxxxxxxxxxx");
		//
		// lblEngineer
		//
		lblEngineer.setLocation(new java.awt.Point(64, 88));
		lblEngineer.setName("lblEngineer");
		lblEngineer.setSize(new jwinforms.Size(17, 13));
		lblEngineer.setTabIndex(95);
		lblEngineer.setText("88");
		//
		// lblTrader
		//
		lblTrader.setLocation(new java.awt.Point(64, 72));
		lblTrader.setName("lblTrader");
		lblTrader.setSize(new jwinforms.Size(17, 13));
		lblTrader.setTabIndex(94);
		lblTrader.setText("88");
		//
		// lblFighter
		//
		lblFighter.setLocation(new java.awt.Point(64, 56));
		lblFighter.setName("lblFighter");
		lblFighter.setSize(new jwinforms.Size(17, 13));
		lblFighter.setTabIndex(93);
		lblFighter.setText("88");
		//
		// lblPilot
		//
		lblPilot.setLocation(new java.awt.Point(64, 40));
		lblPilot.setName("lblPilot");
		lblPilot.setSize(new jwinforms.Size(17, 13));
		lblPilot.setTabIndex(92);
		lblPilot.setText("88");
		//
		// lblEngineerLabel
		//
		lblEngineerLabel.setAutoSize(true);
		lblEngineerLabel.setLocation(new java.awt.Point(12, 88));
		lblEngineerLabel.setName("lblEngineerLabel");
		lblEngineerLabel.setSize(new jwinforms.Size(53, 16));
		lblEngineerLabel.setTabIndex(91);
		lblEngineerLabel.setText("Engineer:");
		//
		// lblTraderLabel
		//
		lblTraderLabel.setAutoSize(true);
		lblTraderLabel.setLocation(new java.awt.Point(12, 72));
		lblTraderLabel.setName("lblTraderLabel");
		lblTraderLabel.setSize(new jwinforms.Size(41, 16));
		lblTraderLabel.setTabIndex(90);
		lblTraderLabel.setText("Trader:");
		//
		// lblFighterLabel
		//
		lblFighterLabel.setAutoSize(true);
		lblFighterLabel.setLocation(new java.awt.Point(12, 56));
		lblFighterLabel.setName("lblFighterLabel");
		lblFighterLabel.setSize(new jwinforms.Size(43, 16));
		lblFighterLabel.setTabIndex(89);
		lblFighterLabel.setText("Fighter:");
		//
		// lblPilotLabel
		//
		lblPilotLabel.setAutoSize(true);
		lblPilotLabel.setLocation(new java.awt.Point(12, 40));
		lblPilotLabel.setName("lblPilotLabel");
		lblPilotLabel.setSize(new jwinforms.Size(29, 16));
		lblPilotLabel.setTabIndex(88);
		lblPilotLabel.setText("Pilot:");
		//
		// lblCrewNoQuarters
		//
		lblCrewNoQuarters.setLocation(new java.awt.Point(16, 24));
		lblCrewNoQuarters.setName("lblCrewNoQuarters");
		lblCrewNoQuarters.setSize(new jwinforms.Size(120, 16));
		lblCrewNoQuarters.setTabIndex(7);
		lblCrewNoQuarters.setText("No quarters available");
		lblCrewNoQuarters.setVisible(false);
		//
		// lblForHireNone
		//
		lblForHireNone.setLocation(new java.awt.Point(16, 24));
		lblForHireNone.setName("lblForHireNone");
		lblForHireNone.setSize(new jwinforms.Size(120, 16));
		lblForHireNone.setTabIndex(8);
		lblForHireNone.setText("No one for hire");
		lblForHireNone.setVisible(false);
		//
		// FormViewPersonnel
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(488, 129));
		Controls.add(boxInfo);
		Controls.add(boxForHire);
		Controls.add(boxCurrentCrew);
		Controls.add(btnClose);
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormViewPersonnel");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Personnel");
	}

	//#endregion

	private void DeselectAll()
	{
		lstForHire.clearSelected();
		lstCrew.clearSelected();
	}

	private void UpdateAll()
	{
		selectedCrewMember = null;

		UpdateForHire();
		UpdateCurrentCrew();
		UpdateInfo();
	}

	private void UpdateCurrentCrew()
	{
		CrewMember[] crew = game.Commander().getShip().Crew();

		lstCrew.Items.clear();
		for (int i = 1; i < crew.length; i++)
		{
			if (crew[i] == null)
				lstCrew.Items.add(Strings.PersonnelVacancy);
			else
				lstCrew.Items.add(crew[i]);
		}

		boolean entries = (lstCrew.Items.size() > 0);

		lstCrew.setVisible(entries);
		lblCrewNoQuarters.setVisible(!entries);

		if (entries)
			lstCrew.setHeight(lstCrew.getItemHeight() * Math.min(lstCrew.Items.size(), 6) + 2);
		else
			// TODO: remove this when Strings are moved to resource.
			lblCrewNoQuarters.setText(Strings.PersonnelNoQuarters);
	}

	private void UpdateForHire()
	{
		CrewMember[] mercs = game.Commander().getCurrentSystem().MercenariesForHire();

		lstForHire.Items.clear();
		for (int i = 0; i < mercs.length; i++)
			lstForHire.Items.add(mercs[i]);

		boolean entries = (lstForHire.Items.size() > 0);

		lstForHire.setVisible(entries);
		lblForHireNone.setVisible(!entries);

		if (entries)
			lstForHire.setHeight(lstForHire.getItemHeight() * Math.min(lstForHire.Items.size(), 6) + 2);
		else
			// TODO: remove this when Strings are moved to resource.
			lblForHireNone.setText(Strings.PersonnelNoMercenaries);
	}

	private void UpdateInfo()
	{
		boolean visible = false;
		boolean rateVisible = false;
		boolean hireFireVisible = false;

		if (selectedCrewMember != null)
		{
			visible = true;
			if (selectedCrewMember.Rate() > 0)
				rateVisible = true;

			lblName.setText(selectedCrewMember.Name());
			lblRate.setText(Functions.StringVars(Strings.MoneyRateSuffix, Functions.FormatMoney(selectedCrewMember
					.Rate())));
			lblPilot.setText(selectedCrewMember.Pilot() + "");
			lblFighter.setText(selectedCrewMember.Fighter() + "");
			lblTrader.setText(selectedCrewMember.Trader() + "");
			lblEngineer.setText(selectedCrewMember.Engineer() + "");

			btnHireFire.setText(game.Commander().getShip().HasCrew(selectedCrewMember.Id()) ? Strings.MercenaryFire
					: Strings.MercenaryHire);
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

	//#endregion

	//#region Event Handlers

	private void HireFire(Object sender, EventArgs e)
	{
		if (selectedCrewMember != null && btnHireFire.getVisible())
		{
			if (game.Commander().getShip().HasCrew(selectedCrewMember.Id()))
			{
				if (FormAlert.Alert(AlertType.CrewFireMercenary, selectedCrewMember.Name()) == DialogResult.Yes)
				{
					game.Commander().getShip().Fire(selectedCrewMember.Id());

					UpdateAll();
					game.getParentWindow().UpdateAll();
				}
			} else
			{
				if (game.Commander().getShip().FreeCrewQuarters() == 0)
					GuiFacade.alert(AlertType.CrewNoQuarters, selectedCrewMember.Name());
				else
				{
					game.Commander().getShip().Hire(selectedCrewMember);

					UpdateAll();
					game.getParentWindow().UpdateAll();
				}
			}
		}
	}

	private void SelectedIndexChanged(Object sender, EventArgs e)
	{
		if (!handlingSelect)
		{
			handlingSelect = true;

			Object obj = ((ListBox)sender).getSelectedItem();
			DeselectAll();

			if (obj instanceof CrewMember)
			{
				((ListBox)sender).setSelectedItem(obj);
				selectedCrewMember = (CrewMember)obj;
			} else
				selectedCrewMember = null;

			handlingSelect = false;
			UpdateInfo();
		}
	}

	//#endregion
}
