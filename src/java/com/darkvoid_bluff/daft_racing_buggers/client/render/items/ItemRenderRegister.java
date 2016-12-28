package com.darkvoid_bluff.daft_racing_buggers.client.render.items;

import com.darkvoid_bluff.daft_racing_buggers.DaftRacingBuggers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister
{
	public static void registerItemRenderer()
	{
		//registerItem(Wacky_Race.);
	}
	
	public static void registerItem(Item item)
	{
		int dotLoc;
		
		ItemModelMesher meshRenderer;
		
		String unlocalisedName;
		String string1;
			
		unlocalisedName = item.getUnlocalizedName();
		dotLoc = unlocalisedName.indexOf(".") + 1;
	    meshRenderer = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	    
	    string1 = DaftRacingBuggers.MODID + ":" + unlocalisedName.substring(dotLoc);
	    meshRenderer.register(item, 0, new ModelResourceLocation(string1, "inventory"));
	}
}
