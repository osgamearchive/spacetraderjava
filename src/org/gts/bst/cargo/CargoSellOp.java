package org.gts.bst.cargo;
import spacetrader.enums.SpaceTraderEnum;
	public enum CargoSellOp implements SpaceTraderEnum
	{
		SellSystem,
		SellTrader,
		Dump,
		Jettison;

		public int CastToInt()
		{
return ordinal();
		}
	};