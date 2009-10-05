package spacetrader.gui;

import jwinforms.Font;
import jwinforms.FontStyle;
import jwinforms.GraphicsUnit;

final class FontCollection
{
	private static final String FONT_FAMILY = Font.WINDOWS_DEFAULT_FONT_FAMILY;


	static final Font regular825 = new Font(FONT_FAMILY, 8.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
	static final Font bold825 = new Font(FONT_FAMILY, 8.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
	static final Font bold10 = new Font(FONT_FAMILY, 10F, FontStyle.Bold, GraphicsUnit.Point, 0);
	static final Font bold12 = new Font(FONT_FAMILY, 12F, FontStyle.Bold, GraphicsUnit.Point, 0);

	private FontCollection()
	{}
}
