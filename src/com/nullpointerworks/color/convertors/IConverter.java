/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;

/**
 * This interface serves to standardize color model converters. The only method asked to implement is the converter event call.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public interface IConverter
{
	/**
	 * Returns a new {@code Color} object containing transformed data dependent on the implementation. The returned color should have the same chromatic properties as the provided color. Mind that conversion may introduce rounding errors so an exact conversion cannot be guaranteed.
	 * @param c - the color to convert
	 * @return the new color
	 * @since 1.0.0
	 */
	public Color convert(Color c);
}
