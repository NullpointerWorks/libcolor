/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors.hsl;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * This converter implementation compiles HSV(Hue, Saturation, Value) data from HSL(Hue, Saturation, Lightness) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertHSLtoHSV implements IConverter
{
	/**
	 * Returns a new HSL to HSV converter instance.
	 * @return a new HSL to HSV converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertHSLtoHSV();}
	
	@Override
	public Color convert(Color c)
	{
		float h = c.getComponent(0);
		float s = c.getComponent(1)*0.5f;
	    float l = c.getComponent(2);
	    float H = h;
	    float V = l + s*( 1f - Math.abs(2f*l - 1f) );
	    float S = 2f * (V - l) / V;
		return new Color(ColorModel.HSV, H,S,V);
	}
}
