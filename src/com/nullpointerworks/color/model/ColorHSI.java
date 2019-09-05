/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.model;

/**
 * hue - saturation - intensity
 */
public class ColorHSI 
{
	public ColorHSI() {}
	public ColorHSI(float h,float s,float i)
	{
		H=h; S=s; I=i;
	}
	/**
	 * hue = [0-360] radians 
	 */
	public float H = 0f;
	/**
	 * saturation [0-1] 
	 */
	public float S = 0f;
	/**
	 * intensity [0-1] 
	 */
	public float I = 0f;
}
