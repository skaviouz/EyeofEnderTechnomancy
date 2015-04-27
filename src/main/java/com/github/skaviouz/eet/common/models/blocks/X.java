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
package com.github.skaviouz.eet.common.models.blocks;

import com.github.skaviouz.eet.EyeofEnderTechnomancy;
import com.github.skaviouz.eet.common.models.EETBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 *
 * @author skaviouz
 */
public class X extends EETBlock {

public X() {
	super(Material.cloth);
	setUnlocalizedName("X");
	setCreativeTab(EyeofEnderTechnomancy.tab_eet);
}

@Override
public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float X, float Y, float Z) {
//	TileEntity tileEntity = worldIn.getBlockTileEntity(X, Y, Z);
//	if (tileEntity == null || playerIn.isSneaking()) {
//		return false;
//	}
	//code to open gui explained later
	//playerIn.openGui(Tiny.instance, 0, worldIn, hitX, hitY, hitZ);
	return true;
}

}
