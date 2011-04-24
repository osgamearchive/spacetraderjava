package spacetrader.enums;

public enum PoliceRecordType implements SpaceTraderEnum// : int
{
	Psychopath, // = 0,
	Villain, // = 1,
	Criminal, // = 2,
	Crook, // = 3,
	Dubious, // = 4,
	Clean, // = 5,
	Lawful, // = 6,
	Trusted, // = 7,
	Liked, // = 8,
	Hero; // = 9

	public int CastToInt()
	{
		return ordinal();
	}
}