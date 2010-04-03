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

import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.FormStartPosition;
import jwinforms.WinformControl;
import spacetrader.*;

public class FormViewCommander extends SpaceTraderForm
{
	private jwinforms.Button btnClose;
	private jwinforms.Label lblNameLabel;
	private jwinforms.Label lblName;
	private jwinforms.Label lblDifficulty;
	private jwinforms.Label lblTimeLabel;
	private jwinforms.Label lblCashLabel;
	private jwinforms.Label lblDebtLabel;
	private jwinforms.Label lblNetWorthLabel;
	private jwinforms.Label lblDifficultyLabel;
	private jwinforms.Label lblTime;
	private jwinforms.GroupBox boxSkills;
	private jwinforms.Label lblEngineer;
	private jwinforms.Label lblTrader;
	private jwinforms.Label lblFighter;
	private jwinforms.Label lblPilot;
	private jwinforms.Label lblEngineerLabel;
	private jwinforms.Label lblTraderLabel;
	private jwinforms.Label lblFighterLabel;
	private jwinforms.Label lblPilotLabel;
	private jwinforms.GroupBox boxFinances;
	private jwinforms.Label lblNetWorth;
	private jwinforms.Label lblDebt;
	private jwinforms.Label lblCash;
	private jwinforms.Label lblKills;
	private jwinforms.Label lblReputation;
	private jwinforms.Label lblRecord;
	private jwinforms.Label lblPoliceLabel;
	private jwinforms.Label lblReputationLabel;
	private jwinforms.Label lblKillsLabel;
	private jwinforms.GroupBox boxNotoriety;
	private jwinforms.Label lblBountyLabel;
	private jwinforms.Label lblBounty;

	private final Game game = Game.CurrentGame();

	public FormViewCommander()
	{
		InitializeComponent();

		InitializeScreen();
	}

