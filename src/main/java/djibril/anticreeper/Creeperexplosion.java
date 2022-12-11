package djibril.anticreeper;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class Creeperexplosion implements Listener {
    @EventHandler
    public void bumm(EntityExplodeEvent event){
        if(!(event.getEntity() instanceof Creeper))
            return;
        if(event.getEntity() instanceof Creeper)
            event.blockList().clear();


    }
}
