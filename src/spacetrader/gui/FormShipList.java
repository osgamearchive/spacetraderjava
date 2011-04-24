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
import jwinforms.Button;
import jwinforms.Container;
import jwinforms.ContentAlignment;
import jwinforms.DialogResult;
import jwinforms.EventArgs;
import jwinforms.EventHandler;
import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.GraphicsUnit;
import jwinforms.Label;
import jwinforms.WinformControl;
import jwinforms.WinformForm;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.ShipSpec;
import spacetrader.SpecialEvent;
import spacetrader.Strings;
import spacetrader.enums.AlertType;


public class FormShipList extends WinformForm {
  //#region Control Declarations
  private jwinforms.Button btnClose;
  private jwinforms.Button btnBuy0;
  private jwinforms.Label lblName0;
  private jwinforms.Button btnInfo0;
  private jwinforms.Label lblPrice0;
  private jwinforms.Label lblPrice1;
  private jwinforms.Button btnInfo1;
  private jwinforms.Label lblName1;
  private jwinforms.Button btnBuy1;
  private jwinforms.Label lblPrice2;
  private jwinforms.Button btnInfo2;
  private jwinforms.Label lblName2;
  private jwinforms.Button btnBuy2;
  private jwinforms.Label lblPrice3;
  private jwinforms.Button btnInfo3;
  private jwinforms.Label lblName3;
  private jwinforms.Button btnBuy3;
  private jwinforms.Label lblPrice4;
  private jwinforms.Button btnInfo4;
  private jwinforms.Label lblName4;
  private jwinforms.Button btnBuy4;
  private jwinforms.Label lblPrice5;
  private jwinforms.Button btnInfo5;
  private jwinforms.Label lblName5;
  private jwinforms.Button btnBuy5;
  private jwinforms.Label lblPrice6;
  private jwinforms.Button btnInfo6;
  private jwinforms.Label lblName6;
  private jwinforms.Button btnBuy6;
  private jwinforms.Label lblPrice7;
  private jwinforms.Button btnInfo7;
  private jwinforms.Label lblName7;
  private jwinforms.Button btnBuy7;
  private jwinforms.Label lblPrice8;
  private jwinforms.Button btnInfo8;
  private jwinforms.Label lblName8;
  private jwinforms.Button btnBuy8;
  private jwinforms.Label lblPrice9;
  private jwinforms.Button btnInfo9;
  private jwinforms.Label lblName9;
  private jwinforms.Button btnBuy9;
  private jwinforms.GroupBox boxShipInfo;
  private jwinforms.Label lblSizeLabel;
  private jwinforms.Label lblNameLabel;
  private jwinforms.Label lblBaysLabel;
  private jwinforms.Label lblRangeLabel;
  private jwinforms.Label lblHullLabel;
  private jwinforms.Label lblWeaponLabel;
  private jwinforms.Label lblShieldLabel;
  private jwinforms.Label lblCrewLabel;
  private jwinforms.Label lblGadgetLabel;
  private jwinforms.PictureBox picShip;
  private jwinforms.Label lblName;
  private jwinforms.Label lblSize;
  private jwinforms.Label lblBays;
  private jwinforms.Label lblRange;
  private jwinforms.Label lblHull;
  private jwinforms.Label lblWeapon;
  private jwinforms.Label lblShield;
  private jwinforms.Label lblGadget;
  private jwinforms.Label lblCrew;
  private Container components = null;
  private Label[] lblPrice;
  private Button[] btnBuy;
  //#endregion
  //#region Member Declarations
  private Game game = Game.CurrentGame();
  private int[] prices = new int[Consts.ShipSpecs.length];

  //#endregion
  //#region Methods
  public FormShipList() {
    InitializeComponent();

    //#region Array of controls
    lblPrice = new Label[] {
          lblPrice0,
          lblPrice1,
          lblPrice2,
          lblPrice3,
          lblPrice4,
          lblPrice5,
          lblPrice6,
          lblPrice7,
          lblPrice8,
          lblPrice9,};

    btnBuy = new Button[] {
          btnBuy0,
          btnBuy1,
          btnBuy2,
          btnBuy3,
          btnBuy4,
          btnBuy5,
          btnBuy6,
          btnBuy7,
          btnBuy8,
          btnBuy9,};
    //#endregion

    UpdateAll();
    Info(game.Commander().getShip().Type().CastToInt());

    if(game.Commander().getShip().getTribbles() > 0 && !game.getTribbleMessage()) {
      FormAlert.Alert(AlertType.TribblesTradeIn, this);
      game.setTribbleMessage(true);
    }
  }

