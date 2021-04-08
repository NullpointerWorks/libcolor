/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.colorizer;

import com.nullpointerworks.color.Colorizer;

/**
 * A 32 bit color manipulation class that manipulates the RGB channels of the provided integers. All RGB colors compiled through this class will have full opacity.
 * <pre>
 * alpha    red      green    blue
 * 11111111 00000000 00000000 00000000
 * 32----25 24----17 16-----9 8------1
 * MSB                             LSB
 * </pre>
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ColorizerRGB extends Colorizer
{
	@Override
	public int lerp(int c1, int c2, float lambda)
	{
		int r = (c1>>16)& 0xFF;
		int g = (c1>>8) & 0xFF;
		int b = (c1) 	& 0xFF;
		
		int r2 = (c2>>16)& 0xFF;
		int g2 = (c2>>8) & 0xFF;
		int b2 = (c2) 	 & 0xFF;
		
		int A = (int)(lambda*256f + 0.5f);
		r = il256(r, r2, A);
		g = il256(g, g2, A);
		b = il256(b, b2, A);
		return toInt(r,g,b);
	}
	
	@Override
	public int slerp(int c1, int c2, float lambda)
	{
		int r = (c1>>16) & 0xFF;
		int g = (c1>>8)  & 0xFF;
		int b = (c1) 	 & 0xFF;
		
		int r2 = (c2>>16)& 0xFF;
		int g2 = (c2>>8) & 0xFF;
		int b2 = (c2) 	 & 0xFF;
		
		int A = (int)(lambda*256f + 0.5f);
		r = sil256(r, r2, A);
		g = sil256(g, g2, A);
		b = sil256(b, b2, A);
		return toInt(r,g,b);
	}
	
	@Override
	public int fromHex(String hex)
	{
		hex = hex.replace("0x", "");
		hex = hex.replace("0X", "");
		hex = hex.replace("#", "");
		hex = hex.replace("h", "");
		hex = hex.replace("H", "");
		int r=0,g=0,b=0;
		if (hex.length() == 6)
		{
			r = Integer.parseInt( hex.substring(0, 2), 16 );
			g = Integer.parseInt( hex.substring(2, 4), 16 );
			b = Integer.parseInt( hex.substring(4, 6), 16 );
		}
		else throw new NumberFormatException();
		return toInt(r, g, b);
	}
	
	/**
     * Pass in RGB values [0,255]. Returns the integer value at full opacity.
	 * @param rgb - a list of colors values in the order of R, G and B
	 * @return the integer value of the color
	 * @since 1.0.0
     */
	public int toInt(int... rgb)
	{
		return ( (-16777216)| rgb[0]<<16 | rgb[1]<<8 | rgb[2] );
	}
	
	/**
	 * Percentage based color compilation. RGB values range from [0,1]. Returns the integer value at full opacity.
	 * @param argb - a list of colors values in the order of R, G and B
	 * @return the integer value of the color
	 * @since 1.0.0
	 */
	public int toInt(float... rgb)
	{
		int cr = rnd(rgb[0]*255f);
		int cg = rnd(rgb[1]*255f);
		int cb = rnd(rgb[2]*255f);
		return toInt(cr, cg, cb);
	}

	/**
	 * Returns the hex value as a {@code String} of the given integer.
	 * @param rgb - a list of colors values in the order of A, R, G and B
	 * @return the hex value as a {@code String} of the given integer
	 * @since 1.0.0
	 */
	@Override
	public String toHex(int... rgb)
	{
		int r = clamp(0, rgb[0], 255);
		int g = clamp(0, rgb[1], 255);
		int b = clamp(0, rgb[2], 255);
		String rhex = Integer.toHexString(r);
		String ghex = Integer.toHexString(g);
		String bhex = Integer.toHexString(b);
		return rhex+ghex+bhex;
	}
}
