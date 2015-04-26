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
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import net.minecraftforge.common.config.Configuration;

/**
 * Load all the configs
 *
 * @author skaviouz
 */
public class EETConfig {

//loading via classloader on runtime will be
//		/
//		leading / is stripped, don't care
//loading via EETConfig.class.getResourceAsStream on runtime can be
//		/build/classes/main/com/github/skaviouz/eet/init (DEV)
//		/mods/mod.jar/com/github/skaviouz/eet/init (USER)
public static void init(File dir) throws Exception {
	EyeofEnderTechnomancy.config = new Configuration(new File(dir, "EyeofEnderTechnomancy.cfg"));
	try {
		EyeofEnderTechnomancy.config.load();
		syncConfig();
	} catch (Exception e) {
		//drop the ball
		throw e;
	} finally {
		EyeofEnderTechnomancy.config.save();
	}
}

/**
 * change all the default settings to the configured values
 */
public static void syncConfig() {
}

}
