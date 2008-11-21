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
	public class FormJettison extends WinformForm
	{
		//#region Control Declarations

		private jwinforms.Button btnJettisonAll9;
		private jwinforms.Button btnJettisonQty9;
		private jwinforms.Button btnJettisonAll8;
		private jwinforms.Button btnJettisonQty8;
		private jwinforms.Button btnJettisonAll7;
		private jwinforms.Button btnJettisonQty7;
		private jwinforms.Button btnJettisonAll6;
		private jwinforms.Button btnJettisonQty6;
		private jwinforms.Button btnJettisonAll5;
		private jwinforms.Button btnJettisonQty5;
		private jwinforms.Button btnJettisonAll4;
		private jwinforms.Button btnJettisonQty4;
		private jwinforms.Button btnJettisonAll3;
		private jwinforms.Button btnJettisonQty3;
		private jwinforms.Button btnJettisonAll2;
		private jwinforms.Button btnJettisonQty2;
		private jwinforms.Button btnJettisonAll1;
		private jwinforms.Button btnJettisonQty1;
		private jwinforms.Button btnJettisonAll0;
		private jwinforms.Button btnJettisonQty0;
		private jwinforms.Label lblTradeCmdty9;
		private jwinforms.Label lblTradeCmdty8;
		private jwinforms.Label lblTradeCmdty2;
		private jwinforms.Label lblTradeCmdty0;
		private jwinforms.Label lblTradeCmdty1;
		private jwinforms.Label lblTradeCmdty6;
		private jwinforms.Label lblTradeCmdty5;
		private jwinforms.Label lblTradeCmdty4;
		private jwinforms.Label lblTradeCmdty3;
		private jwinforms.Label lblTradeCmdty7;
		private jwinforms.Label lblBaysLabel;
		private jwinforms.Label lblBays;
		private jwinforms.Button btnDone;
		private Container components = null;

		private Button[]	btnJettisonQty;
		private Button[]	btnJettisonAll;

		//#endregion

		//#region Member Declarations

		private Game			game	= Game.CurrentGame();

		//#endregion

		//#region Methods

		public FormJettison()
		{
			InitializeComponent();

			//#region Arrays of Cargo controls
			btnJettisonQty	= new Button[]
			{
				btnJettisonQty0,
				btnJettisonQty1,
				btnJettisonQty2,
				btnJettisonQty3,
				btnJettisonQty4,
				btnJettisonQty5,
				btnJettisonQty6,
				btnJettisonQty7,
				btnJettisonQty8,
				btnJettisonQty9
			};

			btnJettisonAll	= new Button[]
			{
				btnJettisonAll0,
				btnJettisonAll1,
				btnJettisonAll2,
				btnJettisonAll3,
				btnJettisonAll4,
				btnJettisonAll5,
				btnJettisonAll6,
				btnJettisonAll7,
				btnJettisonAll8,
				btnJettisonAll9
			};
			//#endregion

			UpdateAll();
		}

		

		//#region Windows Form Designer generated code
		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.btnJettisonAll9 = new jwinforms.Button();
			this.btnJettisonQty9 = new jwinforms.Button();
			this.btnJettisonAll8 = new jwinforms.Button();
			this.btnJettisonQty8 = new jwinforms.Button();
			this.btnJettisonAll7 = new jwinforms.Button();
			this.btnJettisonQty7 = new jwinforms.Button();
			this.btnJettisonAll6 = new jwinforms.Button();
			this.btnJettisonQty6 = new jwinforms.Button();
			this.btnJettisonAll5 = new jwinforms.Button();
			this.btnJettisonQty5 = new jwinforms.Button();
			this.btnJettisonAll4 = new jwinforms.Button();
			this.btnJettisonQty4 = new jwinforms.Button();
			this.btnJettisonAll3 = new jwinforms.Button();
			this.btnJettisonQty3 = new jwinforms.Button();
			this.btnJettisonAll2 = new jwinforms.Button();
			this.btnJettisonQty2 = new jwinforms.Button();
			this.btnJettisonAll1 = new jwinforms.Button();
			this.btnJettisonQty1 = new jwinforms.Button();
			this.btnJettisonAll0 = new jwinforms.Button();
			this.btnJettisonQty0 = new jwinforms.Button();
			this.lblTradeCmdty9 = new jwinforms.Label();
			this.lblTradeCmdty8 = new jwinforms.Label();
			this.lblTradeCmdty2 = new jwinforms.Label();
			this.lblTradeCmdty0 = new jwinforms.Label();
			this.lblTradeCmdty1 = new jwinforms.Label();
			this.lblTradeCmdty6 = new jwinforms.Label();
			this.lblTradeCmdty5 = new jwinforms.Label();
			this.lblTradeCmdty4 = new jwinforms.Label();
			this.lblTradeCmdty3 = new jwinforms.Label();
			this.lblTradeCmdty7 = new jwinforms.Label();
			this.lblBaysLabel = new jwinforms.Label();
			this.lblBays = new jwinforms.Label();
			this.btnDone = new jwinforms.Button();
			this.SuspendLayout();
			//
			// btnJettisonAll9
			//
			this.btnJettisonAll9.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll9.setLocation(new java.awt.Point(100, 220));
			this.btnJettisonAll9.setName("btnJettisonAll9");
			this.btnJettisonAll9.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll9.setTabIndex(141);
			this.btnJettisonAll9.setText("All");
			this.btnJettisonAll9.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty9
			//
			this.btnJettisonQty9.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty9.setLocation(new java.awt.Point(68, 220));
			this.btnJettisonQty9.setName("btnJettisonQty9");
			this.btnJettisonQty9.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty9.setTabIndex(140);
			this.btnJettisonQty9.setText("88");
			this.btnJettisonQty9.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll8
			//
			this.btnJettisonAll8.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll8.setLocation(new java.awt.Point(100, 196));
			this.btnJettisonAll8.setName("btnJettisonAll8");
			this.btnJettisonAll8.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll8.setTabIndex(139);
			this.btnJettisonAll8.setText("All");
			this.btnJettisonAll8.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty8
			//
			this.btnJettisonQty8.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty8.setLocation(new java.awt.Point(68, 196));
			this.btnJettisonQty8.setName("btnJettisonQty8");
			this.btnJettisonQty8.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty8.setTabIndex(138);
			this.btnJettisonQty8.setText("88");
			this.btnJettisonQty8.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll7
			//
			this.btnJettisonAll7.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll7.setLocation(new java.awt.Point(100, 172));
			this.btnJettisonAll7.setName("btnJettisonAll7");
			this.btnJettisonAll7.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll7.setTabIndex(137);
			this.btnJettisonAll7.setText("All");
			this.btnJettisonAll7.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty7
			//
			this.btnJettisonQty7.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty7.setLocation(new java.awt.Point(68, 172));
			this.btnJettisonQty7.setName("btnJettisonQty7");
			this.btnJettisonQty7.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty7.setTabIndex(136);
			this.btnJettisonQty7.setText("88");
			this.btnJettisonQty7.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll6
			//
			this.btnJettisonAll6.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll6.setLocation(new java.awt.Point(100, 148));
			this.btnJettisonAll6.setName("btnJettisonAll6");
			this.btnJettisonAll6.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll6.setTabIndex(135);
			this.btnJettisonAll6.setText("All");
			this.btnJettisonAll6.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty6
			//
			this.btnJettisonQty6.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty6.setLocation(new java.awt.Point(68, 148));
			this.btnJettisonQty6.setName("btnJettisonQty6");
			this.btnJettisonQty6.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty6.setTabIndex(134);
			this.btnJettisonQty6.setText("88");
			this.btnJettisonQty6.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll5
			//
			this.btnJettisonAll5.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll5.setLocation(new java.awt.Point(100, 124));
			this.btnJettisonAll5.setName("btnJettisonAll5");
			this.btnJettisonAll5.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll5.setTabIndex(133);
			this.btnJettisonAll5.setText("All");
			this.btnJettisonAll5.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty5
			//
			this.btnJettisonQty5.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty5.setLocation(new java.awt.Point(68, 124));
			this.btnJettisonQty5.setName("btnJettisonQty5");
			this.btnJettisonQty5.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty5.setTabIndex(132);
			this.btnJettisonQty5.setText("88");
			this.btnJettisonQty5.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll4
			//
			this.btnJettisonAll4.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll4.setLocation(new java.awt.Point(100, 100));
			this.btnJettisonAll4.setName("btnJettisonAll4");
			this.btnJettisonAll4.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll4.setTabIndex(131);
			this.btnJettisonAll4.setText("All");
			this.btnJettisonAll4.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty4
			//
			this.btnJettisonQty4.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty4.setLocation(new java.awt.Point(68, 100));
			this.btnJettisonQty4.setName("btnJettisonQty4");
			this.btnJettisonQty4.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty4.setTabIndex(130);
			this.btnJettisonQty4.setText("88");
			this.btnJettisonQty4.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll3
			//
			this.btnJettisonAll3.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll3.setLocation(new java.awt.Point(100, 76));
			this.btnJettisonAll3.setName("btnJettisonAll3");
			this.btnJettisonAll3.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll3.setTabIndex(129);
			this.btnJettisonAll3.setText("All");
			this.btnJettisonAll3.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty3
			//
			this.btnJettisonQty3.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty3.setLocation(new java.awt.Point(68, 76));
			this.btnJettisonQty3.setName("btnJettisonQty3");
			this.btnJettisonQty3.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty3.setTabIndex(128);
			this.btnJettisonQty3.setText("88");
			this.btnJettisonQty3.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll2
			//
			this.btnJettisonAll2.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll2.setLocation(new java.awt.Point(100, 52));
			this.btnJettisonAll2.setName("btnJettisonAll2");
			this.btnJettisonAll2.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll2.setTabIndex(127);
			this.btnJettisonAll2.setText("All");
			this.btnJettisonAll2.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty2
			//
			this.btnJettisonQty2.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty2.setLocation(new java.awt.Point(68, 52));
			this.btnJettisonQty2.setName("btnJettisonQty2");
			this.btnJettisonQty2.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty2.setTabIndex(126);
			this.btnJettisonQty2.setText("88");
			this.btnJettisonQty2.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll1
			//
			this.btnJettisonAll1.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll1.setLocation(new java.awt.Point(100, 28));
			this.btnJettisonAll1.setName("btnJettisonAll1");
			this.btnJettisonAll1.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll1.setTabIndex(125);
			this.btnJettisonAll1.setText("All");
			this.btnJettisonAll1.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty1
			//
			this.btnJettisonQty1.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty1.setLocation(new java.awt.Point(68, 28));
			this.btnJettisonQty1.setName("btnJettisonQty1");
			this.btnJettisonQty1.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty1.setTabIndex(124);
			this.btnJettisonQty1.setText("88");
			this.btnJettisonQty1.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonAll0
			//
			this.btnJettisonAll0.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonAll0.setLocation(new java.awt.Point(100, 4));
			this.btnJettisonAll0.setName("btnJettisonAll0");
			this.btnJettisonAll0.setSize(new jwinforms.Size(32, 22));
			this.btnJettisonAll0.setTabIndex(123);
			this.btnJettisonAll0.setText("All");
			this.btnJettisonAll0.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// btnJettisonQty0
			//
			this.btnJettisonQty0.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnJettisonQty0.setLocation(new java.awt.Point(68, 4));
			this.btnJettisonQty0.setName("btnJettisonQty0");
			this.btnJettisonQty0.setSize(new jwinforms.Size(28, 22));
			this.btnJettisonQty0.setTabIndex(122);
			this.btnJettisonQty0.setText("88");
			this.btnJettisonQty0.setClick(new EventHandler<Object, EventArgs>()
{
public void handle(Object sender, jwinforms.EventArgs e)
	{
btnJettison_Click(sender, e);}});
			//
			// lblTradeCmdty9
			//
			this.lblTradeCmdty9.setAutoSize(true);
			this.lblTradeCmdty9.setLocation(new java.awt.Point(8, 224));
			this.lblTradeCmdty9.setName("lblTradeCmdty9");
			this.lblTradeCmdty9.setSize(new jwinforms.Size(40, 13));
			this.lblTradeCmdty9.setTabIndex(151);
			this.lblTradeCmdty9.setText("Robots");
			//
			// lblTradeCmdty8
			//
			this.lblTradeCmdty8.setAutoSize(true);
			this.lblTradeCmdty8.setLocation(new java.awt.Point(8, 200));
			this.lblTradeCmdty8.setName("lblTradeCmdty8");
			this.lblTradeCmdty8.setSize(new jwinforms.Size(51, 13));
			this.lblTradeCmdty8.setTabIndex(150);
			this.lblTradeCmdty8.setText("Narcotics");
			//
			// lblTradeCmdty2
			//
			this.lblTradeCmdty2.setAutoSize(true);
			this.lblTradeCmdty2.setLocation(new java.awt.Point(8, 56));
			this.lblTradeCmdty2.setName("lblTradeCmdty2");
			this.lblTradeCmdty2.setSize(new jwinforms.Size(30, 13));
			this.lblTradeCmdty2.setTabIndex(149);
			this.lblTradeCmdty2.setText("Food");
			//
			// lblTradeCmdty0
			//
			this.lblTradeCmdty0.setAutoSize(true);
			this.lblTradeCmdty0.setLocation(new java.awt.Point(8, 8));
			this.lblTradeCmdty0.setName("lblTradeCmdty0");
			this.lblTradeCmdty0.setSize(new jwinforms.Size(34, 13));
			this.lblTradeCmdty0.setTabIndex(148);
			this.lblTradeCmdty0.setText("Water");
			//
			// lblTradeCmdty1
			//
			this.lblTradeCmdty1.setAutoSize(true);
			this.lblTradeCmdty1.setLocation(new java.awt.Point(8, 32));
			this.lblTradeCmdty1.setName("lblTradeCmdty1");
			this.lblTradeCmdty1.setSize(new jwinforms.Size(27, 13));
			this.lblTradeCmdty1.setTabIndex(147);
			this.lblTradeCmdty1.setText("Furs");
			//
			// lblTradeCmdty6
			//
			this.lblTradeCmdty6.setAutoSize(true);
			this.lblTradeCmdty6.setLocation(new java.awt.Point(8, 152));
			this.lblTradeCmdty6.setName("lblTradeCmdty6");
			this.lblTradeCmdty6.setSize(new jwinforms.Size(50, 13));
			this.lblTradeCmdty6.setTabIndex(146);
			this.lblTradeCmdty6.setText("Medicine");
			//
			// lblTradeCmdty5
			//
			this.lblTradeCmdty5.setAutoSize(true);
			this.lblTradeCmdty5.setLocation(new java.awt.Point(8, 128));
			this.lblTradeCmdty5.setName("lblTradeCmdty5");
			this.lblTradeCmdty5.setSize(new jwinforms.Size(49, 13));
			this.lblTradeCmdty5.setTabIndex(145);
			this.lblTradeCmdty5.setText("Firearms");
			//
			// lblTradeCmdty4
			//
			this.lblTradeCmdty4.setAutoSize(true);
			this.lblTradeCmdty4.setLocation(new java.awt.Point(8, 104));
			this.lblTradeCmdty4.setName("lblTradeCmdty4");
			this.lblTradeCmdty4.setSize(new jwinforms.Size(41, 13));
			this.lblTradeCmdty4.setTabIndex(144);
			this.lblTradeCmdty4.setText("Games");
			//
			// lblTradeCmdty3
			//
			this.lblTradeCmdty3.setAutoSize(true);
			this.lblTradeCmdty3.setLocation(new java.awt.Point(8, 80));
			this.lblTradeCmdty3.setName("lblTradeCmdty3");
			this.lblTradeCmdty3.setSize(new jwinforms.Size(23, 13));
			this.lblTradeCmdty3.setTabIndex(143);
			this.lblTradeCmdty3.setText("Ore");
			//
			// lblTradeCmdty7
			//
			this.lblTradeCmdty7.setAutoSize(true);
			this.lblTradeCmdty7.setLocation(new java.awt.Point(8, 176));
			this.lblTradeCmdty7.setName("lblTradeCmdty7");
			this.lblTradeCmdty7.setSize(new jwinforms.Size(53, 13));
			this.lblTradeCmdty7.setTabIndex(142);
			this.lblTradeCmdty7.setText("Machines");
			//
			// lblBaysLabel
			//
			this.lblBaysLabel.setAutoSize(true);
			this.lblBaysLabel.setLocation(new java.awt.Point(144, 8));
			this.lblBaysLabel.setName("lblBaysLabel");
			this.lblBaysLabel.setSize(new jwinforms.Size(33, 13));
			this.lblBaysLabel.setTabIndex(152);
			this.lblBaysLabel.setText("Bays:");
			//
			// lblBays
			//
			this.lblBays.setLocation(new java.awt.Point(176, 8));
			this.lblBays.setName("lblBays");
			this.lblBays.setSize(new jwinforms.Size(33, 13));
			this.lblBays.setTabIndex(153);
			this.lblBays.setText("88/88");
			//
			// btnDone
			//
			this.btnDone.setDialogResult(DialogResult.Cancel);
			this.btnDone.setFlatStyle(jwinforms.FlatStyle.Flat);
			this.btnDone.setLocation(new java.awt.Point(87, 252));
			this.btnDone.setName("btnDone");
			this.btnDone.setSize(new jwinforms.Size(44, 22));
			this.btnDone.setTabIndex(154);
			this.btnDone.setText("Done");
			//
			// FormJettison
			//
			this.setAcceptButton(this.btnDone);
			this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
			this.setCancelButton(this.btnDone);
			this.setClientSize(new jwinforms.Size(218, 283));
			this.Controls.addAll(Arrays.asList(
											this.btnDone,
											this.lblBays,
											this.lblBaysLabel,
											this.lblTradeCmdty9,
											this.lblTradeCmdty8,
											this.lblTradeCmdty2,
											this.lblTradeCmdty0,
											this.lblTradeCmdty1,
											this.lblTradeCmdty6,
											this.lblTradeCmdty5,
											this.lblTradeCmdty4,
											this.lblTradeCmdty3,
											this.lblTradeCmdty7,
											this.btnJettisonAll9,
											this.btnJettisonQty9,
											this.btnJettisonAll8,
											this.btnJettisonQty8,
											this.btnJettisonAll7,
											this.btnJettisonQty7,
											this.btnJettisonAll6,
											this.btnJettisonQty6,
											this.btnJettisonAll5,
											this.btnJettisonQty5,
											this.btnJettisonAll4,
											this.btnJettisonQty4,
											this.btnJettisonAll3,
											this.btnJettisonQty3,
											this.btnJettisonAll2,
											this.btnJettisonQty2,
											this.btnJettisonAll1,
											this.btnJettisonQty1,
											this.btnJettisonAll0,
											this.btnJettisonQty0));
			this.setFormBorderStyle(FormBorderStyle.FixedDialog);
			this.setMaximizeBox(false);
			this.setMinimizeBox(false);
			this.setName("FormJettison");
			this.setShowInTaskbar(false);
			this.setStartPosition(FormStartPosition.CenterParent);
			this.setText("Jettison Cargo");
			this.ResumeLayout(false);
		}
		//#endregion

		private void Jettison(int tradeItem, boolean all)
		{
			game.CargoJettison(tradeItem, all, this);
			UpdateAll();
		}

		private void UpdateAll()
		{
			Ship	ship	= game.Commander().getShip();

			for (int i = 0; i < btnJettisonQty.length; i++)
				btnJettisonQty[i].setText(""+ship.Cargo()[i]);

			lblBays.setText(ship.FilledCargoBays() + "/" + ship.CargoBays());
		}

		//#endregion

		//#region Event Handlers

		private void btnJettison_Click(Object sender, EventArgs e)
		{
			String	name	= ((Button)sender).getName();
			boolean		all		= name.indexOf("Qty") < 0;
			int			index	= Integer.parseInt(name.substring(name.length() - 1));

			Jettison(index, all);
		}

		//#endregion
	}
