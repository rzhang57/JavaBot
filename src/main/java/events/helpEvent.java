package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class helpEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!help")) {
            event.getChannel().sendMessage("```**Help Pg.1**\n!help to pull up this command list\n!ccchelp to learn more about the Canadian Computing Challenge\n!reminder for a daily tip/reminder\n!about to learn more about me\n!python for a surprise\n!aboutdev to learn more about my developer!\n$serverinfo for info on the server you are in\n**More to come :)**```").queue();


        }
    }
}

