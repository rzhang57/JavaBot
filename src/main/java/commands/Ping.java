package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class Ping extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!ping")) {
            e.getChannel().sendMessage("pong!").queue(
                    msg -> e.getChannel().sendMessage(new EmbedBuilder()
                            .addField("Ping:", "**Discord API:** " + e.getJDA().getGatewayPing() + "ms\n" +
                                    "**You:** " + String.valueOf((msg.getTimeCreated().getNano() / 1000000) - (e.getMessage().getTimeCreated().getNano() / 1000000)) + "ms", false)
                            .build()).queue());
            e.getChannel().sendFile(new File("C:\\Users\\Ryan Zhang\\Pictures\\download.jpg\\")).queue();
        }
    }
}