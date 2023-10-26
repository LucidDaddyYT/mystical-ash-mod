package com.luciddemon.mysticalash.entity.client;

import com.luciddemon.mysticalash.MysticalAsh;
import com.luciddemon.mysticalash.entity.custom.QuadwingEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class QuadwingRenderer extends GeoEntityRenderer<QuadwingEntity> {
    public QuadwingRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new QuadwingModel());
        this.shadowRadius = 2.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(QuadwingEntity instance) {
        return new ResourceLocation(MysticalAsh.MODID, "textures/entity/quadwing.png");
    }
}
