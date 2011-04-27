package spacetrader.enums;


public enum TechLevel implements SpaceTraderEnum {
  PreAgricultural, // = 0,
  Agricultural, // = 1,
  Medieval, // = 2,
  Renaissance, // = 3,
  EarlyIndustrial, // = 4,
  Industrial, // = 5,
  PostIndustrial, // = 6,
  HiTech, // = 7,
  Unavailable;// = 8

  @Override
  public int CastToInt() {
    return ordinal();
  }

  public static TechLevel FromInt(int i) {
    return values()[i];
  }
}