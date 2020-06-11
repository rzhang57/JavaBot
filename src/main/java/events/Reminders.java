package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class Reminders extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("$reminder")) {
            event.getChannel().sendMessage("Never forget to put the semicolon at the end of each line to avoid nightmares for the rest of your life.").queue();
            event.getChannel().sendFile(new File("C:\\Users\\Ryan Zhang\\Desktop\\cc.PNG\\")).queue();
        }
    }
}

