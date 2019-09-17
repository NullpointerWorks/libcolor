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
public class ColorizerRGB
{
	ColorizerRGB() {}
	
	/**
	 * Performs a linear interpolation between two colors using a given lambda [0-1]. The provided integer colors are 8 bits per channel in ARGB format.
	 * @since 1.0.0
	 */
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
	
	/**
	 * square interpolate between two RGB colors using a given lambda
	 * @since 1.0.0
	 */
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
	
    /*
     * Pass in RGB values [0,255]. returns the integer value with full alpha
     */
	private int toInt(int r,int g, int b)
	{
		return ( (-16777216) | r<<16 | g<<8 | b );
	}
	
	/*
	 * Integer Lerp - interpolate two integers
	 */
	private int il256(int A, int B, int F)
	{
		return (A*(256-F) + B * F) >> 8;
	}
	
	/*
	 * Square Integer Lerp - square interpolate two integers 
	 */
	private int sil256(int A, int B, int F)
	{
		A=A*A; B=B*B;
		int x = il256(A,B,F);
		return (int)((Math.sqrt(x)+0.5));
	}
}
