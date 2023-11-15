package com.alekiponi.tfa.item;

import com.alekiponi.tfa.TerraFirmApocalypse;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TFATabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerraFirmApocalypse.MOD_ID);


    /*
    public static final RegistryObject<CreativeModeTab> FIRMACIV_TAB = CREATIVE_MODE_TABS.register("firmaciv_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TFAItems.SEXTANT.get()))
                    .title(Component.translatable("creativetab.firmaciv_tab"))
                    .displayItems((pParameters, pOutput) -> {


                    }).build());

     */

    public static void register(IEventBus eventBus) {
        //CREATIVE_MODE_TABS.register((eventBus));
    }

}
