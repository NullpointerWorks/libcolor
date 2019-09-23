/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;

/**
 * 
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public class ColorPassThrough implements IConverter
{
	
	/**
	 * 
	 * @since 1.0.0
	 */
	public static IConverter New() {return new ColorPassThrough();}
	
	@Override
	public Color convert(Color c) {return c;}
}
