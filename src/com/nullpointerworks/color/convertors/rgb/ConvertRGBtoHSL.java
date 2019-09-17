package com.nullpointerworks.color.convertors.rgb;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

public class ConvertRGBtoHSL implements IConverter
{
	public static IConverter New() {return new ConvertRGBtoHSL();}
	
	@Override
	public Color convert(Color c)
	{
		float R = c.getComponent(0);
		float G = c.getComponent(1);
	    float B = c.getComponent(2);
	    
		float min = min(R, G, B);
	    float max = max(R, G, B);
	    float delta = max - min;
	    float inv_delta 	= 1f / delta;
	    float inv_six 		= 0.16666667f;
	    float half_delta 	= delta * 0.5f;
	    
	    float H = max;
	    float S = max;
	    float L = (max+min) * 0.5f;
	    
	    if(delta == 0f)
	    {
	        H = 0f;
	        S = 0f;
	    }
	    else
	    {
    	   if ( L < 0.5f ) S = delta / ( max + min );
    	   else S = delta / ( 2 - max - min );
    	   
    	   float del_R = ( ( (max - R) * inv_six ) + half_delta ) * inv_delta;
		   float del_G = ( ( (max - G) * inv_six ) + half_delta ) * inv_delta;
		   float del_B = ( ( (max - B) * inv_six ) + half_delta ) * inv_delta;

    	   if      ( R == max ) H = del_B - del_G;
    	   else if ( G == max ) H = ( 0.333333f ) + del_R - del_B;
    	   else if ( B == max ) H = ( 0.666667f ) + del_G - del_R;

    	    if ( H < 0f ) H += 1;
    	    if ( H > 1f ) H -= 1;
    	}
	    
		// compile color
	    return new Color(ColorModel.HSL, H,S,L);
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
