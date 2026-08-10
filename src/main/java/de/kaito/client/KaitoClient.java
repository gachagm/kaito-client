package de.kaito.client;

import net.fabricmc.api.ClientModInitializer;

public class KaitoClient implements ClientModInitializer {

    public static final String MOD_ID = "kaitoclient";

    @Override
    public void onInitializeClient() {
        System.out.println("[Kaito Client] Loaded!");
    }
}