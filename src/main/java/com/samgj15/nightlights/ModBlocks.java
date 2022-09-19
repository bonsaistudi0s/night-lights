package com.samgj15.nightlights;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NightLightsMain.MOD_ID);

    public static final RegistryObject<Block> FROG_BLACK = BLOCKS.register("frog_black", () -> new NightLightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightLightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> FROG_BLUE = BLOCKS.register("frog_blue", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_BROWN = BLOCKS.register("frog_brown", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_CYAN = BLOCKS.register("frog_cyan", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_GRAY = BLOCKS.register("frog_gray", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_GREEN = BLOCKS.register("frog_green", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_LIGHT_BLUE = BLOCKS.register("frog_light_blue", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_LIGHT_GRAY = BLOCKS.register("frog_light_gray", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_LIME = BLOCKS.register("frog_lime", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_MAGENTA = BLOCKS.register("frog_magenta", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_ORANGE = BLOCKS.register("frog_orange", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_PINK = BLOCKS.register("frog_pink", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_PURPLE = BLOCKS.register("frog_purple", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_RED = BLOCKS.register("frog_red", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_WHITE = BLOCKS.register("frog_white", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    public static final RegistryObject<Block> FROG_YELLOW = BLOCKS.register("frog_yellow", () -> new NightLightBlock(Block.Properties.copy(FROG_BLACK.get())));
    
    public static final RegistryObject<Block> MUSHROOM_BLACK = BLOCKS.register("mushroom_black", () -> new NightLightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightLightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MUSHROOM_BLUE = BLOCKS.register("mushroom_blue", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_BROWN = BLOCKS.register("mushroom_brown", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_CYAN = BLOCKS.register("mushroom_cyan", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_GRAY = BLOCKS.register("mushroom_gray", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_GREEN = BLOCKS.register("mushroom_green", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_LIGHT_BLUE = BLOCKS.register("mushroom_light_blue", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_LIGHT_GRAY = BLOCKS.register("mushroom_light_gray", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_LIME = BLOCKS.register("mushroom_lime", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_MAGENTA = BLOCKS.register("mushroom_magenta", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_ORANGE = BLOCKS.register("mushroom_orange", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_PINK = BLOCKS.register("mushroom_pink", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_PURPLE = BLOCKS.register("mushroom_purple", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_RED = BLOCKS.register("mushroom_red", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_WHITE = BLOCKS.register("mushroom_white", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    public static final RegistryObject<Block> MUSHROOM_YELLOW = BLOCKS.register("mushroom_yellow", () -> new NightLightBlock(Block.Properties.copy(MUSHROOM_BLACK.get())));
    
    public static final RegistryObject<Block> OCTOPUS_BLACK = BLOCKS.register("octopus_black", () -> new NightLightBlock(Block.Properties.copy(Blocks.FLOWER_POT).noOcclusion().lightLevel((state) -> state.getValue(NightLightBlock.CLICKED) ? 8 : 0).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> OCTOPUS_BLUE = BLOCKS.register("octopus_blue", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_BROWN = BLOCKS.register("octopus_brown", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_CYAN = BLOCKS.register("octopus_cyan", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_GRAY = BLOCKS.register("octopus_gray", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_GREEN = BLOCKS.register("octopus_green", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_LIGHT_BLUE = BLOCKS.register("octopus_light_blue", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_LIGHT_GRAY = BLOCKS.register("octopus_light_gray", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_LIME = BLOCKS.register("octopus_lime", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_MAGENTA = BLOCKS.register("octopus_magenta", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_ORANGE = BLOCKS.register("octopus_orange", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_PINK = BLOCKS.register("octopus_pink", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_PURPLE = BLOCKS.register("octopus_purple", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_RED = BLOCKS.register("octopus_red", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_WHITE = BLOCKS.register("octopus_white", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    public static final RegistryObject<Block> OCTOPUS_YELLOW = BLOCKS.register("octopus_yellow", () -> new NightLightBlock(Block.Properties.copy(OCTOPUS_BLACK.get())));
    
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            final Item.Properties properties = new Item.Properties().tab(ModCreativeModeTab.CREATIVE_TAB);
            final CustomBlockItem blockItem = new CustomBlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }
    
}
