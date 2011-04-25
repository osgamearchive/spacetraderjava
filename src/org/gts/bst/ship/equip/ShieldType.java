package org.gts.bst.ship.equip;
import spacetrader.enums.SpaceTraderEnum;


public enum ShieldType implements SpaceTraderEnum, EquipmentSubType {
  Energy,
  Reflective,
  Lightning;

  @Override
  public int CastToInt() {
    return ordinal();
  }

  public static ShieldType FromInt(int i) {
    return values()[i];
  }
}
