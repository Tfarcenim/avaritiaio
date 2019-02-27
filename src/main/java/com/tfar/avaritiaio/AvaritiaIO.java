package com.tfar.avaritiaio;

import com.tfar.avaritiaio.proxy.commonproxy;
import com.tfar.avaritiaio.util.handlers.IMCHandler;
import com.tfar.avaritiaio.util.handlers.OreDictionaryHandler;
import com.tfar.avaritiaio.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION,
dependencies = reference.DEPENDENCIES, acceptedMinecraftVersions = reference.MC_VERSION)
public class AvaritiaIO {
    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static commonproxy proxy;
    public static Logger logger;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        IMCHandler.sendIMCs();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        OreDictionaryHandler.RegisterOreDictionary();

    }
    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {
    }
}
