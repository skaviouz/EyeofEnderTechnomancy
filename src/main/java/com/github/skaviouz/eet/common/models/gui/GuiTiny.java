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
package com.github.skaviouz.eet.common.models.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.Stitcher.Slot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

/**
 *
 * @author skaviouz
 */
public class GuiTiny extends GuiContainer {

	public GuiTiny(Container p_i1072_1_) {
		super(p_i1072_1_);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	}
/*
public GuiTiny(InventoryPlayer inventoryPlayer, TileEntityTiny tileEntity) {
	//the container is instanciated and passed to the superclass for handling
	super(new ContainerTiny(inventoryPlayer, tileEntity));
}

@Override
protected void drawGuiContainerForegroundLayer(int param1, int param2) {
	//draw text and stuff here
	//the parameters for drawString are: string, x, y, color
	fontRenderer.drawString("Tiny", 8, 6, 4210752);
	//draws "Inventory" or your regional equivalent
	fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
}

@Override
protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	this.mc.renderEngine.bindTexture(new ResourceLocation("/gui/trap.png"));
	int x = (width - xSize) / 2;
	int y = (height - ySize) / 2;
	this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
}

public class ContainerTiny extends Container {

protected TileEntityTiny tileEntity;

public ContainerTiny(InventoryPlayer inventoryPlayer, TileEntityTiny te) {
	tileEntity = te;

                //the Slot constructor takes the IInventory and the slot number in that it binds to
	//and the x-y coordinates it resides on-screen
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			addSlotToContainer(new Slot(tileEntity, j + i * 3, 62 + j * 18, 17 + i * 18));
		}
	}

	//commonly used vanilla code that adds the player's inventory
	bindPlayerInventory(inventoryPlayer);
}

@Override
public boolean canInteractWith(EntityPlayer player) {
	return tileEntity.isUseableByPlayer(player);
}

protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 9; j++) {
			addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
					8 + j * 18, 84 + i * 18));
		}
	}

	for (int i = 0; i < 9; i++) {
		addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
	}
}

@Override
public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
	ItemStack stack = null;
	Slot slotObject = (Slot) inventorySlots.get(slot);

	//null checks and checks if the item can be stacked (maxStackSize > 1)
	if (slotObject != null && slotObject.getHasStack()) {
		ItemStack stackInSlot = slotObject.getStack();
		stack = stackInSlot.copy();

		//merges the item into player inventory since its in the tileEntity
		if (slot < tileEntity.getSizeInventory()) {
			if (!this.mergeItemStack(stackInSlot, tileEntity.getSizeInventory(), 36 + tileEntity.getSizeInventory(), true)) {
				return null;
			}
		} //places it into the tileEntity is possible since its in the player inventory
		else if (!this.mergeItemStack(stackInSlot, 0, tileEntity.getSizeInventory(), false)) {
			return null;
		}

		if (stackInSlot.stackSize == 0) {
			slotObject.putStack(null);
		} else {
			slotObject.onSlotChanged();
		}

		if (stackInSlot.stackSize == stack.stackSize) {
			return null;
		}
		slotObject.onPickupFromSlot(player, stackInSlot);
	}
	return stack;
}
}*/
}
