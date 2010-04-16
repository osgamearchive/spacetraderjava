/*******************************************************************************
 *
 * Space Trader for Windows 2.00
 *
 * Copyright (C) 2005 Jay French, All Rights Reserved
 *
 * Additional coding by David Pierron
 * Original coding by Pieter Spronck, Sam Anderson, Samuel Goldstein, Matt Lee
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * If you'd like a copy of the GNU General Public License, go to
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * You can contact the author at spacetrader@frenchfryz.com
 *
 ******************************************************************************/
package spacetrader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import spacetrader.enums.AlertType;
import spacetrader.enums.Difficulty;
import spacetrader.guifacade.GuiFacade;
import spacetrader.persistence.Persistence;
import spacetrader.stub.BinaryFormatter;
import spacetrader.stub.SerializationException;
import spacetrader.util.Hashtable;
import spacetrader.util.Log;
import spacetrader.util.Util;

public class Functions
{
	private static Random rand = new Random();

	private final static long DEFSEEDX = 521288629;
	private final static long DEFSEEDY = 362436069;
	private final static int MAX_WORD = 65535;

	private static long SeedX = DEFSEEDX;
	private static long SeedY = DEFSEEDY;

	public static int AdjustSkillForDifficulty(int skill)
	{
		Difficulty diff = Game.currentGame().Difficulty();
		skill = diff.adjustSkill(skill);

		return skill;
	}

	public static String[] ArrayListtoStringArray(List<?> list)
	{
		String[] items = new String[list.size()];

		for (int i = 0; i < items.length; i++)
			items[i] = (String)list.get(i);

		return items;
	}

	public static <T> String[] arrayToStringArray(T[] array)
	{
		String[] items = new String[array.length];

		for (int i = 0; i < items.length; i++)
			items[i] = array[i].toString();

		return items;
	}

	public static int Distance(StarSystem a, StarSystem b)
	{
		return (int)Math.floor(Math.sqrt(Math.pow(a.X() - b.X(), 2) + Math.pow(a.Y() - b.Y(), 2)));
	}

	public static int Distance(StarSystem a, int x, int y)
	{
		return (int)Math.floor(Math.sqrt(Math.pow(a.X() - x, 2) + Math.pow(a.Y() - y, 2)));
	}

	public static String FormatNumber(int num)
	{
		// return String.format("{0:n0}", num);
		return String.format("%,d", num);
	}

	public static String FormatList(String[] listItems)
	{
		return StringVars(Strings.ListStrings[listItems.length], listItems);
	}

	public static String FormatMoney(int num)
	{
		// return String.format("{0:n0} cr.", num);
		return String.format("%,d cr.", num);
	}

	public static String FormatPercent(int num)
	{
		// return String.format("{0:n0}%", num);
		return String.format("%,d%%", num);
	}

	public static HighScoreRecord[] GetHighScores()
	{
		Object obj = LoadFile(Persistence.getHighScoresFilename(), true);
		if (obj == null)
			return new HighScoreRecord[3];

		return (HighScoreRecord[])STSerializableObject.ArrayListToArray((List<Hashtable>)obj, "HighScoreRecord");
	}

	public static int GetRandom(int max)
	{
		return GetRandom(0, max);
	}

	public static int GetRandom(int min, int max)
	{
		if (max == min)
			// Fix the Single Tribblet bug --avv
			return max;
		// return rand.Next(min, max);
		return rand.nextInt(max - min) + min;
	}

	// *************************************************************************
	// Pieter's new random functions, tweaked a bit by SjG
	// *************************************************************************
	public static int GetRandom2(int max)
	{
		return (int)(Rand() % max);
	}

	public static boolean IsInt(String toParse)
	{
		try
		{
			Integer.parseInt(toParse);
			return true;
		} catch (Exception e)
		{
			return false;
		}
	}

