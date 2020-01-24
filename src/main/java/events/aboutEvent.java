package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class aboutEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!about")) {
            event.getChannel().sendMessage("Hey there! I am a Discord Bot developed in java here to assist with all of your java needs. type '!help' to start!").queue();
        }
    }
}



