package com.alekiponi.tfa.mixins;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(AbstractSkeleton.class)
public class AbstractSkeletonMixin extends Monster implements RangedAttackMob {


    protected AbstractSkeletonMixin(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public void aiStep() {
        super.aiStep();
    }

    public void performRangedAttack(LivingEntity pTarget, float pVelocity) {

    }
}
