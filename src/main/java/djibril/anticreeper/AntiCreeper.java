package djibril.anticreeper;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCreeper extends JavaPlugin {

    @Override
    public void onEnable() {
registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void registerEvents(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new Creeperexplosion(), (Plugin)this);
    }
}
