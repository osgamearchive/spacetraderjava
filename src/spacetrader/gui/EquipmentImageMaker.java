package spacetrader.gui;

import jwinforms.Image;
import spacetrader.Equipment;
import spacetrader.Strings;

public class EquipmentImageMaker
{
	static Image makeImageFor(Equipment equipment)
	{
		return SpaceTrader.INSTANCE.EquipmentImages().getImages()[BaseImageIndex(equipment)
				+ equipment.SubType().CastToInt()];
	}

	static final int BaseImageIndex(Equipment equipment)
	{
		// TODO remove this coupling!@
		switch (equipment.EquipmentType())
		{
			case Gadget:
				return Strings.WeaponNames.length + Strings.ShieldNames.length;
			case Shield:
				return Strings.WeaponNames.length;
			case Weapon:
				// baseImageIndex should be 0
				return 0;
			default:
				throw new RuntimeException("Unknown equipment type: " + equipment.EquipmentType());
		}
	}
}
