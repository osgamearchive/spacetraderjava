package spacetrader.guifacade;

import spacetrader.enums.AlertType;

/**
 * Ment to be the connecting link between the game engien and the GUI. Will help later
 * with replacing the GUI layer.
 *
 * It holds things refactored UP from the controller classes. Also see GameController.
 *
 * @author Aviv
 *
 */
public class GuiFacade
{
	public static DialogResult alert(AlertType type)
	{
		return GuiEngine.alert.alert(type);
	}

	public static DialogResult alert(AlertType type, String var1, String var2)
	{
		return GuiEngine.alert.alert(type, var1, var2);
	}

	public static DialogResult alert(AlertType type, String var1, String var2, String var3)
	{
		return GuiEngine.alert.alert(type, var1, var2, var3);
	}

	public static DialogResult alert(AlertType type, String[] args)
	{
		return GuiEngine.alert.alert(type, args);
	}
	public static DialogResult alert(AlertType type, String var1)
	{
		return GuiEngine.alert.alert(type, var1);
	}
}
