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
package com.github.skaviouz.eet.proxy;

import com.github.skaviouz.eet.init.Blocks;
import com.github.skaviouz.eet.init.Items;

/**
 *
 * @author skaviouz
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		Items.registerRenders();
		Blocks.registerRenders();
	}
}
