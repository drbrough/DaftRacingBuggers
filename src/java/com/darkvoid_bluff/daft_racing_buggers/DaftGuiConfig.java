/**
 * 
 */
package com.darkvoid_bluff.daft_racing_buggers;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * @author David Brough
 *
 */
public class DaftGuiConfig extends GuiConfig
{
	public DaftGuiConfig(GuiScreen parent)
	{
		super(parent,
				new ConfigElement(
						DaftRacingBuggers.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				DaftRacingBuggers.MODID,
				false,
				false,
				"Change Race Conditions");
		titleLine2 = DaftRacingBuggers.configFile.getAbsolutePath();
	}

	@Override
    public void initGui()
    {
        // You can add buttons and initialize fields here
        super.initGui();
    }

    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        // You can do things like create animations, draw additional elements, etc. here
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        // You can process any additional buttons you may have added here
        super.actionPerformed(button);
    }
}
