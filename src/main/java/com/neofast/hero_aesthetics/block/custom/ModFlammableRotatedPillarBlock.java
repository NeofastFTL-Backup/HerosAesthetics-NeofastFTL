package com.neofast.hero_aesthetics.block.custom;
import com.neofast.hero_aesthetics.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }
  
  @Nullable
  public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
    if (context.getItemInHand().getItem() instanceof net.minecraft.world.item.AxeItem) {
      if (state.is((Block) ModBlocks.JAP_MAP_LOG.get())) {
      return (BlockState)((Block) ModBlocks.STRIPPED_JAP_MAP_LOG.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.JAP_MAP_WOOD.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_JAP_MAP_WOOD.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.SIL_MAP_LOG.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_SIL_MAP_LOG.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.SIL_MAP_WOOD.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_SIL_MAP_WOOD.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.DOU_FIR_LOG.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_DOU_FIR_LOG.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.DOU_FIR_WOOD.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_DOU_FIR_WOOD.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.REDWOOD_LOG.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_REDWOOD_LOG.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.REDWOOD_WOOD.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_REDWOOD_WOOD.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.THUJA_LOG.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_THUJA_LOG.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
       if (state.is((Block)ModBlocks.THUJA_WOOD.get())) {
         return (BlockState)((Block)ModBlocks.STRIPPED_THUJA_WOOD.get()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
      }
    } 
    
     return super.getToolModifiedState(state, context, toolAction, simulate);
  }
}