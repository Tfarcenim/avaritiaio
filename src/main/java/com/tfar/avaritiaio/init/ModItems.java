package com.tfar.avaritiaio.init;

import com.tfar.avaritiaio.capacitor.ItemInfinityCapacitor;
import com.tfar.avaritiaio.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<ItemBase> ITEMS = new ArrayList<>();
    public static final Item INFINITE_CAPACITOR = new ItemInfinityCapacitor("infinitecapacitor");
    public static final Item NEUTRONIUM_GRINDING_BALL = new ItemBase("grindingballneutronium");
    public static final Item INFINITY_GRINDING_BALL = new ItemBase("grindingballinfinity");
}

