package com.neofast.hero_aesthetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.neofast.hero_aesthetics.block.entity.ItemDisplayBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class ItemDisplayBlockEntityRenderer implements BlockEntityRenderer<ItemDisplayBlockEntity> {
    public ItemDisplayBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(ItemDisplayBlockEntity pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBufferSource, int pPackedLight, int pPackedOverlay) {
        ItemStack itemStack = pBlockEntity.getItemStack();
        if (!itemStack.isEmpty()) {
            pPoseStack.pushPose();
            
            // Move to the center of the block and slightly up
            pPoseStack.translate(0.5D, 0.9D, 0.5D);
            pPoseStack.scale(0.5F, 0.5F, 0.5F);

            // Rotate based on time for a nice effect
            long time = pBlockEntity.getLevel().getGameTime();
            float rotation = (time + pPartialTick) * 4.0F;
            pPoseStack.mulPose(Axis.YP.rotationDegrees(rotation));

            ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
            itemRenderer.renderStatic(itemStack, ItemDisplayContext.FIXED, pPackedLight, OverlayTexture.NO_OVERLAY, pPoseStack, pBufferSource, pBlockEntity.getLevel(), 0);
            
            pPoseStack.popPose();
        }
    }
}
