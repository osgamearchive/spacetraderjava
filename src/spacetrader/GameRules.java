package spacetrader;

public class GameRules
{
	static GameRules instance;

	public static GameRules instance()
	{
		if (instance == null)
			return instance = new GameRules();
		return instance;
	}
	private GameRules()
	{}

	public int maxTotalInitialPoints()
	{
		return 20;
	}

	public int maxInitialSkillPoints()
	{
		return 10;
	}
}
