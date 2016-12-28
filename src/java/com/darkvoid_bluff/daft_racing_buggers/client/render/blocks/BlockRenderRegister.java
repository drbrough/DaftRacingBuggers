package com.darkvoid_bluff.daft_racing_buggers.client.render.blocks;

import com.darkvoid_bluff.daft_racing_buggers.DaftRacingBuggers;
import com.darkvoid_bluff.daft_racing_buggers.materials.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister
{
	public static void  registerBlockRenderer()
	{
		registerBlock(DaftRacingBuggersMaterials.trailMarkerBlock);
		registerBlock(DaftRacingBuggersMaterials.originStationBlock);
	}
	
	public static void registerBlock(Block block)
	{
		int dotLoc;
		
		ItemModelMesher meshRenderer;
		
		String string1;
		String unlocalisedName;
			
		unlocalisedName = block.getUnlocalizedName();
		dotLoc = unlocalisedName.indexOf(".") + 1;
		meshRenderer = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		string1 = DaftRacingBuggers.MODID + ":" + unlocalisedName.substring(dotLoc);
	    meshRenderer.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(string1, "inventory"));
    }
}
