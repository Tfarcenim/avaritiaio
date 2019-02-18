package com.tfar.avaritiaio.items;

import com.tfar.avaritiaio.main;
import com.tfar.avaritiaio.init.ModItems;
import com.tfar.avaritiaio.util.IHasModel;
import crazypants.enderio.api.capacitor.ICapacitorData;
import crazypants.enderio.api.capacitor.ICapacitorKey;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public class ItemBase extends Item implements IHasModel, ICapacitorData {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);    }
    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(this,0,"inventory");
    }

    @Override
    public float getUnscaledValue(@Nonnull ICapacitorKey key) {
        return 1f;
    }

    @Nonnull
    @Override
    public String getUnlocalizedName() {
        return "none";
    }

    @Nonnull
    @Override
    public String getLocalizedName() {
        return "none";
    }
}
