package de.kaito.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;

public final class KaitoZoom {

    private static final double ZOOM_FOV = 30.0;

    private KaitoZoom() {
    }

    public static void initialize() {
        ClientTickEvents.END_CLIENT_TICK.register(KaitoZoom::tick);
    }

    private static void tick(Minecraft client) {
        if (client.player == null) {
            return;
        }

        if (Zoom.ZOOM_KEY.isDown()) {
            client.options.fov().set((int) ZOOM_FOV);
        }
    }
}