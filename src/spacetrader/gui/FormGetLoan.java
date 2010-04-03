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
package spacetrader.gui;

import java.util.Arrays;

import jwinforms.*;

import spacetrader.Functions;
import spacetrader.Strings;

public class FormGetLoan extends SpaceTraderForm
{
	private jwinforms.Button btnOk;
	private jwinforms.Label lblQuestion;
	private jwinforms.Button btnMax;
	private jwinforms.Button btnNothing;
	private jwinforms.NumericUpDown numAmount;
	private jwinforms.Label lblStatement;

	public FormGetLoan(int max)
	{
		InitializeComponent();

		numAmount.setMaximum(max);
		numAmount.setValue(numAmount.getMinimum());
		lblStatement.setText(Functions.StringVars(Strings.BankLoanStatementBorrow, Functions.Multiples(max,
				Strings.MoneyUnit)));
	}

	private void InitializeComponent()
	{
		lblQuestion = new jwinforms.Label();
		numAmount = new jwinforms.NumericUpDown();
		btnOk = new jwinforms.Button();
		btnMax = new jwinforms.Button();
		btnNothing = new jwinforms.Button();
		lblStatement = new jwinforms.Label();
		((ISupportInitialize)(numAmount)).BeginInit();
		this.SuspendLayout();
		//
		// lblQuestion
		//
		lblQuestion.setAutoSize(true);
		lblQuestion.setLocation(new java.awt.Point(8, 24));
		lblQuestion.setName("lblQuestion");
		lblQuestion.setSize(new jwinforms.Size(178, 13));
		lblQuestion.setTabIndex(3);
		lblQuestion.setText("How much do you want to borrow?");
		//
		// numAmount
		//
		numAmount.setLocation(new java.awt.Point(184, 22));
		numAmount.setMaximum(99999);
		numAmount.setMinimum(1);
		numAmount.setName("numAmount");
		numAmount.setSize(new jwinforms.Size(58, 20));
		numAmount.setTabIndex(1);
		numAmount.ThousandsSeparator = true;
		numAmount.setValue(88888);
		//
		// btnOk
		//
		btnOk.setDialogResult(DialogResult.OK);
		btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnOk.setLocation(new java.awt.Point(52, 48));
		btnOk.setName("btnOk");
		btnOk.setSize(new jwinforms.Size(41, 22));
		btnOk.setTabIndex(2);
		btnOk.setText("Ok");
		//
		// btnMax
		//
		btnMax.setDialogResult(DialogResult.OK);
		btnMax.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnMax.setLocation(new java.awt.Point(100, 48));
		btnMax.setName("btnMax");
		btnMax.setSize(new jwinforms.Size(41, 22));
		btnMax.setTabIndex(3);
		btnMax.setText("Max");
		btnMax.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnMax_Click();
			}
		});
		//
		// btnNothing
		//
		btnNothing.setDialogResult(DialogResult.Cancel);
		btnNothing.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnNothing.setLocation(new java.awt.Point(148, 48));
		btnNothing.setName("btnNothing");
		btnNothing.setSize(new jwinforms.Size(53, 22));
		btnNothing.setTabIndex(4);
		btnNothing.setText("Nothing");
		//
		// lblStatement
		//
		lblStatement.setLocation(new java.awt.Point(8, 8));
		lblStatement.setName("lblStatement");
		lblStatement.setSize(new jwinforms.Size(189, 13));
		lblStatement.setTabIndex(5);
		lblStatement.setText("You can borrow up to 88,888 credits.");
		//
		// FormGetLoan
		//
		this.setAcceptButton(btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnNothing);
		this.setClientSize(new jwinforms.Size(252, 79));
		this.setControlBox(false);
		Controls.addAll(Arrays.asList(lblStatement, btnNothing, btnMax, btnOk, numAmount,
				lblQuestion));
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setName("FormGetLoan");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Get Loan");
		((ISupportInitialize)(numAmount)).EndInit();
	}

	private void btnMax_Click()
	{
		numAmount.setValue(numAmount.getMaximum());
	}

	public int Amount()
	{
		return numAmount.getValue();
	}
}
