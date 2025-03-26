package com.joonseo.change_lore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class change implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (strings.length == 0) {

                player.sendMessage(ChatColor.BOLD + ""+ ChatColor.GREEN + "사용법 : /change <아이템이름>");
                return true;

            }


            String itemName = String.join(" ",strings);
            ItemStack item = player.getInventory().getItemInMainHand();

            if (item == null || item.getType().isAir()) {
                player.sendMessage(ChatColor.BOLD + ""+ ChatColor.GREEN + "손이 비어있습니다.");
                return true;
            }

            ItemMeta itemmeta = item.getItemMeta();

            if(itemmeta != null) {







        }


        return false;
    }
}
