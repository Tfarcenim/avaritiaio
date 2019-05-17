package com.tfar.avaritiaio;

import com.tfar.avaritiaio.init.ModItems;
import com.tfar.avaritiaio.items.ItemBase;
import com.tfar.avaritiaio.util.IMCHandler;
import com.tfar.avaritiaio.util.Vars;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Logger;
@Mod.EventBusSubscriber
@Mod(modid = Vars.MOD_ID, name = Vars.NAME, version = Vars.VERSION,
dependencies = Vars.DEPENDENCIES, acceptedMinecraftVersions = Vars.MC_VERSION)
public class AvaritiaIO {

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        IMCHandler.sendIMCs();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ballInfinity", ModItems.INFINITY_GRINDING_BALL);
        OreDictionary.registerOre("ballNeutronium", ModItems.NEUTRONIUM_GRINDING_BALL);
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        for (ItemBase item : ModItems.ITEMS) {
            item.setRegistryName(item.name);
            item.setTranslationKey(item.registryName.toString());
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            ((ItemBase) item).registerModel();
        }
    }
}
