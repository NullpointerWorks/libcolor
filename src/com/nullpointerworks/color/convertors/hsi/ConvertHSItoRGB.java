/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors.hsi;

import com.nullpointerworks.color.Color;
import com.nullpointerworks.color.ColorModel;
import com.nullpointerworks.color.convertors.IConverter;

/**
 * 
 * @author Michiel Drost - Nullpointer Works
 * @since 1.0.0
 */
public class ConvertHSItoRGB implements IConverter
{
	/**
	 * 
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ConvertHSItoRGB();}
	
	@Override
	public Color convert(Color c)
	{
		float h = c.getComponent(0);
		float S = c.getComponent(1);
	    float I = c.getComponent(2);
	    float H = 0.016666667f * h;
		float Z = 1f - Math.abs( (H % 2f) - 1f );
		float C = I * S / (1f + Z);
		float X = C * Z;
		float m = 0.333333333f * I * (1f - S);
		return compileChroma(H,C,X,m);
	}
	
	/*
	 * Compile an RGB object using a Hue'-Chroma-Luma parameters
	 * H = sextant: hue / 60
	 * C = chroma
	 * X = Luma
	 * m = match lightness
	 */
	private Color compileChroma(float H, float C, float X, float m)
	{
		float R=0f, G=0f, B=0f;
		int sex = (int)(H);
		switch(sex)
		{
		case 0: R = C; G = X; B = 0f; break;
		case 1: R = X; G = C; B = 0f; break;
		case 2: R = 0f; G = C; B = X; break;
		case 3: R = 0f; G = X; B = C; break;
		case 4: R = X; G = 0f; B = C; break;
		case 5: R = C; G = 0f; B = X; break;
		}
		return new Color(ColorModel.RGB, R+m, G+m, B+m);
	}
}
