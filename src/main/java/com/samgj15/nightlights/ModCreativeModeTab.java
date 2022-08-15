package com.samgj15.nightlights;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
	public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("nightlights") {

	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(Items.REDSTONE_LAMP); //PINK OCTOPUS
	    }
	};
}
