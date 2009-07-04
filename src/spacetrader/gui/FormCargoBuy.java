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
import spacetrader.Commander;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Strings;
import spacetrader.enums.CargoBuyOp;

public class FormCargoBuy extends WinformForm
{
	// #region Control Declarations

	private jwinforms.Button btnOk;
	private jwinforms.Button btnAll;
	private jwinforms.Button btnNone;
	private jwinforms.Label lblQuestion;
	private jwinforms.Label lblStatement;
	private jwinforms.NumericUpDown numAmount;
	private jwinforms.Label lblAvailable;
	private jwinforms.Label lblAfford;

	// #endregion

	// #region Member Declarations

	private Game game = Game.CurrentGame();

	// #endregion

	// #region Methods

	public FormCargoBuy(int item, int maxAmount, CargoBuyOp op)
	{
		InitializeComponent();

		Commander cmdr = game.Commander();
		numAmount.setMaximum(maxAmount);
		numAmount.setValue(numAmount.getMinimum());
		this.setText(Functions.StringVars(Strings.CargoTitle, Strings.CargoBuyOps[op.CastToInt()],
				Consts.TradeItems[item].Name()));
		lblQuestion.setText(Functions.StringVars(Strings.CargoBuyQuestion, Strings.CargoBuyOps[op.CastToInt()]
				.toLowerCase()));

		switch (op)
		{
		case BuySystem:
			lblStatement.setText(Functions.StringVars(Strings.CargoBuyStatement, Functions.FormatMoney(game
					.PriceCargoBuy()[item]), Functions.FormatNumber(maxAmount)));

			this.setHeight(btnOk.getTop() + btnOk.getHeight() + 34);
			break;
		case BuyTrader:
			int afford = Math.min(game.Commander().getCash() / game.PriceCargoBuy()[item], game.Commander().getShip()
					.FreeCargoBays());
			if (afford < maxAmount)
				numAmount.setMaximum(afford);

			lblStatement.setText(Functions.StringVars(Strings.CargoBuyStatementTrader, Consts.TradeItems[item].Name(),
					Functions.FormatMoney(game.PriceCargoBuy()[item])));
			lblAvailable.setText(Functions.StringVars(Strings.CargoBuyAvailable, Functions.Multiples(game.getOpponent()
					.Cargo()[item], Strings.CargoUnit)));
			lblAfford.setText(Functions.StringVars(Strings.CargoBuyAfford, Functions.Multiples(afford,
					Strings.CargoUnit)));

			lblAvailable.setVisible(true);
			lblAfford.setVisible(true);

			btnOk.setTop(btnOk.getTop() + 26);
			btnAll.setTop(btnAll.getTop() + 26);
			btnNone.setTop(btnNone.getTop() + 26);
			lblQuestion.setTop(lblQuestion.getTop() + 26);
			numAmount.setTop(numAmount.getTop() + 26);

			break;
		case Plunder:
			lblStatement.setText(Functions.StringVars(Strings.CargoBuyStatementSteal, Functions.FormatNumber(game
					.getOpponent().Cargo()[item])));

			this.setHeight(btnOk.getTop() + btnOk.getHeight() + 34);
			break;
		}
	}

