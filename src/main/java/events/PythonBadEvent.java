package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
        import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PythonBadEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!python")) {
            event.getChannel().sendMessage("Hey! Stop saying that or I will ban you! That is highly offensive!!!").queue();
        }
    }
}