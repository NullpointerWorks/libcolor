/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.hsl;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

public class ConvertHSLtoRGB implements IConverter
{
	public static IConverter New() {return new ConvertHSLtoRGB();}
	
	@Override
	public Color convert(Color c)
	{
		float H = c.getComponent(0);
		float S = c.getComponent(1);
	    float L = c.getComponent(2);
	    float R,G,B,v1,v2;
	    R=G=B=L;
	    
	    if ( S != 0 )
	    {
	    	if ( L < 0.5f ) v2 = L * ( 1f + S );
	    	else v2 = ( L + S ) - ( S * L );
	    	v1 = 2f * L - v2;
	       	R = chroma( v1, v2, H + ( 0.33333f ) );
	       	G = chroma( v1, v2, H );
	       	B = chroma( v1, v2, H - ( 0.33333f ) );
	    }
	    
	    return new Color(ColorModel.RGB, R,G,B);
	}
	
	float chroma( float lum1, float lum2, float hue )
	{
	   if ( hue < 0 ) hue += 1;
	   if ( hue > 1 ) hue -= 1;
	   if ( ( 6f * hue ) < 1f ) return (lum1 + ( lum2 - lum1 ) * 6f * hue);
	   if ( ( 2f * hue ) < 1f ) return lum2;
	   if ( ( 3f * hue ) < 2f ) return (lum1 + ( lum2 - lum1 ) * (0.666667f - hue) * 6f);
	   return ( lum1 );
	}
}