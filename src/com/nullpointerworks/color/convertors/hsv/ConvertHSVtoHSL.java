package com.nullpointerworks.color.convertors.hsv;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

public class ConvertHSVtoHSL implements IConverter
{
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
