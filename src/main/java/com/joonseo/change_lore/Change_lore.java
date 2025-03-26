package com.joonseo.change_lore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Change_lore extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("change").setExecutor(new change());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
