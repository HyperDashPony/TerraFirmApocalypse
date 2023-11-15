package com.alekiponi.tfa.mixins;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;

import java.util.UUID;

@Mixin(EnderMan.class)
public class EnderManMixin extends Monster implements NeutralMob {

    protected EnderManMixin(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
    }


    public int getRemainingPersistentAngerTime() {
        return 0;
    }


    public void setRemainingPersistentAngerTime(int pRemainingPersistentAngerTime) {

    }


    public UUID getPersistentAngerTarget() {
        return null;
    }


    public void setPersistentAngerTarget(@Nullable UUID pPersistentAngerTarget) {

    }


    public void startPersistentAngerTimer() {

    }
}
