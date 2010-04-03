/*******************************************************************************
 *
 * Space Trader for Windows 2.00
 *
 * Copyright (C) 2005 Jay French, All Rights Reserved
 *
 * Additional coding by David Pierron Original coding by Pieter Spronck, Sam Anderson,
 * Samuel Goldstein, Matt Lee
 *
 * This program is free software; you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * If you'd like a copy of the GNU General Public License, go to
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * You can contact the author at spacetrader@frenchfryz.com
 *
 ******************************************************************************/
package spacetrader.gui;

import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.FormStartPosition;
import spacetrader.Functions;
import spacetrader.Game;

public class FormCosts extends SpaceTraderForm
{
	private jwinforms.Button btnClose;
	private jwinforms.Label lblMerc;
	private jwinforms.Label lblIns;
	private jwinforms.Label lblInt;
	private jwinforms.Label lblTax;
	private jwinforms.Label lblTotal;
	private jwinforms.Label lblTotalLabel;
	private jwinforms.Label lblTaxLabel;
	private jwinforms.Label lblIntLabel;
	private jwinforms.Label lblMercLabel;
	private jwinforms.Label lblInsLabel;
	private jwinforms.PictureBox picLine;

	private final Game game = Game.CurrentGame();

	public FormCosts()
	{
		InitializeComponent();

		lblMerc.setText(Functions.FormatMoney(game.MercenaryCosts()));
		lblIns.setText(Functions.FormatMoney(game.InsuranceCosts()));
		lblInt.setText(Functions.FormatMoney(game.InterestCosts()));
		lblTax.setText(Functions.FormatMoney(game.WormholeCosts()));
		lblTotal.setText(Functions.FormatMoney(game.CurrentCosts()));
	}

	private void InitializeComponent()
	{
		btnClose = new jwinforms.Button();
		lblMerc = new jwinforms.Label();
		lblIns = new jwinforms.Label();
		lblInt = new jwinforms.Label();
		lblTax = new jwinforms.Label();
		lblTotal = new jwinforms.Label();
		lblTotalLabel = new jwinforms.Label();
		lblTaxLabel = new jwinforms.Label();
		lblIntLabel = new jwinforms.Label();
		lblMercLabel = new jwinforms.Label();
		lblInsLabel = new jwinforms.Label();
		picLine = new jwinforms.PictureBox();
		this.SuspendLayout();
		//
		// btnClose
		//
		btnClose.setDialogResult(DialogResult.Cancel);
		btnClose.setLocation(new java.awt.Point(-32, -32));
		btnClose.setName("btnClose");
		btnClose.setSize(new jwinforms.Size(32, 32));
		btnClose.setTabIndex(32);
		btnClose.setTabStop(false);
		btnClose.setText("X");
		//
		// lblMerc
		//
		lblMerc.setLocation(new java.awt.Point(104, 8));
		lblMerc.setName("lblMerc");
		lblMerc.setSize(new jwinforms.Size(39, 13));
		lblMerc.setTabIndex(36);
		lblMerc.setText("888 cr.");
		lblMerc.TextAlign = ContentAlignment.TopRight;
		//
		// lblIns
		//
		lblIns.setLocation(new java.awt.Point(104, 24));
		lblIns.setName("lblIns");
		lblIns.setSize(new jwinforms.Size(39, 13));
		lblIns.setTabIndex(40);
		lblIns.setText("888 cr.");
		lblIns.TextAlign = ContentAlignment.TopRight;
		//
		// lblInt
		//
		lblInt.setLocation(new java.awt.Point(104, 40));
		lblInt.setName("lblInt");
		lblInt.setSize(new jwinforms.Size(39, 13));
		lblInt.setTabIndex(44);
		lblInt.setText("888 cr.");
		lblInt.TextAlign = ContentAlignment.TopRight;
		//
		// lblTax
		//
		lblTax.setLocation(new java.awt.Point(104, 56));
		lblTax.setName("lblTax");
		lblTax.setSize(new jwinforms.Size(39, 13));
		lblTax.setTabIndex(48);
		lblTax.setText("888 cr.");
		lblTax.TextAlign = ContentAlignment.TopRight;
		//
		// lblTotal
		//
		lblTotal.setLocation(new java.awt.Point(104, 79));
		lblTotal.setName("lblTotal");
		lblTotal.setSize(new jwinforms.Size(39, 13));
		lblTotal.setTabIndex(52);
		lblTotal.setText("888 cr.");
		lblTotal.TextAlign = ContentAlignment.TopRight;
		//
		// lblTotalLabel
		//
		lblTotalLabel.setAutoSize(true);
		lblTotalLabel.setFont(FontCollection.bold825);
		lblTotalLabel.setLocation(new java.awt.Point(8, 79));
		lblTotalLabel.setName("lblTotalLabel");
		lblTotalLabel.setSize(new jwinforms.Size(34, 13));
		lblTotalLabel.setTabIndex(7);
		lblTotalLabel.setText("Total:");
		//
		// lblTaxLabel
		//
		lblTaxLabel.setAutoSize(true);
		lblTaxLabel.setFont(FontCollection.bold825);
		lblTaxLabel.setLocation(new java.awt.Point(8, 56));
		lblTaxLabel.setName("lblTaxLabel");
		lblTaxLabel.setSize(new jwinforms.Size(84, 13));
		lblTaxLabel.setTabIndex(6);
		lblTaxLabel.setText("Wormhole Tax:");
		//
		// lblIntLabel
		//
		lblIntLabel.setAutoSize(true);
		lblIntLabel.setFont(FontCollection.bold825);
		lblIntLabel.setLocation(new java.awt.Point(8, 40));
		lblIntLabel.setName("lblIntLabel");
		lblIntLabel.setSize(new jwinforms.Size(47, 13));
		lblIntLabel.setTabIndex(5);
		lblIntLabel.setText("Interest:");
		//
		// lblMercLabel
		//
		lblMercLabel.setAutoSize(true);
		lblMercLabel.setFont(FontCollection.bold825);
		lblMercLabel.setLocation(new java.awt.Point(8, 8));
		lblMercLabel.setName("lblMercLabel");
		lblMercLabel.setSize(new jwinforms.Size(72, 13));
		lblMercLabel.setTabIndex(4);
		lblMercLabel.setText("Mercenaries:");
		//
		// lblInsLabel
		//
		lblInsLabel.setAutoSize(true);
		lblInsLabel.setFont(FontCollection.bold825);
		lblInsLabel.setLocation(new java.awt.Point(8, 24));
		lblInsLabel.setName("lblInsLabel");
		lblInsLabel.setSize(new jwinforms.Size(59, 13));
		lblInsLabel.setTabIndex(3);
		lblInsLabel.setText("Insurance:");
		//
		// picLine
		//
		picLine.setBackColor(java.awt.Color.darkGray);
		picLine.setLocation(new java.awt.Point(6, 73));
		picLine.setName("picLine");
		picLine.setSize(new jwinforms.Size(138, 1));
		picLine.setTabIndex(134);
		picLine.setTabStop(false);
		//
		// FormCosts
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(btnClose);
		this.setClientSize(new jwinforms.Size(148, 99));
		Controls.addAll(picLine, lblTotal, lblTax, lblInt, lblIns, lblMerc,
				btnClose, lblInsLabel, lblTotalLabel, lblTaxLabel, lblIntLabel,
				lblMercLabel);
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormCosts");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Cost Specification");
	}
}
