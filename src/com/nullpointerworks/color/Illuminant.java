/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

/**
 * 
 * @since 1.0.0
 * @author Michiel Drost - Nullpointer Works
 */
public enum Illuminant 
{
	/**
	 * Fluorescent light. Ultralume 50, Philips TL85.
	 * @since 1.0.0
	 */
	ULTRALUME50,
	
	/**
	 * Fluorescent light. Ultralume 40, Philips TL84.
	 * @since 1.0.0
	 */
	ULTRALUME40,
	
	/**
	 * Fluorescent light. Ultralume 30, Philips TL83.
	 * @since 1.0.0
	 */
	ULTRALUME30,
	
	/**
	 * Incandescent/tungsten.
	 * @since 1.0.0
	 */
	TUNGSTEN, 
	
	/**
	 * ICC profile PCS.
	 * @since 1.0.0
	 */
	D50,
	
	/**
	 * Mid-morning daylight.
	 * @since 1.0.0
	 */
	D55,
	
	/**
	 * Daylight, sRGB, Adobe-RGB.
	 * @since 1.0.0
	 */
	D65,
	
	/**
	 * North sky daylight.
	 * @since 1.0.0
	 */
	D75,
	
	/**
	 * Equal energy.
	 * @since 1.0.0
	 */
	EQUAL,
	
	/**
	 * Sylvania F40, D50 simulator.
	 * @since 1.0.0
	 */
	SYLVANIA40
}
