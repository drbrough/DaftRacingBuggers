/**
 * 
 */
package com.darkvoid_bluff.daft_racing_buggers;

/**
 * @author David Brough
 *
 */
public enum RaceType
{
	/**
	 * No Race, Might as well disable the mod
	 */
	NONE,
	/**
	 * Start at the Origin Marker by right clicking on it with an empty hand
	 * right click on each of the Trail Markers with an empty hand to register at them
	 * and then return to the Origin Marker and right click on it with an empty hand to finish
	 */
	ORIENTEERING,
	/**
	 * The same as ORIENTEERING but you will be told the first time you right click on each marker
	 * to bring an item to the marker and right click on the marker with that item to register at that marker
	 */
	QUESTING 
}
