package com.nextcentury.wic.minecraft.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.nextcentury.wic.minecraft.food.BringMeDoughnuts;
import com.nextcentury.wic.minecraft.food.Doughnut;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0";
	public static Doughnut doughnut;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(doughnut, 0,
						new ModelResourceLocation("examplemod:doughnut"));
	}

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		doughnut = new Doughnut();
		GameRegistry.registerItem(doughnut, "doughnut");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		if (event.getSide().isClient()) {
			//ModelBakery.addVariantName(doughnut, new String[] { MODID
			//		+ ":doughnut" });

			registerItem(doughnut, 0, MODID + ":doughnut");
		}
	}

	@SideOnly(Side.CLIENT)
	public static void registerItem(Item item, int metadata, String itemName) {
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem()
				.getItemModelMesher();
		mesher.register(item, metadata, new ModelResourceLocation(itemName,
				"inventory"));
	}

	@EventHandler
	public void registerCommands(FMLServerStartingEvent event) {
		event.registerServerCommand(new BringMeDoughnuts());
	}
}