	// #region Windows Form Designer generated code
	// / <summary>
	// / Required method for Designer support - do not modify
	// / the contents of this method with the code editor.
	// / </summary>
	private void InitializeComponent()
	{
		this.lblQuestion = new jwinforms.Label();
		this.lblStatement = new jwinforms.Label();
		this.numAmount = new jwinforms.NumericUpDown();
		this.btnOk = new jwinforms.Button();
		this.btnAll = new jwinforms.Button();
		this.btnNone = new jwinforms.Button();
		this.lblAvailable = new jwinforms.Label();
		this.lblAfford = new jwinforms.Label();
		((ISupportInitialize)(this.numAmount)).BeginInit();
		this.SuspendLayout();
		// 
		// lblQuestion
		// 
		this.lblQuestion.setAutoSize(true);
		this.lblQuestion.setLocation(new java.awt.Point(8, 24));
		this.lblQuestion.setName("lblQuestion");
		this.lblQuestion.setSize(new jwinforms.Size(161, 16));
		this.lblQuestion.setTabIndex(1);
		this.lblQuestion.setText("How many do you want to buy?");
		// 
		// lblStatement
		// 
		this.lblStatement.setLocation(new java.awt.Point(8, 8));
		this.lblStatement.setName("lblStatement");
		this.lblStatement.setSize(new jwinforms.Size(326, 13));
		this.lblStatement.setTabIndex(3);
		this.lblStatement.setText("The trader wants to sell Machines for the price of 8,888 cr. each.");
		// 
		// numAmount
		// 
		this.numAmount.setLocation(new java.awt.Point(168, 22));
		this.numAmount.setMaximum(999);
		this.numAmount.setMinimum(1);
		this.numAmount.setName("numAmount");
		this.numAmount.setSize(new jwinforms.Size(44, 20));
		this.numAmount.setTabIndex(1);
		this.numAmount.setValue(1);
		// 
		// btnOk
		// 
		this.btnOk.setDialogResult(DialogResult.OK);
		this.btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnOk.setLocation(new java.awt.Point(95, 48));
		this.btnOk.setName("btnOk");
		this.btnOk.setSize(new jwinforms.Size(41, 22));
		this.btnOk.setTabIndex(2);
		this.btnOk.setText("Ok");
		// 
		// btnAll
		// 
		this.btnAll.setDialogResult(DialogResult.OK);
		this.btnAll.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnAll.setLocation(new java.awt.Point(143, 48));
		this.btnAll.setName("btnAll");
		this.btnAll.setSize(new jwinforms.Size(41, 22));
		this.btnAll.setTabIndex(3);
		this.btnAll.setText("All");
		this.btnAll.setClick(new EventHandler<Object, EventArgs>()
		{
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnAll_Click(sender, e);
			}
		});
		// 
		// btnNone
		// 
		this.btnNone.setDialogResult(DialogResult.Cancel);
		this.btnNone.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnNone.setLocation(new java.awt.Point(191, 48));
		this.btnNone.setName("btnNone");
		this.btnNone.setSize(new jwinforms.Size(41, 22));
		this.btnNone.setTabIndex(4);
		this.btnNone.setText("None");
		// 
		// lblAvailable
		// 
		this.lblAvailable.setLocation(new java.awt.Point(8, 21));
		this.lblAvailable.setName("lblAvailable");
		this.lblAvailable.setSize(new jwinforms.Size(163, 13));
		this.lblAvailable.setTabIndex(5);
		this.lblAvailable.setText("The trader has 88 units for sale.");
		this.lblAvailable.setVisible(false);
		// 
		// lblAfford
		// 
		this.lblAfford.setLocation(new java.awt.Point(8, 34));
		this.lblAfford.setName("lblAfford");
		this.lblAfford.setSize(new jwinforms.Size(157, 13));
		this.lblAfford.setTabIndex(6);
		this.lblAfford.setText("You can afford to buy 88 units.");
		this.lblAfford.setVisible(false);
		// 
		// FormCargoBuy
		// 
		this.setAcceptButton(this.btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(this.btnNone);
		this.setClientSize(new jwinforms.Size(326, 105));
		this.setControlBox(false);
		this.Controls.add(this.btnNone);
		this.Controls.add(this.btnAll);
		this.Controls.add(this.btnOk);
		this.Controls.add(this.numAmount);
		this.Controls.add(this.lblQuestion);
		this.Controls.add(this.lblStatement);
		this.Controls.add(this.lblAfford);
		this.Controls.add(this.lblAvailable);
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setName("FormCargoBuy");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Buy Xxxxxxxxxx");
		((ISupportInitialize)(this.numAmount)).EndInit();

	}

	// #endregion

	// #endregion

	// #region Event Handlers

	private void btnAll_Click(Object sender, EventArgs e)
	{
		numAmount.setValue(numAmount.getMaximum());
	}

	// #endregion

	// #region Properties

	public int Amount()
	{
		return numAmount.getValue();
	}

	// #endregion
}
