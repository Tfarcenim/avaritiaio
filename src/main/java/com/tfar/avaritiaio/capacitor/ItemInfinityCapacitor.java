package com.tfar.avaritiaio.capacitor;

import com.tfar.avaritiaio.init.ModItems;
import com.tfar.avaritiaio.AvaritiaIO;
import com.tfar.avaritiaio.util.IHasModel;
import crazypants.enderio.api.capacitor.ICapacitorData;
import crazypants.enderio.api.capacitor.ICapacitorKey;
import net.minecraft.creativetab.CreativeTabs;

import javax.annotation.Nonnull;

public class ItemInfinityCapacitor extends ItemAvaritiaIOCapacitor implements IHasModel, ICapacitorData {



    public ItemInfinityCapacitor(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);
}

    @Override
    public void registerModels() {
        AvaritiaIO.proxy.registerItemRenderer(this,0,"inventory");
    }

    @Override
    public float getUnscaledValue(@Nonnull ICapacitorKey key) {
        return 1.0f;
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



