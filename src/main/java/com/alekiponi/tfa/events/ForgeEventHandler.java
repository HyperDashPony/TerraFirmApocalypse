package com.alekiponi.tfa.events;

import com.alekiponi.tfa.TerraFirmApocalypse;
import net.dries007.tfc.config.TFCConfig;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TerraFirmApocalypse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventHandler {


    @SubscribeEvent
    public static void onWorldLoad(LevelEvent.Load event)
    {
        if (event.getLevel() instanceof final ServerLevel level)
        {

            final MinecraftServer server = level.getServer();

            TFCConfig.SERVER.enableVanillaMonstersOnSurface.set(true);

        }
    }

}
