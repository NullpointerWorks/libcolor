/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.model;

import com.nullpointerworks.color.Color;

public class ColorRGB 
{
	public ColorRGB(){}
	public ColorRGB(float r, float g, float b)
	{
		R=r; G=g; B=b;
	}
	public ColorRGB(int col)
	{
		A = ((col>>24) & 0xFF)/255f;
		R = ((col>>16) & 0xFF)/255f;
		G = ((col>>8)  & 0xFF)/255f;
		B = ((col) 	  & 0xFF)/255f;
	}

	public float A = 1f;
	public float R = 0f;
	public float G = 0f;
	public float B = 0f;
	
	public int toInt()
	{
		return Color.toInt(A*255f,R*255f,G*255f,B*255f);
	}
}
