package com.darkvoid_bluff.daft_racing_buggers.materials;

import com.darkvoid_bluff.daft_racing_buggers.DaftRacingBuggers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TrailMarkerBlock extends Block
{
	public TrailMarkerBlock(String unlocalizedName, Material materialIn, float hardness, float resistance)
	{
		super(materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setRegistryName(DaftRacingBuggers.MODID, unlocalizedName);
	}
	
	public TrailMarkerBlock(String unlocalisedName, float hardness, float resistance)
	{
		this(unlocalisedName, Material.BARRIER, hardness, resistance);
	}
	
	public TrailMarkerBlock(String unlocalisedName)
	{
		this(unlocalisedName, 2.0f, 10.0f);
	}
}
