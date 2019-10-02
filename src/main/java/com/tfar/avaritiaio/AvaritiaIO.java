package com.tfar.avaritiaio;

import com.tfar.avaritiaio.capacitor.ItemInfinityCapacitor;
import com.tfar.avaritiaio.util.IMCHandler;
import com.tfar.avaritiaio.util.Vars;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
@Mod(modid = Vars.MOD_ID, name = Vars.NAME, version = Vars.VERSION,
        dependencies = Vars.DEPENDENCIES, acceptedMinecraftVersions = Vars.MC_VERSION)
public class AvaritiaIO {

  public static final List<Item> ITEMS = new ArrayList<>();

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    IMCHandler.sendIMCs();
  }
  @EventHandler
  public static void init(FMLInitializationEvent event) {
    OreDictionary.registerOre("ballInfinity", ModItems.GRINDINGBALLINFINITY);
    OreDictionary.registerOre("ballNeutronium", ModItems.GRINDINGBALLNEUTRONIUM);
  }

  @SubscribeEvent
  public static void onItemRegister(RegistryEvent.Register<Item> event) {
    registerItem(new Item(),"grindingballneutronium",event.getRegistry());
    registerItem(new Item(),"grindingballinfinity",event.getRegistry());
    registerItem(new ItemInfinityCapacitor(),"infinitecapacitor",event.getRegistry());
  }

  public static void registerItem(Item item, String name, IForgeRegistry<Item> registry) {
    registry.register(item.setRegistryName(name).setTranslationKey(item.getRegistryName().toString()));
    ITEMS.add(item);
  }

  @SubscribeEvent
  public static void onModelRegister(ModelRegistryEvent event) {
    for (Item item :ITEMS) {
      ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
  }

  @SubscribeEvent
  public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
    //Only process events for this mod
    if (event.getModID().equals(Vars.MOD_ID)) {
      ConfigManager.sync(Vars.MOD_ID, Config.Type.INSTANCE);
    }
  }

  @GameRegistry.ObjectHolder(Vars.MOD_ID)
  public static class ModItems {
    public static final Item GRINDINGBALLNEUTRONIUM = null;
    public static final Item GRINDINGBALLINFINITY = null;
  }
}
