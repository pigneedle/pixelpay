package com.pixelpay.pixelpaymod;

import java.util.logging.Logger;

import net.minecraftforge.common.MinecraftForge;

import com.pixelmonmod.pixelmon.Pixelmon;
import com.pixelpay.pixelpaymod.config.PixelPayConfig;
import com.pixelpay.pixelpaymod.events.ForgeEventsHandler;
import com.pixelpay.pixelpaymod.events.PixelmonEventsHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import java.util.logging.Logger;

@Mod(modid = PixelPayMod.MODID, name = PixelPayMod.NAME, version = PixelPayMod.VERSION)
public class PixelPayMod
{
    public static final String MODID = "pixelpay";
    public static final String NAME = "Pixelmon Payment System";
    public static final String VERSION = "0.1";

    public Logger logger = Logger.getLogger("PixelPoints");
    public static PixelPayConfig config;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Initialization console output
    	System.out.println("Pixelmon Payment System >> "+"initialized!");
    	// Register Events
    	MinecraftForge.EVENT_BUS.register(new ForgeEventsHandler());
    }
    
    @EventHandler
    public void serverStart(FMLServerStartingEvent event)
    {
    	// Register Events
    	Pixelmon.EVENT_BUS.register(new PixelmonEventsHandler());
    }
}
