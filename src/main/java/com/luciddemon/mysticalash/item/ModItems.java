package com.luciddemon.mysticalash.item;

import com.luciddemon.mysticalash.MysticalAsh;
import com.luciddemon.mysticalash.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysticalAsh.MODID);

    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_ASH)));

    public static final RegistryObject<Item> QUADWING_SPAWN_EGG = ITEMS.register("quadwing_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.QUADWING,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_ASH)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
