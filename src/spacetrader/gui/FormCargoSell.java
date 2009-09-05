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
package spacetrader.gui;import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.*;

public class FormCargoSell extends SpaceTraderForm
{
	// #region Control Declarations

	private jwinforms.Button btnOk;
	private jwinforms.Button btnAll;
	private jwinforms.Button btnNone;
	private jwinforms.Label lblStatement;
	private jwinforms.Label lblQuestion;
	private jwinforms.NumericUpDown numAmount;
	private jwinforms.Label lblPaid;
	private jwinforms.Label lblProfit;
	private Container components = null;

	// #endregion

	// #region Member Declarations

	private Game game = Game.CurrentGame();

	// #endregion

	// #region Methods

	public FormCargoSell(int item, int maxAmount, CargoSellOp op, int price)
	{
		InitializeComponent();

		Commander cmdr = game.Commander();
		int cost = cmdr.PriceCargo()[item] / cmdr.getShip().Cargo()[item];

		numAmount.setMaximum(maxAmount);
		numAmount.setValue(numAmount.getMinimum());
		this.setText(Functions.StringVars(Strings.CargoTitle,
				Strings.CargoSellOps[op.CastToInt()],
				Consts.TradeItems[item].Name()));
		lblQuestion.setText(Functions.StringVars(Strings.CargoSellQuestion,
				Strings.CargoSellOps[op.CastToInt()].toLowerCase()));
		lblPaid.setText(Functions.StringVars(
				op == CargoSellOp.SellTrader ? Strings.CargoSellPaidTrader
						: Strings.CargoSellPaid, Functions.FormatMoney(cost),
				Functions.Multiples(maxAmount, Strings.CargoUnit)));
		lblProfit.setText(Functions.StringVars(Strings.CargoSellProfit,
				price >= cost ? "profit" : "loss", Functions
						.FormatMoney(price >= cost ? price - cost : cost
								- price)));

		// Override defaults for some ops.
		switch (op)
		{
		case Dump:
			lblStatement.setText(Functions.StringVars(
					Strings.CargoSellStatementDump,
					Strings.CargoSellOps[op.CastToInt()].toLowerCase(),
					Functions.FormatNumber(maxAmount)));
			lblProfit.setText(Functions.StringVars(Strings.CargoSellDumpCost,
					Functions.FormatMoney(-price)));
			break;
		case Jettison:
			lblStatement.setText(Functions.StringVars(
					Strings.CargoSellStatementDump,
					Strings.CargoSellOps[op.CastToInt()].toLowerCase(),
					Functions.FormatNumber(maxAmount)));
			break;
		case SellSystem:
			lblStatement.setText(Functions.StringVars(
					Strings.CargoSellStatement, Functions
							.FormatNumber(maxAmount), Functions
							.FormatMoney(price)));
			break;
		case SellTrader:
			lblStatement.setText(Functions.StringVars(
					Strings.CargoSellStatementTrader,
					Consts.TradeItems[item].Name(), Functions.FormatMoney(price)));
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
		this.lblPaid = new jwinforms.Label();
		this.lblProfit = new jwinforms.Label();
		((ISupportInitialize) (this.numAmount)).BeginInit();
		this.SuspendLayout();
		// 
		// lblQuestion
		// 
		this.lblQuestion.setLocation(new java.awt.Point(8, 50));
		this.lblQuestion.setName("lblQuestion");
		this.lblQuestion.setSize(new jwinforms.Size(160, 13));
		this.lblQuestion.setTabIndex(1);
		this.lblQuestion.setText("How many do you want to sell?");
		// 
		// lblStatement
		// 
		this.lblStatement.setLocation(new java.awt.Point(8, 8));
		this.lblStatement.setName("lblStatement");
		this.lblStatement.setSize(new jwinforms.Size(302, 13));
		this.lblStatement.setTabIndex(3);
		this.lblStatement.setText("The trader wants to by Machines, and offers 8,888 cr. each.");
		// 
		// numAmount
		// 
		this.numAmount.setLocation(new java.awt.Point(168, 48));
		this.numAmount.setMinimum(1);
		this.numAmount.setName("numAmount");
		this.numAmount.setSize(new jwinforms.Size(38, 20));
		this.numAmount.setTabIndex(1);
		this.numAmount.setValue(88);
		// 
		// btnOk
		// 
		this.btnOk.setDialogResult(DialogResult.OK);
		this.btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnOk.setLocation(new java.awt.Point(83, 74));
		this.btnOk.setName("btnOk");
		this.btnOk.setSize(new jwinforms.Size(41, 22));
		this.btnOk.setTabIndex(2);
		this.btnOk.setText("Ok");
		// 
		// btnAll
		// 
		this.btnAll.setDialogResult(DialogResult.OK);
		this.btnAll.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnAll.setLocation(new java.awt.Point(131, 74));
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
		this.btnNone.setLocation(new java.awt.Point(179, 74));
		this.btnNone.setName("btnNone");
		this.btnNone.setSize(new jwinforms.Size(41, 22));
		this.btnNone.setTabIndex(4);
		this.btnNone.setText("None");
		// 
		// lblPaid
		// 
		this.lblPaid.setLocation(new java.awt.Point(8, 21));
		this.lblPaid.setName("lblPaid");
		this.lblPaid.setSize(new jwinforms.Size(280, 13));
		this.lblPaid.setTabIndex(5);
		this.lblPaid.setText("You paid about 8,888 cr. per unit, and can sell 88 units.");
		// 
		// lblProfit
		// 
		this.lblProfit.setLocation(new java.awt.Point(8, 34));
		this.lblProfit.setName("lblProfit");
		this.lblProfit.setSize(new jwinforms.Size(200, 13));
		this.lblProfit.setTabIndex(6);
		this.lblProfit.setText("It costs 8,888 cr. per unit for disposal.");
		// 
		// FormCargoSell
		// 
		this.setAcceptButton(this.btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(this.btnNone);
		this.setClientSize(new jwinforms.Size(302, 105));
		this.setControlBox(false);
		this.Controls.add(this.lblProfit);
		this.Controls.add(this.lblPaid);
		this.Controls.add(this.btnNone);
		this.Controls.add(this.btnAll);
		this.Controls.add(this.btnOk);
		this.Controls.add(this.numAmount);
		this.Controls.add(this.lblQuestion);
		this.Controls.add(this.lblStatement);
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setName("FormCargoSell");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Sell Xxxxxxxxxx");
		((ISupportInitialize) (this.numAmount)).EndInit();

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