  //#region Windows Form Designer generated code
  /// <summary>
  /// Required method for Designer support - do not modify
  /// the contents of this method with the code editor.
  /// </summary>
  private void InitializeComponent() {
    this.btnClose = new jwinforms.Button();
    this.btnBuy0 = new jwinforms.Button();
    this.lblName0 = new jwinforms.Label();
    this.btnInfo0 = new jwinforms.Button();
    this.lblPrice0 = new jwinforms.Label();
    this.lblPrice1 = new jwinforms.Label();
    this.btnInfo1 = new jwinforms.Button();
    this.lblName1 = new jwinforms.Label();
    this.btnBuy1 = new jwinforms.Button();
    this.lblPrice2 = new jwinforms.Label();
    this.btnInfo2 = new jwinforms.Button();
    this.lblName2 = new jwinforms.Label();
    this.btnBuy2 = new jwinforms.Button();
    this.lblPrice3 = new jwinforms.Label();
    this.btnInfo3 = new jwinforms.Button();
    this.lblName3 = new jwinforms.Label();
    this.btnBuy3 = new jwinforms.Button();
    this.lblPrice4 = new jwinforms.Label();
    this.btnInfo4 = new jwinforms.Button();
    this.lblName4 = new jwinforms.Label();
    this.btnBuy4 = new jwinforms.Button();
    this.lblPrice5 = new jwinforms.Label();
    this.btnInfo5 = new jwinforms.Button();
    this.lblName5 = new jwinforms.Label();
    this.btnBuy5 = new jwinforms.Button();
    this.lblPrice6 = new jwinforms.Label();
    this.btnInfo6 = new jwinforms.Button();
    this.lblName6 = new jwinforms.Label();
    this.btnBuy6 = new jwinforms.Button();
    this.lblPrice7 = new jwinforms.Label();
    this.btnInfo7 = new jwinforms.Button();
    this.lblName7 = new jwinforms.Label();
    this.btnBuy7 = new jwinforms.Button();
    this.lblPrice8 = new jwinforms.Label();
    this.btnInfo8 = new jwinforms.Button();
    this.lblName8 = new jwinforms.Label();
    this.btnBuy8 = new jwinforms.Button();
    this.lblPrice9 = new jwinforms.Label();
    this.btnInfo9 = new jwinforms.Button();
    this.lblName9 = new jwinforms.Label();
    this.btnBuy9 = new jwinforms.Button();
    this.boxShipInfo = new jwinforms.GroupBox();
    this.lblCrew = new jwinforms.Label();
    this.lblGadget = new jwinforms.Label();
    this.lblShield = new jwinforms.Label();
    this.lblWeapon = new jwinforms.Label();
    this.lblHull = new jwinforms.Label();
    this.lblRange = new jwinforms.Label();
    this.lblBays = new jwinforms.Label();
    this.lblSize = new jwinforms.Label();
    this.lblName = new jwinforms.Label();
    this.picShip = new jwinforms.PictureBox();
    this.lblGadgetLabel = new jwinforms.Label();
    this.lblCrewLabel = new jwinforms.Label();
    this.lblShieldLabel = new jwinforms.Label();
    this.lblWeaponLabel = new jwinforms.Label();
    this.lblHullLabel = new jwinforms.Label();
    this.lblRangeLabel = new jwinforms.Label();
    this.lblBaysLabel = new jwinforms.Label();
    this.lblNameLabel = new jwinforms.Label();
    this.lblSizeLabel = new jwinforms.Label();
    this.boxShipInfo.SuspendLayout();
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
    // btnBuy0
    //
    this.btnBuy0.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy0.setLocation(new java.awt.Point(8, 8));
    this.btnBuy0.setName("btnBuy0");
    this.btnBuy0.setSize(new jwinforms.Size(35, 22));
    this.btnBuy0.setTabIndex(1);
    this.btnBuy0.setText("Buy");
    this.btnBuy0.setVisible(false);
    this.btnBuy0.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName0
    //
    this.lblName0.setLocation(new java.awt.Point(48, 12));
    this.lblName0.setName("lblName0");
    this.lblName0.setSize(new jwinforms.Size(70, 13));
    this.lblName0.setTabIndex(34);
    this.lblName0.setText("Flea");
    //
    // btnInfo0
    //
    this.btnInfo0.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo0.setLocation(new java.awt.Point(120, 8));
    this.btnInfo0.setName("btnInfo0");
    this.btnInfo0.setSize(new jwinforms.Size(34, 22));
    this.btnInfo0.setTabIndex(11);
    this.btnInfo0.setText("Info");
    this.btnInfo0.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice0
    //
    this.lblPrice0.setLocation(new java.awt.Point(160, 12));
    this.lblPrice0.setName("lblPrice0");
    this.lblPrice0.setSize(new jwinforms.Size(64, 13));
    this.lblPrice0.setTabIndex(36);
    this.lblPrice0.setText("-888,888 cr.");
    this.lblPrice0.TextAlign = ContentAlignment.TopRight;
    //
    // lblPrice1
    //
    this.lblPrice1.setLocation(new java.awt.Point(160, 36));
    this.lblPrice1.setName("lblPrice1");
    this.lblPrice1.setSize(new jwinforms.Size(64, 13));
    this.lblPrice1.setTabIndex(40);
    this.lblPrice1.setText("-888,888 cr.");
    this.lblPrice1.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo1
    //
    this.btnInfo1.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo1.setLocation(new java.awt.Point(120, 32));
    this.btnInfo1.setName("btnInfo1");
    this.btnInfo1.setSize(new jwinforms.Size(34, 22));
    this.btnInfo1.setTabIndex(12);
    this.btnInfo1.setText("Info");
    this.btnInfo1.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName1
    //
    this.lblName1.setLocation(new java.awt.Point(48, 36));
    this.lblName1.setName("lblName1");
    this.lblName1.setSize(new jwinforms.Size(70, 13));
    this.lblName1.setTabIndex(38);
    this.lblName1.setText("Gnat");
    //
    // btnBuy1
    //
    this.btnBuy1.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy1.setLocation(new java.awt.Point(8, 32));
    this.btnBuy1.setName("btnBuy1");
    this.btnBuy1.setSize(new jwinforms.Size(35, 22));
    this.btnBuy1.setTabIndex(2);
    this.btnBuy1.setText("Buy");
    this.btnBuy1.setVisible(false);
    this.btnBuy1.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice2
    //
    this.lblPrice2.setLocation(new java.awt.Point(160, 60));
    this.lblPrice2.setName("lblPrice2");
    this.lblPrice2.setSize(new jwinforms.Size(64, 13));
    this.lblPrice2.setTabIndex(44);
    this.lblPrice2.setText("-888,888 cr.");
    this.lblPrice2.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo2
    //
    this.btnInfo2.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo2.setLocation(new java.awt.Point(120, 56));
    this.btnInfo2.setName("btnInfo2");
    this.btnInfo2.setSize(new jwinforms.Size(34, 22));
    this.btnInfo2.setTabIndex(13);
    this.btnInfo2.setText("Info");
    this.btnInfo2.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName2
    //
    this.lblName2.setLocation(new java.awt.Point(48, 60));
    this.lblName2.setName("lblName2");
    this.lblName2.setSize(new jwinforms.Size(70, 13));
    this.lblName2.setTabIndex(42);
    this.lblName2.setText("Firefly");
    //
    // btnBuy2
    //
    this.btnBuy2.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy2.setLocation(new java.awt.Point(8, 56));
    this.btnBuy2.setName("btnBuy2");
    this.btnBuy2.setSize(new jwinforms.Size(35, 22));
    this.btnBuy2.setTabIndex(3);
    this.btnBuy2.setText("Buy");
    this.btnBuy2.setVisible(false);
    this.btnBuy2.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice3
    //
    this.lblPrice3.setLocation(new java.awt.Point(160, 84));
    this.lblPrice3.setName("lblPrice3");
    this.lblPrice3.setSize(new jwinforms.Size(64, 13));
    this.lblPrice3.setTabIndex(48);
    this.lblPrice3.setText("-888,888 cr.");
    this.lblPrice3.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo3
    //
    this.btnInfo3.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo3.setLocation(new java.awt.Point(120, 80));
    this.btnInfo3.setName("btnInfo3");
    this.btnInfo3.setSize(new jwinforms.Size(34, 22));
    this.btnInfo3.setTabIndex(14);
    this.btnInfo3.setText("Info");
    this.btnInfo3.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName3
    //
    this.lblName3.setLocation(new java.awt.Point(48, 84));
    this.lblName3.setName("lblName3");
    this.lblName3.setSize(new jwinforms.Size(70, 13));
    this.lblName3.setTabIndex(46);
    this.lblName3.setText("Mosquito");
    //
    // btnBuy3
    //
    this.btnBuy3.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy3.setLocation(new java.awt.Point(8, 80));
    this.btnBuy3.setName("btnBuy3");
    this.btnBuy3.setSize(new jwinforms.Size(35, 22));
    this.btnBuy3.setTabIndex(4);
    this.btnBuy3.setText("Buy");
    this.btnBuy3.setVisible(false);
    this.btnBuy3.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice4
    //
    this.lblPrice4.setLocation(new java.awt.Point(160, 108));
    this.lblPrice4.setName("lblPrice4");
    this.lblPrice4.setSize(new jwinforms.Size(64, 13));
    this.lblPrice4.setTabIndex(52);
    this.lblPrice4.setText("-888,888 cr.");
    this.lblPrice4.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo4
    //
    this.btnInfo4.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo4.setLocation(new java.awt.Point(120, 104));
    this.btnInfo4.setName("btnInfo4");
    this.btnInfo4.setSize(new jwinforms.Size(34, 22));
    this.btnInfo4.setTabIndex(15);
    this.btnInfo4.setText("Info");
    this.btnInfo4.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName4
    //
    this.lblName4.setLocation(new java.awt.Point(48, 108));
    this.lblName4.setName("lblName4");
    this.lblName4.setSize(new jwinforms.Size(70, 13));
    this.lblName4.setTabIndex(50);
    this.lblName4.setText("Bumblebee");
    //
    // btnBuy4
    //
    this.btnBuy4.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy4.setLocation(new java.awt.Point(8, 104));
    this.btnBuy4.setName("btnBuy4");
    this.btnBuy4.setSize(new jwinforms.Size(35, 22));
    this.btnBuy4.setTabIndex(5);
    this.btnBuy4.setText("Buy");
    this.btnBuy4.setVisible(false);
    this.btnBuy4.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice5
    //
    this.lblPrice5.setLocation(new java.awt.Point(160, 132));
    this.lblPrice5.setName("lblPrice5");
    this.lblPrice5.setSize(new jwinforms.Size(64, 13));
    this.lblPrice5.setTabIndex(56);
    this.lblPrice5.setText("got one");
    this.lblPrice5.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo5
    //
    this.btnInfo5.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo5.setLocation(new java.awt.Point(120, 128));
    this.btnInfo5.setName("btnInfo5");
    this.btnInfo5.setSize(new jwinforms.Size(34, 22));
    this.btnInfo5.setTabIndex(16);
    this.btnInfo5.setText("Info");
    this.btnInfo5.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName5
    //
    this.lblName5.setLocation(new java.awt.Point(48, 132));
    this.lblName5.setName("lblName5");
    this.lblName5.setSize(new jwinforms.Size(70, 13));
    this.lblName5.setTabIndex(54);
    this.lblName5.setText("Beetle");
    //
    // btnBuy5
    //
    this.btnBuy5.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy5.setLocation(new java.awt.Point(8, 128));
    this.btnBuy5.setName("btnBuy5");
    this.btnBuy5.setSize(new jwinforms.Size(35, 22));
    this.btnBuy5.setTabIndex(6);
    this.btnBuy5.setText("Buy");
    this.btnBuy5.setVisible(false);
    this.btnBuy5.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice6
    //
    this.lblPrice6.setLocation(new java.awt.Point(160, 156));
    this.lblPrice6.setName("lblPrice6");
    this.lblPrice6.setSize(new jwinforms.Size(64, 13));
    this.lblPrice6.setTabIndex(60);
    this.lblPrice6.setText("-888,888 cr.");
    this.lblPrice6.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo6
    //
    this.btnInfo6.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo6.setLocation(new java.awt.Point(120, 152));
    this.btnInfo6.setName("btnInfo6");
    this.btnInfo6.setSize(new jwinforms.Size(34, 22));
    this.btnInfo6.setTabIndex(17);
    this.btnInfo6.setText("Info");
    this.btnInfo6.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName6
    //
    this.lblName6.setLocation(new java.awt.Point(48, 156));
    this.lblName6.setName("lblName6");
    this.lblName6.setSize(new jwinforms.Size(70, 13));
    this.lblName6.setTabIndex(58);
    this.lblName6.setText("Hornet");
    //
    // btnBuy6
    //
    this.btnBuy6.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy6.setLocation(new java.awt.Point(8, 152));
    this.btnBuy6.setName("btnBuy6");
    this.btnBuy6.setSize(new jwinforms.Size(35, 22));
    this.btnBuy6.setTabIndex(7);
    this.btnBuy6.setText("Buy");
    this.btnBuy6.setVisible(false);
    this.btnBuy6.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice7
    //
    this.lblPrice7.setLocation(new java.awt.Point(160, 180));
    this.lblPrice7.setName("lblPrice7");
    this.lblPrice7.setSize(new jwinforms.Size(64, 13));
    this.lblPrice7.setTabIndex(64);
    this.lblPrice7.setText("-888,888 cr.");
    this.lblPrice7.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo7
    //
    this.btnInfo7.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo7.setLocation(new java.awt.Point(120, 176));
    this.btnInfo7.setName("btnInfo7");
    this.btnInfo7.setSize(new jwinforms.Size(34, 22));
    this.btnInfo7.setTabIndex(18);
    this.btnInfo7.setText("Info");
    this.btnInfo7.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName7
    //
    this.lblName7.setLocation(new java.awt.Point(48, 180));
    this.lblName7.setName("lblName7");
    this.lblName7.setSize(new jwinforms.Size(70, 13));
    this.lblName7.setTabIndex(62);
    this.lblName7.setText("Grasshopper");
    //
    // btnBuy7
    //
    this.btnBuy7.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy7.setLocation(new java.awt.Point(8, 176));
    this.btnBuy7.setName("btnBuy7");
    this.btnBuy7.setSize(new jwinforms.Size(35, 22));
    this.btnBuy7.setTabIndex(8);
    this.btnBuy7.setText("Buy");
    this.btnBuy7.setVisible(false);
    this.btnBuy7.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice8
    //
    this.lblPrice8.setLocation(new java.awt.Point(160, 204));
    this.lblPrice8.setName("lblPrice8");
    this.lblPrice8.setSize(new jwinforms.Size(64, 13));
    this.lblPrice8.setTabIndex(68);
    this.lblPrice8.setText("-888,888 cr.");
    this.lblPrice8.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo8
    //
    this.btnInfo8.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo8.setLocation(new java.awt.Point(120, 200));
    this.btnInfo8.setName("btnInfo8");
    this.btnInfo8.setSize(new jwinforms.Size(34, 22));
    this.btnInfo8.setTabIndex(19);
    this.btnInfo8.setText("Info");
    this.btnInfo8.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName8
    //
    this.lblName8.setLocation(new java.awt.Point(48, 204));
    this.lblName8.setName("lblName8");
    this.lblName8.setSize(new jwinforms.Size(70, 13));
    this.lblName8.setTabIndex(66);
    this.lblName8.setText("Termite");
    //
    // btnBuy8
    //
    this.btnBuy8.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy8.setLocation(new java.awt.Point(8, 200));
    this.btnBuy8.setName("btnBuy8");
    this.btnBuy8.setSize(new jwinforms.Size(35, 22));
    this.btnBuy8.setTabIndex(9);
    this.btnBuy8.setText("Buy");
    this.btnBuy8.setVisible(false);
    this.btnBuy8.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblPrice9
    //
    this.lblPrice9.setLocation(new java.awt.Point(160, 228));
    this.lblPrice9.setName("lblPrice9");
    this.lblPrice9.setSize(new jwinforms.Size(64, 13));
    this.lblPrice9.setTabIndex(72);
    this.lblPrice9.setText("not sold");
    this.lblPrice9.TextAlign = ContentAlignment.TopRight;
    //
    // btnInfo9
    //
    this.btnInfo9.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnInfo9.setLocation(new java.awt.Point(120, 224));
    this.btnInfo9.setName("btnInfo9");
    this.btnInfo9.setSize(new jwinforms.Size(34, 22));
    this.btnInfo9.setTabIndex(20);
    this.btnInfo9.setText("Info");
    this.btnInfo9.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // lblName9
    //
    this.lblName9.setLocation(new java.awt.Point(48, 228));
    this.lblName9.setName("lblName9");
    this.lblName9.setSize(new jwinforms.Size(70, 13));
    this.lblName9.setTabIndex(70);
    this.lblName9.setText("Wasp");
    //
    // btnBuy9
    //
    this.btnBuy9.setFlatStyle(jwinforms.FlatStyle.Flat);
    this.btnBuy9.setLocation(new java.awt.Point(8, 224));
    this.btnBuy9.setName("btnBuy9");
    this.btnBuy9.setSize(new jwinforms.Size(35, 22));
    this.btnBuy9.setTabIndex(10);
    this.btnBuy9.setText("Buy");
    this.btnBuy9.setVisible(false);
    this.btnBuy9.setClick(new EventHandler<Object, EventArgs>()
 {
      @Override
      public void handle(Object sender, jwinforms.EventArgs e) {
        btnBuyInfo_Click(sender, e);
      }
    });
    //
    // boxShipInfo
    //
    this.boxShipInfo.Controls.addAll((new WinformControl[] {
          this.lblCrew,
          this.lblGadget,
          this.lblShield,
          this.lblWeapon,
          this.lblHull,
          this.lblRange,
          this.lblBays,
          this.lblSize,
          this.lblName,
          this.picShip,
          this.lblGadgetLabel,
          this.lblCrewLabel,
          this.lblShieldLabel,
          this.lblWeaponLabel,
          this.lblHullLabel,
          this.lblRangeLabel,
          this.lblBaysLabel,
          this.lblNameLabel,
          this.lblSizeLabel}));
    this.boxShipInfo.setLocation(new java.awt.Point(232, 0));
    this.boxShipInfo.setName("boxShipInfo");
    this.boxShipInfo.setSize(new jwinforms.Size(200, 248));
    this.boxShipInfo.setTabIndex(73);
    this.boxShipInfo.setTabStop(false);
    this.boxShipInfo.setText("Ship Information");
    //
    // lblCrew
    //
    this.lblCrew.setLocation(new java.awt.Point(96, 224));
    this.lblCrew.setName("lblCrew");
    this.lblCrew.setSize(new jwinforms.Size(10, 13));
    this.lblCrew.setTabIndex(43);
    this.lblCrew.setText("8");
    //
    // lblGadget
    //
    this.lblGadget.setLocation(new java.awt.Point(96, 208));
    this.lblGadget.setName("lblGadget");
    this.lblGadget.setSize(new jwinforms.Size(10, 13));
    this.lblGadget.setTabIndex(42);
    this.lblGadget.setText("8");
    //
    // lblShield
    //
    this.lblShield.setLocation(new java.awt.Point(96, 192));
    this.lblShield.setName("lblShield");
    this.lblShield.setSize(new jwinforms.Size(10, 13));
    this.lblShield.setTabIndex(41);
    this.lblShield.setText("8");
    //
    // lblWeapon
    //
    this.lblWeapon.setLocation(new java.awt.Point(96, 176));
    this.lblWeapon.setName("lblWeapon");
    this.lblWeapon.setSize(new jwinforms.Size(10, 13));
    this.lblWeapon.setTabIndex(40);
    this.lblWeapon.setText("8");
    //
    // lblHull
    //
    this.lblHull.setLocation(new java.awt.Point(96, 160));
    this.lblHull.setName("lblHull");
    this.lblHull.setSize(new jwinforms.Size(23, 13));
    this.lblHull.setTabIndex(39);
    this.lblHull.setText("888");
    //
    // lblRange
    //
    this.lblRange.setLocation(new java.awt.Point(96, 144));
    this.lblRange.setName("lblRange");
    this.lblRange.setSize(new jwinforms.Size(59, 13));
    this.lblRange.setTabIndex(38);
    this.lblRange.setText("88 parsecs");
    //
    // lblBays
    //
    this.lblBays.setLocation(new java.awt.Point(96, 128));
    this.lblBays.setName("lblBays");
    this.lblBays.setSize(new jwinforms.Size(17, 13));
    this.lblBays.setTabIndex(37);
    this.lblBays.setText("88");
    //
    // lblSize
    //
    this.lblSize.setLocation(new java.awt.Point(96, 112));
    this.lblSize.setName("lblSize");
    this.lblSize.setSize(new jwinforms.Size(45, 13));
    this.lblSize.setTabIndex(36);
    this.lblSize.setText("Medium");
    //
    // lblName
    //
    this.lblName.setLocation(new java.awt.Point(96, 96));
    this.lblName.setName("lblName");
    this.lblName.setSize(new jwinforms.Size(100, 13));
    this.lblName.setTabIndex(35);
    this.lblName.setText("Grasshopper");
    //
    // picShip
    //
    this.picShip.setBackColor(java.awt.Color.white);
    this.picShip.setBorderStyle(jwinforms.BorderStyle.FixedSingle);
    this.picShip.setLocation(new java.awt.Point(67, 25));
    this.picShip.setName("picShip");
    this.picShip.setSize(new jwinforms.Size(66, 54));
    this.picShip.setTabIndex(12);
    this.picShip.setTabStop(false);
    //
    // lblGadgetLabel
    //
    this.lblGadgetLabel.setAutoSize(true);
    this.lblGadgetLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblGadgetLabel.setLocation(new java.awt.Point(8, 208));
    this.lblGadgetLabel.setName("lblGadgetLabel");
    this.lblGadgetLabel.setSize(new jwinforms.Size(76, 13));
    this.lblGadgetLabel.setTabIndex(11);
    this.lblGadgetLabel.setText("Gadget Slots:");
    //
    // lblCrewLabel
    //
    this.lblCrewLabel.setAutoSize(true);
    this.lblCrewLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblCrewLabel.setLocation(new java.awt.Point(8, 224));
    this.lblCrewLabel.setName("lblCrewLabel");
    this.lblCrewLabel.setSize(new jwinforms.Size(84, 13));
    this.lblCrewLabel.setTabIndex(10);
    this.lblCrewLabel.setText("Crew Quarters:");
    //
    // lblShieldLabel
    //
    this.lblShieldLabel.setAutoSize(true);
    this.lblShieldLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblShieldLabel.setLocation(new java.awt.Point(8, 192));
    this.lblShieldLabel.setName("lblShieldLabel");
    this.lblShieldLabel.setSize(new jwinforms.Size(70, 13));
    this.lblShieldLabel.setTabIndex(9);
    this.lblShieldLabel.setText("Shield Slots:");
    //
    // lblWeaponLabel
    //
    this.lblWeaponLabel.setAutoSize(true);
    this.lblWeaponLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblWeaponLabel.setLocation(new java.awt.Point(8, 176));
    this.lblWeaponLabel.setName("lblWeaponLabel");
    this.lblWeaponLabel.setSize(new jwinforms.Size(81, 13));
    this.lblWeaponLabel.setTabIndex(8);
    this.lblWeaponLabel.setText("Weapon Slots:");
    //
    // lblHullLabel
    //
    this.lblHullLabel.setAutoSize(true);
    this.lblHullLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblHullLabel.setLocation(new java.awt.Point(8, 160));
    this.lblHullLabel.setName("lblHullLabel");
    this.lblHullLabel.setSize(new jwinforms.Size(73, 13));
    this.lblHullLabel.setTabIndex(7);
    this.lblHullLabel.setText("Hull Strength");
    //
    // lblRangeLabel
    //
    this.lblRangeLabel.setAutoSize(true);
    this.lblRangeLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblRangeLabel.setLocation(new java.awt.Point(8, 144));
    this.lblRangeLabel.setName("lblRangeLabel");
    this.lblRangeLabel.setSize(new jwinforms.Size(42, 13));
    this.lblRangeLabel.setTabIndex(6);
    this.lblRangeLabel.setText("Range:");
    //
    // lblBaysLabel
    //
    this.lblBaysLabel.setAutoSize(true);
    this.lblBaysLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblBaysLabel.setLocation(new java.awt.Point(8, 128));
    this.lblBaysLabel.setName("lblBaysLabel");
    this.lblBaysLabel.setSize(new jwinforms.Size(69, 13));
    this.lblBaysLabel.setTabIndex(5);
    this.lblBaysLabel.setText("Cargo Bays:");
    //
    // lblNameLabel
    //
    this.lblNameLabel.setAutoSize(true);
    this.lblNameLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblNameLabel.setLocation(new java.awt.Point(8, 96));
    this.lblNameLabel.setName("lblNameLabel");
    this.lblNameLabel.setSize(new jwinforms.Size(39, 13));
    this.lblNameLabel.setTabIndex(4);
    this.lblNameLabel.setText("Name:");
    //
    // lblSizeLabel
    //
    this.lblSizeLabel.setAutoSize(true);
    this.lblSizeLabel.setFont(new Font("Microsoft Sans Serif", 8.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(0))));
    this.lblSizeLabel.setLocation(new java.awt.Point(8, 112));
    this.lblSizeLabel.setName("lblSizeLabel");
    this.lblSizeLabel.setSize(new jwinforms.Size(31, 13));
    this.lblSizeLabel.setTabIndex(3);
    this.lblSizeLabel.setText("Size:");
    //
    // FormShipList
    //
    this.setAutoScaleBaseSize(new jwinforms.Size(5, 13));
    this.setCancelButton(this.btnClose);
    this.setClientSize(new jwinforms.Size(438, 255));
    this.Controls.addAll(Arrays.asList(
        this.boxShipInfo,
        this.lblPrice9,
        this.btnInfo9,
        this.lblName9,
        this.btnBuy9,
        this.lblPrice8,
        this.btnInfo8,
        this.lblName8,
        this.btnBuy8,
        this.lblPrice7,
        this.btnInfo7,
        this.lblName7,
        this.btnBuy7,
        this.lblPrice6,
        this.btnInfo6,
        this.lblName6,
        this.btnBuy6,
        this.lblPrice5,
        this.btnInfo5,
        this.lblName5,
        this.btnBuy5,
        this.lblPrice4,
        this.btnInfo4,
        this.lblName4,
        this.btnBuy4,
        this.lblPrice3,
        this.btnInfo3,
        this.lblName3,
        this.btnBuy3,
        this.lblPrice2,
        this.btnInfo2,
        this.lblName2,
        this.btnBuy2,
        this.lblPrice1,
        this.btnInfo1,
        this.lblName1,
        this.btnBuy1,
        this.lblPrice0,
        this.btnInfo0,
        this.lblName0,
        this.btnBuy0,
        this.btnClose));
    this.setFormBorderStyle(FormBorderStyle.FixedDialog);
    this.setMaximizeBox(false);
    this.setMinimizeBox(false);
    this.setName("FormShipList");
    this.setShowInTaskbar(false);
    this.setStartPosition(FormStartPosition.CenterParent);
    this.setText("Ship List");
    this.boxShipInfo.ResumeLayout(false);
    this.ResumeLayout(false);

  }
  //#endregion

  private void Buy(int id) {
    Info(id);

    if(game.Commander().TradeShip(Consts.ShipSpecs[id], prices[id], this)) {
      if(game.getQuestStatusScarab() == SpecialEvent.StatusScarabDone) {
        game.setQuestStatusScarab(SpecialEvent.StatusScarabNotStarted);
      }

      UpdateAll();
      game.getParentWindow().UpdateAll();
    }
  }

  private void Info(int id) {
    ShipSpec spec = Consts.ShipSpecs[id];

    picShip.setImage(spec.Image());
    lblName.setText(spec.Name());
    lblSize.setText(Strings.Sizes[spec.getSize().CastToInt()]);
    lblBays.setText(Functions.FormatNumber(spec.CargoBays()));
    lblRange.setText(Functions.Multiples(spec.FuelTanks(), Strings.DistanceUnit));
    lblHull.setText(Functions.FormatNumber(spec.HullStrength()));
    lblWeapon.setText(Functions.FormatNumber(spec.getWeaponSlots()));
    lblShield.setText(Functions.FormatNumber(spec.getShieldSlots()));
    lblGadget.setText(Functions.FormatNumber(spec.getGadgetSlots()));
    lblCrew.setText(Functions.FormatNumber(spec.getCrewQuarters()));
  }

  private void UpdateAll() {
    for(int i = 0; i < lblPrice.length; i++) {
      btnBuy[i].setVisible(false);

      if(Consts.ShipSpecs[i].MinimumTechLevel().CastToInt() > game.Commander().CurrentSystem().TechLevel().CastToInt()) {
        lblPrice[i].setText(Strings.CargoBuyNA);
      } else if(Consts.ShipSpecs[i].Type() == game.Commander().getShip().Type()) {
        lblPrice[i].setText(Strings.ShipBuyGotOne);
      } else {
        btnBuy[i].setVisible(true);
        prices[i] = Consts.ShipSpecs[i].getPrice() - game.Commander().getShip().Worth(false);
        lblPrice[i].setText(Functions.FormatMoney(prices[i]));
      }
    }
  }

  //#endregion
  //#region Event Handlers
  private void btnBuyInfo_Click(Object sender, EventArgs e) {
    String name = ((Button)sender).getName();
    int index = Integer.parseInt(name.substring(name.length() - 1));

    if(name.indexOf("Buy") < 0) {
      Info(index);
    } else {
      Buy(index);
    }
  }
  //#endregion
}
