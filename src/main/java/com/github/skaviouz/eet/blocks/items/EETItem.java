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
package com.github.skaviouz.eet.blocks.items;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author skaviouz
 */
public class EETItem extends Item {

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!playerIn.isSneaking()) {
			if (stack.getTagCompound() == null) {
				stack.setTagCompound(new NBTTagCompound());
			}
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("dim", playerIn.dimension);
			nbt.setInteger("posX", pos.getX());
			nbt.setInteger("posY", pos.getY());
			nbt.setInteger("posZ", pos.getZ());
			stack.getTagCompound().setTag("coords", nbt);
			stack.setStackDisplayName(EnumChatFormatting.AQUA + "synchronized_ender_pearl");
		}
		return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (playerIn.isSneaking()) {
			if (stack.getTagCompound() != null) {
				stack.getTagCompound().removeTag("coords");
				stack.clearCustomName();
			}
		}
		return stack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		if (stack.getTagCompound() != null) {
			if (stack.getTagCompound().hasKey("coords")) {
				NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("coords");
				int[] pos = new int[]{
					nbt.getInteger("dim"),
					nbt.getInteger("posX"),
					nbt.getInteger("posY"),
					nbt.getInteger("posZ"),};
				tooltip.add("Dimension: "+pos[0]+", X:" + pos[1] + ", Y:" + pos[2] + ", Z:" + pos[3] + ".");
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		if (stack.getTagCompound()!=null) {
			return stack.getTagCompound().hasKey("coords");
		}
		return false;
	}

}
