/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.tristimulus;

/**
 * Standard illuminant table for 2 degree observer from a reflecting diffuser. Observer	XYZ, at 2° (CIE 1931).
 * @since 1.0.0
 */
public class Illuminant2
{
	
	/**
	 * Old direct sunlight at noon.
	 * @since 1.0.0
	 */
	public static final float[] B	= {99.0927f,	100.000f,	85.313f};
	
	/**
	 * Old daylight.
	 * @since 1.0.0
	 */
	public static final float[] C	= {98.074f,	100.000f,	118.232f};	
	
	/**
	 * Daylight Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F1	= {92.834f,	100.000f,	103.665f};
	
	/**
	 * Cool fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F2	= {99.187f,	100.000f,	67.395f};
	
	/**
	 * White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F3	= {103.754f,	100.000f,	49.861f};
	
	/**
	 * Warm White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F4	= {109.147f,	100.000f,	38.813f};
	
	/**
	 * Daylight Fluorescent
	 * @since 1.0.0
	 */
	public static final float[] F5	= {90.872f,	100.000f,	98.723f};
	
	/**
	 * Lite White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F6	= {97.309f,	100.000f,	60.191f};
	
	/**
	 * Daylight fluorescent, D65 simulator.
	 * @since 1.0.0
	 */
	public static final float[] F7	= {95.044f,	100.000f,	108.755f};
	
	/**
	 * Sylvania F40, D50 simulator.
	 * @since 1.0.0
	 */
	public static final float[] F8 = {100.365f, 100f, 67.868f}; 
	
	/**
	 * Cool White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F9 = {100.365f, 100f, 67.868f}; 
}
