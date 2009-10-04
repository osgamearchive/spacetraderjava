package jwinforms;

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
}
