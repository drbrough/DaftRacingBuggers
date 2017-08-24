/**
 * 
 */
package com.darkvoid_bluff.daft_racing_buggers;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

/**
 * @author David Brough
 *
 */
public class DaftGuiFactory implements IModGuiFactory 
{

	/* (non-Javadoc)
	 * @see net.minecraftforge.fml.client.IModGuiFactory#initialize(net.minecraft.client.Minecraft)
	 */
	@Override
	public void initialize(Minecraft minecraftInstance)
	{
	}

	/* (non-Javadoc)
	 * @see net.minecraftforge.fml.client.IModGuiFactory#mainConfigGuiClass()
	 */
	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass()
	{
		// TODO Auto-generated method stub
		return DaftGuiConfig.class;
	}

	/* (non-Javadoc)
	 * @see net.minecraftforge.fml.client.IModGuiFactory#runtimeGuiCategories()
	 */
	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
	{
		return null;
	}

	/* (non-Javadoc)
	 * @see net.minecraftforge.fml.client.IModGuiFactory#getHandlerFor(net.minecraftforge.fml.client.IModGuiFactory.RuntimeOptionCategoryElement)
	 */
	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
	{
		return null;
	}

}
