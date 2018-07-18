package net.zalfenior.ExtraGen.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase infusionDust = new ItemBase("infusion_dust").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				infusionDust
		);
	}
	
	public static void registerModels() {
		infusionDust.registerItemModel();
	}
	
}
