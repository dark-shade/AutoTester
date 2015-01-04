package thread.heartbeat;

import gui.ChatPane;
import gui.GUIMain;
import util.Timer;
import util.Utils;

import java.util.Set;

/**
 * Created by Nick on 7/8/2014.
 */
public class ViewerCount implements HeartbeatThread {

    private Timer toUpdate;

    public ViewerCount() {
        toUpdate = new Timer(3500);
    }

    @Override
    public boolean shouldBeat() {
        return !toUpdate.isRunning() && GUIMain.chatPanes.size() > 1;
    }

    @Override
    public void beat() {
        Set<String> keys = GUIMain.chatPanes.keySet();
        for (String s : keys) {
            if (s.equalsIgnoreCase("system logs")) continue;
            if (Utils.isChannelLive(s)) {
                int count = Utils.countViewers(s);
                if (count >= 0) {
                    ChatPane cp = GUIMain.chatPanes.get(s);
                    if (cp != null) cp.setViewerCount(count);
                }
            } else {
                ChatPane cp = GUIMain.chatPanes.get(s);
                if (cp != null) cp.setViewerCount(-1);
            }
        }
    }

    @Override
    public void afterBeat() {
        toUpdate.reset();
    }
}
