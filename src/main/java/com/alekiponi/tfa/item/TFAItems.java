package com.alekiponi.tfa.item;

import com.alekiponi.tfa.TerraFirmApocalypse;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TFAItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TerraFirmApocalypse.MOD_ID);


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
