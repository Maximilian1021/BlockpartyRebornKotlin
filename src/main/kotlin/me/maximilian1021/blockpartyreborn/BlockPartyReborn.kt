package me.maximilian1021.blockpartyreborn


import me.maximilian1021.blockpartyreborn.bstats.Metrics
import me.maximilian1021.blockpartyreborn.command.BlockPartyCommand
import me.maximilian1021.blockpartyreborn.listener.InteractListener
import net.axay.kspigot.extensions.pluginManager
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class BlockPartyReborn : KSpigot() {

    override fun startup() {
        logger.info("§b-------------")
        logger.info("§aPlugin-Name:§6 " + description.name)
        logger.info("§aVersion: §6" + description.version)
        logger.info("§aAuthor: §6" + description.contributors)
        logger.info("§aWebsite: §6" + description.website)
        logger.info("")
        logger.info("§6" + description.name + "§a is loading")


        logger.info("§6" + description.name  + "§a is successfully loading");

        logger.info("§b-------------")


        pluginManager.registerEvents(InteractListener(this), this)

//        val metrics = Metrics(this, 11868)
        getCommand("blockparty")?.setExecutor(BlockPartyCommand(this))
        getCommand("blockparty")?.tabCompleter = BlockPartyCommand(this)
    }

    override fun shutdown() {
        logger.info("§cThe Plugin was disabled!")
    }
}