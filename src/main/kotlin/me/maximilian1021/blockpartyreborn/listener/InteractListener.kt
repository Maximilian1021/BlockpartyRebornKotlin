package me.maximilian1021.blockpartyreborn.listener

import me.maximilian1021.blockpartyreborn.BlockPartyReborn
import net.kyori.adventure.text.Component
import org.bukkit.Location
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.EquipmentSlot
import java.util.*

class InteractListener(private val plugin: BlockPartyReborn) : Listener {

    var pos1: HashMap<UUID, Location> = HashMap()
    var pos2: HashMap<UUID, Location> = HashMap()

    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        val player = event.player
        if (event.hand == EquipmentSlot.HAND &&player.inventory.itemInMainHand.itemMeta?.displayName() == Component.text("Blockparty Wand")) {
            if (event.clickedBlock != null) {
                if (event.action == Action.LEFT_CLICK_BLOCK) {
                    pos1[player.uniqueId] = event.clickedBlock!!.location
                    player.sendMessage("Pos1: ${pos1[player.uniqueId]?.blockX} ${pos1[player.uniqueId]?.blockY} ${pos1[player.uniqueId]?.blockZ} (XYZ)")
                    event.isCancelled = true
                } else if (event.action == Action.RIGHT_CLICK_BLOCK) {
                    pos2[player.uniqueId] = event.clickedBlock!!.location
                    player.sendMessage("Pos2: ${pos2[player.uniqueId]?.blockX} ${pos2[player.uniqueId]?.blockY} ${pos2[player.uniqueId]?.blockZ} (XYZ)")
                    event.isCancelled = true
                }
            }
        }
    }
}