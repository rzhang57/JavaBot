package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class aboutEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!about")) {
            event.getChannel().sendMessage("Hey there! I am a Discord Bot developed in java by java developer Ryan Zhang. I am still in development and am using JDA version 4.1.0 build 100. Currently conducting beta testing ").queue();
        }
    }
}



