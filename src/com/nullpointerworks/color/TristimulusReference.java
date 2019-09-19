/*
 * Creative Commons - Attribution, Share Alike 4.0 
 * Nullpointer Works (2019)
 * Use is subject to license terms.
 */
package com.nullpointerworks.color;

/**
 * Standard tristimulus illuminant table from a reflecting diffuser. Observer XYZ, at 2° (CIE 1931) and at 10° (CIE 1964).
 * @since 1.0.0
 */
public class TristimulusReference
{
	/*
	 * tristimulus look-up-table
	 */
	private static final float[][] triref = 
	{
		{96.174f, 	100f, 	81.712f,	99.001f,	100,	83.134f},
		{100.966f, 	100f, 	64.37f,		103.866f,	100,	65.627f},
		{108.046f, 	100f, 	39.228f,	111.428f,	100,	40.353f},
		{109.85f, 	100f, 	35.585f,	111.144f,	100,	35.200f},
		{96.422f,	100f,	82.521f,	96.720f,	100f,	81.427f},
		{95.682f,	100f,	92.149f,	95.799f,	100f,	90.926f},
		{95.047f,	100f,	108.883f,	94.811f,	100f,	107.304f},
		{94.972f,	100f,	122.638f,	94.416f,	100f,	120.641f},
		{100f, 		100f, 	100f, 		100f, 		100f, 	100f},
		{100.365f,	100f,	67.868f, 	97.115f,	100f,	81.135f}
	};
	
	public static final float[] getStimulus(Illuminant illuminant, ObserverAngle angle)
	{
		int i = illuminant.ordinal();
		int a = angle.ordinal() * 3;
		return new float[] {triref[i][a], triref[i][a+1], triref[i][a+2]};
	}
	
}
