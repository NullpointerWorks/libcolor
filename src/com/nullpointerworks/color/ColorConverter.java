/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color;

import com.nullpointerworks.color.convertors.*;
import com.nullpointerworks.color.convertors.cmy.*;
import com.nullpointerworks.color.convertors.hsi.*;
import com.nullpointerworks.color.convertors.hsl.*;
import com.nullpointerworks.color.convertors.hsv.*;
import com.nullpointerworks.color.convertors.rgb.*;

/**
 * The color converter class is used to transform a color in one color space to another color space. 
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public final class ColorConverter
{
	/*
	 * conversion look-up table
	 * @since 1.0.0
	 */
	private static final IConverter[][] convertors = new IConverter[][]
	{
		// RGB to ...
		{
			ColorPassThrough.New(),
			ConvertRGBtoHSI.New(),
			ConvertRGBtoHSL.New(),
			ConvertRGBtoHSV.New(),
			ConvertRGBtoCMY.New()
		},
		// HSI to ...
		{
			ConvertHSItoRGB.New(),
			ColorPassThrough.New(),
			ColorByPassRGB.New(ColorModel.HSL),
			ColorByPassRGB.New(ColorModel.HSV),
			ColorByPassRGB.New(ColorModel.CMY)
		},
		// HSL to ...
		{
			ConvertHSLtoRGB.New(),
			ColorByPassRGB.New(ColorModel.HSI),
			ColorPassThrough.New(),
			ConvertHSLtoHSV.New(),
			ColorByPassRGB.New(ColorModel.CMY)
		},
		// HSV/HSB to ...
		{
			ConvertHSVtoRGB.New(),
			ColorByPassRGB.New(ColorModel.HSI),
			ConvertHSVtoHSL.New(),
			ColorPassThrough.New(),
			ColorByPassRGB.New(ColorModel.CMY)
		},
		// CMY to ...
		{
			ConvertCMYtoRGB.New(),
			ColorByPassRGB.New(ColorModel.HSI),
			ColorByPassRGB.New(ColorModel.HSL),
			ColorByPassRGB.New(ColorModel.HSV),
			ColorPassThrough.New()
		}
	};
	
	/**
	 * Converts the given color into the specified color model. This method returns a new color instance in the form of said color model.
	 * @param c - the color to convert
	 * @param cm - the color model to convert into
	 * @return a new color instance in the form of specified color model
	 * @since 1.0.0
	 */
	public static Color convert(Color c, ColorModel cm)
	{
		var conv = convertors[ c.getColorModel().ordinal() ][ cm.ordinal() ];
		return conv.convert( c );
	}
}
