/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.model;

/**
 * Cyan - Magenta - Yellow - Key
 */
public class ColorCMYK 
{
	public ColorCMYK(){}
	public ColorCMYK(float c, float m, float y, float k)
	{
		C=c;M=m;Y=y;K=k;
	}
	public float C = 0;
	public float M = 0;
	public float Y = 0;
	public float K = 0;
}
