package com.luciddemon.mysticalash.entity.client;

import com.luciddemon.mysticalash.MysticalAsh;
import com.luciddemon.mysticalash.entity.custom.QuadwingEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class QuadwingModel extends AnimatedGeoModel<QuadwingEntity> {
    @Override
    public ResourceLocation getModelLocation(QuadwingEntity object) {
        return new ResourceLocation(MysticalAsh.MODID, "geo/quadwing.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(QuadwingEntity object) {
        return new ResourceLocation(MysticalAsh.MODID, "textures/entity/quadwing.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(QuadwingEntity animatable) {
        return new ResourceLocation(MysticalAsh.MODID, "animations/quadwing.animation.json");
    }
}
