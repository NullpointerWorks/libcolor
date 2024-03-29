/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors.hsv;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * This converter implementation compiles RGB(Red, Green, Blue) data from HSV(Hue, Saturation, Value) data.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ConvertHSVtoRGB implements IConverter
{
	/**
	 * Returns a new HSV to RGB converter instance.
	 * @return a new HSV to RGB converter instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertHSVtoRGB();}
	
	@Override
	public Color convert(Color c)
	{
		float H = c.getComponent(0);
		float S = c.getComponent(1);
	    float V = c.getComponent(2);
	    float R = V;
	    float G = V;
	    float B = V;
	    
	    if ( S != 0f )
	    {
	    	float h = H * 6f;
	    	if ( h == 6f ) h = 0f;
	    	int sextant = (int)h;
	    	
	    	float X = V * ( 1 - S );
	    	float Y = V * ( 1 - S * ( h - sextant ) );
	    	float Z = V * ( 1 - S * ( 1 - ( h - sextant ) ) );
	    	
	    	if ( sextant == 0 ) 
	    	{ 
	    		R = V; G = Z; B = X; 
	    	}
		   	else 
		   	if ( sextant == 1 ) 
		   	{ 
		   		R = Y; G = V; B = X; 
		   	}
		   	else 
		   	if ( sextant == 2 ) 
		   	{ 
		   		R = X; G = V; B = Z; 
		   	}
		   	else 
		   	if ( sextant == 3 ) 
		   	{ 
		   		R = X; G = Y; B = V;     
		   	}
		   	else 
		   	if ( sextant == 4 ) 
		   	{ 
		   		R = Z; G = X; B = V;     
		   	}
		   	else 
		   	{ 
		   		R = V; G = X; B = Y; 
		   	}
	    }
	    
	    return new Color(ColorModel.RGB, R,G,B);
	}
}
