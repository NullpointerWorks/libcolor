/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.hsv;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * This converter implementation compiles HSL(Hue, Saturation, Lightness) data from HSV(Hue, Saturation, Value) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertHSVtoHSL implements IConverter
{
	/**
	 * Returns a new HSV to HSL converter instance.
	 * @return a new HSV to HSL converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertHSVtoHSL();}
	
	@Override
	public Color convert(Color c)
	{
		float H = c.getComponent(0);
		float s = c.getComponent(1);
	    float v = c.getComponent(2);
		float L = 0.5f * v * ( 2f - s );
		float S = (v*s) / (1f - Math.abs(2f*L - 1f));
		return new Color(ColorModel.HSL, H,S,L);
	}
}
