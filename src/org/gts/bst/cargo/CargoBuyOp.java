package org.gts.bst.cargo;
import spacetrader.enums.SpaceTraderEnum;
public enum CargoBuyOp implements SpaceTraderEnum
	{
		BuySystem,
		BuyTrader,
		Plunder;

		public int CastToInt()
		{
return ordinal();
		}
	};