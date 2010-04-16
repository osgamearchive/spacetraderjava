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
import spacetrader.GameRules;
import spacetrader.enums.Difficulty;

public class FormNewCommander extends SpaceTraderForm
{
	private jwinforms.Label lblName;
	private jwinforms.TextBox txtName;
	private jwinforms.Button btnClose;
	private jwinforms.Label lblDifficulty;
	private jwinforms.Label lblSkillPoints;
	private jwinforms.Label lblPilot;
	private jwinforms.Label lblFighter;
	private jwinforms.Label lblTrader;
	private jwinforms.Label lblEngineer;
	private jwinforms.ComboBox selDifficulty;
	private jwinforms.NumericUpDown numPilot;
	private jwinforms.Button btnOk;
	private jwinforms.Label lblPointsRemaining;
	private jwinforms.Label lblPoints;
	private jwinforms.NumericUpDown numFighter;
	private jwinforms.NumericUpDown numTrader;
	private jwinforms.NumericUpDown numEngineer;

	private final int maxTotalPoints;
	private final int maxSkillPoints;

	public FormNewCommander(GameRules rules)
	{
		maxTotalPoints = rules.maxTotalInitialPoints();
		maxSkillPoints = rules.maxInitialSkillPoints();

		InitializeComponent();

		selDifficulty.setSelectedIndex(2);
	}

