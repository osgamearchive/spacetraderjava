package spacetrader.gui;

import java.io.File;

import jwinforms.Bitmap;
import jwinforms.Image;
import jwinforms.Rectangle;

import spacetrader.stub.RegistryKey;

public class Util
{
	public static RegistryKey GetRegistryKey()
	{
		File regfile = new File("registryKey.properties");

		return new RegistryKey(regfile);

		// return Registry.CurrentUser.OpenSubKey("Software",
		// true).CreateSubKey("FrenchFryz").CreateSubKey("SpaceTrader");
	}
	
	// yhe, this is on its way out. --avv
	public static Rectangle[] ShipImageOffsets = new Rectangle[] {
	// We only care about X and Width, so set Y and Height to 0.
			new Rectangle(22, 0, 19, 0), // Flea
			new Rectangle(18, 0, 27, 0), // Gnat
			new Rectangle(18, 0, 27, 0), // Firefly
			new Rectangle(18, 0, 27, 0), // Mosquito
			new Rectangle(12, 0, 40, 0), // Bumblebee
			new Rectangle(12, 0, 40, 0), // Beetle
			new Rectangle(7, 0, 50, 0), // Hornet
			new Rectangle(7, 0, 50, 0), // Grasshopper
			new Rectangle(2, 0, 60, 0), // Termite
			new Rectangle(2, 0, 60, 0), // Wasp
			new Rectangle(7, 0, 49, 0), // Space Monster
			new Rectangle(21, 0, 22, 0), // Dragonfly
			new Rectangle(15, 0, 34, 0), // Mantis
			new Rectangle(7, 0, 49, 0), // Scarab
			new Rectangle(9, 0, 46, 0), // Bottle
			new Rectangle(2, 0, 60, 0), // Custom
			new Rectangle(2, 0, 60, 0) // Scorpion
	};
}
