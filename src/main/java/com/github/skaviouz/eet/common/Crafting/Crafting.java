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
package com.github.skaviouz.eet.common.Crafting;

import com.github.skaviouz.eet.init.EETItems;
import net.minecraft.item.ItemStack;

/**
 * The crafting recipe for the item this'll include all crafting methods.
 *
 * @author skaviouz
 */
public @interface Crafting {

CraftingType ct = CraftingType.Default;

int i();

public enum CraftingType {

None, Default, Shapeless,
}

public class enumm {

int none = 0;
}

public @interface hasDefaultRecipes {

public Object is = null;
}

public @interface hasShapelessRecipes {

}

public interface insiderun {

public ItemStack is = new ItemStack(EETItems.items[0]);
//		public 
}

}
