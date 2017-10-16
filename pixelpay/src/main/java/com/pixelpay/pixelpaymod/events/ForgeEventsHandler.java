package com.pixelpay.pixelpaymod.events;

import com.pixelmonmod.pixelmon.api.events.BeatTrainerEvent;
import com.pixelmonmod.pixelmon.api.events.BeatWildPixelmonEvent;
import com.pixelmonmod.pixelmon.api.events.LevelUpEvent;
import com.pixelmonmod.pixelmon.api.events.LostToTrainerEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonAchievementEvent;
import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.pixelmonmod.pixelmon.api.events.EvolveEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonFaintEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonTradeEvent;
import com.pixelmonmod.pixelmon.api.events.PlayerBattleEndedEvent;
import com.pixelmonmod.pixelmon.api.events.PokeLootClaimedEvent;
import com.pixelmonmod.pixelmon.api.events.RareCandyEvent;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class ForgeEventsHandler {
    @SubscribeEvent
	public void PlayerLogin (PlayerEvent.PlayerLoggedInEvent event) {   	 
        // Log in console output
    	System.out.println("Pixelmon Payment System >> "+ event.player.getName() +" logged in.");
    	// Log in message player.
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
    			 event.player.getName() + TextFormatting.RESET + " logged in."));
	}
}
