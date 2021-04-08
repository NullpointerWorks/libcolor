/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;

/**
 * This implementation does not convert anything. The {@code convert(Color)} method returns the argument color directly. This class is used in the converter object to simplify the converter look-up table.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ColorPassThrough implements IConverter
{
	/**
	 * Returns a new pass-through instance.
	 * @return a new pass-through instance
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ColorPassThrough();}
	
	@Override
	public Color convert(Color c) {return c;}
}
