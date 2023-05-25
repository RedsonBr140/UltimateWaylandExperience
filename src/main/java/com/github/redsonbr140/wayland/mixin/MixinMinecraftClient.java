package com.github.redsonbr140.wayland.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


import java.io.InputStream;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
	@Redirect(method = "<init>*", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setIcon(Ljava/io/InputStream;Ljava/io/InputStream;)V"))
	private void redirectSetIcon(Window window, InputStream icon16, InputStream icon32) {
		// Do nothing (redirected method call is skipped)
	}
}
