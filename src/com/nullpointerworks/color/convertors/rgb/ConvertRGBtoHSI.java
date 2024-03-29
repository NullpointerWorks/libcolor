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
 * This converter implementation compiles HSI(Hue, Saturation, Intensity) data from RGB(Red, Green, Blue) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertRGBtoHSI implements IConverter
{
	/**
	 * Returns a new RGB to HSI converter instance.
	 * @return a new RGB to HSI converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertRGBtoHSI();}
	
	@Override
	public Color convert(Color c)
	{
		float R = c.getComponent(0);
		float G = c.getComponent(1);
	    float B = c.getComponent(2);
	    
	    float max = max(R, G, B);
	    float min = min(R, G, B);
	    float delta = max - min;
	    
	    float H = 0f;
	    float S = 0f;
	    float I = (R+G+B) * 0.333333333f;
	    
	    if(delta != 0f)
	    {
	        float halfDelta = ( delta * 0.5f );
	        float invDelta = 1f / delta;
	        float delR = ( ( ( max - R ) * 0.166666667f ) + halfDelta ) * invDelta;
	        float delG = ( ( ( max - G ) * 0.166666667f ) + halfDelta ) * invDelta;
	        float delB = ( ( ( max - B ) * 0.166666667f ) + halfDelta ) * invDelta;
	        
	        if(R == max)
	        {
	            H = delB - delG;
	        }
	        else 
	        if(G == max)
	        {
	            H = (0.333333333f) + delR - delB;
	        }
	        else 
	        if(B == max)
	        {
	            H = (0.666666666f) + delG - delR;
	        }
	        
	        if(H < 0f) H += 1f;
	        if(H > 1f) H -= 1f;
	        
		    H *= 360f;
	    }
	    
	    if (I != 0f)
	    {
	    	S = 1f - (min/I);
	    }
	    
	    I *= 3f;
	    
	    return new Color(ColorModel.HSI, H,S,I);
	}
	
	private float max(float x1,float x2,float x3)
	{
		float x=(x1<x2)?x2:x1;
		return (x<x3)?x3:x;
	}
	
	private float min(float x1,float x2,float x3)
	{
		float x = (x1<x2)?x1:x2;
		return (x<x3)?x:x3;
	}
}
