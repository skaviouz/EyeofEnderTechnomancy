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
import com.github.skaviouz.eet.blocks.EETBlock;
import static com.github.skaviouz.eet.init.Items.getUNomit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author skaviouz
 */
public class Blocks {
	public static Block[] blocks;

	public static void init() {
		blocks = new Block[]{
			new EETBlock(Material.cloth).setUnlocalizedName("synchronized_ender_block"), 
			new EETBlock(Material.cloth).setUnlocalizedName("compressed_synchronized_ender"), 
		};
	}

	public static void register() {
		for(int i = 0;i<blocks.length;i++){
			GameRegistry.registerBlock(blocks[i], getUNomit(blocks[i],false));
		}
	}

	public static void registerRenders() {
		for(int i = 0;i<blocks.length;i++){
			registerRender(blocks[i]);
		}
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(getUNomit(block,true), "inventory")
				);
	}
	
	/**
	 * get UnlocalizedName
	 * omit (TILE:)
	 * @param block
	 * @param b true(Minecraft:Iron_Ingot) else (Iron_Ingot)
	 * @return 
	 */
	public static String getUNomit(Block block, boolean b){
		String s = block.getUnlocalizedName().substring(5);
		return (b)?Reference.MOD_ID + ":" + s:s;
	}

}
