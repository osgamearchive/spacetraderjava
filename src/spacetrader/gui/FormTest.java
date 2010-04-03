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

import java.util.Arrays;

import jwinforms.*;
import spacetrader.Consts;
import spacetrader.SpecialEvent;
import spacetrader.enums.AlertType;
import spacetrader.enums.SpecialEventType;
import spacetrader.guifacade.GuiFacade;

public class FormTest extends SpaceTraderForm
{
	private jwinforms.Label lblAlertType;
	private jwinforms.GroupBox boxAlert;
	private jwinforms.Label lblValue2;
	private jwinforms.Label lblValue1;
	private jwinforms.Label lblValue3;
	private jwinforms.ComboBox selAlertType;
	private jwinforms.TextBox txtValue1;
	private jwinforms.TextBox txtValue2;
	private jwinforms.TextBox txtValue3;
	private jwinforms.GroupBox groupBox1;
	private jwinforms.Button btnTestAlert;
	private jwinforms.Button btnTestSpecialEvent;
	private jwinforms.ComboBox selSpecialEvent;
	private jwinforms.Label lblSpecialEvent;

	public FormTest()
	{
		InitializeComponent();

		AlertType[] alerts = Arrays.copyOfRange(AlertType.values(), AlertType.Alert.ordinal(),
				AlertType.WildWontStayAboardReactor.ordinal());
//		for (AlertType type = AlertType.Alert; type.CastToInt() <= AlertType.WildWontStayAboardReactor.CastToInt(); type++)
		for (AlertType type : alerts)
			selAlertType.Items.add(type);
		selAlertType.setSelectedIndex(0);

		SpecialEventType[] events = Arrays.copyOfRange(SpecialEventType.values(), SpecialEventType.Artifact.ordinal(),
				SpecialEventType.WildGetsOut.ordinal());
//			for (SpecialEventType type = SpecialEventType.Artifact; type < SpecialEventType.WildGetsOut; type++)
		for (SpecialEventType type : events)
			selSpecialEvent.Items.add(type);
		selSpecialEvent.setSelectedIndex(0);
	}

