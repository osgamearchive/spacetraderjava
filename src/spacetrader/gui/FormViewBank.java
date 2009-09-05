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

package spacetrader.gui;import java.util.*;

import jwinforms.*;
import spacetrader.*;import spacetrader.enums.*;
	public class FormViewBank extends SpaceTraderForm
	{
		//#region Control Declarations

		private jwinforms.Label lblLoan;
		private jwinforms.Label lblCurrentDebtLabel;
		private jwinforms.Label lblMaxLoanLabel;
		private jwinforms.Label lblCurrentDebt;
		private jwinforms.Label lblMaxLoan;
		private jwinforms.Button btnGetLoan;
		private jwinforms.Button btnBuyInsurance;
		private jwinforms.Label lblNoClaim;
		private jwinforms.Label lblShipValue;
		private jwinforms.Label lblNoClaimLabel;
		private jwinforms.Label lblShipValueLabel;
		private jwinforms.Label lblInsurance;
		private jwinforms.Label lblInsAmt;
		private jwinforms.Label lblInsAmtLabel;
		private jwinforms.Button btnPayBack;
		private jwinforms.Button btnClose;
		private jwinforms.Label lblMaxNoClaim;
		private Container components = null;

		//#endregion

		//#region Member Declarations

		private Game			game		= Game.CurrentGame();
		private Commander	cmdr		= Game.CurrentGame().Commander();
		private int				MaxLoan	= Game.CurrentGame().Commander().getPoliceRecordScore() >=
																Consts.PoliceRecordScoreClean ?
																Math.min(25000, Math.max(1000, Game.CurrentGame().Commander().Worth() / 5000 * 500)) :
																500;

		//#endregion

		//#region Methods

		public FormViewBank()
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
			this.lblLoan = new jwinforms.Label();
			this.lblCurrentDebtLabel = new jwinforms.Label();
			this.lblMaxLoanLabel = new jwinforms.Label();
			this.lblCurrentDebt = new jwinforms.Label();
			this.lblMaxLoan = new jwinforms.Label();
			this.btnGetLoan = new jwinforms.Button();
			this.btnBuyInsurance = new jwinforms.Button();
			this.lblNoClaim = new jwinforms.Label();
			this.lblShipValue = new jwinforms.Label();
			this.lblNoClaimLabel = new jwinforms.Label();
			this.lblShipValueLabel = new jwinforms.Label();
			this.lblInsurance = new jwinforms.Label();
			this.lblInsAmt = new jwinforms.Label();
			this.lblInsAmtLabel = new jwinforms.Label();
			this.btnPayBack = new jwinforms.Button();
			this.btnClose = new jwinforms.Button();
			this.lblMaxNoClaim = new jwinforms.Label();
			this.SuspendLayout();
			//
			// lblLoan
			//
			this.lblLoan.setAutoSize(true);
			this.lblLoan.setFont(new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblLoan.setLocation(new java.awt.Point(8, 8));
			this.lblLoan.setName("lblLoan");
			this.lblLoan.setSize(new jwinforms.Size(44, 19));
			this.lblLoan.setTabIndex(1);
			this.lblLoan.setText("Loan");
			//
			// lblCurrentDebtLabel
			//
			this.lblCurrentDebtLabel.setAutoSize(true);
			this.lblCurrentDebtLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblCurrentDebtLabel.setLocation(new java.awt.Point(16, 32));
			this.lblCurrentDebtLabel.setName("lblCurrentDebtLabel");
			this.lblCurrentDebtLabel.setSize(new jwinforms.Size(75, 13));
			this.lblCurrentDebtLabel.setTabIndex(2);
			this.lblCurrentDebtLabel.setText("Current Debt:");
			//
			// lblMaxLoanLabel
			//
			this.lblMaxLoanLabel.setAutoSize(true);
			this.lblMaxLoanLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblMaxLoanLabel.setLocation(new java.awt.Point(16, 52));
			this.lblMaxLoanLabel.setName("lblMaxLoanLabel");
			this.lblMaxLoanLabel.setSize(new jwinforms.Size(88, 13));
			this.lblMaxLoanLabel.setTabIndex(3);
			this.lblMaxLoanLabel.setText("Maximum Loan:");
			//
			// lblCurrentDebt
			//
			this.lblCurrentDebt.setLocation(new java.awt.Point(136, 32));
			this.lblCurrentDebt.setName("lblCurrentDebt");
			this.lblCurrentDebt.setSize(new jwinforms.Size(56, 13));
			this.lblCurrentDebt.setTabIndex(4);
			this.lblCurrentDebt.setText("88,888 cr.");
			this.lblCurrentDebt.TextAlign = ContentAlignment.TopRight;
			//
			// lblMaxLoan
			//
			this.lblMaxLoan.setLocation(new java.awt.Point(136, 52));
			this.lblMaxLoan.setName("lblMaxLoan");
			this.lblMaxLoan.setSize(new jwinforms.Size(56, 13));
			this.lblMaxLoan.setTabIndex(5);
			this.lblMaxLoan.setText("88,888 cr.");
			this.lblMaxLoan.TextAlign = ContentAlignment.TopRight;
			//
			// btnGetLoan
			//
			this.btnGetLoan.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnGetLoan.setLocation(new java.awt.Point(16, 72));
			this.btnGetLoan.setName("btnGetLoan");
			this.btnGetLoan.setSize(new jwinforms.Size(61, 22));
			this.btnGetLoan.setTabIndex(1);
			this.btnGetLoan.setText("Get Loan");
			this.btnGetLoan.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnGetLoan_Click(sender, e);}});
			//
			// btnBuyInsurance
			//
			this.btnBuyInsurance.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnBuyInsurance.setLocation(new java.awt.Point(16, 196));
			this.btnBuyInsurance.setName("btnBuyInsurance");
			this.btnBuyInsurance.setSize(new jwinforms.Size(90, 22));
			this.btnBuyInsurance.setTabIndex(3);
			this.btnBuyInsurance.setText("Stop Insurance");
			this.btnBuyInsurance.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnBuyInsurance_Click(sender, e);}});
			//
			// lblNoClaim
			//
			this.lblNoClaim.setLocation(new java.awt.Point(154, 156));
			this.lblNoClaim.setName("lblNoClaim");
			this.lblNoClaim.setSize(new jwinforms.Size(32, 13));
			this.lblNoClaim.setTabIndex(27);
			this.lblNoClaim.setText("88%");
			this.lblNoClaim.TextAlign = ContentAlignment.TopRight;
			//
			// lblShipValue
			//
			this.lblShipValue.setLocation(new java.awt.Point(136, 136));
			this.lblShipValue.setName("lblShipValue");
			this.lblShipValue.setSize(new jwinforms.Size(56, 13));
			this.lblShipValue.setTabIndex(26);
			this.lblShipValue.setText("88,888 cr.");
			this.lblShipValue.TextAlign = ContentAlignment.TopRight;
			//
			// lblNoClaimLabel
			//
			this.lblNoClaimLabel.setAutoSize(true);
			this.lblNoClaimLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblNoClaimLabel.setLocation(new java.awt.Point(16, 156));
			this.lblNoClaimLabel.setName("lblNoClaimLabel");
			this.lblNoClaimLabel.setSize(new jwinforms.Size(106, 13));
			this.lblNoClaimLabel.setTabIndex(25);
			this.lblNoClaimLabel.setText("No-Claim Discount:");
			//
			// lblShipValueLabel
			//
			this.lblShipValueLabel.setAutoSize(true);
			this.lblShipValueLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblShipValueLabel.setLocation(new java.awt.Point(16, 136));
			this.lblShipValueLabel.setName("lblShipValueLabel");
			this.lblShipValueLabel.setSize(new jwinforms.Size(65, 13));
			this.lblShipValueLabel.setTabIndex(24);
			this.lblShipValueLabel.setText("Ship Value:");
			//
			// lblInsurance
			//
			this.lblInsurance.setAutoSize(true);
			this.lblInsurance.setFont(new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblInsurance.setLocation(new java.awt.Point(8, 112));
			this.lblInsurance.setName("lblInsurance");
			this.lblInsurance.setSize(new jwinforms.Size(81, 19));
			this.lblInsurance.setTabIndex(23);
			this.lblInsurance.setText("Insurance");
			//
			// lblInsAmt
			//
			this.lblInsAmt.setLocation(new java.awt.Point(136, 176));
			this.lblInsAmt.setName("lblInsAmt");
			this.lblInsAmt.setSize(new jwinforms.Size(82, 13));
			this.lblInsAmt.setTabIndex(30);
			this.lblInsAmt.setText("8,888 cr. daily");
			this.lblInsAmt.TextAlign = ContentAlignment.TopRight;
			//
			// lblInsAmtLabel
			//
			this.lblInsAmtLabel.setAutoSize(true);
			this.lblInsAmtLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
			this.lblInsAmtLabel.setLocation(new java.awt.Point(16, 176));
			this.lblInsAmtLabel.setName("lblInsAmtLabel");
			this.lblInsAmtLabel.setSize(new jwinforms.Size(38, 13));
			this.lblInsAmtLabel.setTabIndex(29);
			this.lblInsAmtLabel.setText("Costs:");
			//
			// btnPayBack
			//
			this.btnPayBack.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnPayBack.setLocation(new java.awt.Point(88, 72));
			this.btnPayBack.setName("btnPayBack");
			this.btnPayBack.setSize(new jwinforms.Size(90, 22));
			this.btnPayBack.setTabIndex(2);
			this.btnPayBack.setText("Pay Back Loan");
			this.btnPayBack.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnPayBack_Click(sender, e);}});
			//
			// btnClose
			//
			this.btnClose.setDialogResult(DialogResult.Cancel);
			this.btnClose.setLocation(new java.awt.Point(-32, -32));
			this.btnClose.setName("btnClose");
			this.btnClose.setSize(new jwinforms.Size(26, 27));
			this.btnClose.setTabIndex(32);
			this.btnClose.setTabStop(false);
			this.btnClose.setText("X");
			//
			// lblMaxNoClaim
			//
			this.lblMaxNoClaim.setAutoSize(true);
			this.lblMaxNoClaim.setLocation(new java.awt.Point(182, 156));
			this.lblMaxNoClaim.setName("lblMaxNoClaim");
			this.lblMaxNoClaim.setSize(new jwinforms.Size(33, 13));
			this.lblMaxNoClaim.setTabIndex(33);
			this.lblMaxNoClaim.setText("(max)");
			this.lblMaxNoClaim.setVisible(false);
			//
			// FormViewBank
			//
			this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
			this.setCancelButton(this.btnClose);
			this.setClientSize(new jwinforms.Size(226, 231));
			this.Controls.addAll(Arrays.asList(
																																	this.lblMaxNoClaim,
																																	this.btnClose,
																																	this.btnPayBack,
																																	this.lblInsAmt,
																																	this.lblInsAmtLabel,
																																	this.lblNoClaimLabel,
																																	this.lblShipValueLabel,
																																	this.lblInsurance,
																																	this.lblMaxLoanLabel,
																																	this.lblCurrentDebtLabel,
																																	this.lblLoan,
																																	this.btnBuyInsurance,
																																	this.lblNoClaim,
																																	this.lblShipValue,
																																	this.btnGetLoan,
																																	this.lblMaxLoan,
																																	this.lblCurrentDebt));
			this.setFormBorderStyle(FormBorderStyle.FixedDialog);
			this.setMaximizeBox(false);
			this.setMinimizeBox(false);
			this.setName("FormViewBank");
			this.setShowInTaskbar(false);
			this.setStartPosition(FormStartPosition.CenterParent);
			this.setText("Bank");
		}
		//#endregion

		private void UpdateAll()
		{
			// Loan Info
			lblCurrentDebt.setText(Functions.FormatMoney(cmdr.getDebt()));
			lblMaxLoan.setText(Functions.FormatMoney(MaxLoan));
			btnPayBack.setVisible((cmdr.getDebt() > 0));

			// Insurance Info
			lblShipValue.setText(Functions.FormatMoney(cmdr.getShip().BaseWorth(true)));
			lblNoClaim.setText(Functions.FormatPercent(cmdr.NoClaim()));
			lblMaxNoClaim.setVisible((cmdr.NoClaim() == Consts.MaxNoClaim));
			lblInsAmt.setText(Functions.StringVars(Strings.MoneyRateSuffix,
				Functions.FormatMoney(game.InsuranceCosts())));
			btnBuyInsurance.setText(Functions.StringVars(Strings.BankInsuranceButtonText, cmdr.getInsurance() ?
				Strings.BankInsuranceButtonStop : Strings.BankInsuranceButtonBuy));
		}

		//#endregion

		//#region Event Handlers

		private void btnGetLoan_Click(Object sender, EventArgs e)
		{
			if (cmdr.getDebt() >= MaxLoan)
				FormAlert.Alert(AlertType.DebtTooLargeLoan);
			else
			{
				FormGetLoan	form	= new FormGetLoan(MaxLoan - cmdr.getDebt());
				if (form.ShowDialog(this) == DialogResult.OK)
				{
					cmdr.setCash(cmdr.getCash() + form.Amount());
					cmdr.setDebt(cmdr.getDebt() + form.Amount());

					UpdateAll();
					game.getParentWindow().UpdateAll();
				}
			}
		}

		private void btnPayBack_Click(Object sender, EventArgs e)
		{
			if (cmdr.getDebt() == 0)
				FormAlert.Alert(AlertType.DebtNone);
			else
			{
				FormPayBackLoan	form	= new FormPayBackLoan();
				if (form.ShowDialog(this) == DialogResult.OK)
				{
					cmdr.setCash(cmdr.getCash() - form.Amount());
					cmdr.setDebt(cmdr.getDebt() - form.Amount());

					UpdateAll();
					game.getParentWindow().UpdateAll();
				}
			}
		}

		private void btnBuyInsurance_Click(Object sender, EventArgs e)
		{
			if (cmdr.getInsurance())
			{
				if (FormAlert.Alert(AlertType.InsuranceStop) == DialogResult.Yes)
				{
					cmdr.setInsurance(false);
					cmdr.NoClaim(0);
				}
			}
			else if (!cmdr.getShip().getEscapePod())
				FormAlert.Alert(AlertType.InsuranceNoEscapePod);
			else
			{
				cmdr.setInsurance(true);
				cmdr.NoClaim(0);
			}

			UpdateAll();
			game.getParentWindow().UpdateAll();
		}

		//#endregion
	}
