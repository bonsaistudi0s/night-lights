package com.samgj15.nightlights;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NightLightsMain.MOD_ID)
public class NightLightsMain {
	public static final String MOD_ID = "nightlights";
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	//Loader
	public NightLightsMain() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientSetup);
		
		ModBlocks.BLOCKS.register(modEventBus);
		ModHangingBlocks.BLOCKS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void clientSetup(final FMLClientSetupEvent event ) {
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_BROWN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_CYAN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_DEFAULT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_GRAY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_GREEN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_LIGHT_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_LIGHT_GRAY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_LIME.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.FAIRY_LIGHTS_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_BROWN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_CYAN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_DEFAULT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_GRAY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_GREEN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_LIGHT_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_LIGHT_GRAY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_LIME.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModHangingBlocks.HANGING_LIGHTS_YELLOW.get(), RenderType.cutout());
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Hey, it's Night Lights!");
	}

}
