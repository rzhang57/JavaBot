package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter {

    @Override

    public void onGuildMessageReceived (GuildMessageReceivedEvent event){

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!calculate")){
            event.getChannel().sendMessage("ok");

        }

    }




}
