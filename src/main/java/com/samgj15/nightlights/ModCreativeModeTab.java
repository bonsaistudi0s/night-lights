package com.samgj15.nightlights;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
	public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("nightlights") {

	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(ModBlocks.OCTOPUS_PINK.get());
	    }
	};
}
