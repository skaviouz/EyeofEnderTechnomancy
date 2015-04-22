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
package com.github.skaviouz.eet;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

/**
 *
 * @author skaviouz
 */
@Mod(modid = EyeofEnderTechnomancy.MODID, name = EyeofEnderTechnomancy.MODNAME, version = EyeofEnderTechnomancy.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class EyeofEnderTechnomancy //Start the class Declaration
{

    //Set the ID of the mod (Should be lower case).

    public static final String MODID = "eet";
    //Set the "Name" of the mod.
    public static final String MODNAME = "EyeofEnderTechnomancy";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @Instance(value = EyeofEnderTechnomancy.MODID) //Tell Forge what instance to use.
    public static EyeofEnderTechnomancy instance;

 }
