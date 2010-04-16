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

import java.awt.Point;

import jwinforms.*;
import spacetrader.Game;
import spacetrader.GameFacade;
import spacetrader.GameOptions;
import spacetrader.enums.AlertType;
import spacetrader.guifacade.GuiFacade;

public class FormOptions extends SpaceTraderForm
{
	private Button btnOk;
	private Button btnCancel;
	private Label lblEmpty;
	private Label lblIgnore;
	private CheckBox chkFuel;
	private CheckBox chkContinuousAttack;
	private CheckBox chkAttackFleeing;
	private CheckBox chkDisable;
	private CheckBox chkNewspaper;
	private CheckBox chkNewspaperShow;
	private CheckBox chkRange;
	private CheckBox chkStopTracking;
	private CheckBox chkLoan;
	private CheckBox chkIgnoreTradersDealing;
	private CheckBox chkReserveMoney;
	private CheckBox chkIgnoreTraders;
	private CheckBox chkIgnorePirates;
	private CheckBox chkIgnorePolice;
	private CheckBox chkRepair;
	private NumericUpDown numEmpty;
	private Button btnSave;
	private Button btnLoad;

	private final Game game = GameFacade.currentGame();
	private boolean initializing = true;

	private final GameOptions _options = new GameOptions(false);

	public FormOptions()
	{
		InitializeComponent();

		if (game != null)
			_options.CopyValues(game.Options());
		else
		{
			_options.LoadFromDefaults(false);
			btnOk.setEnabled(false);
			GuiFacade.alert(AlertType.OptionsNoGame);
		}

		UpdateAll();
	}

