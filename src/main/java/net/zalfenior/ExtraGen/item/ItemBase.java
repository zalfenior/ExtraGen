package net.zalfenior.ExtraGen.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.zalfenior.ExtraGen.ExtraGen;

public class ItemBase extends Item {
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		ExtraGen.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
