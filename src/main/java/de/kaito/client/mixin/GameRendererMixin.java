package de.kaito.client.mixin;

import de.kaito.client.Zoom;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @ModifyVariable(
            method = "getFov",
            at = @At("STORE"),
            ordinal = 0
    )
    private double kaito$zoomFov(double fov) {
        Minecraft client = Minecraft.getInstance();

        if (Zoom.ZOOM_KEY.isDown()) {
            return fov * 0.25;
        }

        return fov;
    }
}