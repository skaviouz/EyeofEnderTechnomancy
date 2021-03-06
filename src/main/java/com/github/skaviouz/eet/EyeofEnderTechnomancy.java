/*
 * 
 DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
 Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

 DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
 TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

 0. You just DO WHAT THE FUCK YOU WANT TO.
 */
package com.github.skaviouz.eet;

import com.github.skaviouz.eet.common.models.CreativeGUITab;
import com.github.skaviouz.eet.init.Recipes;
import com.github.skaviouz.eet.init.EETBlocks;
import com.github.skaviouz.eet.init.EETConfig;
import com.github.skaviouz.eet.init.EETItems;
import com.github.skaviouz.eet.proxy.CommonProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

/**
 * The Eye of Ender Technomancy mod.
 *
 * @author skaviouz
 */
@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION,
		acceptedMinecraftVersions = "1.8"
) //Tell forge "Oh hey, there's a new mod here to load."
public class EyeofEnderTechnomancy {

/**
 * Oh hey! Can you system.out.println for me? and add some useful extras like
 * time?
 */
public static Logger log = FMLLog.getLogger();

public static Configuration config;

/**
 * Annotation is used by the ML reflection is used to override CommonProxy with
 * ClientProxy See how we set clientSide and serverSide; and clientSide extends
 * serverSide.
 */
@SidedProxy(
		clientSide = Reference.CLIENT_PROXY_CLASS,
		serverSide = Reference.SERVER_PROXY_CLASS
)
public static CommonProxy proxy;

public static final CreativeGUITab tab_eet = new CreativeGUITab("tabEETechnomancy");

@Instance(
		value = Reference.MOD_ID) //Tell Forge what instance to use.
public static EyeofEnderTechnomancy instance;

/**
 * Config handling item/block init and registration
 *
 * @param event
 * @throws Exception Not my fault
 */
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event) throws Exception {
	//config handling stuff
	EETConfig.init(event.getModConfigurationDirectory());
	//item/block init and registering
	EETBlocks.init();
	EETBlocks.register();
	EETItems.init();
	EETItems.register();
}

@Mod.EventHandler
public void Init(FMLInitializationEvent event) {
	//client proxy stuff
	//tileEntities, guis, entities, packet registering
	proxy.registerRenders();
	Recipes.init();
}

@Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event) {

}

}
