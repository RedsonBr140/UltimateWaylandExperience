package com.github.redsonbr140.wayland;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WaylandPreLaunch implements PreLaunchEntrypoint {
    public static final Logger LOGGER = LogManager.getLogger("the-ultimate-wayland-experience");

    @Override
		public void onPreLaunch() {
			LOGGER.info("Wayland EXP Pre-LAUNCHED!!!");
	}
}
