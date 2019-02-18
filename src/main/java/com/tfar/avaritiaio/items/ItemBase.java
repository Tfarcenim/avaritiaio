package com.tfar.avaritiaio.items;

import com.tfar.avaritiaio.main;
import com.tfar.avaritiaio.init.ModItems;
import com.tfar.avaritiaio.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);    }
    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
