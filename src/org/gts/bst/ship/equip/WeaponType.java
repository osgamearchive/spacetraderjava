package org.gts.bst.ship.equip;
import spacetrader.enums.SpaceTraderEnum;
import spacetrader.enums.TechLevel;


public enum WeaponType implements SpaceTraderEnum, EquipmentSubType {
  PulseLaser(TechLevel.t5, false, 50, 15, 2000),
  BeamLaser(TechLevel.t6, false, 35, 25, 12500),
  MilitaryLaser(TechLevel.t7, false, 15, 35, 35000),
  MorgansLaser(TechLevel.t8, false, 0, 85, 50000),
  PhotonDisruptor(TechLevel.t6, true, 0, 20, 15000),
  QuantumDistruptor(TechLevel.t8, true, 0, 60, 50000);
  public final TechLevel tl;
  public final boolean disabler;
  public final int chance;
  public final int cost;
  public final int id;
  public final int power;

  private WeaponType(TechLevel t, boolean b, int i, int j, int k) {
    tl = t;
    disabler = b;
    chance = i;
    power = j;
    cost = k;
    id = ordinal();
  }

  public static WeaponType fromId(int i) {
    return values()[i];
  }

  @Override
  public int CastToInt() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int asInteger() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
