package liangzi.com.partfriends;

import org.bukkit.plugin.java.JavaPlugin;

public final class Part extends JavaPlugin {
    public static Part plugin;
    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
