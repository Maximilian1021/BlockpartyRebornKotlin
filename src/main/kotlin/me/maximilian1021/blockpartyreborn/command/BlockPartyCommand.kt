package me.maximilian1021.blockpartyreborn.command

import me.maximilian1021.blockpartyreborn.BlockPartyReborn
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class BlockPartyCommand(private val plugin: BlockPartyReborn) : TabExecutor {
    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<out String>): List<String> {
        var completions = listOf("")
        if (args.isEmpty()) {
            return completions
        } else if (args.size == 1) {
            completions = listOf("arena", "wand")
        } else if (args.size == 2 && args[0] == "arena") {
            completions = listOf("<name>")
            return completions
        } else if (args.size == 3 && args[0] == "arena") {
            completions = listOf("set", "create")
        } else if (args.size == 4 && args[0] == "arena") {
            completions = listOf("floor", "lobby", "game")
        }
        return completions.filter { it.startsWith(args[args.size - 1], true) }.sorted()
    }


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            return true
        }
        if (args.isEmpty()) {
            // TODO: Help
        } else if (args.size == 1) {
            when (args[0]) {
                "arena" -> {
                    // TODO: Help
                }
                "wand" -> {
                    val stick = ItemStack(Material.STICK)
                    val stickMeta: ItemMeta = stick.itemMeta
                    stickMeta.displayName(Component.text("Blockparty Wand"))
                    stick.itemMeta = stickMeta

                    sender.inventory.addItem(stick)
                }
            }
        } else if (args.size == 3) {
            if (args[0] == "arena") {
                // check if arena exists
                if (args[3] == "create") {
                    // create arena
                }
            }
        } else if (args.size == 4) {
            if (args[0] == "arena") {
                // check if arena exists
                if (args[3] == "set") {
                    when(args[4]) {
                        "floor" -> {

                        }
                        "game" -> {

                        }
                        "lobby" -> {

                        }
                    }
                }
            }
        }











        return true
    }
}