package org.devoxx4kids.forge.mods.wic;

import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Parachute {

	@SubscribeEvent
	public void deployParachute(PlayerTickEvent event) {
		// Put code to slow fall motion here
	}

	@SubscribeEvent
	public void negateFallDamage(LivingFallEvent event) {
		// Put code to prevent fall damage here
	}
}