package net.divinerpg.utils.events;

import java.io.IOException;

import net.divinerpg.utils.Util;
import net.divinerpg.utils.config.ConfigurationHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EventClientLogin {
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent evt) {
			EntityPlayer p = evt.player;
			if (!p.worldObj.isRemote) {
				try {
					if(!UpdateChecker.isOnline() && !ConfigurationHelper.canShowOverlay){
						if(Util.isDeveloperName(p.getCommandSenderName())) {
							p.addChatMessage(Util.getChatComponent(Util.AQUA + "Welcome DivineRPG developer!"));
						} else {
							p.addChatMessage(Util.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + Util.GREEN + " DivineRPG!"));
						}
						p.addChatMessage(Util.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Unable to check for latest version, you may want to check your internet connection!"));
					}
					else if(UpdateChecker.isUpdateAvailable() && !ConfigurationHelper.canShowOverlay) {
						p.addChatMessage(Util.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + Util.GREEN + " DivineRPG!"));
						p.addChatMessage(Util.addChatMessage(EnumChatFormatting.RED, "A DivineRPG update is avaliable."));
						p.addChatMessage(Util.addChatMessage(EnumChatFormatting.RED, "[New Version: " + UpdateChecker.getCurrentVersion() + "]")); 
					}
					else {
						p.addChatMessage(Util.addChatMessage(EnumChatFormatting.AQUA, "Thank you "  + p.getDisplayName() + ", for downloading and playing" + Util.GREEN + " DivineRPG!"));
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} 
}