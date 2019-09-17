/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.rgb;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * 
 * @since 1.0.0
 */
public class ConvertRGBtoCMY implements IConverter
{
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
