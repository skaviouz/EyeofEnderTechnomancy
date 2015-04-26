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

import net.minecraft.block.Block;
import net.minecraft.item.ItemEnderEye;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author skaviouz
 */
public class Recipes {

public static void init() {
	GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("eet:synchronized_ender_pearl"), 1), Item.getByNameOrId("minecraft:dirt"));
	//GameRegistry.addRecipe(new ItemStack(EETItems.items[0], 1), new Object[]{
	GameRegistry.addShapedRecipe(new ItemStack(Item.getByNameOrId("eet:synchronized_ender_pearl"), 1), new Object[]{
		"PE ",
		"   ",
		"   ",
		'P', Item.getByNameOrId("minecraft:ender_eye"),
		'E', Item.getByNameOrId("minecraft:emerald")}
	);
}

}