	private void InitializeComponent()
	{
		lblAlertType = new jwinforms.Label();
		boxAlert = new jwinforms.GroupBox();
		btnTestAlert = new jwinforms.Button();
		txtValue3 = new jwinforms.TextBox();
		txtValue2 = new jwinforms.TextBox();
		txtValue1 = new jwinforms.TextBox();
		selAlertType = new jwinforms.ComboBox();
		lblValue3 = new jwinforms.Label();
		lblValue1 = new jwinforms.Label();
		lblValue2 = new jwinforms.Label();
		groupBox1 = new jwinforms.GroupBox();
		btnTestSpecialEvent = new jwinforms.Button();
		selSpecialEvent = new jwinforms.ComboBox();
		lblSpecialEvent = new jwinforms.Label();
		boxAlert.SuspendLayout();
		groupBox1.SuspendLayout();
		this.SuspendLayout();
		//
		// lblAlertType
		//
		lblAlertType.setAutoSize(true);
		lblAlertType.setLocation(new java.awt.Point(8, 19));
		lblAlertType.setName("lblAlertType");
		lblAlertType.setSize(new jwinforms.Size(56, 13));
		lblAlertType.setTabIndex(0);
		lblAlertType.setText("Alert Type");
		//
		// boxAlert
		//
		boxAlert.Controls
				.addAll((new WinformControl[] { btnTestAlert, txtValue3, txtValue2, txtValue1,
						selAlertType, lblValue3, lblValue1, lblValue2, lblAlertType }));
		boxAlert.setLocation(new java.awt.Point(8, 8));
		boxAlert.setName("boxAlert");
		boxAlert.setSize(new jwinforms.Size(200, 152));
		boxAlert.setTabIndex(1);
		boxAlert.setTabStop(false);
		boxAlert.setText("Test Alert");
		//
		// btnTestAlert
		//
		btnTestAlert.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnTestAlert.setLocation(new java.awt.Point(80, 120));
		btnTestAlert.setName("btnTestAlert");
		btnTestAlert.setSize(new jwinforms.Size(41, 22));
		btnTestAlert.setTabIndex(8);
		btnTestAlert.setText("Test");
		btnTestAlert.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnTestAlert_Click(sender, e);
			}
		});
		//
		// txtValue3
		//
		txtValue3.setLocation(new java.awt.Point(72, 88));
		txtValue3.setName("txtValue3");
		txtValue3.setSize(new jwinforms.Size(120, 20));
		txtValue3.setTabIndex(7);
		txtValue3.setText("");
		//
		// txtValue2
		//
		txtValue2.setLocation(new java.awt.Point(72, 64));
		txtValue2.setName("txtValue2");
		txtValue2.setSize(new jwinforms.Size(120, 20));
		txtValue2.setTabIndex(6);
		txtValue2.setText("");
		//
		// txtValue1
		//
		txtValue1.setLocation(new java.awt.Point(72, 40));
		txtValue1.setName("txtValue1");
		txtValue1.setSize(new jwinforms.Size(120, 20));
		txtValue1.setTabIndex(5);
		txtValue1.setText("");
		//
		// selAlertType
		//
		selAlertType.DropDownStyle = jwinforms.ComboBoxStyle.DropDownList;
		selAlertType.setLocation(new java.awt.Point(72, 16));
		selAlertType.setName("selAlertType");
		selAlertType.setSize(new jwinforms.Size(120, 21));
		selAlertType.setTabIndex(4);
		//
		// lblValue3
		//
		lblValue3.setAutoSize(true);
		lblValue3.setLocation(new java.awt.Point(8, 91));
		lblValue3.setName("lblValue3");
		lblValue3.setSize(new jwinforms.Size(43, 13));
		lblValue3.setTabIndex(3);
		lblValue3.setText("Value 3");
		//
		// lblValue1
		//
		lblValue1.setAutoSize(true);
		lblValue1.setLocation(new java.awt.Point(8, 43));
		lblValue1.setName("lblValue1");
		lblValue1.setSize(new jwinforms.Size(43, 13));
		lblValue1.setTabIndex(2);
		lblValue1.setText("Value 1");
		//
		// lblValue2
		//
		lblValue2.setAutoSize(true);
		lblValue2.setLocation(new java.awt.Point(8, 67));
		lblValue2.setName("lblValue2");
		lblValue2.setSize(new jwinforms.Size(43, 13));
		lblValue2.setTabIndex(1);
		lblValue2.setText("Value 2");
		//
		// groupBox1
		//
		groupBox1.Controls.addAll((new WinformControl[] { btnTestSpecialEvent, selSpecialEvent,
				lblSpecialEvent }));
		groupBox1.setLocation(new java.awt.Point(8, 168));
		groupBox1.setName("groupBox1");
		groupBox1.setSize(new jwinforms.Size(200, 80));
		groupBox1.setTabIndex(2);
		groupBox1.setTabStop(false);
		groupBox1.setText("Test Special Alert");
		//
		// btnTestSpecialEvent
		//
		btnTestSpecialEvent.setFlatStyle(jwinforms.FlatStyle.Flat);
		btnTestSpecialEvent.setLocation(new java.awt.Point(80, 48));
		btnTestSpecialEvent.setName("btnTestSpecialEvent");
		btnTestSpecialEvent.setSize(new jwinforms.Size(41, 22));
		btnTestSpecialEvent.setTabIndex(8);
		btnTestSpecialEvent.setText("Test");
		btnTestSpecialEvent.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnTestSpecialEvent_Click(sender, e);
			}
		});
		//
		// selSpecialEvent
		//
		selSpecialEvent.DropDownStyle = jwinforms.ComboBoxStyle.DropDownList;
		selSpecialEvent.setLocation(new java.awt.Point(88, 16));
		selSpecialEvent.setName("selSpecialEvent");
		selSpecialEvent.setSize(new jwinforms.Size(104, 21));
		selSpecialEvent.setTabIndex(4);
		//
		// lblSpecialEvent
		//
		lblSpecialEvent.setAutoSize(true);
		lblSpecialEvent.setLocation(new java.awt.Point(8, 19));
		lblSpecialEvent.setName("lblSpecialEvent");
		lblSpecialEvent.setSize(new jwinforms.Size(73, 13));
		lblSpecialEvent.setTabIndex(0);
		lblSpecialEvent.setText("Special Event");
		//
		// FormTest
		//
		this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
		this.setClientSize(new jwinforms.Size(370, 255));
		Controls.addAll(Arrays.asList(groupBox1, boxAlert));
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormTest");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Test");
	}

	private void btnTestAlert_Click(Object sender, EventArgs e)
	{
		GuiFacade.alert(AlertType.Alert, "Result", ("The result was " + GuiFacade.alert(
				((AlertType)selAlertType.getSelectedItem()), txtValue1.getText(), txtValue2.getText(),
				txtValue3.getText()).toString()));
	}

	private void btnTestSpecialEvent_Click(Object sender, EventArgs e)
	{
		SpecialEvent specEvent = Consts.SpecialEvents[((SpecialEventType)selSpecialEvent.getSelectedItem()).CastToInt()];
		String btn1, btn2;
		DialogResult res1, res2;

		if (specEvent.MessageOnly())
		{
			btn1 = "Ok";
			btn2 = null;
			res1 = DialogResult.OK;
			res2 = DialogResult.None;
		} else
		{
			btn1 = "Yes";
			btn2 = "No";
			res1 = DialogResult.Yes;
			res2 = DialogResult.No;
		}

		(new FormAlert(specEvent.Title(), specEvent.String(), btn1, res1, btn2, res2, null)).ShowDialog(this);
	}
}
