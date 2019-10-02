/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.colorizer;

import com.nullpointerworks.color.Colorizer;

/**
 * A 32 bit color manipulation class that, along with RGB, also handles the alpha channel in the ARGB format.
 * <pre>
 * alpha    red      green    blue
 * 00000000 00000000 00000000 00000000
 * 32----25 24----17 16-----9 8------1
 * MSB                             LSB
 * </pre>
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ColorizerARGB extends Colorizer
{
	@Override
	public int lerp(int c1, int c2, float lambda)
	{
		int a = (c1>>24)& 0xFF;
		int r = (c1>>16)& 0xFF;
		int g = (c1>>8) & 0xFF;
		int b = (c1) 	& 0xFF;
		
		int a2 = (c2>>24)& 0xFF;
		int r2 = (c2>>16)& 0xFF;
		int g2 = (c2>>8) & 0xFF;
		int b2 = (c2) 	 & 0xFF;
		
		int A = (int)(lambda*256f + 0.5f);
		a = il256(a, a2, A);
		r = il256(r, r2, A);
		g = il256(g, g2, A);
		b = il256(b, b2, A);
		return toInt(a,r,g,b);
	}
	
	@Override
	public int slerp(int c1, int c2, float lambda)
	{
		int a = (c1>>24) & 0xFF;
		int r = (c1>>16) & 0xFF;
		int g = (c1>>8)  & 0xFF;
		int b = (c1) 	 & 0xFF;
		
		int a2 = (c2>>24)& 0xFF;
		int r2 = (c2>>16)& 0xFF;
		int g2 = (c2>>8) & 0xFF;
		int b2 = (c2) 	 & 0xFF;
		
		int A = (int)(lambda*256f + 0.5f);
		a = sil256(a, a2, A);
		r = sil256(r, r2, A);
		g = sil256(g, g2, A);
		b = sil256(b, b2, A);
		return toInt(a,r,g,b);
	}
	
	@Override
	public int fromHex(String hex)
	{
		hex = hex.replace("0x", "");
		hex = hex.replace("0X", "");
		hex = hex.replace("#", "");
		hex = hex.replace("h", "");
		hex = hex.replace("H", "");
		int a=0,r=0,g=0,b=0;
		if (hex.length() == 8)
		{
			a = Integer.parseInt( hex.substring(0, 2), 16 );
			r = Integer.parseInt( hex.substring(2, 4), 16 );
			g = Integer.parseInt( hex.substring(4, 6), 16 );
			b = Integer.parseInt( hex.substring(6, 8), 16 );
		}
		else throw new NumberFormatException();
		return toInt(a, r, g, b);
	}
	
	/**
	 * Returns the hex value as a {@code String} of the given integer.
	 * @param r - the red color channel
	 * @param g - the green color channel
	 * @param b - the blue color channel
	 * @return the hex value as a {@code String} of the given integer
	 * @since 1.0.0
	 */
	public String toHex(int a, int r, int g, int b)
	{
		a = clamp(0, a, 255);
		r = clamp(0, r, 255);
		g = clamp(0, g, 255);
		b = clamp(0, b, 255);
		String ahex = Integer.toHexString(a);
		String rhex = Integer.toHexString(r);
		String ghex = Integer.toHexString(g);
		String bhex = Integer.toHexString(b);
		return ahex+rhex+ghex+bhex;
	}
	
	/**
     * Pass in RGB values [0,255]. Returns the integer value at a specified opacity.
	 * @param a - the alpha transparency channel
	 * @param r - the red color channel
	 * @param g - the green color channel
	 * @param b - the blue color channel
	 * @return the integer value of the color
	 * @since 1.0.0
     */
	public int toInt(int a, int r,int g,int b)
	{
		return ( a<<24 | r<<16 | g<<8 | b );
	}
	
	/**
	 * Percentage based color compilation. RGB values range from [0,1]. Returns the integer value at a specified opacity.
	 * @param a - the alpha transparency channel
	 * @param r - the red color channel
	 * @param g - the green color channel
	 * @param b - the blue color channel
	 * @return the integer value of the color
	 * @since 1.0.0
	 */
	public int toInt(float a, float r, float g, float b)
	{
		int ca = rnd(a*255f);
		int cr = rnd(r*255f);
		int cg = rnd(g*255f);
		int cb = rnd(b*255f);
		return toInt(ca, cr, cg, cb);
	}
}
