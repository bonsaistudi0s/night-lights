package com.samgj15.nightlights;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class CustomBlockItem extends BlockItem implements IForgeItem{

	public CustomBlockItem(Block block, Properties properties) {
		super(block, properties);
	}
	
	@Override
    public boolean canEquip(ItemStack itemStack, EquipmentSlot armorType, Entity entity)
        {
               if (armorType == EquipmentSlot.HEAD) {
            		return true;
                }
                else return false;
        }
}
