/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorConverter;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * The bypass converter class acts as a step between the source and target color. If no algorithm is available to convert a color directly into the selected color model, then it is first converted to RGB, and then to the desired color model. This assumes a conversion implementation to- and from- RGB is available.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ColorByPassRGB implements IConverter
{
	/**
	 * Returns a new bypass converter instance.
	 * @return a new bypass converter instance
	 * @since 1.0.0
	 */
	public static IConverter New(ColorModel cm) {return new ColorByPassRGB(cm);}
	
	private ColorModel bypass = null;
	
	/**
	 * Creates a color bypass object with the chosen color model as its conversion target. 
	 * @since 1.0.0
	 */
	public ColorByPassRGB(ColorModel cm)
	{
		bypass = cm;
	}
	
	@Override
	public Color convert(Color c)
	{
		var rgb = ColorConverter.convert(c, ColorModel.RGB);
		return ColorConverter.convert(rgb, bypass);
	}
}
