package com.luciddemon.mysticalash.entity;

import com.luciddemon.mysticalash.MysticalAsh;
import com.luciddemon.mysticalash.entity.custom.QuadwingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MysticalAsh.MODID);

    public static final RegistryObject<EntityType<QuadwingEntity>> QUADWING =
            ENTITY_TYPES.register("quadwing",
                    () -> EntityType.Builder.of(QuadwingEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(MysticalAsh.MODID, "quadwing").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
