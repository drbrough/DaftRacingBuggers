package com.darkvoid_bluff.daft_racing_buggers;

import com.darkvoid_bluff.daft_racing_buggers.materials.DaftRacingBuggersMaterials;
import com.darkvoid_bluff.daft_racing_buggers.world.DaftRacingBuggersWorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		DaftRacingBuggersMaterials.createBlocks();
		DaftRacingBuggersMaterials.createItems();
	}
	
	public void init (FMLInitializationEvent e)
	{
		MinecraftForge.EVENT_BUS.register(new DaftRacingBuggersWorldGen());
	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
