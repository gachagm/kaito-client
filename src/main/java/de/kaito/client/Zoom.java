package de.kaito.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public final class Zoom {

    public static final KeyMapping ZOOM_KEY = KeyMappingHelper.registerKeyMapping(
            new KeyMapping(
                    "key.kaitoclient.zoom",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_C,
                    KeyMapping.Category.register(
                            Identifier.fromNamespaceAndPath(
                                    KaitoClient.MOD_ID,
                                    "controls"
                            )
                    )
            )
    );

    private Zoom() {
    }
}