	private void InitializeComponent()
	{
		lblNameLabel = new jwinforms.Label();
		lblName = new jwinforms.Label();
		lblDifficulty = new jwinforms.Label();
		btnClose = new jwinforms.Button();
		lblTimeLabel = new jwinforms.Label();
		lblCashLabel = new jwinforms.Label();
		lblDebtLabel = new jwinforms.Label();
		lblNetWorthLabel = new jwinforms.Label();
		lblDifficultyLabel = new jwinforms.Label();
		lblTime = new jwinforms.Label();
		boxSkills = new jwinforms.GroupBox();
		lblEngineer = new jwinforms.Label();
		lblTrader = new jwinforms.Label();
		lblFighter = new jwinforms.Label();
		lblPilot = new jwinforms.Label();
		lblEngineerLabel = new jwinforms.Label();
		lblTraderLabel = new jwinforms.Label();
		lblFighterLabel = new jwinforms.Label();
		lblPilotLabel = new jwinforms.Label();
		boxFinances = new jwinforms.GroupBox();
		lblCash = new jwinforms.Label();
		lblDebt = new jwinforms.Label();
		lblNetWorth = new jwinforms.Label();
		boxNotoriety = new jwinforms.GroupBox();
		lblPoliceLabel = new jwinforms.Label();
		lblReputationLabel = new jwinforms.Label();
		lblKillsLabel = new jwinforms.Label();
		lblKills = new jwinforms.Label();
		lblReputation = new jwinforms.Label();
		lblRecord = new jwinforms.Label();
		lblBountyLabel = new jwinforms.Label();
		lblBounty = new jwinforms.Label();
		boxSkills.SuspendLayout();
		boxFinances.SuspendLayout();
		boxNotoriety.SuspendLayout();
		this.SuspendLayout();
		//
		// lblNameLabel
		//
		lblNameLabel.setAutoSize(true);
		lblNameLabel.setFont(FontCollection.bold825);
		lblNameLabel.setLocation(new java.awt.Point(8, 8));
		lblNameLabel.setName("lblNameLabel");
		lblNameLabel.setSize(new jwinforms.Size(39, 16));
		lblNameLabel.setTabIndex(2);
		lblNameLabel.setText("Name:");
		//
		// lblName
		//
		lblName.setLocation(new java.awt.Point(69, 8));
		lblName.setName("lblName");
		lblName.setSize(new jwinforms.Size(155, 13));
		lblName.setTabIndex(4);
		lblName.setText("XXXXXXXXXXXXXXXXXX");
		//
		// lblDifficulty
		//
		lblDifficulty.setLocation(new java.awt.Point(69, 24));
		lblDifficulty.setName("lblDifficulty");
		lblDifficulty.setSize(new jwinforms.Size(58, 13));
		lblDifficulty.setTabIndex(5);
		lblDifficulty.setText("Impossible");
		//
		// btnClose
		//
		btnClose.setDialogResult(DialogResult.Cancel);
		btnClose.setLocation(new java.awt.Point(-32, -32));
		btnClose.setName("btnClose");
		btnClose.setSize(new jwinforms.Size(26, 27));
		btnClose.setTabIndex(32);
		btnClose.setTabStop(false);
		btnClose.setText("X");
		//
		// lblTimeLabel
		//
		lblTimeLabel.setAutoSize(true);
		lblTimeLabel.setFont(FontCollection.bold825);
		lblTimeLabel.setLocation(new java.awt.Point(8, 40));
		lblTimeLabel.setName("lblTimeLabel");
		lblTimeLabel.setSize(new jwinforms.Size(34, 16));
		lblTimeLabel.setTabIndex(37);
		lblTimeLabel.setText("Time:");
		//
		// lblCashLabel
		//
		lblCashLabel.setAutoSize(true);
		lblCashLabel.setFont(FontCollection.bold825);
		lblCashLabel.setLocation(new java.awt.Point(8, 16));
		lblCashLabel.setName("lblCashLabel");
		lblCashLabel.setSize(new jwinforms.Size(35, 16));
		lblCashLabel.setTabIndex(38);
		lblCashLabel.setText("Cash:");
		//
		// lblDebtLabel
		//
		lblDebtLabel.setAutoSize(true);
		lblDebtLabel.setFont(FontCollection.bold825);
		lblDebtLabel.setLocation(new java.awt.Point(8, 32));
		lblDebtLabel.setName("lblDebtLabel");
		lblDebtLabel.setSize(new jwinforms.Size(32, 16));
		lblDebtLabel.setTabIndex(39);
		lblDebtLabel.setText("Debt:");
		//
		// lblNetWorthLabel
		//
		lblNetWorthLabel.setAutoSize(true);
		lblNetWorthLabel.setFont(FontCollection.bold825);
		lblNetWorthLabel.setLocation(new java.awt.Point(8, 48));
		lblNetWorthLabel.setName("lblNetWorthLabel");
		lblNetWorthLabel.setSize(new jwinforms.Size(60, 16));
		lblNetWorthLabel.setTabIndex(40);
		lblNetWorthLabel.setText("Net Worth:");
		//
		// lblDifficultyLabel
		//
		lblDifficultyLabel.setAutoSize(true);
		lblDifficultyLabel.setFont(FontCollection.bold825);
		lblDifficultyLabel.setLocation(new java.awt.Point(8, 24));
		lblDifficultyLabel.setName("lblDifficultyLabel");
		lblDifficultyLabel.setSize(new jwinforms.Size(53, 16));
		lblDifficultyLabel.setTabIndex(43);
		lblDifficultyLabel.setText("Difficulty:");
		//
		// lblTime
		//
		lblTime.setLocation(new java.awt.Point(69, 40));
		lblTime.setName("lblTime");
		lblTime.setSize(new jwinforms.Size(66, 13));
		lblTime.setTabIndex(44);
		lblTime.setText("88,888 days");
		//
		// boxSkills
		//
		boxSkills.Controls.addAll((new WinformControl[] { lblEngineer, lblTrader, lblFighter,
				lblPilot, lblEngineerLabel, lblTraderLabel, lblFighterLabel, lblPilotLabel }));
		boxSkills.setLocation(new java.awt.Point(8, 64));
		boxSkills.setName("boxSkills");
		boxSkills.setSize(new jwinforms.Size(216, 56));
		boxSkills.setTabIndex(49);
		boxSkills.setTabStop(false);
		boxSkills.setText("Skills");
		//
		// lblEngineer
		//
		lblEngineer.setLocation(new java.awt.Point(167, 32));
		lblEngineer.setName("lblEngineer");
		lblEngineer.setSize(new jwinforms.Size(40, 13));
		lblEngineer.setTabIndex(56);
		lblEngineer.setText("88 (88)");
		//
		// lblTrader
		//
		lblTrader.setLocation(new java.awt.Point(58, 32));
		lblTrader.setName("lblTrader");
		lblTrader.setSize(new jwinforms.Size(40, 13));
		lblTrader.setTabIndex(55);
		lblTrader.setText("88 (88)");
		//
		// lblFighter
		//
		lblFighter.setLocation(new java.awt.Point(167, 16));
		lblFighter.setName("lblFighter");
		lblFighter.setSize(new jwinforms.Size(40, 13));
		lblFighter.setTabIndex(54);
		lblFighter.setText("88 (88)");
		//
		// lblPilot
		//
		lblPilot.setLocation(new java.awt.Point(58, 16));
		lblPilot.setName("lblPilot");
		lblPilot.setSize(new jwinforms.Size(40, 13));
		lblPilot.setTabIndex(53);
		lblPilot.setText("88 (88)");
		//
		// lblEngineerLabel
		//
		lblEngineerLabel.setAutoSize(true);
		lblEngineerLabel.setFont(FontCollection.bold825);
		lblEngineerLabel.setLocation(new java.awt.Point(104, 32));
		lblEngineerLabel.setName("lblEngineerLabel");
		lblEngineerLabel.setSize(new jwinforms.Size(55, 16));
		lblEngineerLabel.setTabIndex(52);
		lblEngineerLabel.setText("Engineer:");
		//
		// lblTraderLabel
		//
		lblTraderLabel.setAutoSize(true);
		lblTraderLabel.setFont(FontCollection.bold825);
		lblTraderLabel.setLocation(new java.awt.Point(8, 32));
		lblTraderLabel.setName("lblTraderLabel");
		lblTraderLabel.setSize(new jwinforms.Size(42, 16));
		lblTraderLabel.setTabIndex(51);
		lblTraderLabel.setText("Trader:");
		//
		// lblFighterLabel
		//
		lblFighterLabel.setAutoSize(true);
		lblFighterLabel.setFont(FontCollection.bold825);
		lblFighterLabel.setLocation(new java.awt.Point(104, 16));
		lblFighterLabel.setName("lblFighterLabel");
		lblFighterLabel.setSize(new jwinforms.Size(44, 16));
		lblFighterLabel.setTabIndex(50);
		lblFighterLabel.setText("Fighter:");
		//
		// lblPilotLabel
		//
		lblPilotLabel.setAutoSize(true);
		lblPilotLabel.setFont(FontCollection.bold825);
		lblPilotLabel.setLocation(new java.awt.Point(8, 16));
		lblPilotLabel.setName("lblPilotLabel");
		lblPilotLabel.setSize(new jwinforms.Size(31, 16));
		lblPilotLabel.setTabIndex(49);
		lblPilotLabel.setText("Pilot:");
		//
		// boxFinances
		//
		boxFinances.Controls.addAll(lblCash, lblDebt, lblNetWorth, lblNetWorthLabel,
				lblCashLabel, lblDebtLabel);
		boxFinances.setLocation(new java.awt.Point(8, 128));
		boxFinances.setName("boxFinances");
		boxFinances.setSize(new jwinforms.Size(216, 72));
		boxFinances.setTabIndex(50);
		boxFinances.setTabStop(false);
		boxFinances.setText("Finances");
		//
		// lblCash
		//
		lblCash.setLocation(new java.awt.Point(104, 16));
		lblCash.setName("lblCash");
		lblCash.setSize(new jwinforms.Size(70, 13));
		lblCash.setTabIndex(43);
		lblCash.setText("8,888,888 cr.");
		lblCash.TextAlign = ContentAlignment.TopRight;
		//
		// lblDebt
		//
		lblDebt.setLocation(new java.awt.Point(104, 32));
		lblDebt.setName("lblDebt");
		lblDebt.setSize(new jwinforms.Size(70, 13));
		lblDebt.setTabIndex(42);
		lblDebt.setText("8,888,888 cr.");
		lblDebt.TextAlign = ContentAlignment.TopRight;
		//
		// lblNetWorth
		//
		lblNetWorth.setLocation(new java.awt.Point(104, 48));
		lblNetWorth.setName("lblNetWorth");
		lblNetWorth.setSize(new jwinforms.Size(70, 13));
		lblNetWorth.setTabIndex(41);
		lblNetWorth.setText("8,888,888 cr.");
		lblNetWorth.TextAlign = ContentAlignment.TopRight;
		//
		// boxNotoriety
		//
		boxNotoriety.Controls.addAll((new WinformControl[] { lblBountyLabel, lblBounty,
				lblPoliceLabel, lblReputationLabel, lblKillsLabel, lblKills, lblReputation,
				lblRecord }));
		boxNotoriety.setLocation(new java.awt.Point(8, 208));
		boxNotoriety.setName("boxNotoriety");
		boxNotoriety.setSize(new jwinforms.Size(216, 88));
		boxNotoriety.setTabIndex(51);
		boxNotoriety.setTabStop(false);
		boxNotoriety.setText("Notoriety");
		//
		// lblPoliceLabel
		//
		lblPoliceLabel.setAutoSize(true);
		lblPoliceLabel.setFont(FontCollection.bold825);
		lblPoliceLabel.setLocation(new java.awt.Point(8, 48));
		lblPoliceLabel.setName("lblPoliceLabel");
		lblPoliceLabel.setSize(new jwinforms.Size(81, 16));
		lblPoliceLabel.setTabIndex(46);
		lblPoliceLabel.setText("Police Record:");
		//
		// lblReputationLabel
		//
		lblReputationLabel.setAutoSize(true);
		lblReputationLabel.setFont(FontCollection.bold825);
		lblReputationLabel.setLocation(new java.awt.Point(8, 32));
		lblReputationLabel.setName("lblReputationLabel");
		lblReputationLabel.setSize(new jwinforms.Size(65, 16));
		lblReputationLabel.setTabIndex(45);
		lblReputationLabel.setText("Reputation:");
		//
		// lblKillsLabel
		//
		lblKillsLabel.setAutoSize(true);
		lblKillsLabel.setFont(FontCollection.bold825);
		lblKillsLabel.setLocation(new java.awt.Point(8, 16));
		lblKillsLabel.setName("lblKillsLabel");
		lblKillsLabel.setSize(new jwinforms.Size(30, 16));
		lblKillsLabel.setTabIndex(44);
		lblKillsLabel.setText("Kills:");
		//
		// lblKills
		//
		lblKills.setLocation(new java.awt.Point(104, 16));
		lblKills.setName("lblKills");
		lblKills.setSize(new jwinforms.Size(33, 13));
		lblKills.setTabIndex(43);
		lblKills.setText("8,888");
		//
		// lblReputation
		//
		lblReputation.setLocation(new java.awt.Point(104, 32));
		lblReputation.setName("lblReputation");
		lblReputation.setSize(new jwinforms.Size(88, 13));
		lblReputation.setTabIndex(42);
		lblReputation.setText("Mostly Harmless");
		//
		// lblRecord
		//
		lblRecord.setLocation(new java.awt.Point(104, 48));
		lblRecord.setName("lblRecord");
		lblRecord.setSize(new jwinforms.Size(63, 13));
		lblRecord.setTabIndex(41);
		lblRecord.setText("Psychopath");
		//
		// lblBountyLabel
		//
		lblBountyLabel.setAutoSize(true);
		lblBountyLabel.setFont(FontCollection.bold825);
		lblBountyLabel.setLocation(new java.awt.Point(8, 64));
		lblBountyLabel.setName("lblBountyLabel");
		lblBountyLabel.setSize(new jwinforms.Size(84, 16));
		lblBountyLabel.setTabIndex(48);
		lblBountyLabel.setText("Bounty offered:");
		lblBountyLabel.setVisible(false);
		//
		// lblBounty
		//
		lblBounty.setLocation(new java.awt.Point(104, 64));
		lblBounty.setName("lblBounty");
		lblBounty.setSize(new jwinforms.Size(72, 13));
		lblBounty.setTabIndex(47);
		lblBounty.setText("8,888,888 cr.");
		lblBounty.setVisible(false);
		// FormViewCommander
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(232, 304));
		Controls.addAll(Arrays.asList(boxNotoriety, boxFinances, boxSkills, lblTime,
				lblDifficultyLabel, lblTimeLabel, lblNameLabel, btnClose, lblDifficulty,
				lblName));
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormViewCommander");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Commander Status");
	}

	private void InitializeScreen()
	{
		Commander cmdr = game.Commander();

		lblName.setText(cmdr.Name());
		lblDifficulty.setText(Strings.DifficultyLevels[game.Difficulty().CastToInt()]);
		lblTime.setText(Functions.Multiples(cmdr.getDays(), Strings.TimeUnit));

		lblPilot.setText(cmdr.Pilot() + " (" + cmdr.getShip().Pilot() + ")");
		lblFighter.setText(cmdr.Fighter() + " (" + cmdr.getShip().Fighter() + ")");
		lblTrader.setText(cmdr.Trader() + " (" + cmdr.getShip().Trader() + ")");
		lblEngineer.setText(cmdr.Engineer() + " (" + cmdr.getShip().Engineer() + ")");

		lblCash.setText(Functions.FormatMoney(cmdr.getCash()));
		lblDebt.setText(Functions.FormatMoney(cmdr.getDebt()));
		lblNetWorth.setText(Functions.FormatMoney(cmdr.Worth()));

		lblKills.setText(Functions.FormatNumber(cmdr.getKillsPirate() + cmdr.getKillsPolice() + cmdr.getKillsTrader()));
		lblRecord.setText(PoliceRecord.GetPoliceRecordFromScore(cmdr.getPoliceRecordScore()).Name());
		lblReputation.setText(Reputation.GetReputationFromScore(cmdr.getReputationScore()).Name());

		int score = cmdr.getPoliceRecordScore();
		if (score <= Consts.PoliceRecordScoreCrook)
		{
			lblBountyLabel.setVisible(true);
			lblBountyLabel.setText("Bounty offered:");
			lblBounty.setVisible(true);
			lblBounty.setText(Functions.FormatMoney(-1000 * score));
		} else if (score >= Consts.PoliceRecordScoreTrusted)
		{
			lblBountyLabel.setVisible(true);
			lblBountyLabel.setText("Angry kingpins:");
			lblBounty.setVisible(true);
			lblBounty.setText(Functions.FormatNumber(score / 5));
		} else
		{
			lblBountyLabel.setVisible(false);
			lblBounty.setVisible(false);
		}
	}
}