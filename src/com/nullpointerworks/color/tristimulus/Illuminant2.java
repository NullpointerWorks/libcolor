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
	 * Incandescent/tungsten.
	 * @since 1.0.0
	 */
	public static final float[] TUNGSTEN = {109.85f, 100f, 35.585f}; 
	
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
	 * ICC profile PCS.
	 * @since 1.0.0
	 */
	public static final float[] D50	= {96.422f,	100.000f,	82.521f};
	
	/**
	 * Mid-morning daylight.
	 * @since 1.0.0
	 */
	public static final float[] D55	= {95.682f,	100.000f,	92.149f};
	
	/**
	 * Daylight, sRGB, Adobe-RGB.
	 * @since 1.0.0
	 */
	public static final float[] D65	= {95.047f,	100.000f,	108.883f};
	
	/**
	 * North sky daylight.
	 * @since 1.0.0
	 */
	public static final float[] D75	= {94.972f,	100.000f,	122.638f};
	
	/**
	 * Equal energy.
	 * @since 1.0.0
	 */
	public static final float[] EQUAL	= {100.000f,	100.000f,	100.000f};
	
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
	
	/**
	 * Fluorescent light. Ultralume 50, Philips TL85
	 * @since 1.0.0
	 */
	public static final float[] Ultralume50 = {96.174f, 100f, 81.712f}; 

	/**
	 * Fluorescent light. Ultralume 40, Philips TL84
	 * @since 1.0.0
	 */
	public static final float[] Ultralume40 = {100.966f, 100f, 64.37f}; 
	
	/**
	 * Fluorescent light. Ultralume 30, Philips TL83
	 * @since 1.0.0
	 */
	public static final float[] Ultralume30 = {108.046f, 100f, 39.228f}; 
}
