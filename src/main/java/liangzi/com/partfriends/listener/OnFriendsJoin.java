package liangzi.com.partfriends.listener;

import liangzi.com.partfriends.Part;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @Description 好友进入服务器时
 * @Author liangzi
 * @Date 2022/11/19 10:28
 * @Version 1.0
 */

public class OnFriendsJoin implements Listener {
    @EventHandler
    public void onFriendsJoin(PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        (new BukkitRunnable() {
            public void run() {
                p.sendMessage("1");
                p.sendMessage("你当前有"+"位在线好友");
            }
        }).runTaskLater(Part.plugin,1L);
    }
}
