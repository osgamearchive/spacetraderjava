package spacetrader;

import spacetrader.enums.Difficulty;
import spacetrader.guifacade.MainWindow;

/**
 * The only static access point to the game (From the GUI).
 *
 * @author Aviv
 */
public class GameFacade
{
	public static GameRules getRules()
	{
		return GameRules.instance();
	}

	public static boolean hasActiveGame()
	{
		return Game.currentGame() != null;
	}

	public static Game currentGame()
	{
		return Game.currentGame();
	}

	public static Game newGame(String commanderName, Difficulty difficulty, int pilot, int fighter, int trader,
			int engineer, MainWindow window)
	{
		return new Game(commanderName, difficulty, pilot, fighter, trader, engineer, window);
	}
}
