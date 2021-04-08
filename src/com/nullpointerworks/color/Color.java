/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color;

/**
 * A container for holding floating-point color data. How the color is to be interpreted depends on the {@code ColorModel} since the color data is a generic {@code float[]}. All color data is assumed to be in the range [0,1]. All implemented color models in this library consist of three element {@code float[]} data.
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
	 * Creates a new color object with the provided color data. This color has the RGB color model by default.
	 * @param v - the list of color data
	 * @since 1.0.0
	 */
	public Color(float... v)
	{
		this(ColorModel.RGB, v);
	}
	
	/**
	 * Creates a new color object with the provided color data and color model.
	 * @param cm - the color model
	 * @param v - the list of color data
	 * @since 1.0.0
	 */
	public Color(ColorModel cm, float... v)
	{
		this.cm=cm;
		values = new float[v.length];
		for (int i=0, l=v.length; i<l; i++) setValue(i, v[i]);
	}
	
	/**
	 * Returns the color model of this object.
	 * @return the color model of this object
	 * @since 1.0.0
	 */
	public ColorModel getColorModel() {return cm;}
	
	/**
	 * Returns the value of the color data at the specified index.
	 * @param index - the component index
	 * @return the value of the color data at the specified index
	 * @since 1.0.0
	 */
	public float getComponent(int index) {return values[index];}
	
	/**
	 * Returns {@code true} if there's no color data available, {@code false} otherwise.
	 * @return {@code true} if there's no color data available, {@code false} otherwise
	 * @since 1.0.0
	 */
	public boolean isNull() {return values==null;}
	
	/**
	 * Sets the value of a color component to the specified value.
	 * @param index - the color data index
	 * @param v - the value to set to
	 * @since 1.0.0
	 */
	public void setValue(int index, float v) {values[index] = v;}
}
