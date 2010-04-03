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
package spacetrader.gui;

import java.util.*;

import jwinforms.*;
import spacetrader.stub.ArrayList;
import spacetrader.util.*;
import spacetrader.*;
import spacetrader.enums.*;


@SuppressWarnings("unchecked")
public class FormViewShip extends SpaceTraderForm
{
	private jwinforms.Button btnClose;
	private jwinforms.Label lblTypeLabel;
	private jwinforms.Label lblType;
	private jwinforms.GroupBox boxSpecialCargo;
	private jwinforms.Label lblSpecialCargo;
	private jwinforms.Label lblEquipLabel;
	private jwinforms.Label lblEquip;

	private final Game game = Game.CurrentGame();
	private final Ship ship = Game.CurrentGame().Commander().getShip();

	public FormViewShip()
	{
		InitializeComponent();

		lblType.setText(ship.Name());
		lblEquipLabel.setText("");
		lblEquip.setText("");

		DisplayEquipment();
		DisplaySpecialCargo();
	}

	private void InitializeComponent()
	{
		lblTypeLabel = new jwinforms.Label();
		lblType = new jwinforms.Label();
		btnClose = new jwinforms.Button();
		lblEquipLabel = new jwinforms.Label();
		lblEquip = new jwinforms.Label();
		boxSpecialCargo = new jwinforms.GroupBox();
		lblSpecialCargo = new jwinforms.Label();
		boxSpecialCargo.SuspendLayout();
		this.SuspendLayout();
		// 
		// lblTypeLabel
		// 
		lblTypeLabel.setAutoSize(true);
		lblTypeLabel.setFont(FontCollection.bold825);
		lblTypeLabel.setLocation(new java.awt.Point(8, 8));
		lblTypeLabel.setName("lblTypeLabel");
		lblTypeLabel.setSize(new jwinforms.Size(34, 13));
		lblTypeLabel.setTabIndex(2);
		lblTypeLabel.setText("Type:");
		// 
		// lblType
		// 
		lblType.setLocation(new java.awt.Point(80, 8));
		lblType.setName("lblType");
		lblType.setSize(new jwinforms.Size(100, 13));
		lblType.setTabIndex(4);
		lblType.setText("Grasshopper");
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
		// lblEquipLabel
		// 
		lblEquipLabel.setFont(FontCollection.bold825);
		lblEquipLabel.setLocation(new java.awt.Point(8, 34));
		lblEquipLabel.setName("lblEquipLabel");
		lblEquipLabel.setSize(new jwinforms.Size(64, 176));
		lblEquipLabel.setTabIndex(43);
		lblEquipLabel.setText("Hull:\r\n\r\nEquipment:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nUnfilled:");
		// 
		// lblEquip
		// 
		lblEquip.setLocation(new java.awt.Point(80, 34));
		lblEquip.setName("lblEquip");
		lblEquip.setSize(new jwinforms.Size(120, 176));
		lblEquip.setTabIndex(44);
		lblEquip
				.setText("Hardened\r\n\r\n1 Military Laser\r\n1 Morgan\'s Laser\r\n1 Energy Shield\r\n1 Reflective Shi"
						+ "eld\r\n1 Lightning Shield\r\nNavigating System\r\nAuto-Repair System\r\n10 Extra Cargo Bays\r\nAn Escape Pod\r\n"
						+ "\r\n1 weapon slot\r\n1 gadget slot");
		// 
		// boxSpecialCargo
		// 
		boxSpecialCargo.Controls.addAll((new WinformControl[] { lblSpecialCargo }));
		boxSpecialCargo.setLocation(new java.awt.Point(192, 8));
		boxSpecialCargo.setName("boxSpecialCargo");
		boxSpecialCargo.setSize(new jwinforms.Size(200, 204));
		boxSpecialCargo.setTabIndex(64);
		boxSpecialCargo.setTabStop(false);
		boxSpecialCargo.setText("Special Cargo");
		// 
		// lblSpecialCargo
		// 
		lblSpecialCargo.setLocation(new java.awt.Point(8, 16));
		lblSpecialCargo.setName("lblSpecialCargo");
		lblSpecialCargo.setSize(new jwinforms.Size(190, 176));
		lblSpecialCargo.setTabIndex(0);
		lblSpecialCargo.setText("No special items.");
		// 
		// FormViewShip
		// 
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(402, 219));
		Controls.addAll(Arrays.asList(boxSpecialCargo, lblEquip, lblEquipLabel, btnClose,
				lblTypeLabel, lblType));
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormViewShip");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Current Ship");
	}

	private void DisplayEquipment()
	{
		if (game.getQuestStatusScarab() == SpecialEvent.StatusScarabDone)
		{
			lblEquipLabel.setText(lblEquipLabel.getText() + ("Hull:" + Strings.newline + Strings.newline));
			lblEquip.setText(lblEquip.getText() + ("Hardened" + Strings.newline + Strings.newline));
		}

		boolean equipPrinted = false;

		for (int i = 0; i < Consts.Weapons.length; i++)
		{
			int count = 0;
			for (int j = 0; j < ship.Weapons().length; j++)
			{
				if (ship.Weapons()[j] != null && ship.Weapons()[j].Type() == Consts.Weapons[i].Type())
					count++;
			}
			if (count > 0)
			{
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(count, Consts.Weapons[i].Name()) + Strings.newline));
				equipPrinted = true;
			}
		}

		for (int i = 0; i < Consts.Shields.length; i++)
		{
			int count = 0;
			for (int j = 0; j < ship.Shields().length; j++)
			{
				if (ship.Shields()[j] != null && ship.Shields()[j].Type() == Consts.Shields[i].Type())
					count++;
			}
			if (count > 0)
			{
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(count, Consts.Shields[i].Name()) + Strings.newline));
				equipPrinted = true;
			}
		}

		for (int i = 0; i < Consts.Gadgets.length; i++)
		{
			int count = 0;
			for (int j = 0; j < ship.Gadgets().length; j++)
			{
				if (ship.Gadgets()[j] != null && ship.Gadgets()[j].Type() == Consts.Gadgets[i].Type())
					count++;
			}
			if (count > 0)
			{
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));

				if (i == GadgetType.ExtraCargoBays.CastToInt() || i == GadgetType.HiddenCargoBays.CastToInt())
				{
					count *= 5;
					lblEquip
							.setText(lblEquip.getText()
									+ (Functions.FormatNumber(count) + Consts.Gadgets[i].Name().substring(1) + Strings.newline));
				} else
					lblEquip.setText(lblEquip.getText()
							+ (Functions.Multiples(count, Consts.Gadgets[i].Name()) + Strings.newline));

				equipPrinted = true;
			}
		}

		if (ship.getEscapePod())
		{
			lblEquipLabel.setText(lblEquipLabel.getText()
					+ (equipPrinted ? Strings.newline : "Equipment:" + Strings.newline));
			lblEquip.setText(lblEquip.getText() + ("1 " + Strings.ShipInfoEscapePod + Strings.newline));
			equipPrinted = true;
		}

		if (ship.FreeSlots() > 0)
		{
			lblEquipLabel.setText(lblEquipLabel.getText() + ((equipPrinted ? Strings.newline : "") + "Unfilled:"));
			lblEquip.setText(lblEquip.getText() + (equipPrinted ? Strings.newline : ""));

			if (ship.FreeSlotsWeapon() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsWeapon(), "weapon slot") + Strings.newline));

			if (ship.FreeSlotsShield() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsShield(), "shield slot") + Strings.newline));

			if (ship.FreeSlotsGadget() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsGadget(), "gadget slot") + Strings.newline));
		}
	}

	private void DisplaySpecialCargo()
	{
		ArrayList specialCargo = new ArrayList(12);

		if (ship.getTribbles() > 0)
		{
			if (ship.getTribbles() == Consts.MaxTribbles)
				specialCargo.add(Strings.SpecialCargoTribblesInfest);
			else
				specialCargo.add(Functions.Multiples(ship.getTribbles(), Strings.SpecialCargoTribblesCute) + ".");
		}

		if (game.getQuestStatusJapori() == SpecialEvent.StatusJaporiInTransit)
			specialCargo.add(Strings.SpecialCargoJapori);

		if (ship.ArtifactOnBoard())
			specialCargo.add(Strings.SpecialCargoArtifact);

		if (game.getQuestStatusJarek() == SpecialEvent.StatusJarekDone)
			specialCargo.add(Strings.SpecialCargoJarek);

		if (ship.ReactorOnBoard())
		{
			specialCargo.add(Strings.SpecialCargoReactor);
			specialCargo.add(Functions.Multiples(10 - ((game.getQuestStatusReactor() - 1) / 2), "bay")
					+ Strings.SpecialCargoReactorBays);
		}

		if (ship.SculptureOnBoard())
			specialCargo.add(Strings.SpecialCargoSculpture);

		if (game.getCanSuperWarp())
			specialCargo.add(Strings.SpecialCargoExperiment);

		lblSpecialCargo.setText(specialCargo.size() == 0 ? Strings.SpecialCargoNone : Util.StringsJoin(Strings.newline
				+ Strings.newline, Functions.ArrayListtoStringArray(specialCargo)));
	}
}
