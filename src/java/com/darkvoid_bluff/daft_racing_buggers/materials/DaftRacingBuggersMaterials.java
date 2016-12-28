package com.darkvoid_bluff.daft_racing_buggers.materials;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DaftRacingBuggersMaterials
{
	public static Block originStationBlock;
	public static Block trailMarkerBlock;
	
	public static ItemBlock originStationItem;
	public static ItemBlock trailMarkerItem;
	
	public static void createBlocks()
	{
		originStationBlock = new OriginStationBlock("origin_station");
		originStationBlock.setLightLevel(1.0f);
		
		originStationItem = new ItemBlock(originStationBlock);
		originStationItem.setRegistryName(originStationBlock.getRegistryName());
		
		trailMarkerBlock = new TrailMarkerBlock("trail_marker_block");
		trailMarkerBlock.setLightLevel(0.0f);
		
		trailMarkerItem = new ItemBlock(trailMarkerBlock);
		trailMarkerItem.setRegistryName(trailMarkerBlock.getRegistryName());
		
		GameRegistry.register(trailMarkerBlock);		
    	GameRegistry.register(trailMarkerItem);
    	
		GameRegistry.register(originStationBlock);		
    	GameRegistry.register(originStationItem);
	}
    
    public static void createItems()
    {
    }
}
