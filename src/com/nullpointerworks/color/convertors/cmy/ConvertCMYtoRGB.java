/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.cmy;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * This converter implementation compiles RGB(Red, Green, Blue) data from CMY(Cyan, Magenta, Yellow) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertCMYtoRGB implements IConverter
{
	/**
	 * Returns a new CMY to RGB converter instance.
	 * @return a new CMY to RGB converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertCMYtoRGB();}
	
	@Override
	public Color convert(Color c)
	{
		float C = c.getComponent(0);
		float M = c.getComponent(1);
	    float Y = c.getComponent(2);
		float R = (1f - C);
		float G = (1f - M);
		float B = (1f - Y);
	    return new Color(ColorModel.RGB, R,G,B);
	}
}
