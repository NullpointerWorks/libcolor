/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.convertors;

import com.nullpointerworks.color.Color;

public class ColorPassThrough implements IConverter
{
	public static IConverter New() {return new ColorPassThrough();}
	
	@Override
	public Color convert(Color c) {return c;}
}
