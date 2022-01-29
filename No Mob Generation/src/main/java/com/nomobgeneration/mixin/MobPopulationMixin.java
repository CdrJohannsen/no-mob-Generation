package com.nomobgeneration.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.world.SpawnHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(SpawnHelper.class)
public class MobPopulationMixin {
    @Inject(at = @At("HEAD"), method = "populateEntities", cancellable = true)
    private static void isValidChar(CallbackInfo ci) {
       ci.cancel();
    }
}
