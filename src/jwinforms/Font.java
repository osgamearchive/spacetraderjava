package jwinforms;

import java.awt.GraphicsEnvironment;
import java.util.HashSet;
import java.util.Set;

public class Font extends java.awt.Font
{
	public Font(String name, float size)
	{
		this(name, FontStyle.Regular, size, GraphicsUnit.Point);
	}

	public Font(String name, float size, FontStyle style, GraphicsUnit unit, int b)
	{
		this(name, style, size, unit);
	}

	private Font(String name, FontStyle style, float size, GraphicsUnit unit)
	{
		super(name, style.awtFontstyle, (int)unit.toPixels(size));
		Name = getName();
		FontFamily = getFamily();
	}

	Font(java.awt.Font source)
	{
		super(source);
		Name = getName();
		FontFamily = getFamily();
	}

	public final String FontFamily;
	public final String Name;

	public static final String WINDOWS_DEFAULT_FONT_FAMILY;

	static
	{
		String[] preferedFonts = new String[] { "Microsoft Sans Serif", // What Windows says.
				"Tahoma", // Basically the same. Mostly on Windows
				"Geneva", // Very similar font, can be found on the Macintosh
				"Kalimati" // Similar, should be present in common Linuxes.
		};

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		HashSet<String> names = new HashSet<String>();
		for (String family : ge.getAvailableFontFamilyNames())
			names.add(family);
		WINDOWS_DEFAULT_FONT_FAMILY = findInSet(names, preferedFonts);
	}

	private static String findInSet(Set<String> set, String[] targets)
	{
		for (String string : targets)
			if (set.contains(string))
				return string;
		return null;
	}
}
