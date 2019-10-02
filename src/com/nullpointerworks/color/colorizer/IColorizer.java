/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
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
}