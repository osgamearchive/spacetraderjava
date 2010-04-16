package spacetrader.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import spacetrader.Consts;
import spacetrader.stub.Directory;
import spacetrader.util.Environment;
import util.Path;

/**
 * Implementation for classical file systems (directory, file).
 *
 * @author Aviv
 */
public class FileBasedPersistenceProvider implements PersistenceProvider
{
	private static String baseDirectory = Environment.CurrentDirectory;
	private static String customDirectory = Path.Combine(baseDirectory, "custom");
	private static String dataDirectory = Path.Combine(baseDirectory, "data");
	private static String saveDirectory = Path.Combine(baseDirectory, "save");

	private static String customImagesDirectory = Path.Combine(customDirectory, "images");
	private static String customTemplatesDirectory = Path.Combine(customDirectory, "templates");

	private static String highScoreFile = Path.Combine(dataDirectory, "HighScores.bin");
	private static String defaultSettingsFile = Path.Combine(dataDirectory, "DefaultSettings.bin");

	public void InitFileStructure()
	{
		String[] paths = new String[] { customDirectory, customImagesDirectory, customTemplatesDirectory,
				dataDirectory, saveDirectory };

		for (String path : paths)
			if (!Directory.Exists(path))
				Directory.CreateDirectory(path);
	}

	public String getCustomImageDir()
	{
		return customImagesDirectory;
	}

	public String getCustomTemplateDir()
	{
		return customTemplatesDirectory;
	}

	public String getDefultSettingsFilename()
	{
		return defaultSettingsFile;
	}

	public String getHighScoresFilename()
	{
		return highScoreFile;
	}

	public InputStream openFileRead(String filename) throws IOException
	{
		return new FileInputStream(filename);
	}

	public OutputStream openFileWrite(String filename) throws IOException
	{
		return new FileOutputStream(filename, false);
	}

	public String getSaveDirectory()
	{
		return saveDirectory;
	}
}
