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

import jwinforms.*;
import spacetrader.*;
import spacetrader.enums.ShipyardId;
import spacetrader.stub.ArrayList;
import spacetrader.util.Util;

@SuppressWarnings({"unchecked","synthetic-access"})
public class FormMonster extends WinformForm
{
	// #region Constants

	private final int SplitSystems = 31;

	// #endregion

	// #region Control Declarations

	private jwinforms.Button btnClose;
	private jwinforms.Panel pnlMercs;
	private jwinforms.Panel pnlQuests;
	private jwinforms.Panel pnlShipyards;
	private jwinforms.PictureBox picLine1;
	private jwinforms.PictureBox picLine0;
	private jwinforms.PictureBox picLine2;
	private jwinforms.Label lblMercLabel;
	private jwinforms.Label lblQuestsLabel;
	private jwinforms.Label lblShipyardsLabel;
	private jwinforms.LinkLabel lblMercIDLabel;
	private jwinforms.LinkLabel lblMercNameLabel;
	private jwinforms.LinkLabel lblMercSkillLabelPilot;
	private jwinforms.LinkLabel lblMercSkillLabelFighter;
	private jwinforms.LinkLabel lblMercSkillLabelTrader;
	private jwinforms.LinkLabel lblMercSkillLabelEngineer;
	private jwinforms.LinkLabel lblMercSystemLabel;
	private jwinforms.LinkLabel lblQuestSystemLabel;
	private jwinforms.LinkLabel lblQuestDescLabel;
	private jwinforms.LinkLabel lblShipyardsSystemLabel;
	private jwinforms.LinkLabel lblShipyardsDescLabel;
	private jwinforms.Label lblMercIds;
	private jwinforms.Label lblMercNames;
	private jwinforms.Label lblMercSkillsPilot;
	private jwinforms.Label lblMercSkillsFighter;
	private jwinforms.Label lblMercSkillsTrader;
	private jwinforms.Label lblMercSkillsEngineer;
	private jwinforms.LinkLabel lblMercSystems;
	private jwinforms.LinkLabel lblMercSystems2;
	private jwinforms.LinkLabel lblQuestSystems;
	private jwinforms.Label lblQuests;
	private jwinforms.LinkLabel lblShipyardSystems;
	private jwinforms.Label lblShipyards;

	// #endregion

	// #region Member Declarations

	private Game game = Game.CurrentGame();
	private Integer[] mercIds;
	private Integer[] questSystemIds;
	private Integer[] shipyardSystemIds;

	// #endregion

	// #region Methods

	public FormMonster()
	{
		InitializeComponent();

		PopulateIdArrays();

		SetLabelHeights();

		UpdateAll();
	}

