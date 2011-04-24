package org.gts.bst.ship;
// TODO rename "ShipSize". Is used as WorldSize too?
import spacetrader.enums.SpaceTraderEnum;


public enum Size implements SpaceTraderEnum {
  Tiny, // = 0,
  Small, // = 1,
  Medium, // = 2,
  Large, // = 3,
  Huge, // = 4,
  Gargantuan // = 5
  ;

  @Override
  public int CastToInt() {
    return ordinal();
  }

  public static Size FromInt(int i) {
    return values()[i];
  }
}
