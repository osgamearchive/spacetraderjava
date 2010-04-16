package spacetrader.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface PersistenceProvider
{
	String getCustomImageDir();
	String getCustomTemplateDir();
	String getHighScoresFilename();
	String getDefultSettingsFilename();

	OutputStream openFileWrite(String filename) throws IOException;
	InputStream openFileRead(String filename) throws IOException;
}
