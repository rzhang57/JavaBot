package events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived (GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();

        String user = event.getAuthor().getName();

        if(messageSent.equalsIgnoreCase("Hello!")){
            event.getChannel().sendMessage("Hello " + user + "! To start, please type '!help' for a list of commands.").queue();
        }

    }
}
