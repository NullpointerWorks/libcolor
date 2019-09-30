/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

/**
 * A container for holding floating-point color data. How the color is to be interpreted depends on the {@code ColorModel} since the color data is a generic {@code float[]}. All color data is assumed to range [0,1].
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class Color 
{
	private ColorModel cm = null;
	private float[] values = null;
	
	/**
	 * Creates a color object with {@code null} values. 
	 * @since 1.0.0
	 */
	public Color() {}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public Color(float... v)
	{
		this(ColorModel.RGB, v);
	}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public Color(ColorModel cm, float... v)
	{
		this.cm=cm;
		values = new float[v.length];
		for (int i=0, l=v.length; i<l; i++) setValue(i, v[i]);
	}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public ColorModel getColorModel() {return cm;}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public float getComponent(int index) {return values[index];}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public boolean isNull() {return values==null;}
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public void setValue(int index, float v) {values[index] = v;}
}
