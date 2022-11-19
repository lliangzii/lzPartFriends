package liangzi.com.partfriends.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;
import liangzi.com.partfriends.Part;

/**
 * @Description 好友离开游戏时
 * @Author liangzi
 * @Date 2022/11/19 10:30
 * @Version 1.0
 */

public class OnFriendsLeft implements Listener {
    @EventHandler
    public void onFriendsLeft(PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        (new BukkitRunnable() {
            public void run() {
                p.sendMessage("1");
                p.sendMessage("你当前有 %% 位在线好友");
            }
        }).runTaskLater(Part.plugin,2L);
    }
}
