package bunchofstuff.bunchofstuff.utility;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class DelayTask implements Listener {
    private static Plugin plugin = null;
    private int taskId = -1;

    public DelayTask(Plugin plug) {
        plugin = plug;
    }
    public DelayTask(Runnable runnable) {
        this(runnable, 0);
    }
    public DelayTask(Runnable runnable, long delay) {
        if (plugin.isEnabled()) {
            taskId = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, runnable, delay);
        } else {
            runnable.run();
        }
    }
}
