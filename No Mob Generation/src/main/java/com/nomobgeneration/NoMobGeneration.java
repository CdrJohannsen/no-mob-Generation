package com.nomobgeneration;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoMobGeneration implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("nomobgeneration");

	@Override
	public void onInitialize() {
		LOGGER.info("NoMobGeneration Initialized!");
	}
}
