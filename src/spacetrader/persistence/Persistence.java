package spacetrader.persistence;

import java.io.*;

/**
 * An abstruction point for the various persistence used in the game.
 *
 * Note that the "filename" etc. may be something else entirely, based on implementation.
 *
 * @author Aviv
 */
//* Supported data:
// * - custom image, ship template dirs (Where to look for them. const)
// * - high-score file (rw)
// * - default settings (rw)
//
// * Supported actions:
// * - browse file system (or equiv)
// * - save a game w/name ("full path")
public class Persistence
{
	//TODO default value (null-implementation? filesys?)
	private static PersistenceProvider impl;

	public static void installProvider(PersistenceProvider provider)
	{
		impl = provider;
	}

	public static String getCustomImageDir()
	{
		return impl.getCustomImageDir();
	}
	public static String getCustomTemplateDir()
	{
		return impl.getCustomTemplateDir();
	}
	public static String getHighScoresFilename()
	{
		return impl.getHighScoresFilename();
	}
	public static String getDefultSettingsFilename()
	{
		return impl.getDefultSettingsFilename();
	}

	public static OutputStream openFileWrite(String filename) throws IOException
	{
		return impl.openFileWrite(filename);
	}
	public static InputStream openFileRead(String filename) throws IOException
	{
		return impl.openFileRead(filename);
	}
}