	public static Object LoadFile(String fileName, boolean ignoreMissingFile)
	{
		InputStream inStream = null;

		try
		{
			inStream = Persistence.openFileRead(fileName);
			return (new BinaryFormatter()).Deserialize(inStream);
		} catch (FileNotFoundException ex)
		{
			if (!ignoreMissingFile)
				GuiFacade.alert(AlertType.FileErrorOpen, fileName, ex.getMessage());
		} catch (IOException ex)
		{
			GuiFacade.alert(AlertType.FileErrorOpen, fileName, ex.getMessage());
		} catch (SerializationException ex)
		{
			GuiFacade.alert(AlertType.FileErrorOpen, fileName, Strings.FileFormatBad);
		} finally
		{
			if (inStream != null)
				try
				{
					inStream.close();
				} catch (IOException e)
				{
					Log.write("Can't close instream... 231");
				}
		}

		return null;
	}

	public static String Multiples(int num, String unit)
	{
		return FormatNumber(num) + " " + unit + (num == 1 ? "" : "s");
	}

	private static long Rand()
	{
		final int a = 18000;
		final int b = 30903;

		SeedX = a * (SeedX & MAX_WORD) + (SeedX >> 16);
		SeedY = b * (SeedY & MAX_WORD) + (SeedY >> 16);

		return ((SeedX << 16) + (SeedY & MAX_WORD));
	}

	public static int RandomSkill()
	{
		return 1 + GetRandom(5) + GetRandom(6);
	}

	public static void RandSeed(int seed1, int seed2)
	{
		if (seed1 > 0)
			SeedX = seed1; /* use default seeds if parameter is 0 */
		else
			SeedX = DEFSEEDX;

		if (seed2 > 0)
			SeedY = seed2;
		else
			SeedY = DEFSEEDY;
	}

	public static boolean SaveFile(String fileName, Object toSerialize)
	{
		OutputStream outStream = null;

		try
		{
			new File(fileName).createNewFile();
			outStream = Persistence.openFileWrite(fileName);
			(new BinaryFormatter()).Serialize(outStream, toSerialize);
			return true;
		} catch (IOException ex)
		{
			ex.printStackTrace();
			GuiFacade.alert(AlertType.FileErrorSave, fileName, ex.getMessage());
		} finally
		{
			if (outStream != null)
				try
				{
					outStream.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}

		return false;
	}

	public static String StringVars(String toParse, String[] vars)
	{
		String parsed = toParse;

		for (int i = 0; i < vars.length; i++)
			parsed = parsed.replaceAll("\\^" + (i + 1), vars[i]);

		return parsed;
	}

	public static String StringVars(String toParse, String var1)
	{
		return StringVars(toParse, new String[] { var1 });
	}

	public static String StringVars(String toParse, String var1, String var2)
	{
		return StringVars(toParse, new String[] { var1, var2 });
	}

	/**
	 * Returns true if there exists a wormhole from a to b. If b < 0, then return true if
	 * there exists a wormhole at all from a.
	 */
	public static boolean WormholeExists(int a, int b)
	{
		int[] wormholes = Game.currentGame().Wormholes();
		int i = Util.BruteSeek(wormholes, a);
		// int i = Array.IndexOf(wormholes, a);

		return (i >= 0 && (b < 0 || wormholes[(i + 1) % wormholes.length] == b));
	}

	public static boolean WormholeExists(StarSystem a, StarSystem b)
	{
		StarSystem[] universe = Game.currentGame().Universe();
		int[] wormholes = Game.currentGame().Wormholes();
		// int i = Array.IndexOf(wormholes, (int) a.Id);
		int i = Util.BruteSeek(wormholes, a.Id().CastToInt());

		return (i >= 0 && (universe[wormholes[(i + 1) % wormholes.length]] == b));
	}

	public static StarSystem WormholeTarget(int a)
	{
		int[] wormholes = Game.currentGame().Wormholes();
		// int i = Array.IndexOf(wormholes, a);
		int i = Util.BruteSeek(wormholes, a);

		return (i >= 0 ? (Game.currentGame().Universe()[wormholes[(i + 1) % wormholes.length]]) : null);
	}
}
