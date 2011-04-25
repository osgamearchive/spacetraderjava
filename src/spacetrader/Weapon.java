package spacetrader;
import org.gts.bst.ship.equip.EquipmentSubType;
import org.gts.bst.ship.equip.WeaponType;
import spacetrader.enums.TechLevel;
import spacetrader.util.Hashtable;
import spacetrader.util.Log;


public class Weapon extends Equipment {
  private WeaponType _type;
  private boolean _disabling;
  private int _power;

  public Weapon(Hashtable hash) {
    super(hash);
    _type = WeaponType.FromInt(GetValueFromHash(hash, "_type", Integer.class));
    _power = GetValueFromHash(hash, "_power", Integer.class);
    _disabling = GetValueFromHash(hash, "_disabling", false);
  }

  public Weapon(WeaponType type, int power, boolean disabling, int price, TechLevel minTechLevel, int chance) {
    super(org.gts.bst.ship.equip.EquipmentType.Weapon, price, minTechLevel, chance);
    _type = type;
    _power = power;
    _disabling = disabling;
  }

  @Override
  public Equipment Clone() {
    return new Weapon(_type, _power, _disabling, _price, _minTech, _chance);
  }

  @Override
  public Hashtable Serialize() {
    Hashtable hash = super.Serialize();
    hash.add("_type", _type.CastToInt());
    hash.add("_power", _power);
    hash.add("_disabling", _disabling);
    return hash;
  }

  @Override
  public boolean TypeEquals(Object type) {
    boolean equal = false;
    try {
      if(Type() == (WeaponType)type) {
        equal = true;
      }
    } catch(Exception e) {
      Log.write("Ignored exeption " + e);
    }
    return equal;
  }

  public boolean Disabling() {
    return _disabling;
  }

  @Override
  public String Name() {
    return Strings.WeaponNames[_type.CastToInt()];
  }

  public int Power() {
    return _power;
  }

  @Override
  public EquipmentSubType SubType() {
    return Type();
  }

  public WeaponType Type() {
    return _type;
  }
}
