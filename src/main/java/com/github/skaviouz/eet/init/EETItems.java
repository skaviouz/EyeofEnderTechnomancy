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

import com.github.skaviouz.eet.EyeofEnderTechnomancy;
import com.github.skaviouz.eet.Reference;
import com.github.skaviouz.eet.assets.models.EETItem;
import com.github.skaviouz.eet.assets.models.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author skaviouz
 */
public class EETItems {

public static Item[] items;

public static void init() {
	items = new Item[]{
		new SynchronizedEnderPearl(),};
}

public static void register() {
	for (int i = 0; i < items.length; i++) {
		GameRegistry.registerItem(items[i], getUNomit(items[i], false));
	}
}

public static void registerRenders() {
	for (int i = 0; i < items.length; i++) {
		registerRender(items[i]);
	}
}

public static void registerRender(Item item) {
	Minecraft
			.getMinecraft()
			.getRenderItem()
			.getItemModelMesher()
			.register(
					item,
					0,
					new ModelResourceLocation(getUNomit(item, true), "inventory")
			);
}

/**
 * get UnlocalizedName omit (TILE:)
 *
 * @param item
 * @param b true(Minecraft:Iron_Ingot) else (Iron_Ingot)
 * @return
 */
public static String getUNomit(Item item, boolean b) {
	String s = item.getUnlocalizedName().substring(5);
	return (b) ? Reference.MOD_ID + ":" + s : s;
}

}
