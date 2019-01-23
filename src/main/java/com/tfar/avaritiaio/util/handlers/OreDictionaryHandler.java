package com.tfar.avaritiaio.util.handlers;

import com.tfar.avaritiaio.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
    public static void RegisterOreDictionary() {

        OreDictionary.registerOre("ballInfinity", ModItems.INFINITY_GRINDING_BALL);
        OreDictionary.registerOre("ballNeutronium", ModItems.NEUTRONIUM_GRINDING_BALL);
    }
}
