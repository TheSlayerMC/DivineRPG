package divinerpg.events.armorEvents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;

import divinerpg.DivineRPG;
import divinerpg.api.java.divinerpg.api.IFullArmorRegistry;
import divinerpg.api.java.divinerpg.api.armorset.FullArmorHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * Class managing with armor handler events
 */
public class HandlerCollection implements IFullArmorRegistry {
    /**
     * Main list of all handlers collection. Should be a single instance
     */
    private final List<FullArmorHandler> all_handlers = new ArrayList<>();

    /**
     * Current players list
     */
    private final Map<UUID, PlayerHandlers> all_players = new HashMap<>();

    public PlayerHandlers getPlayerHandler(EntityPlayer player) {
        // HOTFIX
        UUID uuid = player.getUniqueID();
        if (!all_players.containsKey(uuid)){
            addPlayer(player);
        }

        return all_players.get(uuid);
    }

    /**
     * Adding new player (on enter the world)
     *
     * @param player - new player
     */
    public void addPlayer(EntityPlayer player) {
        UUID id = player.getUniqueID();
        if (all_players.containsKey(id)) {
            DivineRPG.logger.warn("This player is already registered " + player.getName());
        } else {
            all_players.put(id, new PlayerHandlers(player, all_handlers));
        }
    }

    /**
     * Removing the player (on exit game)
     *
     * @param player - leaving player
     */
    @SuppressWarnings("unlikely-arg-type")
	public void removePlayer(EntityPlayer player) {
        UUID id = player.getUniqueID();
        if (!all_players.containsKey(id)) {
            DivineRPG.logger.warn("This player was't ever registered " + player.getName());
        } else {
            all_handlers.remove(id);
        }
    }

    /**
     * Handling event for current player
     *
     * @param player - player. Ca be null
     * @param event  - triggered event
     */
    public <T extends Event> void handle(@Nullable EntityPlayer player, T event) {
        if (player == null)
            return;

        UUID id = player.getUniqueID();
        if (all_players.containsKey(id)) {
            all_players.get(id).handle(event);
        }
    }

    /**
     * Here we changing equpment status of one of the armorset
     *
     * @param player         - current player
     * @param index          - armor handler index
     * @param isFullEquipped - is player full equipped
     */
    public void onStatusChanged(@Nullable EntityPlayer player, int index, boolean isFullEquipped) {
        if (player == null) {
            DivineRPG.logger.warn("No player founded to change equipment status");
        } else {
            PlayerHandlers playerHandler = getPlayerHandler(player);
            FullArmorHandler handler = getHandlerByIndex(index);
            playerHandler.changeEquippedStatus(player.world, handler, isFullEquipped);
        }
    }

    /**
     * Using on server to get ID of armor handler
     *
     * @param handler - current handler
     */
    public int getHandlerIndex(FullArmorHandler handler) {
        int index = all_handlers.indexOf(handler);
        if (index < 0) {
            DivineRPG.logger.warn("There is no such armor handler! Where did you get it?");
        }

        return index;
    }

    /**
     * Using on client to get handler from ID
     *
     * @param index - index received from server
     */
    public FullArmorHandler getHandlerByIndex(int index) {
        if (index < 0) {
            DivineRPG.logger.warn("Seem like some error on server");
            return null;
        }

        if (index >= all_handlers.size()) {
            DivineRPG.logger.warn("There is no handler by index " + index + ". Are you sure you have registered handler on both sides?");
            return null;
        }

        return all_handlers.get(index);
    }

    @Override
    public void addHandler(FullArmorHandler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("Armor handler is null");
        }

        if (all_handlers.contains(handler)) {
            throw new IllegalArgumentException("Cannot insert handler twice!");
        }

        all_handlers.add(handler);
    }

    @Override
    public void removeHandler(FullArmorHandler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("Armor handler is null");
        }

        if (!all_handlers.contains(handler)) {
            throw new IllegalArgumentException("Armor handler was never registered!");
        }

        all_handlers.remove(handler);
    }
}
