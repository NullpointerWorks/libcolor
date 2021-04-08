/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color;

/**
 * A color space is a specific organization of colors that allows for reproducible representations of color, in both analog and digital representations.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public enum ColorModel 
{
	/**
	 * The RGB color model is an additive color model in which red, green and blue light are added together in various ways to reproduce a broad array of colors.
	 * @since 1.0.0
	 */
	RGB,
	
	/**
	 * The HSI (Hue, Saturation, Intensity) color model is a decoupling of the intensity component from color-carrying information(hue and saturation).
	 * @since 1.0.0
	 */
	HSI,
	
	/**
	 * HSL (Hue, Saturation, Lightness) is an alternative representations of the RGB color model designed to more closely align with the way human vision perceives color-making attributes.
	 * @since 1.0.0
	 */
	HSL,
	
	/**
	 * HSV (hue, saturation, value) is an alternative representations of the RGB color model designed to more closely align with the way human vision perceives color-making attributes.
	 * @since 1.0.0
	 */
	HSV,
	
	/**
	 * The CMY color model is a subtractive color model that predicts the appearance of cyan, magenta and yellow dyes or pigments to reproduce a broad array of colors.
	 * @since 1.0.0
	 */
	CMY
}
