/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors.rgb;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * This converter implementation compiles CMY(Cyan, Magenta, Yellow) data from RGB(Red, Green, Blue) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertRGBtoCMY implements IConverter
{
	/**
	 * Returns a new RGB to CMY converter instance.
	 * @return a new RGB to CMY converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertRGBtoCMY();}
	
	@Override
	public Color convert(Color c)
	{
		float R = c.getComponent(0);
		float G = c.getComponent(1);
	    float B = c.getComponent(2);
		float C = (1f - R);
		float M = (1f - G);
		float Y = (1f - B);
	    return new Color(ColorModel.CMY, C,M,Y);
	}
}
