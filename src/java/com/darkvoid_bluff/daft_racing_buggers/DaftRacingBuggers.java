package com.darkvoid_bluff.daft_racing_buggers;

import java.io.File;
import java.util.List;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(	modid=DaftRacingBuggers.MODID,
		name=DaftRacingBuggers.MODNAME, 
		version=DaftRacingBuggers.MODVER, 
		guiFactory="com.darkvoid_bluff." + DaftRacingBuggers.MODID + ".DaftGuiFactory")
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
    
    /**
     * If true all of a team's members will only count as finishing the race when the last member of the team has finished
     */
    public static boolean configFinishAsATeam = false;
    
    public static int configNumberOfRaceMarkers = 1;
    
    public static RaceType configRaceMode;
    
    public static List<BlockPos> configFixedMarkerLocations;
    
    @SidedProxy(clientSide="com.darkvoid_bluff.daft_racing_buggers.ClientProxy", serverSide="com.darkvoid_bluff.daft_racing_buggers.ServerProxy")
    public static CommonProxy proxy;

    public static File configFile;
    
	public static Configuration config;
	
    /**
     * Tell Forge what instance to use.
     */
    @Instance(value = DaftRacingBuggers.MODID)
    public static DaftRacingBuggers instance;

    /**
     * The preInit Handler is called at the very beginning of the startup routine.
     * In this method we should read your config file, create Blocks, Items, etc. and
     * register them with the GameRegistry.
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	configFile = event.getSuggestedConfigurationFile();
    	config = new Configuration(configFile);
    	syncConfig();
    	
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
    
    public static void syncConfig()
    {
    	config.addCustomCategoryComment("Race Conditions", "Setting the race conditions");
    	
//        configFinishAsATeam = configFile.get("finish as a team", "race conditions", configFinishAsATeam, "A Boolean!");
    	configFinishAsATeam = config.getBoolean("Finish As A Team", "race conditions", configFinishAsATeam, "Finish As A Team: true or false");
    	configNumberOfRaceMarkers = config.getInt("Number Of Race Markers", "race conditions", configNumberOfRaceMarkers, 0, Integer.MAX_VALUE, "Number Of Race Markers: a positive integer");
//        myConfigString = configFile.getString("My Config String", Configuration.CATEGORY_GENERAL, myConfigString, "A String!");

        if(config.hasChanged())
        {    	
          config.save();
        }
     }
}
