/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorConverter;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * 
 * @since 1.0.0
 */
public class ColorByPassRGB implements IConverter
{
	public static IConverter New(ColorModel cm) {return new ColorByPassRGB(cm);}
	
	private ColorModel bypass = null;
	
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
