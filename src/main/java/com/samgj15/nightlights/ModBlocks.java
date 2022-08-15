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
