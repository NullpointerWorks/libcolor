/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

import com.nullpointerworks.color.colorizer.ColorizerARGB;
import com.nullpointerworks.color.colorizer.ColorizerRGB;
import com.nullpointerworks.color.colorizer.IColorizer;

/**
 * This class contains various tools for basic color formatting into the 32 bit integer format. 
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public abstract class Colorizer implements IColorizer
{
	/**
	 * Returns a 32 bit color manipulation class that handles 8 bit color channels in the specified format.
	 * @param cf - the color format
	 * @return a 32 bit color manipulation object in the specified format
	 * @since 1.0.0
	 */
	public static final Colorizer getColorizer(ColorFormat cf)
	{
		switch(cf)
		{
		default:
		case RGB: return new ColorizerRGB();
		case ARGB: return new ColorizerARGB();
		}
	}
	
	/*
	 * rounding function
	 */
	protected final int rnd(float x) 
	{
		return (int)(x+0.5f);
	}
	
	/*
	 * simple clamping function
	 */
	protected final int clamp(int l, int x, int h) 
	{
		x = (x<l)?l:x;
		x = (x>h)?h:x;
		return x;
	}
	
	/*
	 * Integer Lerp - interpolate two integers
	 */
	protected final int il256(int A, int B, int F)
	{
		return (A*(256-F) + B * F) >> 8;
	}
	
	/*
	 * Square Integer Lerp - square interpolate two integers 
	 */
	protected final int sil256(int A, int B, int F)
	{
		A=A*A; B=B*B;
		int x = il256(A,B,F);
		return (int)((Math.sqrt(x)+0.5));
	}
}
