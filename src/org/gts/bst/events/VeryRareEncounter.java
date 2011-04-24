package org.gts.bst.events;
import spacetrader.enums.SpaceTraderEnum;


public enum VeryRareEncounter implements SpaceTraderEnum {
  MarieCeleste, // = 0,
  CaptainAhab, // = 1,
  CaptainConrad, // = 2,
  CaptainHuie, // = 3,
  BottleOld, // = 4,
  BottleGood, // = 5
  ;

  @Override
  public int CastToInt() {
    return ordinal();
  }
}
