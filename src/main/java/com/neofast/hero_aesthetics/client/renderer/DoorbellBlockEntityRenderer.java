package com.neofast.hero_aesthetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.neofast.hero_aesthetics.block.entity.DoorbellBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.level.block.state.BlockState;
import com.mojang.math.Axis;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraftforge.client.model.data.ModelData;

public class DoorbellBlockEntityRenderer implements BlockEntityRenderer<DoorbellBlockEntity> {
    public DoorbellBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(DoorbellBlockEntity pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBufferSource, int pPackedLight, int pPackedOverlay) {
        BlockState mimic = pBlockEntity.getMimic();
        if (mimic != null) {
            BlockRenderDispatcher blockRenderer = Minecraft.getInstance().getBlockRenderer();
            
            pPoseStack.pushPose();

            BlockState doorbellState = pBlockEntity.getBlockState();
            Direction direction = doorbellState.getValue(ButtonBlock.FACING);
            AttachFace face = doorbellState.getValue(ButtonBlock.FACE);
            boolean powered = doorbellState.getValue(ButtonBlock.POWERED);

            // 1. Move to the center of the block
            pPoseStack.translate(0.5, 0.5, 0.5);

            // 2. Rotate to match the button's face and direction
            // Vanilla rotations for a model that is on the South face (Z=14..16):
            // WALL: Y rotation to match direction.
            // FLOOR: X = -90, then Y rotation to match direction.
            // CEILING: X = 90, then Y rotation to match direction + 180 (to keep top pointing correct way).

            if (face == AttachFace.WALL) {
                pPoseStack.mulPose(Axis.YP.rotationDegrees(-direction.toYRot()));
            } else if (face == AttachFace.FLOOR) {
                pPoseStack.mulPose(Axis.XP.rotationDegrees(-90));
                pPoseStack.mulPose(Axis.ZP.rotationDegrees(direction.toYRot()));
            } else if (face == AttachFace.CEILING) {
                pPoseStack.mulPose(Axis.XP.rotationDegrees(90));
                pPoseStack.mulPose(Axis.ZP.rotationDegrees(-direction.toYRot()));
            }

            // The button is 2 pixels deep (0.125 blocks).
            // Standard button model (South-facing):
            // Unpressed: z from 14 to 16. (0.875 to 1.0)
            // Pressed: z from 15 to 16. (0.9375 to 1.0)
            // Relative to center (0.5), this is [0.375, 0.5] and [0.4375, 0.5].
            
            // To avoid z-fighting and ensure it covers the button:
            // We make it slightly larger in all dimensions.
            float depth = powered ? 0.0635f : 0.126f;
            float zCenter = 0.5f - (depth / 2.0f);
            
            pPoseStack.translate(0, 0, zCenter);

            // Scale to button size (6x4x2 pixels)
            // Width: 6/16 = 0.375, Height: 4/16 = 0.25
            pPoseStack.scale(0.377f, 0.252f, depth);

            // Center the mimic block unit cube [0, 1] at the origin
            pPoseStack.translate(-0.5, -0.5, -0.5);

            blockRenderer.renderSingleBlock(mimic, pPoseStack, pBufferSource, pPackedLight, pPackedOverlay, ModelData.EMPTY, null);
            
            pPoseStack.popPose();
        }
    }
}
