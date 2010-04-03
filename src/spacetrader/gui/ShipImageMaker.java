package spacetrader.gui;

import java.awt.Color;

import jwinforms.Graphics;
import jwinforms.GraphicsUnit;
import jwinforms.Image;
import jwinforms.Rectangle;
import spacetrader.Consts;
import spacetrader.Ship;
import spacetrader.ShipSpec;
import spacetrader.guifacade.GuiEngine;

public class ShipImageMaker
{
	public static void PaintShipImage(Ship ship, Graphics graphics, Color backgroundColor)
	{
		// TODO ShipImageOffsets is a nice idea, but needs to go if we want to be able to change images. Like, higher res ones.
		int x = Consts.ShipImageOffsets[ship.Type().CastToInt()].X;
		int width = Consts.ShipImageOffsets[ship.Type().CastToInt()].Width;
		int startDamage = x + width - ship.getHull() * width / ship.HullStrength();
		int startShield = x + width + 2
				- (ship.ShieldStrength() > 0 ? ship.ShieldCharge() * (width + 4) / ship.ShieldStrength() : 0);

		graphics.clear(backgroundColor);

		if (startDamage > x)
		{
			if (startShield > x)
				DrawPartialImage(graphics, ShipImageMaker.ImageDamaged(ship), x, Math.min(startDamage, startShield));

			if (startShield < startDamage)
				DrawPartialImage(graphics, ShipImageMaker.ImageDamagedWithShields(ship), startShield, startDamage);
		}

		if (startShield > startDamage)
			DrawPartialImage(graphics, ShipImageMaker.Image(ship), startDamage, startShield);

		if (startShield < x + width + 2)
			DrawPartialImage(graphics, ImageWithShields(ship), startShield, x + width + 2);
	}

	private static void DrawPartialImage(Graphics g, Image img, int start, int stop)
	{
		g.DrawImage(img, 2 + start, 2, new Rectangle(start, 0, stop - start, img.getHeight()), GraphicsUnit.Pixel);
	}

	public static Image ImageWithShields(Ship ship)
	{
		return SpaceTrader.INSTANCE.ShipImages().getImages()[ship.ImageIndex() * Consts.ImagesPerShip
				+ Consts.ShipImgOffsetShield];
	}

	public static Image ImageDamagedWithShields(Ship ship)
	{
		return SpaceTrader.INSTANCE.ShipImages().getImages()[ship.ImageIndex() * Consts.ImagesPerShip
		+ Consts.ShipImgOffsetSheildDamage];
	}

	public static Image ImageDamaged(Ship ship)
	{
		return SpaceTrader.INSTANCE.ShipImages().getImages()[ship.ImageIndex() * Consts.ImagesPerShip
		+ Consts.ShipImgOffsetDamage];
	}

	public static Image Image(ShipSpec ship)
	{
		return SpaceTrader.INSTANCE.ShipImages().getImages()[ship.ImageIndex() * Consts.ImagesPerShip
		+ Consts.ShipImgOffsetNormal];
	}

	public static Image[] produceCustomImages(String descriptor)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static String describeCustomImages(Image[] customShipImages)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