	private void InitializeComponent()
	{
		btnOk = new Button();
		btnCancel = new Button();
		lblEmpty = new Label();
		chkFuel = new CheckBox();
		chkContinuousAttack = new CheckBox();
		chkAttackFleeing = new CheckBox();
		chkNewspaper = new CheckBox();
		chkRange = new CheckBox();
		chkStopTracking = new CheckBox();
		chkLoan = new CheckBox();
		chkIgnoreTradersDealing = new CheckBox();
		chkReserveMoney = new CheckBox();
		chkIgnoreTraders = new CheckBox();
		chkIgnorePirates = new CheckBox();
		chkIgnorePolice = new CheckBox();
		chkRepair = new CheckBox();
		lblIgnore = new Label();
		numEmpty = new NumericUpDown();
		btnSave = new Button();
		btnLoad = new Button();
		chkNewspaperShow = new CheckBox();
		chkDisable = new CheckBox();
		((ISupportInitialize)(numEmpty)).BeginInit();
		this.SuspendLayout();
		//
		// btnOk
		//
		btnOk.setDialogResult(DialogResult.OK);
		btnOk.setFlatStyle(FlatStyle.Flat);
		btnOk.setLocation(new Point(14, 240));
		btnOk.setName("btnOk");
		btnOk.setSize(new Size(40, 22));
		btnOk.setTabIndex(15);
		btnOk.setText("Ok");
		//
		// btnCancel
		//
		btnCancel.setDialogResult(DialogResult.Cancel);
		btnCancel.setFlatStyle(FlatStyle.Flat);
		btnCancel.setLocation(new Point(62, 240));
		btnCancel.setName("btnCancel");
		btnCancel.setSize(new Size(49, 22));
		btnCancel.setTabIndex(16);
		btnCancel.setText("Cancel");
		//
		// lblEmpty
		//
		lblEmpty.setAutoSize(true);
		lblEmpty.setLocation(new Point(52, 90));
		lblEmpty.setName("lblEmpty");
		lblEmpty.setSize(new Size(292, 16));
		lblEmpty.setTabIndex(38);
		lblEmpty.setText("Cargo Bays to leave empty when buying goods in-system");
		//
		// chkFuel
		//
		chkFuel.setLocation(new Point(8, 8));
		chkFuel.setName("chkFuel");
		chkFuel.setSize(new Size(160, 16));
		chkFuel.setTabIndex(1);
		chkFuel.setText("Get full fuel tanks on arrival");
		chkFuel.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkContinuousAttack
		//
		chkContinuousAttack.setLocation(new Point(8, 176));
		chkContinuousAttack.setName("chkContinuousAttack");
		chkContinuousAttack.setSize(new Size(163, 16));
		chkContinuousAttack.setTabIndex(13);
		chkContinuousAttack.setText("Continuous attack and flight");
		chkContinuousAttack.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkAttackFleeing
		//
		chkAttackFleeing.setLocation(new Point(24, 192));
		chkAttackFleeing.setName("chkAttackFleeing");
		chkAttackFleeing.setSize(new Size(177, 16));
		chkAttackFleeing.setTabIndex(14);
		chkAttackFleeing.setText("Continue attacking fleeing ship");
		chkAttackFleeing.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkNewspaper
		//
		chkNewspaper.setLocation(new Point(8, 40));
		chkNewspaper.setName("chkNewspaper");
		chkNewspaper.setSize(new Size(155, 16));
		chkNewspaper.setTabIndex(3);
		chkNewspaper.setText("Always pay for newspaper");
		chkNewspaper.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkRange
		//
		chkRange.setLocation(new Point(184, 8));
		chkRange.setName("chkRange");
		chkRange.setSize(new Size(175, 16));
		chkRange.setTabIndex(5);
		chkRange.setText("Show range to tracked system");
		chkRange.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkStopTracking
		//
		chkStopTracking.setLocation(new Point(184, 24));
		chkStopTracking.setName("chkStopTracking");
		chkStopTracking.setSize(new Size(139, 16));
		chkStopTracking.setTabIndex(6);
		chkStopTracking.setText("Stop tracking on arrival");
		chkStopTracking.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkLoan
		//
		chkLoan.setLocation(new Point(184, 56));
		chkLoan.setName("chkLoan");
		chkLoan.setSize(new Size(124, 16));
		chkLoan.setTabIndex(4);
		chkLoan.setText("Remind about loans");
		chkLoan.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkIgnoreTradersDealing
		//
		chkIgnoreTradersDealing.setLocation(new Point(152, 152));
		chkIgnoreTradersDealing.setName("chkIgnoreTradersDealing");
		chkIgnoreTradersDealing.setSize(new Size(133, 16));
		chkIgnoreTradersDealing.setTabIndex(12);
		chkIgnoreTradersDealing.setText("Ignore dealing traders");
		chkIgnoreTradersDealing.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkReserveMoney
		//
		chkReserveMoney.setLocation(new Point(184, 40));
		chkReserveMoney.setName("chkReserveMoney");
		chkReserveMoney.setSize(new Size(176, 16));
		chkReserveMoney.setTabIndex(7);
		chkReserveMoney.setText("Reserve money for warp costs");
		chkReserveMoney.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkIgnoreTraders
		//
		chkIgnoreTraders.setLocation(new Point(136, 136));
		chkIgnoreTraders.setName("chkIgnoreTraders");
		chkIgnoreTraders.setSize(new Size(62, 16));
		chkIgnoreTraders.setTabIndex(11);
		chkIgnoreTraders.setText("Traders");
		chkIgnoreTraders.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkIgnorePirates
		//
		chkIgnorePirates.setLocation(new Point(8, 136));
		chkIgnorePirates.setName("chkIgnorePirates");
		chkIgnorePirates.setSize(new Size(58, 16));
		chkIgnorePirates.setTabIndex(9);
		chkIgnorePirates.setText("Pirates");
		chkIgnorePirates.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkIgnorePolice
		//
		chkIgnorePolice.setLocation(new Point(74, 136));
		chkIgnorePolice.setName("chkIgnorePolice");
		chkIgnorePolice.setSize(new Size(54, 16));
		chkIgnorePolice.setTabIndex(10);
		chkIgnorePolice.setText("Police");
		chkIgnorePolice.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkRepair
		//
		chkRepair.setLocation(new Point(8, 24));
		chkRepair.setName("chkRepair");
		chkRepair.setSize(new Size(167, 16));
		chkRepair.setTabIndex(2);
		chkRepair.setText("Get full hull repairs on arrival");
		chkRepair.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// lblIgnore
		//
		lblIgnore.setAutoSize(true);
		lblIgnore.setLocation(new Point(8, 120));
		lblIgnore.setName("lblIgnore");
		lblIgnore.setSize(new Size(152, 16));
		lblIgnore.setTabIndex(52);
		lblIgnore.setText("Always ignore when it is safe:");
		//
		// numEmpty
		//
		numEmpty.setLocation(new Point(8, 88));
		numEmpty.setMaximum(99);
		numEmpty.setName("numEmpty");
		numEmpty.setSize(new Size(40, 20));
		numEmpty.setTabIndex(8);
		numEmpty.setValue(88);
		numEmpty.setValueChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// btnSave
		//
		btnSave.setFlatStyle(FlatStyle.Flat);
		btnSave.setLocation(new Point(119, 240));
		btnSave.setName("btnSave");
		btnSave.setSize(new Size(107, 22));
		btnSave.setTabIndex(17);
		btnSave.setText("Save As Defaults");
		btnSave.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnSave_Click();
			}
		});
		//
		// btnLoad
		//
		btnLoad.setFlatStyle(FlatStyle.Flat);
		btnLoad.setLocation(new Point(234, 240));
		btnLoad.setName("btnLoad");
		btnLoad.setSize(new Size(114, 22));
		btnLoad.setTabIndex(18);
		btnLoad.setText("Load from Defaults");
		btnLoad.setClick(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				btnLoad_Click();
			}
		});
		//
		// chkNewspaperShow
		//
		chkNewspaperShow.setLocation(new Point(24, 56));
		chkNewspaperShow.setName("chkNewspaperShow");
		chkNewspaperShow.setSize(new Size(160, 16));
		chkNewspaperShow.setTabIndex(53);
		chkNewspaperShow.setText("Show newspaper on arrival");
		chkNewspaperShow.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// chkDisable
		//
		chkDisable.setLocation(new Point(8, 208));
		chkDisable.setName("chkDisable");
		chkDisable.setSize(new Size(244, 16));
		chkDisable.setTabIndex(54);
		chkDisable.setText("Attempt to disable opponents when possible");
		chkDisable.setCheckedChanged(new EventHandler<Object, EventArgs>()
		{
			@Override
			public void handle(Object sender, jwinforms.EventArgs e)
			{
				controlChanged();
			}
		});
		//
		// FormOptions
		//
		this.setAcceptButton(btnOk);
		this.setAutoScaleBaseSize(new Size(5, 13));
		this.setCancelButton(btnCancel);
		this.setClientSize(new Size(362, 271));
		Controls.add(chkDisable);
		Controls.add(chkLoan);
		Controls.add(chkNewspaperShow);
		Controls.add(btnLoad);
		Controls.add(btnSave);
		Controls.add(numEmpty);
		Controls.add(lblIgnore);
		Controls.add(lblEmpty);
		Controls.add(chkRepair);
		Controls.add(chkIgnorePolice);
		Controls.add(chkIgnorePirates);
		Controls.add(chkIgnoreTraders);
		Controls.add(chkReserveMoney);
		Controls.add(chkIgnoreTradersDealing);
		Controls.add(chkStopTracking);
		Controls.add(chkRange);
		Controls.add(chkNewspaper);
		Controls.add(chkAttackFleeing);
		Controls.add(chkContinuousAttack);
		Controls.add(chkFuel);
		Controls.add(btnCancel);
		Controls.add(btnOk);
		this.setFormBorderStyle(jwinforms.FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormOptions");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Options");
		((ISupportInitialize)(numEmpty)).EndInit();

	}

	private void UpdateAll()
	{
		initializing = true;

		chkFuel.setChecked(_options.getAutoFuel());
		chkRepair.setChecked(_options.getAutoRepair());
		chkNewspaper.setChecked(_options.getNewsAutoPay());
		chkNewspaperShow.setChecked(_options.getNewsAutoShow());
		chkLoan.setChecked(_options.getRemindLoans());
		chkRange.setChecked(_options.getShowTrackedRange());
		chkStopTracking.setChecked(_options.getTrackAutoOff());
		chkReserveMoney.setChecked(_options.getReserveMoney());
		numEmpty.setValue(_options.getLeaveEmpty());
		chkIgnorePirates.setChecked(_options.getAlwaysIgnorePirates());
		chkIgnorePolice.setChecked(_options.getAlwaysIgnorePolice());
		chkIgnoreTraders.setChecked(_options.getAlwaysIgnoreTraders());
		chkIgnoreTradersDealing.setChecked(_options.getAlwaysIgnoreTradeInOrbit());
		chkContinuousAttack.setChecked(_options.getContinuousAttack());
		chkAttackFleeing.setChecked(_options.getContinuousAttackFleeing());
		chkDisable.setChecked(_options.getDisableOpponents());

		UpdateContinueAttackFleeing();
		UpdateIgnoreTradersDealing();
		UpdateNewsAutoShow();

		initializing = false;
	}

	private void UpdateContinueAttackFleeing()
	{
		if (!chkContinuousAttack.isChecked())
			chkAttackFleeing.setChecked(false);

		chkAttackFleeing.setEnabled(chkContinuousAttack.isChecked());
	}

	private void UpdateIgnoreTradersDealing()
	{
		if (!chkIgnoreTraders.isChecked())
			chkIgnoreTradersDealing.setChecked(false);

		chkIgnoreTradersDealing.setEnabled(chkIgnoreTraders.isChecked());
	}

	private void UpdateNewsAutoShow()
	{
		if (!chkNewspaper.isChecked())
			chkNewspaperShow.setChecked(false);

		chkNewspaperShow.setEnabled(chkNewspaper.isChecked());
	}

	private void btnLoad_Click()
	{
		_options.LoadFromDefaults(true);
		UpdateAll();
	}

	private void btnSave_Click()
	{
		_options.SaveAsDefaults();
	}

	private void controlChanged()
	{
		if (!initializing)
		{
			initializing = true;
			UpdateContinueAttackFleeing();
			UpdateIgnoreTradersDealing();
			UpdateNewsAutoShow();
			initializing = false;

			_options.setAutoFuel(chkFuel.isChecked());
			_options.setAutoRepair(chkRepair.isChecked());
			_options.setNewsAutoPay(chkNewspaper.isChecked());
			_options.setNewsAutoShow(chkNewspaperShow.isChecked());
			_options.setRemindLoans(chkLoan.isChecked());
			_options.setShowTrackedRange(chkRange.isChecked());
			_options.setTrackAutoOff(chkStopTracking.isChecked());
			_options.setReserveMoney(chkReserveMoney.isChecked());
			_options.setLeaveEmpty(numEmpty.getValue());
			_options.setAlwaysIgnorePirates(chkIgnorePirates.isChecked());
			_options.setAlwaysIgnorePolice(chkIgnorePolice.isChecked());
			_options.setAlwaysIgnoreTraders(chkIgnoreTraders.isChecked());
			_options.setAlwaysIgnoreTradeInOrbit(chkIgnoreTradersDealing.isChecked());
			_options.setContinuousAttack(chkContinuousAttack.isChecked());
			_options.setContinuousAttackFleeing(chkAttackFleeing.isChecked());
			_options.setDisableOpponents(chkDisable.isChecked());
		}
	}

	public GameOptions Options()
	{
		return _options;
	}
}
