package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InviteCommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        int timeString = 3600;
        String[] message = e.getMessage().getContentRaw().split(" ");
        if (message.length == 1 && message[0].equalsIgnoreCase("$invite")){
            e.getChannel().sendMessage("To use !invite, do: !invite create").queue();
        }else if(message[0].equalsIgnoreCase("$invite") && message[1].equalsIgnoreCase("create")) {
            e.getChannel().sendMessage("Hey " + e.getAuthor().getName() + "! You want to invite someone? Cool!").queue();
            e.getChannel().sendMessage("Give them this link: " + e.getChannel().createInvite().setMaxAge(timeString).complete().getUrl()).queue();
            e.getChannel().sendMessage("The invite expires in: " + timeString + " seconds.").queue();
        }

    }
}