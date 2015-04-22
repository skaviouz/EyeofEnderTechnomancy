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
package com.github.skaviouz.eet.init;

import com.github.skaviouz.eet.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author skaviouz
 */
public class Items {

	public static Item iron_ingot;

	public static void init() {
		iron_ingot = new Item().setUnlocalizedName("iron_ingot");
	}

	public static void register() {
		GameRegistry.registerItem(iron_ingot, iron_ingot.getUnlocalizedName().substring(5), Reference.MOD_ID);
	}

	public static void registerRenders() {

	}

	public static void registerRender(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(
								Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),
								""
						)
				);
	}
}
