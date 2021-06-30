package me.maximilian1021.l4zs.blockpartyreborn


import me.maximilian1021.l4zs.utils.Metrics
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit


class Main : KSpigot() {


    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was successfully enabled!")
        Bukkit.getConsoleSender().sendMessage("");
        val pluginId = 11868 // <-- Replace with the id of your plugin!

        val metrics = Metrics(this, pluginId)



    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
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