	// #region Windows Form Designer generated code
	// / <summary>
	// / Required method for Designer support - do not modify
	// / the contents of this method with the code editor.
	// / </summary>
	private void InitializeComponent()
	{
		this.btnClose = new jwinforms.Button();
		this.picLine1 = new jwinforms.PictureBox();
		this.picLine0 = new jwinforms.PictureBox();
		this.lblQuestsLabel = new jwinforms.Label();
		this.lblMercLabel = new jwinforms.Label();
		this.lblMercSkillLabelPilot = new jwinforms.LinkLabel();
		this.lblMercSkillLabelFighter = new jwinforms.LinkLabel();
		this.lblMercSkillLabelTrader = new jwinforms.LinkLabel();
		this.lblMercSkillLabelEngineer = new jwinforms.LinkLabel();
		this.lblMercSystemLabel = new jwinforms.LinkLabel();
		this.lblQuestSystemLabel = new jwinforms.LinkLabel();
		this.lblQuestDescLabel = new jwinforms.LinkLabel();
		this.lblMercIDLabel = new jwinforms.LinkLabel();
		this.lblMercNameLabel = new jwinforms.LinkLabel();
		this.lblShipyardsDescLabel = new jwinforms.LinkLabel();
		this.lblShipyardsSystemLabel = new jwinforms.LinkLabel();
		this.lblShipyardsLabel = new jwinforms.Label();
		this.pnlMercs = new jwinforms.Panel();
		this.lblMercSkillsPilot = new jwinforms.Label();
		this.lblMercSkillsFighter = new jwinforms.Label();
		this.lblMercSkillsTrader = new jwinforms.Label();
		this.lblMercSkillsEngineer = new jwinforms.Label();
		this.lblMercSystems = new jwinforms.LinkLabel();
		this.lblMercIds = new jwinforms.Label();
		this.lblMercNames = new jwinforms.Label();
		this.lblMercSystems2 = new jwinforms.LinkLabel();
		this.pnlQuests = new jwinforms.Panel();
		this.lblQuests = new jwinforms.Label();
		this.lblQuestSystems = new jwinforms.LinkLabel();
		this.pnlShipyards = new jwinforms.Panel();
		this.lblShipyards = new jwinforms.Label();
		this.lblShipyardSystems = new jwinforms.LinkLabel();
		this.picLine2 = new jwinforms.PictureBox();
		this.pnlMercs.SuspendLayout();
		this.pnlQuests.SuspendLayout();
		this.pnlShipyards.SuspendLayout();
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
		// picLine1
		//
		this.picLine1.setBackColor(java.awt.Color.darkGray);
		this.picLine1.setLocation(new java.awt.Point(4, 40));
		this.picLine1.setName("picLine1");
		this.picLine1.setSize(new jwinforms.Size(609, 1));
		this.picLine1.setTabIndex(133);
		this.picLine1.setTabStop(false);
		//
		// picLine0
		//
		this.picLine0.setBackColor(java.awt.Color.darkGray);
		this.picLine0.setLocation(new java.awt.Point(234, 8));
		this.picLine0.setName("picLine0");
		this.picLine0.setSize(new jwinforms.Size(1, 347));
		this.picLine0.setTabIndex(132);
		this.picLine0.setTabStop(false);
		//
		// lblQuestsLabel
		//
		this.lblQuestsLabel.setAutoSize(true);
		this.lblQuestsLabel.setFont(new Font("Microsoft Sans Serif", 10F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblQuestsLabel.setLocation(new java.awt.Point(88, 4));
		this.lblQuestsLabel.setName("lblQuestsLabel");
		this.lblQuestsLabel.setSize(new jwinforms.Size(50, 19));
		this.lblQuestsLabel.setTabIndex(134);
		this.lblQuestsLabel.setText("Quests");
		//
		// lblMercLabel
		//
		this.lblMercLabel.setAutoSize(true);
		this.lblMercLabel.setFont(new Font("Microsoft Sans Serif", 10F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblMercLabel.setLocation(new java.awt.Point(348, 4));
		this.lblMercLabel.setName("lblMercLabel");
		this.lblMercLabel.setSize(new jwinforms.Size(84, 19));
		this.lblMercLabel.setTabIndex(141);
		this.lblMercLabel.setText("Mercenaries");
		//
		// lblMercSkillLabelPilot
		//
		this.lblMercSkillLabelPilot.setAutoSize(true);
		this.lblMercSkillLabelPilot.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblMercSkillLabelPilot.setLocation(new java.awt.Point(341, 24));
		this.lblMercSkillLabelPilot.setName("lblMercSkillLabelPilot");
		this.lblMercSkillLabelPilot.setSize(new jwinforms.Size(12, 16));
		this.lblMercSkillLabelPilot.setTabIndex(7);
		this.lblMercSkillLabelPilot.setTabStop(true);
		this.lblMercSkillLabelPilot.setText("P");
		this.lblMercSkillLabelPilot.TextAlign = ContentAlignment.TopRight;
		this.lblMercSkillLabelPilot.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercSkillLabelFighter
		//
		this.lblMercSkillLabelFighter.setAutoSize(true);
		this.lblMercSkillLabelFighter.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold,
				GraphicsUnit.Point, ((byte) (0))));
		this.lblMercSkillLabelFighter.setLocation(new java.awt.Point(362, 24));
		this.lblMercSkillLabelFighter.setName("lblMercSkillLabelFighter");
		this.lblMercSkillLabelFighter.setSize(new jwinforms.Size(11, 16));
		this.lblMercSkillLabelFighter.setTabIndex(8);
		this.lblMercSkillLabelFighter.setTabStop(true);
		this.lblMercSkillLabelFighter.setText("F");
		this.lblMercSkillLabelFighter.TextAlign = ContentAlignment.TopRight;
		this.lblMercSkillLabelFighter.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercSkillLabelTrader
		//
		this.lblMercSkillLabelTrader.setAutoSize(true);
		this.lblMercSkillLabelTrader.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold,
				GraphicsUnit.Point, ((byte) (0))));
		this.lblMercSkillLabelTrader.setLocation(new java.awt.Point(382, 24));
		this.lblMercSkillLabelTrader.setName("lblMercSkillLabelTrader");
		this.lblMercSkillLabelTrader.setSize(new jwinforms.Size(11, 16));
		this.lblMercSkillLabelTrader.setTabIndex(9);
		this.lblMercSkillLabelTrader.setTabStop(true);
		this.lblMercSkillLabelTrader.setText("T");
		this.lblMercSkillLabelTrader.TextAlign = ContentAlignment.TopRight;
		this.lblMercSkillLabelTrader.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercSkillLabelEngineer
		//
		this.lblMercSkillLabelEngineer.setAutoSize(true);
		this.lblMercSkillLabelEngineer.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold,
				GraphicsUnit.Point, ((byte) (0))));
		this.lblMercSkillLabelEngineer.setLocation(new java.awt.Point(401, 24));
		this.lblMercSkillLabelEngineer.setName("lblMercSkillLabelEngineer");
		this.lblMercSkillLabelEngineer.setSize(new jwinforms.Size(12, 16));
		this.lblMercSkillLabelEngineer.setTabIndex(10);
		this.lblMercSkillLabelEngineer.setTabStop(true);
		this.lblMercSkillLabelEngineer.setText("E");
		this.lblMercSkillLabelEngineer.TextAlign = ContentAlignment.TopRight;
		this.lblMercSkillLabelEngineer.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercSystemLabel
		//
		this.lblMercSystemLabel.setAutoSize(true);
		this.lblMercSystemLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblMercSystemLabel.setLocation(new java.awt.Point(425, 24));
		this.lblMercSystemLabel.setName("lblMercSystemLabel");
		this.lblMercSystemLabel.setSize(new jwinforms.Size(43, 16));
		this.lblMercSystemLabel.setTabIndex(11);
		this.lblMercSystemLabel.setTabStop(true);
		this.lblMercSystemLabel.setText("System");
		this.lblMercSystemLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblQuestSystemLabel
		//
		this.lblQuestSystemLabel.setAutoSize(true);
		this.lblQuestSystemLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblQuestSystemLabel.setLocation(new java.awt.Point(13, 24));
		this.lblQuestSystemLabel.setName("lblQuestSystemLabel");
		this.lblQuestSystemLabel.setSize(new jwinforms.Size(43, 16));
		this.lblQuestSystemLabel.setTabIndex(1);
		this.lblQuestSystemLabel.setTabStop(true);
		this.lblQuestSystemLabel.setText("System");
		this.lblQuestSystemLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblQuestDescLabel
		//
		this.lblQuestDescLabel.setAutoSize(true);
		this.lblQuestDescLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblQuestDescLabel.setLocation(new java.awt.Point(85, 24));
		this.lblQuestDescLabel.setName("lblQuestDescLabel");
		this.lblQuestDescLabel.setSize(new jwinforms.Size(63, 16));
		this.lblQuestDescLabel.setTabIndex(2);
		this.lblQuestDescLabel.setTabStop(true);
		this.lblQuestDescLabel.setText("Description");
		this.lblQuestDescLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercIDLabel
		//
		this.lblMercIDLabel.setAutoSize(true);
		this.lblMercIDLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblMercIDLabel.setLocation(new java.awt.Point(247, 24));
		this.lblMercIDLabel.setName("lblMercIDLabel");
		this.lblMercIDLabel.setSize(new jwinforms.Size(16, 16));
		this.lblMercIDLabel.setTabIndex(5);
		this.lblMercIDLabel.setTabStop(true);
		this.lblMercIDLabel.setText("ID");
		this.lblMercIDLabel.TextAlign = ContentAlignment.TopRight;
		this.lblMercIDLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblMercNameLabel
		//
		this.lblMercNameLabel.setAutoSize(true);
		this.lblMercNameLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblMercNameLabel.setLocation(new java.awt.Point(268, 24));
		this.lblMercNameLabel.setName("lblMercNameLabel");
		this.lblMercNameLabel.setSize(new jwinforms.Size(35, 16));
		this.lblMercNameLabel.setTabIndex(6);
		this.lblMercNameLabel.setTabStop(true);
		this.lblMercNameLabel.setText("Name");
		this.lblMercNameLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblShipyardsDescLabel
		//
		this.lblShipyardsDescLabel.setAutoSize(true);
		this.lblShipyardsDescLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblShipyardsDescLabel.setLocation(new java.awt.Point(85, 258));
		this.lblShipyardsDescLabel.setName("lblShipyardsDescLabel");
		this.lblShipyardsDescLabel.setSize(new jwinforms.Size(63, 16));
		this.lblShipyardsDescLabel.setTabIndex(4);
		this.lblShipyardsDescLabel.setTabStop(true);
		this.lblShipyardsDescLabel.setText("Description");
		this.lblShipyardsDescLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblShipyardsSystemLabel
		//
		this.lblShipyardsSystemLabel.setAutoSize(true);
		this.lblShipyardsSystemLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold,
				GraphicsUnit.Point, ((byte) (0))));
		this.lblShipyardsSystemLabel.setLocation(new java.awt.Point(13, 258));
		this.lblShipyardsSystemLabel.setName("lblShipyardsSystemLabel");
		this.lblShipyardsSystemLabel.setSize(new jwinforms.Size(43, 16));
		this.lblShipyardsSystemLabel.setTabIndex(3);
		this.lblShipyardsSystemLabel.setTabStop(true);
		this.lblShipyardsSystemLabel.setText("System");
		this.lblShipyardsSystemLabel.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SortLinkClicked(sender, e);
			}
		};
		//
		// lblShipyardsLabel
		//
		this.lblShipyardsLabel.setAutoSize(true);
		this.lblShipyardsLabel.setFont(new Font("Microsoft Sans Serif", 10F, FontStyle.Bold, GraphicsUnit.Point,
				((byte) (0))));
		this.lblShipyardsLabel.setLocation(new java.awt.Point(79, 238));
		this.lblShipyardsLabel.setName("lblShipyardsLabel");
		this.lblShipyardsLabel.setSize(new jwinforms.Size(68, 19));
		this.lblShipyardsLabel.setTabIndex(155);
		this.lblShipyardsLabel.setText("Shipyards");
		//
		// pnlMercs
		//
		this.pnlMercs.AutoScroll = true;
		this.pnlMercs.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		this.pnlMercs.Controls.add(this.lblMercSkillsPilot);
		this.pnlMercs.Controls.add(this.lblMercSkillsFighter);
		this.pnlMercs.Controls.add(this.lblMercSkillsTrader);
		this.pnlMercs.Controls.add(this.lblMercSkillsEngineer);
		this.pnlMercs.Controls.add(this.lblMercSystems);
		this.pnlMercs.Controls.add(this.lblMercIds);
		this.pnlMercs.Controls.add(this.lblMercNames);
		this.pnlMercs.Controls.add(this.lblMercSystems2);
		this.pnlMercs.setLocation(new java.awt.Point(239, 44));
		this.pnlMercs.setName("pnlMercs");
		this.pnlMercs.setSize(new jwinforms.Size(371, 307));
		this.pnlMercs.setTabIndex(158);
		//
		// lblMercSkillsPilot
		//
		this.lblMercSkillsPilot.setLocation(new java.awt.Point(93, 4));
		this.lblMercSkillsPilot.setName("lblMercSkillsPilot");
		this.lblMercSkillsPilot.setSize(new jwinforms.Size(20, 563));
		this.lblMercSkillsPilot.setTabIndex(144);
		this.lblMercSkillsPilot.TextAlign = ContentAlignment.TopRight;
		//
		// lblMercSkillsFighter
		//
		this.lblMercSkillsFighter.setLocation(new java.awt.Point(113, 4));
		this.lblMercSkillsFighter.setName("lblMercSkillsFighter");
		this.lblMercSkillsFighter.setSize(new jwinforms.Size(20, 563));
		this.lblMercSkillsFighter.setTabIndex(145);
		this.lblMercSkillsFighter.TextAlign = ContentAlignment.TopRight;
		//
		// lblMercSkillsTrader
		//
		this.lblMercSkillsTrader.setLocation(new java.awt.Point(133, 4));
		this.lblMercSkillsTrader.setName("lblMercSkillsTrader");
		this.lblMercSkillsTrader.setSize(new jwinforms.Size(20, 563));
		this.lblMercSkillsTrader.setTabIndex(146);
		this.lblMercSkillsTrader.TextAlign = ContentAlignment.TopRight;
		//
		// lblMercSkillsEngineer
		//
		this.lblMercSkillsEngineer.setLocation(new java.awt.Point(153, 4));
		this.lblMercSkillsEngineer.setName("lblMercSkillsEngineer");
		this.lblMercSkillsEngineer.setSize(new jwinforms.Size(20, 563));
		this.lblMercSkillsEngineer.setTabIndex(147);
		this.lblMercSkillsEngineer.TextAlign = ContentAlignment.TopRight;
		//
		// lblMercSystems
		//
		this.lblMercSystems.LinkArea = new jwinforms.LinkArea(0, 0);
		this.lblMercSystems.setLocation(new java.awt.Point(185, 4));
		this.lblMercSystems.setName("lblMercSystems");
		this.lblMercSystems.setSize(new jwinforms.Size(160, 387));
		this.lblMercSystems.setTabIndex(14);
		this.lblMercSystems.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SystemLinkClicked(sender, e);
			}
		};
		//
		// lblMercIds
		//
		this.lblMercIds.setLocation(new java.awt.Point(0, 4));
		this.lblMercIds.setName("lblMercIds");
		this.lblMercIds.setSize(new jwinforms.Size(23, 563));
		this.lblMercIds.setTabIndex(142);
		this.lblMercIds.TextAlign = ContentAlignment.TopRight;
		//
		// lblMercNames
		//
		this.lblMercNames.setLocation(new java.awt.Point(28, 4));
		this.lblMercNames.setName("lblMercNames");
		this.lblMercNames.setSize(new jwinforms.Size(69, 563));
		this.lblMercNames.setTabIndex(141);
		//
		// lblMercSystems2
		//
		this.lblMercSystems2.LinkArea = new jwinforms.LinkArea(0, 0);
		this.lblMercSystems2.setLocation(new java.awt.Point(185, 391));
		this.lblMercSystems2.setName("lblMercSystems2");
		this.lblMercSystems2.setSize(new jwinforms.Size(160, 175));
		this.lblMercSystems2.setTabIndex(148);
		this.lblMercSystems2.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SystemLinkClicked(sender, e);
			}
		};
		//
		// pnlQuests
		//
		this.pnlQuests.AutoScroll = true;
		this.pnlQuests.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		this.pnlQuests.Controls.add(this.lblQuests);
		this.pnlQuests.Controls.add(this.lblQuestSystems);
		this.pnlQuests.setLocation(new java.awt.Point(8, 44));
		this.pnlQuests.setName("pnlQuests");
		this.pnlQuests.setSize(new jwinforms.Size(222, 182));
		this.pnlQuests.setTabIndex(159);
		//
		// lblQuests
		//
		this.lblQuests.setLocation(new java.awt.Point(76, 4));
		this.lblQuests.setName("lblQuests");
		this.lblQuests.setSize(new jwinforms.Size(120, 350));
		this.lblQuests.setTabIndex(48);
		//
		// lblQuestSystems
		//
		this.lblQuestSystems.LinkArea = new jwinforms.LinkArea(0, 0);
		this.lblQuestSystems.setLocation(new java.awt.Point(4, 4));
		this.lblQuestSystems.setName("lblQuestSystems");
		this.lblQuestSystems.setSize(new jwinforms.Size(68, 350));
		this.lblQuestSystems.setTabIndex(12);
		this.lblQuestSystems.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SystemLinkClicked(sender, e);
			}
		};
		//
		// pnlShipyards
		//
		this.pnlShipyards.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
		this.pnlShipyards.Controls.add(this.lblShipyards);
		this.pnlShipyards.Controls.add(this.lblShipyardSystems);
		this.pnlShipyards.setLocation(new java.awt.Point(8, 278));
		this.pnlShipyards.setName("pnlShipyards");
		this.pnlShipyards.setSize(new jwinforms.Size(222, 73));
		this.pnlShipyards.setTabIndex(160);
		//
		// lblShipyards
		//
		this.lblShipyards.setLocation(new java.awt.Point(76, 4));
		this.lblShipyards.setName("lblShipyards");
		this.lblShipyards.setSize(new jwinforms.Size(120, 63));
		this.lblShipyards.setTabIndex(158);
		//
		// lblShipyardSystems
		//
		this.lblShipyardSystems.LinkArea = new jwinforms.LinkArea(0, 0);
		this.lblShipyardSystems.setLocation(new java.awt.Point(4, 4));
		this.lblShipyardSystems.setName("lblShipyardSystems");
		this.lblShipyardSystems.setSize(new jwinforms.Size(68, 63));
		this.lblShipyardSystems.setTabIndex(13);
		this.lblShipyardSystems.LinkClicked = new EventHandler<Object, LinkLabelLinkClickedEventArgs>()
		{
			public void handle(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
			{
				SystemLinkClicked(sender, e);
			}
		};
		//
		// picLine2
		//
		this.picLine2.setBackColor(java.awt.Color.darkGray);
		this.picLine2.setLocation(new java.awt.Point(4, 274));
		this.picLine2.setName("picLine2");
		this.picLine2.setSize(new jwinforms.Size(222, 1));
		this.picLine2.setTabIndex(161);
		this.picLine2.setTabStop(false);
		//
		// FormMonster
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(this.btnClose);
		this.setClientSize(new jwinforms.Size(617, 358));
		this.Controls.add(this.picLine2);
		this.Controls.add(this.pnlShipyards);
		this.Controls.add(this.pnlQuests);
		this.Controls.add(this.picLine1);
		this.Controls.add(this.picLine0);
		this.Controls.add(this.pnlMercs);
		this.Controls.add(this.lblShipyardsLabel);
		this.Controls.add(this.lblShipyardsDescLabel);
		this.Controls.add(this.lblShipyardsSystemLabel);
		this.Controls.add(this.lblMercNameLabel);
		this.Controls.add(this.lblMercIDLabel);
		this.Controls.add(this.lblQuestDescLabel);
		this.Controls.add(this.lblQuestSystemLabel);
		this.Controls.add(this.lblMercSystemLabel);
		this.Controls.add(this.lblMercSkillLabelEngineer);
		this.Controls.add(this.lblMercSkillLabelTrader);
		this.Controls.add(this.lblMercSkillLabelFighter);
		this.Controls.add(this.lblMercSkillLabelPilot);
		this.Controls.add(this.lblMercLabel);
		this.Controls.add(this.lblQuestsLabel);
		this.Controls.add(this.btnClose);
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormMonster");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Monster.com Job Listing");
		this.pnlMercs.ResumeLayout(false);
		this.pnlQuests.ResumeLayout(false);
		this.pnlShipyards.ResumeLayout(false);
		this.ResumeLayout(false);

	}

	// #endregion

	private int Compare(int a, int b, String sortWhat, String sortBy)
	{
		int compareVal = 0;

		if (sortWhat == "M") // Mercenaries
		{
			CrewMember A = game.Mercenaries()[a];
			CrewMember B = game.Mercenaries()[b];

			boolean strCompare = false;
			Object valA = null;
			Object valB = null;

			switch (SomeStringsForSwitch.valueOf(sortBy))
			{
			case I: // Id
				valA = A.Id().CastToInt();
				valB = B.Id().CastToInt();
				break;
			case N: // Name
				valA = A.Name();
				valB = B.Name();
				strCompare = true;
				break;
			case P: // Pilot
				valA = A.Pilot();
				valB = B.Pilot();
				break;
			case F: // Fighter
				valA = A.Fighter();
				valB = B.Fighter();
				break;
			case T: // Trader
				valA = A.Trader();
				valB = B.Trader();
				break;
			case E: // Engineer
				valA = A.Engineer();
				valB = B.Engineer();
				break;
			case S: // System
				valA = CurrentSystemDisplay(A);
				valB = CurrentSystemDisplay(B);
				strCompare = true;
				break;
			}

			if (strCompare)
				compareVal = ((String) valA).compareTo((String) valB);
			else
				compareVal = ((Integer) valA).compareTo((Integer) valB);

			// Secondary sort by Name
			if (compareVal == 0 && sortBy != "N")
				compareVal = A.Name().compareTo(B.Name());
		} else
		{
			StarSystem A = game.Universe()[a];
			StarSystem B = game.Universe()[b];

			if (sortBy == "D") // Description
			{
				String nameA = "";
				String nameB = "";

				switch (SomeStringsForSwitch.valueOf(sortWhat))
				{
				case Q: // Quests
					nameA = A.SpecialEvent().Title();
					nameB = B.SpecialEvent().Title();
					break;
				case S: // Shipyards
					nameA = A.Shipyard().Name();
					nameB = B.Shipyard().Name();
					break;
				}

				compareVal = nameA.compareTo(nameB);
			}

			if (compareVal == 0) // Default sort - System Name
			{
				compareVal = A.Name().compareTo(B.Name());
			}
		}

		return compareVal;
	}

	private String CurrentSystemDisplay(CrewMember merc)
	{
		return (merc.CurrentSystem() == null ? Strings.Unknown
				: (game.Commander().getShip().HasCrew(merc.Id()) ? Functions.StringVars(Strings.MercOnBoard, merc
						.CurrentSystem().Name()) : merc.CurrentSystem().Name()));
	}

	private void PopulateIdArrays()
	{
		// Populate the mercenary ids array.
		ArrayList ids = new ArrayList();
		for (CrewMember merc : game.Mercenaries())
		{
			if (!Util.ArrayContains(Consts.SpecialCrewMemberIds, merc.Id()))
				ids.add(merc.Id().CastToInt());
		}
		mercIds = (Integer[]) ids.toArray(new Integer[0]);

		// Populate the quest and shipyard system ids arrays.
		ArrayList quests = new ArrayList();
		ArrayList shipyards = new ArrayList();
		for (StarSystem system : game.Universe())
		{
			if (system.ShowSpecialButton())
				quests.add(system.Id().CastToInt());

			if (system.ShipyardId() != ShipyardId.NA)
				shipyards.add(system.Id().CastToInt());
		}
		questSystemIds = (Integer[]) quests.toArray(new Integer[0]);
		shipyardSystemIds = (Integer[]) shipyards.toArray(new Integer[0]);

		// Sort the arrays.
		Sort("M", "N"); // Sort mercenaries by name.
		Sort("Q", "S"); // Sort quests by system name.
		Sort("S", "S"); // Sort shipyards by system name.
	}

	private void SetLabelHeights()
	{

		int questHeight = (int) Math.ceil(questSystemIds.length * 12.5) + 1;
		lblQuests.setHeight(questHeight);
		lblQuestSystems.setHeight(questHeight);

		int shipyardHeight = (int) Math.ceil(shipyardSystemIds.length * 12.5) + 1;
		lblShipyards.setHeight(shipyardHeight);
		lblShipyardSystems.setHeight(shipyardHeight);

		int mercHeight = (int) Math.ceil(mercIds.length * 12.5) + 1;
		lblMercIds.setHeight(mercHeight);
		lblMercNames.setHeight(mercHeight);
		lblMercSkillsPilot.setHeight(mercHeight);
		lblMercSkillsFighter.setHeight(mercHeight);
		lblMercSkillsTrader.setHeight(mercHeight);
		lblMercSkillsEngineer.setHeight(mercHeight);

		// Due to a limitation of the LinkLabel control, no more than 32 links
		// can exist in the LinkLabel.
		lblMercSystems.setHeight((int) Math.ceil(Math.min(mercIds.length, SplitSystems) * 12.5) + 1);
		if (mercIds.length > SplitSystems)
		{
			lblMercSystems2.setVisible(true);
			lblMercSystems2.setHeight((int) Math.ceil((mercIds.length - SplitSystems) * 12.5) + 1);
		} else
		{
			lblMercSystems2.setVisible(false);
			lblMercSystems2.setTop(lblMercSystems.getTop());
		}
	}

	private void Sort(String sortWhat, String sortBy)
	{
		Integer[] array = null;
		switch (SomeStringsForSwitch.valueOf(sortWhat))
		{
		case M:
			array = mercIds;
			break;
		case Q:
			array = questSystemIds;
			break;
		case S:
			array = shipyardSystemIds;
			break;
		}

		for (int i = 0; i < array.length - 1; i++)
		{
			for (int j = 0; j < array.length - i - 1; j++)
			{
				if (Compare(array[j], array[j + 1], sortWhat, sortBy) > 0)
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private void UpdateAll()
	{
		UpdateMercs();
		UpdateQuests();
		UpdateShipyards();
	}

	private void UpdateMercs()
	{
		lblMercIds.setText("");
		lblMercNames.setText("");
		lblMercSkillsPilot.setText("");
		lblMercSkillsFighter.setText("");
		lblMercSkillsTrader.setText("");
		lblMercSkillsEngineer.setText("");
		lblMercSystems.setText("");
		lblMercSystems2.setText("");
		lblMercSystems.Links.clear();
		lblMercSystems2.Links.clear();

		for (int i = 0; i < mercIds.length; i++)
		{
			CrewMember merc = game.Mercenaries()[mercIds[i]];
			boolean link = merc.CurrentSystem() != null && !game.Commander().getShip().HasCrew(merc.Id());

			lblMercIds.setText(lblMercIds.getText() + ((merc.Id().CastToInt()) + Strings.newline));
			lblMercNames.setText(lblMercNames.getText() + (merc.Name() + Strings.newline));
			lblMercSkillsPilot.setText(lblMercSkillsPilot.getText() + (merc.Pilot() + Strings.newline));
			lblMercSkillsFighter.setText(lblMercSkillsFighter.getText() + (merc.Fighter() + Strings.newline));
			lblMercSkillsTrader.setText(lblMercSkillsTrader.getText() + (merc.Trader() + Strings.newline));
			lblMercSkillsEngineer.setText(lblMercSkillsEngineer.getText() + (merc.Engineer() + Strings.newline));

			if (i < SplitSystems)
			{
				int start = lblMercSystems.getText().length();
				lblMercSystems.setText(lblMercSystems.getText() + (CurrentSystemDisplay(merc) + Strings.newline));
				if (link)
					lblMercSystems.Links.add(start, merc.CurrentSystem().Name().length(), merc.CurrentSystem().Name());
			} else
			{
				int start = lblMercSystems2.getText().length();
				lblMercSystems2.setText(lblMercSystems2.getText() + (CurrentSystemDisplay(merc) + Strings.newline));
				if (link)
					lblMercSystems2.Links.add(start, merc.CurrentSystem().Name().length(), merc.CurrentSystem().Name());
			}
		}

		lblMercIds.setText(lblMercIds.getText().trim());
		lblMercNames.setText(lblMercNames.getText().trim());
		lblMercSkillsPilot.setText(lblMercSkillsPilot.getText().trim());
		lblMercSkillsFighter.setText(lblMercSkillsFighter.getText().trim());
		lblMercSkillsTrader.setText(lblMercSkillsTrader.getText().trim());
		lblMercSkillsEngineer.setText(lblMercSkillsEngineer.getText().trim());
		lblMercSystems.setText(lblMercSystems.getText().trim());
		lblMercSystems2.setText(lblMercSystems2.getText().trim());
	}

	private void UpdateQuests()
	{
		lblQuestSystems.setText("");
		lblQuests.setText("");
		lblQuestSystems.Links.clear();

		for (int i = 0; i < questSystemIds.length; i++)
		{
			StarSystem system = game.Universe()[questSystemIds[i]];
			int start = lblQuestSystems.getText().length();

			lblQuestSystems.setText(lblQuestSystems.getText() + (system.Name() + Strings.newline));
			lblQuests.setText(lblQuests.getText() + (system.SpecialEvent().Title() + Strings.newline));

			lblQuestSystems.Links.add(start, system.Name().length(), system.Name());
		}

		lblQuestSystems.setText(lblQuestSystems.getText().trim());
		lblQuests.setText(lblQuests.getText().trim());
	}

	private void UpdateShipyards()
	{
		lblShipyardSystems.setText("");
		lblShipyards.setText("");
		lblShipyardSystems.Links.clear();

		for (int i = 0; i < shipyardSystemIds.length; i++)
		{
			StarSystem system = game.Universe()[shipyardSystemIds[i]];
			int start = lblShipyardSystems.getText().length();

			lblShipyardSystems.setText(lblShipyardSystems.getText() + (system.Name() + Strings.newline));
			lblShipyards.setText(lblShipyards.getText() + (system.Shipyard().Name() + Strings.newline));

			lblShipyardSystems.Links.add(start, system.Name().length(), system.Name());
		}

		lblShipyardSystems.setText(lblShipyardSystems.getText().trim());
		lblShipyards.setText(lblShipyards.getText().trim());
	}

	// #endregion

	// #region Event Handlers

	private void SystemLinkClicked(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
	{
		Game.CurrentGame().setSelectedSystemByName(e.Link.LinkData.toString());
		Game.CurrentGame().getParentWindow().UpdateAll();
		Close();
	}

	private void SortLinkClicked(Object sender, jwinforms.LinkLabelLinkClickedEventArgs e)
	{
		Sort(((LinkLabel) sender).getName().substring(3, 1), ((LinkLabel) sender).getText().substring(0, 1));
		UpdateAll();
	}

	// #endregion
}
