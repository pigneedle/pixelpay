package com.pixelpay.pixelpaymod.events;

import com.pixelmonmod.pixelmon.api.events.BeatTrainerEvent;
import com.pixelmonmod.pixelmon.api.events.BeatWildPixelmonEvent;
import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.pixelmonmod.pixelmon.api.events.EvolveEvent;
import com.pixelmonmod.pixelmon.api.events.LevelUpEvent;
import com.pixelmonmod.pixelmon.api.events.LostToTrainerEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonAchievementEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonFaintEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonTradeEvent;
import com.pixelmonmod.pixelmon.api.events.PlayerBattleEndedEvent;
import com.pixelmonmod.pixelmon.api.events.PokeLootClaimedEvent;
import com.pixelmonmod.pixelmon.api.events.RareCandyEvent;


import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PixelmonEventsHandler {
	@SubscribeEvent
    public void battleEnd(PlayerBattleEndedEvent event) {}
    
    @SubscribeEvent
    public void beatWildPokemon(BeatWildPixelmonEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.beatWildPixelmonXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"Beat a wild pokemon!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " beat a wild Pokemon!"));
    }
    
    @SubscribeEvent
    public void captureEvent(CaptureEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.capturePixelmonXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"You caught a Pokemon!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " caught a wild Pokemon!"));
    }    
    
    @SubscribeEvent
    public void faintEvent(PixelmonFaintEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.pixelmonFaintXP, event.owner.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"You are out of usable Pokemon!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " is out of usable Pokemon!"));
    }
    
    @SubscribeEvent
    public void beatTrainer(BeatTrainerEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.beatTrainerXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"You won the battle!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " won a battle!"));
    }
    
    @SubscribeEvent
    public void loseToTrainer(LostToTrainerEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.loseTrainerXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"You lost the battle!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " lost a battle!"));
    }
    
    @SubscribeEvent
    public void trade(PixelmonTradeEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.tradeXP, event.player1.getDisplayName());
      //PointsAPI.addPoints(PixelPoints.config.tradeXP, event.player2.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"Trade Complete!");
    	event.player1.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player1.getName() + TextFormatting.RESET + " completed a trade!"));
    }
    
    @SubscribeEvent
    public void lootClaimed(PokeLootClaimedEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.claimLootXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"PokeLoot!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " got PokeLoot!"));
    }
    
    @SubscribeEvent
    public void evolved(EvolveEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.pixelmonEvolvedXP, ((EntityPlayer)event.preEvo.func_70902_q()).getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"Your Pokemon evolved!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + "'s Pokemon evolved!"));
    }
    
    @SubscribeEvent
    public void onPixelAchievement(PixelmonAchievementEvent event)
    {
      /*if (event.achievementName.equals("firstcatchChieve")) {
        PointsAPI.addPoints(PixelPoints.config.firstCatchXP, event.player.getDisplayName());
      }
      if (event.achievementName.equals("shinyChieve")) {
        PointsAPI.addPoints(PixelPoints.config.captureShinyAchievementXP, event.player.getDisplayName());
      }*/
    	System.out.println("Pixelmon Payment System >> "+"Achievement!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " earned an achievement!"));
    }
    
    @SubscribeEvent
    public void useRareCandy(RareCandyEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.useRareCandyXP, event.player.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"Rare candy used!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + " used a Rare Candy!"));
    }
    
    @SubscribeEvent
    public void levelUp(LevelUpEvent event)
    {
      //PointsAPI.addPoints(PixelPoints.config.levelUpXP, event.owner.getDisplayName());
    	System.out.println("Pixelmon Payment System >> "+"Level up!");
    	event.player.addChatMessage(new TextComponentString(TextFormatting.RED + "Pixelmon Payment System >> " + TextFormatting.BOLD +
   			 event.player.getName() + TextFormatting.RESET + "'s Pokemon leveled up!"));
    }
}
