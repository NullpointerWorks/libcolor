/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

/**
 * 
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class Colorizer 
{
	private Colorizer() {}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public static final ColorizerARGB argb = new ColorizerARGB();
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public static final ColorizerRGB rgb = new ColorizerRGB();
	
	/**
	 * Percentage based color compilation. aRGB values range from [0,1]
	 * @param a - 
	 * @param r - 
	 * @param g - 
	 * @param b - 
	 * @since 1.0.0
	 */
	public static int toInt(float a, float r, float g, float b)
	{
		int ca = rnd(a*255f);
		int cr = rnd(r*255f);
		int cg = rnd(g*255f);
		int cb = rnd(b*255f);
		return toInt(ca, cr, cg, cb);
	}
	
	/**
     * Pass in aRGB values [0,255]. returns the integer value
	 * @param a - 
	 * @param r - 
	 * @param g - 
	 * @param b - 
	 * @since 1.0.0
     */
	public static int toInt(int a,int r,int g,int b)
	{
		return ( a<<24 | r<<16 | g<<8 | b );
	}
	
	/**
	 * Percentage based color compilation. RGB values range from [0,1]
	 * @param r - 
	 * @param g - 
	 * @param b - 
	 * @since 1.0.0
	 */
	public static int toInt(float r, float g, float b)
	{
		int cr = rnd(r*255f);
		int cg = rnd(g*255f);
		int cb = rnd(b*255f);
		return toInt(255, cr, cg, cb);
	}
	
    /**
     * Pass in RGB values [0,255]. returns the integer value with full alpha
	 * @param r - 
	 * @param g - 
	 * @param b - 
	 * @since 1.0.0
     */
	public static int toInt(int r,int g, int b)
	{
		return ( (-16777216) | r<<16 | g<<8 | b );
	}
	
	/**
	 * Returns the color integer value of the given 6-digit hexadecimal string. 
	 * @since 1.0.0
	 */
	public static int fromHex(String hex)
	{
		hex = hex.replace("0x", "");
		hex = hex.replace("0X", "");
		hex = hex.replace("#", "");
		hex = hex.replace("h", "");
		hex = hex.replace("H", "");
		int r=0,g=0,b=0,a=255;
		if (hex.length() == 6)
		{
			r = Integer.parseInt( hex.substring(0, 2), 16 );
			g = Integer.parseInt( hex.substring(2, 4), 16 );
			b = Integer.parseInt( hex.substring(4, 6), 16 );
		}
		else throw new NumberFormatException();
		return toInt(a, r, g, b);
	}
	
	/**
	 * Returns the color hex value of the given integer
	 * @param r - 
	 * @param g - 
	 * @param b - 
	 */
	public static String toHex(int r, int g, int b)
	{
		r = clamp(0, r, 255);
		g = clamp(0, g, 255);
		b = clamp(0, b, 255);
		String rhex = Integer.toHexString(r);
		String ghex = Integer.toHexString(g);
		String bhex = Integer.toHexString(b);
		return rhex+ghex+bhex;
	}
	
	private static int rnd(float x) 
	{
		return (int)(x+0.5f);
	}
	
	private static int clamp(int l, int x, int h) 
	{
		x = (x<l)?l:x;
		x = (x>h)?h:x;
		return x;
	}
}
