package spacetrader;
import jwinforms.Image;
import org.gts.bst.ship.ShipType;
import org.gts.bst.ship.Size;
import spacetrader.util.Hashtable;


public class ShipTemplate extends STSerializableObject implements Comparable<ShipTemplate> {
  private Image[] _images = null;
  private Size _size = org.gts.bst.ship.Size.Tiny;
  private String _name = null;
  private int _imageIndex = ShipType.Custom.CastToInt();
  private int _cargoBays = 0;
  private int _weaponSlots = 0;
  private int _shieldSlots = 0;
  private int _gadgetSlots = 0;
  private int _crewQuarters = 0;
  private int _fuelTanks = 0;
  private int _hullStrength = 0;

  public ShipTemplate(Size size, String name) {
    _name = name;
    _size = size;
    _images = Game.CurrentGame().getParentWindow().CustomShipImages();
  }

  public ShipTemplate(ShipSpec spec, String name) {
    _name = name;
    _size = spec.getSize();
    _imageIndex = spec.ImageIndex();
    _cargoBays = spec.CargoBays();
    _weaponSlots = spec.getWeaponSlots();
    _shieldSlots = spec.getShieldSlots();
    _gadgetSlots = spec.getGadgetSlots();
    _crewQuarters = spec.getCrewQuarters();
    _fuelTanks = spec.FuelTanks();
    _hullStrength = spec.HullStrength();
    if(ImageIndex() == Consts.ShipImgUseDefault) {
      _images = Game.CurrentGame().getParentWindow().CustomShipImages();
    }
  }

  public ShipTemplate(Hashtable hash) {
    _name = GetValueFromHash(hash, "_name", _name, String.class);
    _size = (GetValueFromHash(hash, "_size", _size));
    _imageIndex = GetValueFromHash(hash, "_imageIndex", _imageIndex);
    _cargoBays = GetValueFromHash(hash, "_cargoBays", _cargoBays);
    _weaponSlots = GetValueFromHash(hash, "_weaponSlots", _weaponSlots);
    _shieldSlots = GetValueFromHash(hash, "_shieldSlots", _shieldSlots);
    _gadgetSlots = GetValueFromHash(hash, "_gadgetSlots", _gadgetSlots);
    _crewQuarters = GetValueFromHash(hash, "_crewQuarters", _crewQuarters);
    _fuelTanks = GetValueFromHash(hash, "_fuelTanks", _fuelTanks);
    _hullStrength = GetValueFromHash(hash, "_hullStrength", _hullStrength);
    _images = GetValueFromHash(hash, "_images", _images);
  }

  @Override
  public int compareTo(ShipTemplate other) {
    if(other == null) {
      return 1;
    } else {
      return Name().compareTo((other).Name());
    }
  }

  @Override
  public Hashtable Serialize() {
    Hashtable hash = super.Serialize();
    hash.add("_name", _name);
    hash.add("_size", _size.CastToInt());
    hash.add("_imageIndex", _imageIndex);
    hash.add("_cargoBays", _cargoBays);
    hash.add("_weaponSlots", _weaponSlots);
    hash.add("_shieldSlots", _shieldSlots);
    hash.add("_gadgetSlots", _gadgetSlots);
    hash.add("_crewQuarters", _crewQuarters);
    hash.add("_fuelTanks", _fuelTanks);
    hash.add("_hullStrength", _hullStrength);
    if(_images != null) {
      hash.add("_images", _images);
    }
    return hash;
  }

  @Override
  public String toString() {
    return Name();
  }

  public int CargoBays() {
    return _cargoBays;
  }

  public void CargoBays(int value) {
    _cargoBays = value;
  }

  public int CrewQuarters() {
    return _crewQuarters;
  }

  public void CrewQuarters(int value) {
    _crewQuarters = value;
  }

  public int FuelTanks() {
    return _fuelTanks;
  }

  public void FuelTanks(int value) {
    _fuelTanks = value;
  }

  public int GadgetSlots() {
    return _gadgetSlots;
  }

  public void GadgetSlots(int value) {
    _gadgetSlots = value;
  }

  public int HullStrength() {
    return _hullStrength;
  }

  public void HullStrength(int value) {
    _hullStrength = value;
  }

  public int ImageIndex() {
    return _imageIndex;
  }

  public void ImageIndex(int value) {
    _imageIndex = value;
  }

  public Image[] Images() {
    return _images;
  }

  public void Images(Image[] value) {
    _images = value;
  }

  public String Name() {
    return _name;
  }

  public void Name(String value) {
    _name = value;
  }

  public int ShieldSlots() {
    return _shieldSlots;
  }

  public void ShieldSlots(int value) {
    _shieldSlots = value;
  }

  public Size Size() {
    return _size;
  }

  public void Size(Size value) {
    _size = value;
  }

  public int WeaponSlots() {
    return _weaponSlots;
  }

  public void WeaponSlots(int value) {
    _weaponSlots = value;
  }
}
