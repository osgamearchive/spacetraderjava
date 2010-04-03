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

import java.util.Arrays;

import jwinforms.*;

import spacetrader.Commander;
import spacetrader.Game;

public class FormBuyFuel extends SpaceTraderForm
{
	private jwinforms.Button btnOk;
	private jwinforms.Label lblQuestion;
	private jwinforms.Button btnMax;
	private jwinforms.Button btnNothing;
	private jwinforms.NumericUpDown numAmount;

	public FormBuyFuel()
	{
		InitializeComponent();

		Commander cmdr = Game.CurrentGame().Commander();
		numAmount.setMaximum(Math.min(cmdr.getCash(), (cmdr.getShip().FuelTanks() - cmdr.getShip().getFuel())
				* cmdr.getShip().getFuelCost()));
		numAmount.setValue(numAmount.getMaximum());
	}

	private void InitializeComponent()
	{
		lblQuestion = new jwinforms.Label();
		numAmount = new jwinforms.NumericUpDown();
		btnOk = new jwinforms.Button();
		btnMax = new jwinforms.Button();
		btnNothing = new jwinforms.Button();
		((ISupportInitialize)(numAmount)).BeginInit();
		this.SuspendLayout();
		//
		// lblQuestion
		//
		lblQuestion.setAutoSize(true);
		lblQuestion.setLocation(new java.awt.Point(8, 8));
		lblQuestion.setName("lblQuestion");
		lblQuestion.setSize(new jwinforms.Size(211, 13));
		lblQuestion.setTabIndex(3);
		lblQuestion.setText("How much do you want to spend on fuel?");
		//
		// numAmount
		//
		numAmount.setLocation(new java.awt.Point(216, 6));
		numAmount.setMaximum(999);
		numAmount.setMinimum(1);
		numAmount.setName("numAmount");
		numAmount.setSize(new jwinforms.Size(44, 20));
		numAmount.setTabIndex(1);
		numAmount.setValue(888);
		//
		// btnOk
		//
		btnOk.setDialogResult(DialogResult.OK);
		btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnOk.setLocation(new java.awt.Point(61, 32));
		btnOk.setName("btnOk");
		btnOk.setSize(new jwinforms.Size(41, 22));
		btnOk.setTabIndex(2);
		btnOk.setText("Ok");
		//
		// btnMax
		//
		btnMax.setDialogResult(DialogResult.OK);
		btnMax.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnMax.setLocation(new java.awt.Point(109, 32));
		btnMax.setName("btnMax");
		btnMax.setSize(new jwinforms.Size(41, 22));
		btnMax.setTabIndex(3);
		btnMax.setText("Max");
		btnMax.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnMax_Click(sender, e);
			}
		});
		//
		// btnNothing
		//
		btnNothing.setDialogResult(DialogResult.Cancel);
		btnNothing.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnNothing.setLocation(new java.awt.Point(157, 32));
		btnNothing.setName("btnNothing");
		btnNothing.setSize(new jwinforms.Size(53, 22));
		btnNothing.setTabIndex(4);
		btnNothing.setText("Nothing");
		//
		// FormBuyFuel
		//
		this.setAcceptButton(btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnNothing);
		this.setClientSize(new jwinforms.Size(270, 63));
		this.setControlBox(false);
		Controls.addAll(Arrays.asList(btnNothing, btnMax, btnOk, numAmount, lblQuestion));
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setName("FormBuyFuel");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Buy Fuel");
		((ISupportInitialize)(numAmount)).EndInit();
	}

	// #endregion

	// #endregion

	// #region Event Handlers

	private void btnMax_Click(Object sender, EventArgs e)
	{
		numAmount.setValue(numAmount.getMaximum());
	}

	// #endregion

	// #region Properties

	public int Amount()
	{
		return numAmount.getValue();
	}
}
