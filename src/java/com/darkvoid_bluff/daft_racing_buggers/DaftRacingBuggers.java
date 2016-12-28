package com.darkvoid_bluff.daft_racing_buggers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=DaftRacingBuggers.MODID, name=DaftRacingBuggers.MODNAME, version=DaftRacingBuggers.MODVER)
public class DaftRacingBuggers
{
    /**
     * Set the ID of the mod (Should be lower case).
     */
    public static final String MODID = "daft_racing_buggers";
    /**
     * Set the "Name" of the mod.
     */
    public static final String MODNAME = "Daft Racing Buggers";
    /**
     * Set the version of the mod.
     */
    public static final String MODVER = "0.0.0";
    
    @Instance(value = DaftRacingBuggers.MODID) //Tell Forge what instance to use.
    public static DaftRacingBuggers instance;

    @SidedProxy(clientSide="com.darkvoid_bluff.daft_racing_buggers.ClientProxy", serverSide="com.darkvoid_bluff.daft_racing_buggers.ServerProxy")
    public static CommonProxy proxy;

    /**
     * The preInit Handler is called at the very beginning of the startup routine.
     * In this method we should read your config file, create Blocks, Items, etc. and
     * register them with the GameRegistry.
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
       
    
    /**
     * The init Handler is called after the preInit Handler.
     * In this method we can build up data structures,
     * add Crafting Recipes and register new handler.
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
      
    /**
     * The postInit Handler is called at the very end.
     * Its used to communicate with other mods and adjust your setup based on this.
     * @param event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