	private void InitializeComponent()
	{
		lblName = new jwinforms.Label();
		txtName = new jwinforms.TextBox();
		btnClose = new jwinforms.Button();
		lblDifficulty = new jwinforms.Label();
		lblSkillPoints = new jwinforms.Label();
		lblPilot = new jwinforms.Label();
		lblFighter = new jwinforms.Label();
		lblTrader = new jwinforms.Label();
		lblEngineer = new jwinforms.Label();
		selDifficulty = new jwinforms.ComboBox();
		numPilot = new jwinforms.NumericUpDown();
		numFighter = new jwinforms.NumericUpDown();
		numTrader = new jwinforms.NumericUpDown();
		numEngineer = new jwinforms.NumericUpDown();
		btnOk = new jwinforms.Button();
		lblPointsRemaining = new jwinforms.Label();
		lblPoints = new jwinforms.Label();
		((ISupportInitialize)(numPilot)).BeginInit();
		((ISupportInitialize)(numFighter)).BeginInit();
		((ISupportInitialize)(numTrader)).BeginInit();
		((ISupportInitialize)(numEngineer)).BeginInit();
		this.SuspendLayout();
		//
		// lblName
		//
		lblName.setAutoSize(true);
		lblName.setLocation(new java.awt.Point(8, 8));
		lblName.setName("lblName");
		lblName.setSize(new jwinforms.Size(38, 13));
		lblName.setTabIndex(0);
		lblName.setText("Name:");
		//
		// txtName
		//
		txtName.setLocation(new java.awt.Point(72, 5));
		txtName.setName("txtName");
		txtName.setSize(new jwinforms.Size(120, 20));
		txtName.setTabIndex(1);
		txtName.setText("");
		txtName.setTextChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				txtName_TextChanged(sender, e);
			}
		});
		//
		// btnClose
		//
		btnClose.setDialogResult(DialogResult.Cancel);
		btnClose.setLocation(new java.awt.Point(-32, -32));
		btnClose.setName("btnClose");
		btnClose.setSize(new jwinforms.Size(30, 31));
		btnClose.setTabIndex(33);
		btnClose.setTabStop(false);
		btnClose.setText("X");
		//
		// lblDifficulty
		//
		lblDifficulty.setAutoSize(true);
		lblDifficulty.setLocation(new java.awt.Point(8, 40));
		lblDifficulty.setName("lblDifficulty");
		lblDifficulty.setSize(new jwinforms.Size(50, 13));
		lblDifficulty.setTabIndex(34);
		lblDifficulty.setText("Difficulty:");
		//
		// lblSkillPoints
		//
		lblSkillPoints.setAutoSize(true);
		lblSkillPoints.setLocation(new java.awt.Point(8, 72));
		lblSkillPoints.setName("lblSkillPoints");
		lblSkillPoints.setSize(new jwinforms.Size(63, 13));
		lblSkillPoints.setTabIndex(35);
		lblSkillPoints.setText("Skill Points:");
		//
		// lblPilot
		//
		lblPilot.setAutoSize(true);
		lblPilot.setLocation(new java.awt.Point(16, 96));
		lblPilot.setName("lblPilot");
		lblPilot.setSize(new jwinforms.Size(29, 13));
		lblPilot.setTabIndex(36);
		lblPilot.setText("Pilot:");
		//
		// lblFighter
		//
		lblFighter.setAutoSize(true);
		lblFighter.setLocation(new java.awt.Point(16, 120));
		lblFighter.setName("lblFighter");
		lblFighter.setSize(new jwinforms.Size(43, 13));
		lblFighter.setTabIndex(37);
		lblFighter.setText("Fighter:");
		//
		// lblTrader
		//
		lblTrader.setAutoSize(true);
		lblTrader.setLocation(new java.awt.Point(16, 144));
		lblTrader.setName("lblTrader");
		lblTrader.setSize(new jwinforms.Size(41, 13));
		lblTrader.setTabIndex(38);
		lblTrader.setText("Trader:");
		//
		// lblEngineer
		//
		lblEngineer.setAutoSize(true);
		lblEngineer.setLocation(new java.awt.Point(16, 168));
		lblEngineer.setName("lblEngineer");
		lblEngineer.setSize(new jwinforms.Size(53, 13));
		lblEngineer.setTabIndex(39);
		lblEngineer.setText("Engineer:");
		//
		// selDifficulty
		//
		selDifficulty.DropDownStyle = jwinforms.ComboBoxStyle.DropDownList;
		selDifficulty.Items.AddRange(new Object[] { "Beginner", "Easy", "Normal", "Hard", "Impossible" });
		selDifficulty.setLocation(new java.awt.Point(72, 37));
		selDifficulty.setName("selDifficulty");
		selDifficulty.setSize(new jwinforms.Size(120, 21));
		selDifficulty.setTabIndex(2);
		//
		// numPilot
		//
		numPilot.setLocation(new java.awt.Point(72, 94));
		numPilot.setMaximum(10);
		numPilot.setMinimum(1);
		numPilot.setName("numPilot");
		numPilot.setSize(new jwinforms.Size(36, 20));
		numPilot.setTabIndex(3);
		numPilot.TextAlign = jwinforms.HorizontalAlignment.Center;
		numPilot.setValue(1);
		numPilot.setEnter(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueEnter(sender, e);
			}
		});
		numPilot.setValueChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		numPilot.setLeave(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		//
		// numFighter
		//
		numFighter.setLocation(new java.awt.Point(72, 118));
		numFighter.setMaximum(10);
		numFighter.setMinimum(1);
		numFighter.setName("numFighter");
		numFighter.setSize(new jwinforms.Size(36, 20));
		numFighter.setTabIndex(4);
		numFighter.TextAlign = jwinforms.HorizontalAlignment.Center;
		numFighter.setValue(1);
		numFighter.setEnter(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueEnter(sender, e);
			}
		});
		numFighter.setValueChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		numFighter.setLeave(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		//
		// numTrader
		//
		numTrader.setLocation(new java.awt.Point(72, 142));
		numTrader.setMaximum(10);
		numTrader.setMinimum(1);
		numTrader.setName("numTrader");
		numTrader.setSize(new jwinforms.Size(36, 20));
		numTrader.setTabIndex(5);
		numTrader.TextAlign = jwinforms.HorizontalAlignment.Center;
		numTrader.setValue(1);
		numTrader.setEnter(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueEnter(sender, e);
			}
		});
		numTrader.setValueChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		numTrader.setLeave(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		//
		// numEngineer
		//
		numEngineer.setLocation(new java.awt.Point(72, 166));
		numEngineer.setMaximum(10);
		numEngineer.setMinimum(1);
		numEngineer.setName("numEngineer");
		numEngineer.setSize(new jwinforms.Size(36, 20));
		numEngineer.setTabIndex(6);
		numEngineer.TextAlign = jwinforms.HorizontalAlignment.Center;
		numEngineer.setValue(1);
		numEngineer.setEnter(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueEnter(sender, e);
			}
		});
		numEngineer.setValueChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		numEngineer.setLeave(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				num_ValueChanged(sender, e);
			}
		});
		//
		// btnOk
		//
		btnOk.setDialogResult(DialogResult.OK);
		btnOk.setEnabled(false);
		btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnOk.setLocation(new java.awt.Point(83, 200));
		btnOk.setName("btnOk");
		btnOk.setSize(new jwinforms.Size(36, 22));
		btnOk.setTabIndex(7);
		btnOk.setText("Ok");
		btnOk.setEnabled(false);
		//
		// lblPointsRemaining
		//
		lblPointsRemaining.setAutoSize(true);
		lblPointsRemaining.setLocation(new java.awt.Point(91, 72));
		lblPointsRemaining.setName("lblPointsRemaining");
		lblPointsRemaining.setSize(new jwinforms.Size(90, 13));
		lblPointsRemaining.setTabIndex(40);
		lblPointsRemaining.setText("points remaining.");
		//
		// lblPoints
		//
		lblPoints.setLocation(new java.awt.Point(73, 72));
		lblPoints.setName("lblPoints");
		lblPoints.setSize(new jwinforms.Size(17, 13));
		lblPoints.setTabIndex(41);
		lblPoints.setText("16");
		lblPoints.TextAlign = ContentAlignment.TopRight;
		//
		// FormNewCommander
		//
		this.setAcceptButton(btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(202, 231));
		Controls.addAll(Arrays.asList(lblPoints, lblPointsRemaining, lblEngineer, lblTrader,
				lblFighter, lblPilot, lblSkillPoints, lblDifficulty, lblName, btnOk,
				numEngineer, numTrader, numFighter, numPilot, selDifficulty, btnClose,
				txtName));
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormNewCommander");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("New Commander");
		((ISupportInitialize)(numPilot)).EndInit();
		((ISupportInitialize)(numFighter)).EndInit();
		((ISupportInitialize)(numTrader)).EndInit();
		((ISupportInitialize)(numEngineer)).EndInit();

	}

	private void UpdateOkEnabled()
	{
		btnOk.setEnabled(lblPoints.getText().equals("0") && txtName.getText().length() > 0);
	}

	private void num_ValueChanged(Object sender, EventArgs e)
	{
		int points = maxTotalPoints - (Pilot() + Fighter() + Trader() + Engineer());
		lblPoints.setText("" + points);
		numPilot.setMaximum(Math.min(maxSkillPoints, Pilot() + points));
		numFighter.setMaximum(Math.min(maxSkillPoints, Fighter() + points));
		numTrader.setMaximum(Math.min(maxSkillPoints, Trader() + points));
		numEngineer.setMaximum(Math.min(maxSkillPoints, Engineer() + points));

		UpdateOkEnabled();
	}

	private void num_ValueEnter(Object sender, EventArgs e)
	{
		((NumericUpDown)sender).Select(0, ("" + ((NumericUpDown)sender).getValue()).length());
	}

	private void txtName_TextChanged(Object sender, EventArgs e)
	{
		UpdateOkEnabled();
	}

	public String CommanderName()
	{
		return txtName.getText();
	}

	public Difficulty Difficulty()
	{
		return Difficulty.FromInt(selDifficulty.getSelectedIndex());
	}

	public int Pilot()
	{
		return numPilot.getValue();
	}

	public int Fighter()
	{
		return numFighter.getValue();
	}

	public int Trader()
	{
		return numTrader.getValue();
	}

	public int Engineer()
	{
		return numEngineer.getValue();
	}
}
