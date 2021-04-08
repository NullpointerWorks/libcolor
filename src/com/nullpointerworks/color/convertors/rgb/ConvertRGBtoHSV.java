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
 * This converter implementation compiles HSV(Hue, Saturation, Value) data from RGB(Red, Green, Blue) data. The HSV color model is also known as HSB(Hue, Saturation, Brightness). HSV and HSB are the same color model.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertRGBtoHSV implements IConverter
{
	/**
	 * Returns a new RGB to HSV converter instance.
	 * @return a new RGB to HSV converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertRGBtoHSV();}
	
	@Override
	public Color convert(Color c)
	{
		float R = c.getComponent(0);
		float G = c.getComponent(1);
	    float B = c.getComponent(2);
	    float Cmax = max(R, G, B);
	    float Cmin = min(R, G, B);
	    float delta = Cmax - Cmin;
	    float h_delta = delta * 0.5f;
	    float inv_delta = 1f / delta;
	    
	    float H = 0f;
	    float S = 0f;
	    float V = Cmax;
	    
	    if (delta != 0f)
	    {
	    	S = delta / Cmax;
	    	
	    	float dR = ( ( ( Cmax - R ) * 0.1666667f ) + h_delta ) * inv_delta;
	    	float dG = ( ( ( Cmax - G ) * 0.1666667f ) + h_delta ) * inv_delta;
	    	float dB = ( ( ( Cmax - B ) * 0.1666667f ) + h_delta ) * inv_delta;
	    	
	    	if ( R == Cmax ) 
	    	{
	    		H = dB - dG;
	    	}
	    	else 
	    	if ( G == Cmax )
	    	{
	    		H = ( 0.3333333f ) + dR - dB;
	    	}
	    	else
	    	if ( B == Cmax )
	    	{
	    		H = ( 0.6666667f ) + dG - dR;
	    	}
	    	
		    if ( H < 0f ) H += 1f;
		    if ( H > 1f ) H -= 1f;
	    }
	    
	    return new Color(ColorModel.HSV, H,S,V);
	}
	
	float max(float x1,float x2,float x3)
	{
		float x=(x1<x2)?x2:x1;
		return (x<x3)?x3:x;
	}
	
	float min(float x1,float x2,float x3)
	{
		float x = (x1<x2)?x1:x2;
		return (x<x3)?x:x3;
	}
}
