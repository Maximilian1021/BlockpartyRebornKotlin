package me.maximilian1021.blockpartyreborn


import me.maximilian1021.blockpartyreborn.bstats.Metrics
import net.axay.kspigot.main.KSpigot

class BlockPartyReborn : KSpigot() {

    override fun startup() {
        logger.info("§aThe Plugin was successfully enabled!")
        bStats()
    }

    override fun shutdown() {
        logger.info("§cThe Plugin was disabled!")
    }

    private fun bStats() {
        val pluginId = 11868 // <-- Replace with the id of your plugin!
        val metrics = Metrics(this, pluginId)
    }
}