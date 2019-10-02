/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

/**
 * A enumeration of available 32-bit color formats for the integer Colorizer class. The color channel letter order implies the format for how each 8-bit channel is organized from the most significant bit (MSB) the the least significant bit (LSB).
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public enum ColorFormat 
{
	/**
	 * <pre>
	 * red      green    blue
	 * 00000000 00000000 00000000
	 * 24----17 16-----9 8------1
	 * MSB                    LSB
	 * </pre>
	 * @since 1.0.0
	 */
	RGB,
	
	/**
	 * <pre>
	 * alpha    red      green    blue
	 * 00000000 00000000 00000000 00000000
	 * 32----25 24----17 16-----9 8------1
	 * MSB                             LSB
	 * </pre>
	 * @since 1.0.0
	 */
	ARGB
}
