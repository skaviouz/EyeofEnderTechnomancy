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

import com.github.skaviouz.eet.init.Blocks;
import com.github.skaviouz.eet.init.Items;
import com.github.skaviouz.eet.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author skaviouz
 */
@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION
) //Tell forge "Oh hey, there's a new mod here to load."
public class EyeofEnderTechnomancy //Start the class Declaration
{

	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_CLASS,
			serverSide = Reference.SERVER_PROXY_CLASS
	)
	public static CommonProxy proxy;

	@Instance(
			value = Reference.MOD_ID) //Tell Forge what instance to use.
	public static EyeofEnderTechnomancy instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Blocks.init();
		Blocks.register();
		Items.init();
		Items.register();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}

	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

	}

}
