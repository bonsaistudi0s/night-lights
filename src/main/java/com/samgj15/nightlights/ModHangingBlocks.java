package com.samgj15.nightlights;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModHangingBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NightLightsMain.MOD_ID);
	
	public static final RegistryObject<Block> HANGING_LIGHTS_BLACK = BLOCKS.register("hanging_lights_black", () -> new ModCeilingBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().noCollission().instabreak().lightLevel((level) -> {
		return(6);
	})));
	public static final RegistryObject<Block> HANGING_LIGHTS_BLUE = BLOCKS.register("hanging_lights_blue", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_BROWN = BLOCKS.register("hanging_lights_brown", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_CYAN = BLOCKS.register("hanging_lights_cyan", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_DEFAULT = BLOCKS.register("hanging_lights_default", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_GRAY = BLOCKS.register("hanging_lights_gray", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_GREEN = BLOCKS.register("hanging_lights_green", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_LIGHT_BLUE = BLOCKS.register("hanging_lights_light_blue", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_LIGHT_GRAY = BLOCKS.register("hanging_lights_light_gray", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_LIME = BLOCKS.register("hanging_lights_lime", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_MAGENTA = BLOCKS.register("hanging_lights_magenta", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_ORANGE = BLOCKS.register("hanging_lights_orange", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_PINK = BLOCKS.register("hanging_lights_pink", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_PURPLE = BLOCKS.register("hanging_lights_purple", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_RED = BLOCKS.register("hanging_lights_red", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_WHITE = BLOCKS.register("hanging_lights_white", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> HANGING_LIGHTS_YELLOW = BLOCKS.register("hanging_lights_yellow", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	
	public static final RegistryObject<Block> FAIRY_LIGHTS_BLACK = BLOCKS.register("fairy_lights_black", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_BLUE = BLOCKS.register("fairy_lights_blue", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_BROWN = BLOCKS.register("fairy_lights_brown", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_CYAN = BLOCKS.register("fairy_lights_cyan", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_DEFAULT = BLOCKS.register("fairy_lights_default", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_GRAY = BLOCKS.register("fairy_lights_gray", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_GREEN = BLOCKS.register("fairy_lights_green", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_LIGHT_BLUE = BLOCKS.register("fairy_lights_light_blue", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_LIGHT_GRAY = BLOCKS.register("fairy_lights_light_gray", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_LIME = BLOCKS.register("fairy_lights_lime", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_MAGENTA = BLOCKS.register("fairy_lights_magenta", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_ORANGE = BLOCKS.register("fairy_lights_orange", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_PINK = BLOCKS.register("fairy_lights_pink", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_PURPLE = BLOCKS.register("fairy_lights_purple", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_RED = BLOCKS.register("fairy_lights_red", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_WHITE = BLOCKS.register("fairy_lights_white", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));
	public static final RegistryObject<Block> FAIRY_LIGHTS_YELLOW = BLOCKS.register("fairy_lights_yellow", () -> new ModCeilingBlock(Block.Properties.copy(HANGING_LIGHTS_BLACK.get())));

	@SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            final Item.Properties properties = new Item.Properties().tab(ModCreativeModeTab.CREATIVE_TAB);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }
    
}
