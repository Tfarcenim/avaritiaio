package com.tfar.avaritiaio;

import com.tfar.avaritiaio.proxy.commonproxy;
import com.tfar.avaritiaio.util.handlers.OreDictionaryHandler;
import com.tfar.avaritiaio.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)

public class main {
    @Instance
    public static main instance;
    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static commonproxy proxy;
    public static Logger logger;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        {
            FMLInterModComms.sendMessage("enderio", "recipe:xml",
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?><recipes>"
                            + "<recipe name=\"Infinite capacitor\" required=\"true\" disabled=\"false\"><crafting>"
                            + "<grid size=\"3x3\">"
                            + "<item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" /><item name=\"avaritiaio:infinitecapacitorassembly\"/><item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" /><item name=\"CAPACITOR3\" />"
                            + "</grid>"
                            + "<output name=\"avaritiaio:infinitecapacitor\" nbt= '{eiocap: {level: 9.999999f}}'/>"
                            +"</crafting></recipe></recipes>");
            FMLInterModComms.sendMessage("enderio", "recipe:xml",
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?><recipes>"
                            + "<grindingball name=\"Infinity Ball\" grinding=\"5.00\" chance=\"5.00\" power=\"0.01\" durability=\"2000000000\" >"
                            + "<item name=\"oredict:ballInfinity\"/>"
                            + "</grindingball>"
                            + "<grindingball name=\"Neutronium Ball\" grinding=\"1.00\" chance=\"5.00\" power=\"0.10\" durability=\"2000000\" >"
                            + "<item name=\"oredict:ballNeutronium\"/>"
                            +"</grindingball></recipes>");
        }


    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        OreDictionaryHandler.RegisterOreDictionary();

    }
    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {

    }
}
