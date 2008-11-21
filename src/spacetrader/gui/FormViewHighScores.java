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
import spacetrader.*;
	public class FormViewHighScores extends WinformForm
	{
		//#region Control Declarations

		private jwinforms.Button btnClose;
		private jwinforms.Label lblRank0;
		private jwinforms.Label lblRank2;
		private jwinforms.Label lblRank1;
		private jwinforms.Label lblScore0;
		private jwinforms.Label lblScore1;
		private jwinforms.Label lblScore2;
		private jwinforms.Label lblName0;
		private jwinforms.Label lblName1;
		private jwinforms.Label lblName2;
		private jwinforms.Label lblStatus0;
		private jwinforms.Label lblStatus1;
		private jwinforms.Label lblStatus2;
		private Container components = null;

		//#endregion

		//#region Methods

		public FormViewHighScores()
		{
			InitializeComponent();

			Label[] lblName		= new Label[] { lblName0,   lblName1,   lblName2   };
			Label[] lblScore	= new Label[] { lblScore0,  lblScore1,  lblScore2  };
			Label[] lblStatus	= new Label[] { lblStatus0, lblStatus1, lblStatus2 };

			HighScoreRecord[]	highScores	= Functions.GetHighScores(this);
			for (int i = highScores.length - 1; i >= 0 && highScores[i] != null; i--)
			{
				lblName[2 - i].setText(highScores[i].Name());
				lblScore[2 - i].setText(Functions.FormatNumber(highScores[i].Score() / 10) + "." + highScores[i].Score() % 10);
				lblStatus[2 - i].setText(Functions.StringVars(Strings.HighScoreStatus, new String[]
																	{
																		Strings.GameCompletionTypes[highScores[i].Type().CastToInt()],
																		Functions.Multiples(highScores[i].Days(), Strings.TimeUnit),
																		Functions.Multiples(highScores[i].Worth(), Strings.MoneyUnit),
																		Strings.DifficultyLevels[highScores[i].Difficulty().CastToInt()].toLowerCase()
																	}));

				lblScore[2 - i].setVisible(true);
				lblStatus[2 - i].setVisible(true);
			}
		}

		

		//#region Windows Form Designer generated code
		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.btnClose = new jwinforms.Button();
			this.lblRank0 = new jwinforms.Label();
			this.lblRank2 = new jwinforms.Label();
			this.lblRank1 = new jwinforms.Label();
			this.lblScore0 = new jwinforms.Label();
			this.lblScore1 = new jwinforms.Label();
			this.lblScore2 = new jwinforms.Label();
			this.lblName0 = new jwinforms.Label();
			this.lblName1 = new jwinforms.Label();
			this.lblName2 = new jwinforms.Label();
			this.lblStatus0 = new jwinforms.Label();
			this.lblStatus1 = new jwinforms.Label();
			this.lblStatus2 = new jwinforms.Label();
			this.SuspendLayout();
			//
			// btnClose
			//
			this.btnClose.setDialogResult(DialogResult.Cancel);
			this.btnClose.setLocation(new java.awt.Point(-32, -32));
			this.btnClose.setName("btnClose");
			this.btnClose.setSize(new jwinforms.Size(32, 32));
			this.btnClose.setTabIndex(32);
			this.btnClose.setTabStop(false);
			this.btnClose.setText("X");
			//
			// lblRank0
			//
			this.lblRank0.setAutoSize(true);
			this.lblRank0.setLocation(new java.awt.Point(8, 8));
			this.lblRank0.setName("lblRank0");
			this.lblRank0.setSize(new jwinforms.Size(14, 13));
			this.lblRank0.setTabIndex(33);
			this.lblRank0.setText("1.");
			this.lblRank0.TextAlign = ContentAlignment.TopRight;
			//
			// lblRank2
			//
			this.lblRank2.setAutoSize(true);
			this.lblRank2.setLocation(new java.awt.Point(8, 136));
			this.lblRank2.setName("lblRank2");
			this.lblRank2.setSize(new jwinforms.Size(14, 13));
			this.lblRank2.setTabIndex(34);
			this.lblRank2.setText("3.");
			this.lblRank2.TextAlign = ContentAlignment.TopRight;
			//
			// lblRank1
			//
			this.lblRank1.setAutoSize(true);
			this.lblRank1.setLocation(new java.awt.Point(8, 72));
			this.lblRank1.setName("lblRank1");
			this.lblRank1.setSize(new jwinforms.Size(14, 13));
			this.lblRank1.setTabIndex(35);
			this.lblRank1.setText("2.");
			this.lblRank1.TextAlign = ContentAlignment.TopRight;
			//
			// lblScore0
			//
			this.lblScore0.setLocation(new java.awt.Point(168, 8));
			this.lblScore0.setName("lblScore0");
			this.lblScore0.setSize(new jwinforms.Size(43, 13));
			this.lblScore0.setTabIndex(36);
			this.lblScore0.setText("888.8%");
			this.lblScore0.TextAlign = ContentAlignment.TopRight;
			this.lblScore0.setVisible(false);
			//
			// lblScore1
			//
			this.lblScore1.setLocation(new java.awt.Point(168, 72));
			this.lblScore1.setName("lblScore1");
			this.lblScore1.setSize(new jwinforms.Size(43, 13));
			this.lblScore1.setTabIndex(37);
			this.lblScore1.setText("888.8%");
			this.lblScore1.TextAlign = ContentAlignment.TopRight;
			this.lblScore1.setVisible(false);
			//
			// lblScore2
			//
			this.lblScore2.setLocation(new java.awt.Point(168, 136));
			this.lblScore2.setName("lblScore2");
			this.lblScore2.setSize(new jwinforms.Size(43, 13));
			this.lblScore2.setTabIndex(38);
			this.lblScore2.setText("888.8%");
			this.lblScore2.TextAlign = ContentAlignment.TopRight;
			this.lblScore2.setVisible(false);
			//
			// lblName0
			//
			this.lblName0.setLocation(new java.awt.Point(24, 8));
			this.lblName0.setName("lblName0");
			this.lblName0.setSize(new jwinforms.Size(144, 13));
			this.lblName0.setTabIndex(39);
			this.lblName0.setText("Empty");
			//
			// lblName1
			//
			this.lblName1.setLocation(new java.awt.Point(24, 72));
			this.lblName1.setName("lblName1");
			this.lblName1.setSize(new jwinforms.Size(144, 13));
			this.lblName1.setTabIndex(40);
			this.lblName1.setText("Empty");
			//
			// lblName2
			//
			this.lblName2.setLocation(new java.awt.Point(24, 136));
			this.lblName2.setName("lblName2");
			this.lblName2.setSize(new jwinforms.Size(144, 13));
			this.lblName2.setTabIndex(41);
			this.lblName2.setText("Empty");
			//
			// lblStatus0
			//
			this.lblStatus0.setLocation(new java.awt.Point(24, 24));
			this.lblStatus0.setName("lblStatus0");
			this.lblStatus0.setSize(new jwinforms.Size(200, 26));
			this.lblStatus0.setTabIndex(42);
			this.lblStatus0.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
			this.lblStatus0.setVisible(false);
			//
			// lblStatus1
			//
			this.lblStatus1.setLocation(new java.awt.Point(24, 88));
			this.lblStatus1.setName("lblStatus1");
			this.lblStatus1.setSize(new jwinforms.Size(200, 26));
			this.lblStatus1.setTabIndex(43);
			this.lblStatus1.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
			this.lblStatus1.setVisible(false);
			//
			// lblStatus2
			//
			this.lblStatus2.setLocation(new java.awt.Point(24, 152));
			this.lblStatus2.setName("lblStatus2");
			this.lblStatus2.setSize(new jwinforms.Size(200, 26));
			this.lblStatus2.setTabIndex(44);
			this.lblStatus2.setText("Claimed moon in 888,888 days, worth 8,888,888 credits on impossible level.");
			this.lblStatus2.setVisible(false);
			//
			// FormViewHighScores
			//
			this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
			this.setCancelButton(this.btnClose);
			this.setClientSize(new jwinforms.Size(218, 191));
			this.Controls.addAll(Arrays.asList(
																																	this.lblStatus2,
																																	this.lblStatus1,
																																	this.lblStatus0,
																																	this.lblName2,
																																	this.lblName1,
																																	this.lblName0,
																																	this.lblScore2,
																																	this.lblScore1,
																																	this.lblScore0,
																																	this.lblRank1,
																																	this.lblRank2,
																																	this.lblRank0,
																																	this.btnClose));
			this.setFormBorderStyle(FormBorderStyle.FixedDialog);
			this.setMaximizeBox(false);
			this.setMinimizeBox(false);
			this.setName("FormViewHighScores");
			this.setShowInTaskbar(false);
			this.setStartPosition(FormStartPosition.CenterParent);
			this.setText("High Scores");
			this.ResumeLayout(false);
		}
		//#endregion

		//#endregion
	}
