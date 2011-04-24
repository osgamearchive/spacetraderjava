package org.gts.bst.ship.equip;

import spacetrader.enums.SpaceTraderEnum;
import spacetrader.util.EquipmentSubType;

public enum ShieldType implements SpaceTraderEnum , EquipmentSubType
{
	Energy, Reflective, Lightning;

	public int CastToInt()
	{
		return ordinal();
	}

	public static ShieldType FromInt(int i)
	{
		return values()[i];
	}
}