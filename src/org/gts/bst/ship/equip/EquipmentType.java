package org.gts.bst.ship.equip;
import spacetrader.enums.SpaceTraderEnum;
public enum EquipmentType implements SpaceTraderEnum// : int
{
	Weapon, Shield, Gadget;
	public int CastToInt()
	{
		return ordinal();
	}

	public static EquipmentType FromInt(int i)
	{
		return values()[i];
	}
}