package com.luciddemon.mysticalash.event;

import com.luciddemon.mysticalash.MysticalAsh;
import com.luciddemon.mysticalash.entity.ModEntityTypes;
import com.luciddemon.mysticalash.entity.custom.QuadwingEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MysticalAsh.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.QUADWING.get(), QuadwingEntity.setAttributes());
    }
}
