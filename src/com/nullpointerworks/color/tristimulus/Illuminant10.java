/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color.tristimulus;

/**
 * Standard illuminant table for 2 degree observer from a reflecting diffuser. Observer	XYZ, at 10° (CIE 1964).
 * @since 1.0.0
 */
public class Illuminant10
{
	/**
	 * Fluorescent light. Ultralume 50, Philips TL85
	 * @since 1.0.0
	 */
	public static final float[] Ultralume50	 = {99.001f,	100.000f,	83.134f};

	/**
	 * Fluorescent light. Ultralume 40, Philips TL84
	 * @since 1.0.0
	 */
	public static final float[] Ultralume40	 = {103.866f,	100.000f,	65.627f};
	
	/**
	 * Fluorescent light. Ultralume 30, Philips TL83
	 * @since 1.0.0
	 */
	public static final float[] Ultralume30	 = {111.428f,	100.000f,	40.353f};
	
	/**
	 * Incandescent/tungsten.
	 * @since 1.0.0
	 */
	public static final float[] TUNGSTEN	 = {111.144f,	100.000f,	35.200f};
	
	/**
	 * ICC profile PCS.
	 * @since 1.0.0
	 */
	public static final float[] D50	 = {96.720f,	100.000f,	81.427f};
	
	/**
	 * Mid-morning daylight.
	 * @since 1.0.0
	 */
	public static final float[] D55	 = {95.799f,	100.000f,	90.926f};
	
	/**
	 * Daylight, sRGB, Adobe-RGB.
	 * @since 1.0.0
	 */
	public static final float[] D65	 = {94.811f,	100.000f,	107.304f};
	
	/**
	 * North sky daylight.
	 * @since 1.0.0
	 */
	public static final float[] D75	 = {94.416f,	100.000f,	120.641f};
	
	/**
	 * Equal energy.
	 * @since 1.0.0
	 */
	public static final float[] EQUAL	 = {100.000f,	100.000f,	100.000f};
	
	
	
	/**
	 * Old direct sunlight at noon.
	 * @since 1.0.0
	 */
	public static final float[] B	 = {99.178f,	100.000f,	84.3493f};
	
	/**
	 * Old daylight.
	 * @since 1.0.0
	 */
	public static final float[] C	 = {97.285f,	100.000f,	116.145f};
	
	/**
	 * Daylight Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F1	 = {94.791f,	100.000f,	103.191f};
	
	/**
	 * Cool fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F2	 = {103.280f,	100.000f,	69.026f};
	
	/**
	 * White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F3	 = {108.968f,	100.000f,	51.965f};
	
	/**
	 * Warm White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F4	 = {114.961f,	100.000f,	40.963f};
	
	/**
	 * Daylight Fluorescent
	 * @since 1.0.0
	 */
	public static final float[] F5	 = {93.369f,	100.000f,	98.636f};
	
	/**
	 * Lite White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F6	 = {102.148f,	100.000f,	62.074f};
	
	/**
	 * Daylight fluorescent, D65 simulator.
	 * @since 1.0.0
	 */
	public static final float[] F7	 = {95.792f,	100.000f,	107.687f};
	
	/**
	 * Sylvania F40, D50 simulator.
	 * @since 1.0.0
	 */
	public static final float[] F8	 = {97.115f,	100.000f,	81.135f};
	
	/**
	 * Cool White Fluorescent.
	 * @since 1.0.0
	 */
	public static final float[] F9	 = {102.116f,	100.000f,	67.826f}; 
}
