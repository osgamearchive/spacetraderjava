/*******************************************************************************
 *
 * Space Trader for Windows 2.00
 *
 * Copyright (C) 2005 Jay French, All Rights Reserved
 *
 * Additional coding by David Pierron
 * Original coding by Pieter Spronck, Sam Anderson, Samuel Goldstein, Matt Lee
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * If you'd like a copy of the GNU General Public License, go to
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * You can contact the author at spacetrader@frenchfryz.com
 *
 ******************************************************************************/
//using System;
//using System.Drawing;
//using System.Collections;
//using System.ComponentModel;
//using System.Windows.Forms;
package spacetrader.gui;

import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.AlertType;
import spacetrader.enums.EquipmentType;
import spacetrader.enums.GadgetType;
import spacetrader.guifacade.GuiFacade;

public class FormEquipment extends SpaceTraderForm
{
	// #region Control Declarations
	public static void main(String[] args) throws Exception
	{
		FormEquipment form = new FormEquipment();
		Launcher.runForm(form);
	}
	private jwinforms.Button btnClose;
	private jwinforms.GroupBox boxSell;
	private jwinforms.GroupBox boxBuy;
	private jwinforms.ListBox lstSellWeapon;
	private jwinforms.ListBox lstSellShield;
	private jwinforms.ListBox lstSellGadget;
	private jwinforms.ListBox lstBuyGadget;
	private jwinforms.ListBox lstBuyShield;
	private jwinforms.ListBox lstBuyWeapon;
	private jwinforms.GroupBox boxShipInfo;
	private jwinforms.Label lblName;
	private jwinforms.Label lblDescription;
	private jwinforms.PictureBox picEquipment;
	private jwinforms.Label lblSellPrice;
	private jwinforms.Label lblBuyPrice;
	private jwinforms.Label lblSellGadgets;
	private jwinforms.Label lblSellShields;
	private jwinforms.Label lblSellWeapons;
	private jwinforms.Label lblBuyGadgets;
	private jwinforms.Label lblBuyShields;
	private jwinforms.Label lblBuyWeapons;
	private jwinforms.Button btnBuy;
	private jwinforms.Button btnSell;
	private jwinforms.Label lblBuyPriceLabel;
	private jwinforms.Label lblSellPriceLabel;
	private jwinforms.Label lblNameLabel;
	private jwinforms.Label lblTypeLabel;
	private jwinforms.Label lblType;
	private jwinforms.Label lblPowerLabel;
	private jwinforms.Label lblChargeLabel;
	private jwinforms.Label lblPower;
	private jwinforms.Label lblCharge;
	private jwinforms.Label lblSellWeaponNoSlots;
	private jwinforms.Label lblSellShieldNoSlots;
	private jwinforms.Label lblSellGadgetNoSlots;
	private jwinforms.Label lblBuyWeaponNone;
	private jwinforms.Label lblBuyShieldNone;
	private jwinforms.Label lblBuyGadgetNone;

	// #endregion

	// #region Member Declarations

	private final Game game = Game.CurrentGame();
	private final Equipment[] equipBuy = Consts.EquipmentForSale;
	private Equipment selectedEquipment = null;
	private boolean sellSideSelected = false;
	private boolean handlingSelect = false;

	// #endregion

	// #region Methods

	public FormEquipment()
	{
		InitializeComponent();

		UpdateBuy();
		UpdateSell();
	}

