package features;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Status extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        event.getJDA().getPresence().setActivity(Activity.watching("Netlfix"));


    }


}
