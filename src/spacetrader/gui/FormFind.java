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
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.FormStartPosition;
import jwinforms.WinformForm;

public class FormFind extends WinformForm
{
	// #region Control Declarations

	private jwinforms.Label lblText;
	private jwinforms.Button btnOk;
	private jwinforms.Button btnCancel;
	private jwinforms.TextBox txtSystem;
	private jwinforms.CheckBox chkTrack;
	private static String text = "";
	private static boolean boxChecked = false;

	// #endregion

	// #region Methods

	public FormFind()
	{
		InitializeComponent();

		txtSystem.setText(text);
		chkTrack.setChecked(boxChecked);
	}

	// #region Windows Form Designer generated code
	// / <summary>
	// / Required method for Designer support - do not modify
	// / the contents of this method with the code editor.
	// / </summary>
	private void InitializeComponent()
	{
		this.lblText = new jwinforms.Label();
		this.btnOk = new jwinforms.Button();
		this.btnCancel = new jwinforms.Button();
		this.txtSystem = new jwinforms.TextBox();
		this.chkTrack = new jwinforms.CheckBox();
		this.SuspendLayout();
		//
		// lblText
		//
		this.lblText.setAutoSize(true);
		this.lblText.setLocation(new java.awt.Point(8, 8));
		this.lblText.setName("lblText");
		this.lblText.setSize(new jwinforms.Size(177, 13));
		this.lblText.setTabIndex(3);
		this.lblText.setText("Which system are you looking for?");
		//
		// btnOk
		//
		this.btnOk.setDialogResult(DialogResult.OK);
		this.btnOk.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnOk.setLocation(new java.awt.Point(43, 68));
		this.btnOk.setName("btnOk");
		this.btnOk.setSize(new jwinforms.Size(40, 22));
		this.btnOk.setTabIndex(3);
		this.btnOk.setText("Ok");
		//
		// btnCancel
		//
		this.btnCancel.setDialogResult(DialogResult.Cancel);
		this.btnCancel.setFlatStyle(jwinforms.FlatStyle.Flat);
		this.btnCancel.setLocation(new java.awt.Point(91, 68));
		this.btnCancel.setName("btnCancel");
		this.btnCancel.setSize(new jwinforms.Size(50, 22));
		this.btnCancel.setTabIndex(4);
		this.btnCancel.setText("Cancel");
		//
		// txtSystem
		//
		this.txtSystem.setLocation(new java.awt.Point(8, 24));
		this.txtSystem.setName("txtSystem");
		this.txtSystem.setSize(new jwinforms.Size(168, 20));
		this.txtSystem.setTabIndex(1);
		this.txtSystem.setText("");
		//
		// chkTrack
		//
		this.chkTrack.setLocation(new java.awt.Point(8, 48));
		this.chkTrack.setName("chkTrack");
		this.chkTrack.setSize(new jwinforms.Size(112, 16));
		this.chkTrack.setTabIndex(2);
		this.chkTrack.setText("Track this system");
		//
		// FormFind
		//
		this.setAcceptButton(this.btnOk);
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setCancelButton(this.btnCancel);
		this.setClientSize(new jwinforms.Size(184, 97));
		this.setControlBox(false);
		this.Controls.addAll(this.chkTrack, this.txtSystem,
				this.btnCancel, this.btnOk, this.lblText);
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setName("FormFind");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Find System");
		this.Closed = new EventHandler<Object, EventArgs>()
		{
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				FormFind_Closed(sender, e);
			}
		};
		this.ResumeLayout(false);
	}

	// #endregion

	// #endregion

	// #region Event Handlers

	private void FormFind_Closed(Object sender, EventArgs e)
	{
		text = txtSystem.getText();
		boxChecked = chkTrack.isChecked();
	}

	// #endregion

	// #region Properties
	public String SystemName()
	{
		return txtSystem.getText();
	}

	public boolean TrackSystem()
	{
		return chkTrack.isChecked();
	}
}
