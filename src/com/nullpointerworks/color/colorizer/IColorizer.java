/*
 * This is free and unencumbered software released into the public domain.
 * <http://unlicense.org/>
 * Nullpointer Works (2021)
 */
package com.nullpointerworks.color.colorizer;

/**
 * Colorizer method interface. Contains some methods that are standard in all colorizer implementations.
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public interface IColorizer 
{
	/**
	 * Performs a linear interpolation between two colors using a given factor in the range [0-1]. Returns the interpolated color.
	 * @param c1 - base color
	 * @param c2 - blend color
	 * @param lambda - interpolation factor in the range [0,1]
	 * @return the interpolated color
	 * @since 1.0.0
	 */
	int lerp(int c1, int c2, float lambda);
	
	/**
	 * Performs a square interpolation between two colors using a given lambda. Square interpolation corrects for interpolation errors that often occurs when linearly interpolating colors. Some complementary colors when interpolating, at a factor of 0.5 for example, lose their brightness resulting in dark saturated colors.
	 * @param c1 - base color
	 * @param c2 - blend color
	 * @param lambda - interpolation factor in the range [0,1]
	 * @return the interpolated color
	 * @since 1.0.0
	 */
	int slerp(int c1, int c2, float lambda);
	
	/**
	 * Returns the color integer value of the given hexadecimal [0-9 and a-f or A-F] string. Accepted value formats are:
	 * <pre>
	 * pre-fix
	 * #[color]
	 * 0x[color]
	 * 0X[color]
	 * 
	 * post-fix
	 * [color]h
	 * [color]H
	 * 
	 * or plain
	 * [color]
	 * </pre>
	 * @param hex - the hexadecimal string
	 * @return the color integer value of the given hexadecimal string
	 * @since 1.0.0
	 */
	int fromHex(String hex);

	/**
     * Pass in RGB values [0,255]. Returns the integer value.
	 * @param c - a list of colors values
	 * @return the integer value of the color
	 * @since 1.0.0
     */
	int toInt(int... c);
	
	/**
	 * Percentage based color compilation. RGB values range from [0,1]. Returns the integer value.
	 * @param c - a list of colors values
	 * @return the integer value of the color
	 * @since 1.0.0
	 */
	int toInt(float... c);
	
	/**
	 * Returns the hex value as a {@code String} of the given integer.
	 * @param c - a list of colors values
	 * @return the hex value as a {@code String} of the given integer
	 * @since 1.0.0
	 */
	String toHex(int... c);
}
