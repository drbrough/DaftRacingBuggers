/**
 * 
 */
package com.darkvoid_bluff.daft_racing_buggers.materials;

import net.minecraft.block.material.Material;

/**
 * @author David Brough
 *
 */
public class OriginStationBlock extends TrailMarkerBlock
{
	public static boolean originStationSpawned;

	public OriginStationBlock(String unlocalizedName, Material material, float hardness, float resistance)
	{
		super(unlocalizedName, material, hardness, resistance);
	}
	
	public OriginStationBlock(String unlocalisedName, float hardness, float resistance)
	{
		this(unlocalisedName, Material.BARRIER, hardness, resistance);
	}
	
	public OriginStationBlock(String unlocalisedName)
	{
		this(unlocalisedName, 2.0f, 10.0f);
	}
}
