package com.nextcentury.wic.minecraft.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Doughnut extends ItemFood {

	/**
	 * Constructor - how a new item gets built
	 */
	public Doughnut() {
		
		// heals 3 hunger bars, does 5 saturation, and is not edible by wolves
		super(3, 5, false);
		
		// give it a base name, which we can alter for internationalization
		this.setUnlocalizedName("doughnut");	

		// choose what tab to allot this item in in creative mode... (tools, transports, food, ...)
		this.setCreativeTab(CreativeTabs.tabFood);

		// how many can we hold onto, max
		this.setMaxStackSize(5);
		
		// Let me eat this whether or not I'm hungry
		this.setAlwaysEdible();
		
	}

	
	
}
