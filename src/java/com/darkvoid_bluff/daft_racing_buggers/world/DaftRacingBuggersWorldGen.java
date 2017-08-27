/**
 * 
 */
package com.darkvoid_bluff.daft_racing_buggers.world;

import com.darkvoid_bluff.daft_racing_buggers.materials.DaftRacingBuggersMaterials;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.WorldEvent.CreateSpawnPosition;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author David Brough
 *
 */
public class DaftRacingBuggersWorldGen
{
	public DaftRacingBuggersWorldGen()
	{
    }

	/**
	 * Generate the race start point in the Spawn Chunk of the world.
	 * @param sp
	 */
	@SubscribeEvent (priority=EventPriority.NORMAL, receiveCanceled=true)
	public void OnEvent(CreateSpawnPosition sp)
	{
		int originX;
		int originZ;
		
		Block testBlock;
		  
		BlockPos originPos;
		BlockPos originPost;
			
		Random rand;
			
		rand = new Random();
	      
		originX = sp.getWorld().getWorldInfo().getSpawnX() + rand.nextInt(3) - rand.nextInt(3);
        originZ = sp.getWorld().getWorldInfo().getSpawnZ() + rand.nextInt(3) - rand.nextInt(3);
        originPos = sp.getWorld().getTopSolidOrLiquidBlock(new BlockPos(originX, 0, originZ)).up();
	  
        do
        {
        	testBlock = sp.getWorld().getBlockState(originPos).getBlock();
            if (!testBlock.isAir(testBlock.getDefaultState(), sp.getWorld(), originPos) && !testBlock.isLeaves(testBlock.getDefaultState(), sp.getWorld(), originPos)) break;
            originPos = originPos.down();
        } while (originPos.getY() > 0);
	  
	  
        originPos = originPos.up();
        sp.getWorld().setBlockState(originPos, DaftRacingBuggersMaterials.originStationBlock.getDefaultState(), 2);
        originPost = originPos;
	       	
       	for(int postHight = 0; postHight < 3; postHight++)
       	{       		
	        originPost = originPost.up();
	        sp.getWorld().setBlockState(originPost, DaftRacingBuggersMaterials.originStationBlock.getDefaultState(), 2);
       	}
	  
        for (int i = 0; i < 4; ++i)
        {
        	BlockPos blockpos = originPos;
  
            BlockPos blockpos1 = blockpos.east();
            BlockPos blockpos2 = blockpos.west();
            BlockPos blockpos3 = blockpos.north();
            BlockPos blockpos4 = blockpos.south();
  
            if (sp.getWorld().isAirBlock(blockpos2) && sp.getWorld().isSideSolid(blockpos2.down(), EnumFacing.UP))
            {
            	sp.getWorld().setBlockState(blockpos2, Blocks.TORCH.getDefaultState(), 2);
            }
  
            if (sp.getWorld().isAirBlock(blockpos1) && sp.getWorld().isSideSolid(blockpos1.down(), EnumFacing.UP))
            {
            	sp.getWorld().setBlockState(blockpos1, Blocks.TORCH.getDefaultState(), 2);
            }
  	
            if (sp.getWorld().isAirBlock(blockpos3) && sp.getWorld().isSideSolid(blockpos3.down(), EnumFacing.UP))
            {
            	sp.getWorld().setBlockState(blockpos3, Blocks.TORCH.getDefaultState(), 2);
            }
  
            if (sp.getWorld().isAirBlock(blockpos4) && sp.getWorld().isSideSolid(blockpos4.down(), EnumFacing.UP))
            {
            	sp.getWorld().setBlockState(blockpos4, Blocks.TORCH.getDefaultState(), 2);
            }
		}		
	}
}
