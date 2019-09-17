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
	private ColorModel cm = null;
	private float[] values = null;
	
	/**
	 * 
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
		for (int i=0, l=v.length; i<l; i++) values[i] = v[i];
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
