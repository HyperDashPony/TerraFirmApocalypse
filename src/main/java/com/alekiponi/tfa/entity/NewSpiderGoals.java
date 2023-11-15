package com.alekiponi.tfa.entity;

import com.alekiponi.tfa.mixins.SpiderMixin;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Spider;

public class NewSpiderGoals {

    public static class NewSpiderTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
        public NewSpiderTargetGoal(Monster pSpider, Class<T> pEntityTypeToTarget) {
            super(pSpider, pEntityTypeToTarget, true);
        }

    }

    public static class NewSpiderAttackGoal extends MeleeAttackGoal {
        public NewSpiderAttackGoal(Monster pSpider) {
            super(pSpider, 1.0D, true);
        }

        public boolean canUse() {
            return super.canUse() && !this.mob.isVehicle();
        }


        protected double getAttackReachSqr(LivingEntity pAttackTarget) {
            return (double)(4.0F + pAttackTarget.getBbWidth());
        }
    }
}
