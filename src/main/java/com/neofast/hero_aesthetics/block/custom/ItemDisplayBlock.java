package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.entity.ItemDisplayBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ItemDisplayBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 12, 16);

    public ItemDisplayBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ItemDisplayBlockEntity(pPos, pState);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pHand != InteractionHand.MAIN_HAND) return InteractionResult.PASS;
        BlockEntity be = pLevel.getBlockEntity(pPos);
        if (be instanceof ItemDisplayBlockEntity displayBE) {
            ItemStack stackInHand = pPlayer.getItemInHand(pHand);
            ItemStack stackInBE = displayBE.getItemStack();

            if (stackInBE.isEmpty()) {
                if (!stackInHand.isEmpty()) {
                    if (!pLevel.isClientSide) {
                        ItemStack toDisplay = stackInHand.copy();
                        toDisplay.setCount(1);
                        displayBE.setItemStack(toDisplay);
                        if (!pPlayer.getAbilities().instabuild) {
                            stackInHand.shrink(1);
                        }
                    }
                    return InteractionResult.sidedSuccess(pLevel.isClientSide);
                }
            } else {
                if (!pLevel.isClientSide) {
                    if (!pPlayer.getInventory().add(stackInBE)) {
                        pPlayer.drop(stackInBE, false);
                    }
                    displayBE.setItemStack(ItemStack.EMPTY);
                }
                return InteractionResult.sidedSuccess(pLevel.isClientSide);
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity be = pLevel.getBlockEntity(pPos);
            if (be instanceof ItemDisplayBlockEntity displayBE) {
                Containers.dropItemStack(pLevel, pPos.getX(), pPos.getY(), pPos.getZ(), displayBE.getItemStack());
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        }
    }
}
