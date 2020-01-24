package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class helpEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!help")) {
            event.getChannel().sendMessage("!python for a surprise").queue();
            event.getChannel().sendMessage("!help2 for next page").queue();

        }
    }
}