	// #region Windows Form Designer generated code
	// / <summary>
	// / Required method for Designer support - do not modify
	// / the contents of this method with the code editor.
	// / </summary>
	private void InitializeComponent()
	{
		btnClose = new jwinforms.Button();
		boxSell = new jwinforms.GroupBox();
		lblSellGadgetNoSlots = new jwinforms.Label();
		lblSellShieldNoSlots = new jwinforms.Label();
		lblSellWeaponNoSlots = new jwinforms.Label();
		lblSellGadgets = new jwinforms.Label();
		lblSellShields = new jwinforms.Label();
		lblSellWeapons = new jwinforms.Label();
		lstSellGadget = new jwinforms.ListBox();
		lstSellShield = new jwinforms.ListBox();
		lstSellWeapon = new jwinforms.ListBox();
		boxBuy = new jwinforms.GroupBox();
		lblBuyGadgetNone = new jwinforms.Label();
		lblBuyShieldNone = new jwinforms.Label();
		lblBuyWeaponNone = new jwinforms.Label();
		lblBuyGadgets = new jwinforms.Label();
		lblBuyShields = new jwinforms.Label();
		lblBuyWeapons = new jwinforms.Label();
		lstBuyGadget = new jwinforms.ListBox();
		lstBuyShield = new jwinforms.ListBox();
		lstBuyWeapon = new jwinforms.ListBox();
		boxShipInfo = new jwinforms.GroupBox();
		lblCharge = new jwinforms.Label();
		lblPower = new jwinforms.Label();
		lblChargeLabel = new jwinforms.Label();
		lblPowerLabel = new jwinforms.Label();
		lblType = new jwinforms.Label();
		lblTypeLabel = new jwinforms.Label();
		lblNameLabel = new jwinforms.Label();
		btnSell = new jwinforms.Button();
		btnBuy = new jwinforms.Button();
		lblBuyPriceLabel = new jwinforms.Label();
		lblBuyPrice = new jwinforms.Label();
		lblSellPriceLabel = new jwinforms.Label();
		picEquipment = new jwinforms.PictureBox();
		lblSellPrice = new jwinforms.Label();
		lblDescription = new jwinforms.Label();
		lblName = new jwinforms.Label();
		boxSell.SuspendLayout();
		boxBuy.SuspendLayout();
		boxShipInfo.SuspendLayout();
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
		// boxSell
		//
		boxSell.Controls.add(lblSellGadgetNoSlots);
		boxSell.Controls.add(lblSellShieldNoSlots);
		boxSell.Controls.add(lblSellWeaponNoSlots);
		boxSell.Controls.add(lblSellGadgets);
		boxSell.Controls.add(lblSellShields);
		boxSell.Controls.add(lblSellWeapons);
		boxSell.Controls.add(lstSellGadget);
		boxSell.Controls.add(lstSellShield);
		boxSell.Controls.add(lstSellWeapon);
		boxSell.setLocation(new java.awt.Point(4, 2));
		boxSell.setName("boxSell");
		boxSell.setSize(new jwinforms.Size(144, 304));
		boxSell.setTabIndex(1);
		boxSell.setTabStop(false);
		boxSell.setText("Current Inventory");
		//
		// lblSellGadgetNoSlots
		//
		lblSellGadgetNoSlots.setLocation(new java.awt.Point(24, 228));
		lblSellGadgetNoSlots.setName("lblSellGadgetNoSlots");
		lblSellGadgetNoSlots.setSize(new jwinforms.Size(104, 16));
		lblSellGadgetNoSlots.setTabIndex(149);
		lblSellGadgetNoSlots.setText("No slots");
		lblSellGadgetNoSlots.setVisible(false);
		//
		// lblSellShieldNoSlots
		//
		lblSellShieldNoSlots.setLocation(new java.awt.Point(24, 132));
		lblSellShieldNoSlots.setName("lblSellShieldNoSlots");
		lblSellShieldNoSlots.setSize(new jwinforms.Size(104, 16));
		lblSellShieldNoSlots.setTabIndex(148);
		lblSellShieldNoSlots.setText("No slots");
		lblSellShieldNoSlots.setVisible(false);
		//
		// lblSellWeaponNoSlots
		//
		lblSellWeaponNoSlots.setLocation(new java.awt.Point(24, 36));
		lblSellWeaponNoSlots.setName("lblSellWeaponNoSlots");
		lblSellWeaponNoSlots.setSize(new jwinforms.Size(104, 16));
		lblSellWeaponNoSlots.setTabIndex(147);
		lblSellWeaponNoSlots.setText("No slots");
		lblSellWeaponNoSlots.setVisible(false);
		//
		// lblSellGadgets
		//
		lblSellGadgets.setAutoSize(true);
		lblSellGadgets.setLocation(new java.awt.Point(8, 212));
		lblSellGadgets.setName("lblSellGadgets");
		lblSellGadgets.setSize(new jwinforms.Size(47, 16));
		lblSellGadgets.setTabIndex(146);
		lblSellGadgets.setText("Gadgets");
		//
		// lblSellShields
		//
		lblSellShields.setAutoSize(true);
		lblSellShields.setLocation(new java.awt.Point(8, 116));
		lblSellShields.setName("lblSellShields");
		lblSellShields.setSize(new jwinforms.Size(41, 16));
		lblSellShields.setTabIndex(145);
		lblSellShields.setText("Shields");
		//
		// lblSellWeapons
		//
		lblSellWeapons.setAutoSize(true);
		lblSellWeapons.setLocation(new java.awt.Point(8, 20));
		lblSellWeapons.setName("lblSellWeapons");
		lblSellWeapons.setSize(new jwinforms.Size(52, 16));
		lblSellWeapons.setTabIndex(144);
		lblSellWeapons.setText("Weapons");
		//
		// lstSellGadget
		//
		lstSellGadget.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstSellGadget.setLocation(new java.awt.Point(8, 228));
		lstSellGadget.setName("lstSellGadget");
		lstSellGadget.setSize(new jwinforms.Size(128, 67));
		lstSellGadget.setTabIndex(3);
		lstSellGadget.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SellClick(sender, e);
			}
		});
		lstSellGadget.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// lstSellShield
		//
		lstSellShield.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstSellShield.setLocation(new java.awt.Point(8, 132));
		lstSellShield.setName("lstSellShield");
		lstSellShield.setSize(new jwinforms.Size(128, 67));
		lstSellShield.setTabIndex(2);
		lstSellShield.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SellClick(sender, e);
			}
		});
		lstSellShield.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// lstSellWeapon
		//
		lstSellWeapon.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstSellWeapon.setLocation(new java.awt.Point(8, 36));
		lstSellWeapon.setName("lstSellWeapon");
		lstSellWeapon.setSize(new jwinforms.Size(128, 67));
		lstSellWeapon.setTabIndex(1);
		lstSellWeapon.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SellClick(sender, e);
			}
		});
		lstSellWeapon.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// boxBuy
		//
		boxBuy.Controls.add(lblBuyGadgetNone);
		boxBuy.Controls.add(lblBuyShieldNone);
		boxBuy.Controls.add(lblBuyWeaponNone);
		boxBuy.Controls.add(lblBuyGadgets);
		boxBuy.Controls.add(lblBuyShields);
		boxBuy.Controls.add(lblBuyWeapons);
		boxBuy.Controls.add(lstBuyGadget);
		boxBuy.Controls.add(lstBuyShield);
		boxBuy.Controls.add(lstBuyWeapon);
		boxBuy.setLocation(new java.awt.Point(156, 2));
		boxBuy.setName("boxBuy");
		boxBuy.setSize(new jwinforms.Size(144, 304));
		boxBuy.setTabIndex(2);
		boxBuy.setTabStop(false);
		boxBuy.setText("Equipment For Sale");
		//
		// lblBuyGadgetNone
		//
		lblBuyGadgetNone.setLocation(new java.awt.Point(24, 228));
		lblBuyGadgetNone.setName("lblBuyGadgetNone");
		lblBuyGadgetNone.setSize(new jwinforms.Size(104, 16));
		lblBuyGadgetNone.setTabIndex(150);
		lblBuyGadgetNone.setText("None for sale");
		lblBuyGadgetNone.setVisible(false);
		//
		// lblBuyShieldNone
		//
		lblBuyShieldNone.setLocation(new java.awt.Point(24, 132));
		lblBuyShieldNone.setName("lblBuyShieldNone");
		lblBuyShieldNone.setSize(new jwinforms.Size(104, 16));
		lblBuyShieldNone.setTabIndex(149);
		lblBuyShieldNone.setText("None for sale");
		lblBuyShieldNone.setVisible(false);
		//
		// lblBuyWeaponNone
		//
		lblBuyWeaponNone.setLocation(new java.awt.Point(24, 36));
		lblBuyWeaponNone.setName("lblBuyWeaponNone");
		lblBuyWeaponNone.setSize(new jwinforms.Size(104, 16));
		lblBuyWeaponNone.setTabIndex(148);
		lblBuyWeaponNone.setText("None for sale");
		lblBuyWeaponNone.setVisible(false);
		//
		// lblBuyGadgets
		//
		lblBuyGadgets.setAutoSize(true);
		lblBuyGadgets.setLocation(new java.awt.Point(8, 212));
		lblBuyGadgets.setName("lblBuyGadgets");
		lblBuyGadgets.setSize(new jwinforms.Size(47, 16));
		lblBuyGadgets.setTabIndex(143);
		lblBuyGadgets.setText("Gadgets");
		//
		// lblBuyShields
		//
		lblBuyShields.setAutoSize(true);
		lblBuyShields.setLocation(new java.awt.Point(8, 116));
		lblBuyShields.setName("lblBuyShields");
		lblBuyShields.setSize(new jwinforms.Size(41, 16));
		lblBuyShields.setTabIndex(142);
		lblBuyShields.setText("Shields");
		//
		// lblBuyWeapons
		//
		lblBuyWeapons.setAutoSize(true);
		lblBuyWeapons.setLocation(new java.awt.Point(8, 20));
		lblBuyWeapons.setName("lblBuyWeapons");
		lblBuyWeapons.setSize(new jwinforms.Size(52, 16));
		lblBuyWeapons.setTabIndex(141);
		lblBuyWeapons.setText("Weapons");
		//
		// lstBuyGadget
		//
		lstBuyGadget.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstBuyGadget.setLocation(new java.awt.Point(8, 228));
		lstBuyGadget.setName("lstBuyGadget");
		lstBuyGadget.setSize(new jwinforms.Size(128, 67));
		lstBuyGadget.setTabIndex(6);
		lstBuyGadget.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				BuyClick(sender, e);
			}
		});
		lstBuyGadget.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// lstBuyShield
		//
		lstBuyShield.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstBuyShield.setLocation(new java.awt.Point(8, 132));
		lstBuyShield.setName("lstBuyShield");
		lstBuyShield.setSize(new jwinforms.Size(128, 67));
		lstBuyShield.setTabIndex(5);
		lstBuyShield.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				BuyClick(sender, e);
			}
		});
		lstBuyShield.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// lstBuyWeapon
		//
		lstBuyWeapon.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		lstBuyWeapon.setLocation(new java.awt.Point(8, 36));
		lstBuyWeapon.setName("lstBuyWeapon");
		lstBuyWeapon.setSize(new jwinforms.Size(128, 67));
		lstBuyWeapon.setTabIndex(4);
		lstBuyWeapon.setDoubleClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				BuyClick(sender, e);
			}
		});
		lstBuyWeapon.setSelectedIndexChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SelectedIndexChanged(sender, e);
			}
		});
		//
		// boxShipInfo
		//
		boxShipInfo.Controls.add(lblCharge);
		boxShipInfo.Controls.add(lblPower);
		boxShipInfo.Controls.add(lblChargeLabel);
		boxShipInfo.Controls.add(lblPowerLabel);
		boxShipInfo.Controls.add(lblType);
		boxShipInfo.Controls.add(lblTypeLabel);
		boxShipInfo.Controls.add(lblNameLabel);
		boxShipInfo.Controls.add(btnSell);
		boxShipInfo.Controls.add(btnBuy);
		boxShipInfo.Controls.add(lblBuyPriceLabel);
		boxShipInfo.Controls.add(lblBuyPrice);
		boxShipInfo.Controls.add(lblSellPriceLabel);
		boxShipInfo.Controls.add(picEquipment);
		boxShipInfo.Controls.add(lblSellPrice);
		boxShipInfo.Controls.add(lblName);
		boxShipInfo.Controls.add(lblDescription);
		boxShipInfo.setLocation(new java.awt.Point(308, 2));
		boxShipInfo.setName("boxShipInfo");
		boxShipInfo.setSize(new jwinforms.Size(208, 304));
		boxShipInfo.setTabIndex(3);
		boxShipInfo.setTabStop(false);
		boxShipInfo.setText("Equipment Information");
		//
		// lblCharge
		//
		lblCharge.setLocation(new java.awt.Point(80, 164));
		lblCharge.setName("lblCharge");
		lblCharge.setSize(new jwinforms.Size(116, 16));
		lblCharge.setTabIndex(67);
		lblCharge.setText("888");
		//
		// lblPower
		//
		lblPower.setLocation(new java.awt.Point(80, 148));
		lblPower.setName("lblPower");
		lblPower.setSize(new jwinforms.Size(116, 16));
		lblPower.setTabIndex(66);
		lblPower.setText("888");
		//
		// lblChargeLabel
		//
		lblChargeLabel.setAutoSize(true);
		lblChargeLabel.setFont(FontCollection.bold825);
		lblChargeLabel.setLocation(new java.awt.Point(8, 164));
		lblChargeLabel.setName("lblChargeLabel");
		lblChargeLabel.setSize(new jwinforms.Size(46, 16));
		lblChargeLabel.setTabIndex(65);
		lblChargeLabel.setText("Charge:");
		//
		// lblPowerLabel
		//
		lblPowerLabel.setAutoSize(true);
		lblPowerLabel.setFont(FontCollection.bold825);
		lblPowerLabel.setLocation(new java.awt.Point(8, 148));
		lblPowerLabel.setName("lblPowerLabel");
		lblPowerLabel.setSize(new jwinforms.Size(41, 16));
		lblPowerLabel.setTabIndex(64);
		lblPowerLabel.setText("Power:");
		//
		// lblType
		//
		lblType.setLocation(new java.awt.Point(80, 100));
		lblType.setName("lblType");
		lblType.setSize(new jwinforms.Size(116, 16));
		lblType.setTabIndex(63);
		lblType.setText("Weapon");
		//
		// lblTypeLabel
		//
		lblTypeLabel.setAutoSize(true);
		lblTypeLabel.setFont(FontCollection.bold825);
		lblTypeLabel.setLocation(new java.awt.Point(8, 100));
		lblTypeLabel.setName("lblTypeLabel");
		lblTypeLabel.setSize(new jwinforms.Size(34, 16));
		lblTypeLabel.setTabIndex(62);
		lblTypeLabel.setText("Type:");
		//
		// lblNameLabel
		//
		lblNameLabel.setAutoSize(true);
		lblNameLabel.setFont(FontCollection.bold825);
		lblNameLabel.setLocation(new java.awt.Point(8, 84));
		lblNameLabel.setName("lblNameLabel");
		lblNameLabel.setSize(new jwinforms.Size(39, 16));
		lblNameLabel.setTabIndex(61);
		lblNameLabel.setText("Name:");
		//
		// btnSell
		//
		btnSell.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnSell.setLocation(new java.awt.Point(103, 272));
		btnSell.setName("btnSell");
		btnSell.setSize(new jwinforms.Size(58, 22));
		btnSell.setTabIndex(8);
		btnSell.setText("Sell");
		btnSell.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				SellClick(sender, e);
			}
		});
		//
		// btnBuy
		//
		btnBuy.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnBuy.setLocation(new java.awt.Point(31, 272));
		btnBuy.setName("btnBuy");
		btnBuy.setSize(new jwinforms.Size(58, 22));
		btnBuy.setTabIndex(7);
		btnBuy.setText("Buy");
		btnBuy.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				BuyClick(sender, e);
			}
		});
		//
		// lblBuyPriceLabel
		//
		lblBuyPriceLabel.setAutoSize(true);
		lblBuyPriceLabel.setFont(FontCollection.bold825);
		lblBuyPriceLabel.setLocation(new java.awt.Point(8, 116));
		lblBuyPriceLabel.setName("lblBuyPriceLabel");
		lblBuyPriceLabel.setSize(new jwinforms.Size(58, 16));
		lblBuyPriceLabel.setTabIndex(57);
		lblBuyPriceLabel.setText("Buy Price:");
		//
		// lblBuyPrice
		//
		lblBuyPrice.setLocation(new java.awt.Point(80, 116));
		lblBuyPrice.setName("lblBuyPrice");
		lblBuyPrice.setSize(new jwinforms.Size(116, 16));
		lblBuyPrice.setTabIndex(56);
		lblBuyPrice.setText("888,888 cr.");
		//
		// lblSellPriceLabel
		//
		lblSellPriceLabel.setAutoSize(true);
		lblSellPriceLabel.setFont(FontCollection.bold825);
		lblSellPriceLabel.setLocation(new java.awt.Point(8, 132));
		lblSellPriceLabel.setName("lblSellPriceLabel");
		lblSellPriceLabel.setSize(new jwinforms.Size(58, 16));
		lblSellPriceLabel.setTabIndex(55);
		lblSellPriceLabel.setText("Sell Price:");
		//
		// picEquipment
		//
		picEquipment.setBackColor(java.awt.Color.white);
		picEquipment.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		picEquipment.setLocation(new java.awt.Point(71, 20));
		picEquipment.setName("picEquipment");
		picEquipment.setSize(new jwinforms.Size(66, 54));
		picEquipment.setTabIndex(54);
		picEquipment.setTabStop(false);
		picEquipment.setVisible(false);
		//
		// lblSellPrice
		//
		lblSellPrice.setLocation(new java.awt.Point(80, 132));
		lblSellPrice.setName("lblSellPrice");
		lblSellPrice.setSize(new jwinforms.Size(116, 16));
		lblSellPrice.setTabIndex(52);
		lblSellPrice.setText("888,888 cr.");
		//
		// lblDescription
		//
		lblDescription.setLocation(new java.awt.Point(8, 188));
		lblDescription.setName("lblDescription");
		lblDescription.setSize(new jwinforms.Size(196, 75));
		lblDescription.setTabIndex(47);
		//
		// lblName
		//
		lblName.setLocation(new java.awt.Point(80, 84));
		lblName.setName("lblName");
		lblName.setSize(new jwinforms.Size(116, 16));
		lblName.setTabIndex(35);
		lblName.setText("Auto-Repair System");
		//
		// FormEquipment
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(522, 311));
		Controls.add(boxShipInfo);
		Controls.add(boxBuy);
		Controls.add(boxSell);
		Controls.add(btnClose);
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormEquipment");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Buy/Sell Equipment");
		GroupBox r = boxSell;
		GroupBox r1 = boxBuy;
		GroupBox r2 = boxShipInfo;

	}

	// #endregion

	private void Buy()
	{
		if (selectedEquipment != null && !sellSideSelected)
		{
			Commander cmdr = game.Commander();
			EquipmentType baseType = selectedEquipment.EquipmentType();

			if (baseType == EquipmentType.Gadget && cmdr.getShip().HasGadget(((Gadget) selectedEquipment).Type())
					&& ((Gadget) selectedEquipment).Type() != GadgetType.ExtraCargoBays)
				GuiFacade.alert(AlertType.EquipmentAlreadyOwn);
			else if (cmdr.getDebt() > 0)
				GuiFacade.alert(AlertType.DebtNoBuy);
			else if (selectedEquipment.Price() > cmdr.CashToSpend())
				GuiFacade.alert(AlertType.EquipmentIF);
			else if ((baseType == EquipmentType.Weapon && cmdr.getShip().FreeSlotsWeapon() == 0)
					|| (baseType == EquipmentType.Shield && cmdr.getShip().FreeSlotsShield() == 0)
					|| (baseType == EquipmentType.Gadget && cmdr.getShip().FreeSlotsGadget() == 0))
				GuiFacade.alert(AlertType.EquipmentNotEnoughSlots);
			else if (FormAlert.Alert(AlertType.EquipmentBuy, selectedEquipment.Name(), Functions
			.FormatNumber(selectedEquipment.Price())) == DialogResult.Yes)
			{
				cmdr.getShip().AddEquipment(selectedEquipment);
				cmdr.setCash(cmdr.getCash() - selectedEquipment.Price());

				DeselectAll();
				UpdateSell();
				game.getParentWindow().UpdateAll();
			}
		}
	}

	private void DeselectAll()
	{
		lstSellWeapon.clearSelected();
		lstSellShield.clearSelected();
		lstSellGadget.clearSelected();
		lstBuyWeapon.clearSelected();
		lstBuyShield.clearSelected();
		lstBuyGadget.clearSelected();
	}

	private void Sell()
	{
		if (selectedEquipment != null && sellSideSelected)
		{
			if (FormAlert.Alert(AlertType.EquipmentSell) == DialogResult.Yes)
			{
				// The slot is the selected index. Two of the three list boxes
				// will have selected indices of -1, so adding
				// 2 to the total cancels those out.
				int slot = lstSellWeapon.getSelectedIndex() + lstSellShield.getSelectedIndex() + lstSellGadget.getSelectedIndex() + 2;
				Commander cmdr = game.Commander();

				if (selectedEquipment.EquipmentType() == EquipmentType.Gadget
						&& (((Gadget) selectedEquipment).Type() == GadgetType.ExtraCargoBays || ((Gadget) selectedEquipment)
								.Type() == GadgetType.HiddenCargoBays) && cmdr.getShip().FreeCargoBays() < 5)
				{
					GuiFacade.alert(AlertType.EquipmentExtraBaysInUse);
				} else
				{
					cmdr.setCash(cmdr.getCash() + selectedEquipment.SellPrice());
					cmdr.getShip().RemoveEquipment(selectedEquipment.EquipmentType(), slot);

					UpdateSell();
					game.getParentWindow().UpdateAll();
				}
			}
		}
	}

	private void UpdateBuy()
	{
		for (int i = 0; i < equipBuy.length; i++)
		{
			if (equipBuy[i].Price() > 0)
			{
				switch (equipBuy[i].EquipmentType())
				{
				case Weapon:
					lstBuyWeapon.Items.add(equipBuy[i]);
					break;
				case Shield:
					lstBuyShield.Items.add(equipBuy[i]);
					break;
				case Gadget:
					lstBuyGadget.Items.add(equipBuy[i]);
					break;
				}
			}
		}

		ListBox[] buyBoxes = new ListBox[] { lstBuyWeapon, lstBuyShield, lstBuyGadget };
		Label[] buyLabels = new Label[] { lblBuyWeaponNone, lblBuyShieldNone, lblBuyGadgetNone };
		for (int i = 0; i < buyBoxes.length; i++)
		{
			boolean entries = (buyBoxes[i].Items.size() > 0);
			buyBoxes[i].setVisible(entries);
			buyLabels[i].setVisible(!entries);
			if (entries)
				buyBoxes[i].setHeight(buyBoxes[i].getItemHeight() * Math.min(buyBoxes[i].Items.size(), 5) + 2);
		}
	}

	private void UpdateInfo()
	{
		boolean visible = selectedEquipment != null;
		picEquipment.setVisible(visible);
		lblNameLabel.setVisible(visible);
		lblTypeLabel.setVisible(visible);
		lblBuyPriceLabel.setVisible(visible);
		lblSellPriceLabel.setVisible(visible);
		lblPowerLabel.setVisible(visible);
		lblChargeLabel.setVisible(visible);

		if (selectedEquipment == null)
		{
			lblName.setText("");
			lblType.setText("");
			lblDescription.setText("");
			lblBuyPrice.setText("");
			lblSellPrice.setText("");
			lblPower.setText("");
			lblCharge.setText("");
			btnBuy.setVisible(false);
			btnSell.setVisible(false);
		} else
		{
			String power = "";
			String charge = "";
			switch (selectedEquipment.EquipmentType())
			{
			case Weapon:
				power = "" + ((Weapon) selectedEquipment).Power();
				charge = Strings.NA;
				break;
			case Shield:
				power = "" + ((Shield) selectedEquipment).Power();
				charge = sellSideSelected ? "" + ((Shield) selectedEquipment).getCharge() : Strings.NA;
				break;
			case Gadget:
				power = Strings.NA;
				charge = Strings.NA;
				break;
			}

			lblName.setText(selectedEquipment.Name());
			lblType.setText(Strings.EquipmentTypes[selectedEquipment.EquipmentType().CastToInt()]);
			lblDescription
					.setText(Strings.EquipmentDescriptions[selectedEquipment.EquipmentType().CastToInt()][selectedEquipment
							.SubType().CastToInt()]);
			lblBuyPrice.setText(Functions.FormatMoney(selectedEquipment.Price()));
			lblSellPrice.setText(Functions.FormatMoney(selectedEquipment.SellPrice()));
			lblPower.setText(power);
			lblCharge.setText(charge);
			picEquipment.setImage(EquipmentImageMaker.makeImageFor(selectedEquipment));
			btnBuy.setVisible(!sellSideSelected && (selectedEquipment.Price() > 0));
			btnSell.setVisible(sellSideSelected);
		}
	}

	private void UpdateSell()
	{
		sellSideSelected = false;
		selectedEquipment = null;
		UpdateInfo();

		lstSellWeapon.Items.clear();
		lstSellShield.Items.clear();
		lstSellGadget.Items.clear();

		Ship ship = Game.CurrentGame().Commander().getShip();
		Equipment[] equipSell;
		int index;

		equipSell = ship.EquipmentByType(EquipmentType.Weapon);
		for (index = 0; index < equipSell.length; index++)
			lstSellWeapon.Items.add(equipSell[index] == null ? (Object) Strings.EquipmentFreeSlot : equipSell[index]);

		equipSell = ship.EquipmentByType(EquipmentType.Shield);
		for (index = 0; index < equipSell.length; index++)
			lstSellShield.Items.add(equipSell[index] == null ? (Object) Strings.EquipmentFreeSlot : equipSell[index]);

		equipSell = ship.EquipmentByType(EquipmentType.Gadget);
		for (index = 0; index < equipSell.length; index++)
			lstSellGadget.Items.add(equipSell[index] == null ? (Object) Strings.EquipmentFreeSlot : equipSell[index]);

		ListBox[] sellBoxes = new ListBox[] { lstSellWeapon, lstSellShield, lstSellGadget };
		Label[] sellLabels = new Label[] { lblSellWeaponNoSlots, lblSellShieldNoSlots, lblSellGadgetNoSlots };
		for (int i = 0; i < sellBoxes.length; i++)
		{
			boolean entries = (sellBoxes[i].Items.size() > 0);
			sellBoxes[i].setVisible(entries);
			sellLabels[i].setVisible(!entries);
			if (entries)
				sellBoxes[i].setHeight(sellBoxes[i].getItemHeight() * Math.min(sellBoxes[i].Items.size(), 5) + 2);
		}
	}

	// #endregion

	// #region Event Handlers

	private void BuyClick(Object sender, EventArgs e)
	{
		if (selectedEquipment != null)
			Buy();
	}




	private void SelectedIndexChanged(Object sender, EventArgs e)
	{
		if (!handlingSelect)
		{
			handlingSelect = true;

			Object obj = ((ListBox) sender).getSelectedItem();
			DeselectAll();
			((ListBox) sender).setSelectedItem(obj);

			sellSideSelected = (((ListBox) sender).getName().indexOf("Sell") >= 0);

			if (obj instanceof Equipment)
				selectedEquipment = (Equipment) obj;
			else
				selectedEquipment = null;

			handlingSelect = false;
			UpdateInfo();
		}
	}

	private void SellClick(Object sender, EventArgs e)
	{
		if (selectedEquipment != null)
			Sell();
	}

	// #endregion
}
