package com.github.redsonbr140.wayland.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.MinecraftClient;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
@Redirect(method = "<init>*", at = @At(value = "INVOKE", target = "L/net/minecraft/client/util/Window;setIcon(Ljava/io/InputStream;Ljava/io/InputStream;)V"))
private void redirectSetIcon() {
	// Do nothing (redirected method call is skipped)
}
}
