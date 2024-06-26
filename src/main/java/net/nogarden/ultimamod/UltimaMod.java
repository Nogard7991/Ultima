package net.nogarden.ultimamod;

import net.fabricmc.api.ModInitializer;

import net.nogarden.ultimamod.block.ModBlocks;
import net.nogarden.ultimamod.item.ModItemGroups;
import net.nogarden.ultimamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "ultimamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}