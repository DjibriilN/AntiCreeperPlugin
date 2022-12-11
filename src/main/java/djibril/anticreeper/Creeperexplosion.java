package djibril.anticreeper;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class Creeperexplosion implements Listener {
    @EventHandler
    public void Explosion(EntityExplodeEvent event){
        if(!(event.getEntity() instanceof Creeper))
            return;
        if(event.getEntity() instanceof Creeper)
            event.blockList().clear();


    }
}
