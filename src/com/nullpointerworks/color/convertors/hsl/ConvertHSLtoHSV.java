/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.hsl;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

public class ConvertHSLtoHSV implements IConverter
{
	public static IConverter New() {return new ConvertHSLtoHSV();}
	
	@Override
	public Color convert(Color c)
	{
		float h = c.getComponent(0);
		float s = c.getComponent(1);
	    float l = c.getComponent(2);
	    float H = h;
	    float V = l + 0.5f*s*( 1f - Math.abs(2f*l - 1f) );
	    float S = 2f * (V - l) / V;
		return new Color(ColorModel.HSV, H,S,V);
	}
}