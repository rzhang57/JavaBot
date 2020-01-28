package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ftcHelpCommand extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if (message.equalsIgnoreCase("!ftchelp")) {
            event.getChannel().sendMessage("Learn more at ftc").queue();
        }
    }
}


