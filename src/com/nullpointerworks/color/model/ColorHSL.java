/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.model;

/*
 * hue - saturation - lightness
 */
public class ColorHSL 
{
	public ColorHSL() {}
	public ColorHSL(float h,float s,float l)
	{
		H=h; S=s; L=l;
	}
	/**
	 * hue = [0-360] degrees 
	 */
	public float H = 0f;
	/**
	 * saturation [0-1] 
	 */
	public float S = 0f;
	/**
	 * lightness [0-1] 
	 */
	public float L = 0f;
}
