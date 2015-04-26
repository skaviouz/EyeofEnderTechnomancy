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

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Load all the configs
 *
 * @author skaviouz
 */
public class EETConfig {

public static void init() {
	File bmDirectory = new File("config/BloodMagic/schematics");

	if (!bmDirectory.exists() && bmDirectory.mkdirs()) {
		try {
			//loading via classloader on runtime will be
			//		/
			//		leading / is stripped, don't care
			//loading via EETConfig.class.getResourceAsStream on runtime can be
			//		/build/classes/main/com/github/skaviouz/eet/init (DEV)
			//		/mods/mod.jar/com/github/skaviouz/eet/init (USER)
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("/assets/alchemicalwizardry/schematics/building/buildings.zip");
			if (in != null) {
				ZipInputStream zipStream = new ZipInputStream(in);
				ZipEntry entry = null;

				int extractCount = 0;

				while ((entry = zipStream.getNextEntry()) != null) {
					File file = new File(bmDirectory, entry.getName());
					if (file.exists() && file.length() > 3L) {
						continue;
					}
					FileOutputStream out = new FileOutputStream(file);

					byte[] buffer = new byte[8192];
					int len;
					while ((len = zipStream.read(buffer)) != -1) {
						out.write(buffer, 0, len);
					}
					out.close();

					extractCount++;
				}
			}
		} catch (Exception e) {
		}
	}
}

}
