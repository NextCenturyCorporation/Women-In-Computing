package com.nextcentury.wic.minecraft.doughnutmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.nextcentury.wic.minecraft.food.BringMeDoughnuts;
import com.nextcentury.wic.minecraft.food.Doughnut;

@Mod(modid = DoughnutMod.MODID, version = DoughnutMod.VERSION)
public class DoughnutMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0";
	public static Doughnut doughnut;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// TODO: Insert your message below...
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

	}


}
