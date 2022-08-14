package com.samgj15.nightlights;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NightLightsMain.MOD_ID)
public class NightLightsMain {
	public static final String MOD_ID = "nightlights";
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	//Creative Tab
	public static class ModCreativeTab {
		
	}
	
	//Loader
	public NightLightsMain() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(this::setup);
		ModItems.ITEMS.register(modEventBus);
		ModBlocks.BLOCKS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Hey, it's Night Lights!");
	}

}
