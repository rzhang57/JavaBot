package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class cccEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("$ccchelp")) {
            event.getChannel().sendMessage("CCC or the Canadian Computing Competition is an annual coding contest for high-schoolers. Learn more at https://cemc.uwaterloo.ca/contests/computing/2019/index.html. Start practicing today at https://cccgrader.com/.").queue();
        }
    }
}

