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
public class Color 
{
	public static final int LUCID 	= toInt(   0,   0,   0,   0);
	
	public static final int BLACK 	= toInt(   0,   0,   0);
	public static final int DGREY 	= toInt(  85,  85,  85);
	public static final int LGREY 	= toInt( 170, 170, 170);
	public static final int WHITE 	= toInt( 255, 255, 255);

	public static final int RED 	= toInt( 255,   0,   0);
	public static final int GREEN 	= toInt(   0, 255,   0);
	public static final int BLUE 	= toInt(   0,   0, 255);
	
	public static final int CYAN 	= toInt(   0, 255, 255);
	public static final int MAGENTA	= toInt( 255,   0, 255);
	public static final int YELLOW 	= toInt( 255, 255,   0);
	
	// =========================================================
	
	/**
	 * returns the aRGB values to string
	 */
	public static String toString(int c)
	{
		int a = (c>>24) & 0xFF;
		int r = (c>>16) & 0xFF;
		int g = (c>>8)  & 0xFF;
		int b = (c) 	& 0xFF;
		return "a:"+a+" r:"+r+" g:"+g+" b:"+b;
	}
	
	// =========================================================
	
	/**
	 * linear interpolate between two ARGB colors using a given lambda
	 */
	public static int lerp(int c1, int c2, float lambda)
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

	/**
	 * interpolate between two RGB colors using a given lambda
	 */
	public static int lerpRGB(int c1, int c2, float lambda)
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
	
	/**
	 * square interpolate between two RGB colors using a given lambda
	 */
	public static int slerp(int c1, int c2, float lambda)
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
	
	/**
	 * square interpolate between two RGB colors using a given lambda
	 */
	public static int slerpRGB(int c1, int c2, float lambda)
	{
		int r = (c1>>16)& 0xFF;
		int g = (c1>>8) & 0xFF;
		int b = (c1) 	& 0xFF;
		
		int r2 = (c2>>16)& 0xFF;
		int g2 = (c2>>8) & 0xFF;
		int b2 = (c2) 	 & 0xFF;
		
		int A = (int)(lambda*256f + 0.5f);
		r = sil256(r, r2, A);
		g = sil256(g, g2, A);
		b = sil256(b, b2, A);
		return toInt(r,g,b);
	}
	
	// =========================================================
	
	/**
	 * Percentage based color compilation. aRGB values range from [0,1]
	 */
	public static int toInt(float a, float r, float g, float b)
	{
		int ca = (int)(a*255f+0.5f);
		int cr = (int)(r*255f+0.5f);
		int cg = (int)(g*255f+0.5f);
		int cb = (int)(b*255f+0.5f);
		return toInt(ca, cr, cg, cb);
	}
	
	/**
	 * Percentage based color compilation. RGB values range from [0,1]
	 */
	public static int toInt(float r, float g, float b)
	{
		int cr = (int)(r*255f+0.5f);
		int cg = (int)(g*255f+0.5f);
		int cb = (int)(b*255f+0.5f);
		return toInt(255, cr, cg, cb);
	}
	
	/**
     * Pass in aRGB values [0,255]. returns the integer value
     */
	public static int toInt(int a, int r,int g,int b)
	{
		return ( a<<24 | r<<16 | g<<8 | b );
	}
	
    /**
     * Pass in RGB values [0,255]. returns the integer value with full alpha
     */
	public static int toInt(int r,int g, int b)
	{
		return ( (-16777216) | r<<16 | g<<8 | b );
	}
	
	/**
	 * Returns the color integer value of the given 6-digit hexadecimal string
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
	
	// ===================================================
	
	/**
	 * 
	 */
	private static int clamp(int l, int x, int h) 
	{
		if (x<l) return l;
		if (x>h) return h;
		return x;
	}

	/*
	 * Integer Lerp - interpolate two integers
	 */
	private static int il256(int A, int B, int F)
	{
		return (A*(256-F) + B * F) >> 8;
	}
	
	/*
	 * Square Integer Lerp - square interpolate two integers 
	 */
	private static int sil256(int A, int B, int F)
	{
		A=A*A; B=B*B;
		int x = il256(A,B,F);
		return (int)((Math.sqrt(x)+0.5));
	}
}
