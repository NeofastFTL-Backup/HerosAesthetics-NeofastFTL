package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.entity.DoorbellBlockEntity;
import com.neofast.hero_aesthetics.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class DoorbellBlock extends ButtonBlock implements EntityBlock {
    public DoorbellBlock(Properties properties) {
        super(properties, BlockSetType.STONE, 30, true);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DoorbellBlockEntity(pPos, pState);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (hand == InteractionHand.OFF_HAND) {
            return InteractionResult.PASS;
        }

        ItemStack itemstack = player.getItemInHand(hand);
        if (itemstack.getItem() instanceof BlockItem blockItem) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof DoorbellBlockEntity doorbellBlockEntity) {
                if (!level.isClientSide) {
                    BlockState mimicState = blockItem.getBlock().defaultBlockState();
                    doorbellBlockEntity.setMimic(mimicState);
                    level.sendBlockUpdated(pos, state, state, 3);
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        InteractionResult result = super.use(state, level, pos, player, hand, hit);
        if (result.consumesAction()) {
            if (!level.isClientSide) {
                level.playSound(null, pos, ModSounds.DOORBELL_RING.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            }
        }
        return result;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (!pState.is(pNewState.getBlock())) {
            BlockEntity blockentity = pLevel.getBlockEntity(pPos);
            if (blockentity instanceof DoorbellBlockEntity) {
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        }
    }
}
