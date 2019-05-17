package com.tfar.avaritiaio.items;

import com.tfar.avaritiaio.init.ModItems;
import com.tfar.avaritiaio.util.Vars;
import crazypants.enderio.base.EnderIOTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item {

    public String name;
    public ResourceLocation registryName;

    public ItemBase(String name) {
        setCreativeTab(EnderIOTab.tabEnderIOMaterials);
        ModItems.ITEMS.add(this);
        this.name = name;
        this.registryName = new ResourceLocation(Vars.MOD_ID, name);
    }

    public void registerModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
