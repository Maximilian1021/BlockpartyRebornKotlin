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

    /*
#TODO
- Tool zum festlegen von der Arena ( Stick )
- Arena Floor Setup
- Lobby / Game setSpawn Command
-
- Block change Event ( Floor )
- Der Block auf dem gestanden werden soll, soll im Inventar bis auf den Mittleren Block eingeblentet werden
- Bossbar integration
- Gewinner wird der Head im Chat angezeigt
- MySQL Statistics
- /bp start
-
- GamePhase for more Games (LobbyPhase, GamePhase, WinnerPhase)
- Integration von bStats
- Integration von Noteblock API
- Einbauen von Events während des Spiels (erhalt Srpungkraft // Doppelsprung // etc)
 */

}