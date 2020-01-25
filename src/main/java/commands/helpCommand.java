package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class helpCommand {


    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String[] message = e.getMessage().getContentRaw().split(" ");
        if (message.length == 1 && message[0].equalsIgnoreCase("!help")){
            e.getChannel().sendMessage("To get the commands, please type !help [page number]").queue(); //how to use command
        }else if(message.length == 2 && message[0].equalsIgnoreCase("!help") && message[1].equalsIgnoreCase("1")){
            String userName = message[1];
            User user = e.getGuild().getMembersByName(userName, true).get(0).getUser(); //Gets user as object so we can grab info from it for embed
            String avatar = e.getGuild().getMembersByName(userName, true).get(0).getUser().getAvatarUrl(); //gets url of user avatar so we can put in embed
            EmbedBuilder avatarEmbed = new EmbedBuilder(); //Creates the embed.
            avatarEmbed.setTitle("Commands List");
            avatarEmbed.setColor(Color.YELLOW);
            avatarEmbed.setThumbnail("https://s.yimg.com/ny/api/res/1.2/LvpyS_NJwrAKoWAuAG9WzA--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9ODAw/https://s.yimg.com/cd/resizer/2.0/original/m9z_zDizkIjXZvBXqrU-Zve-E6I");
            avatarEmbed.addField("**Here are the commands**\n!help [page number] for  list of commands\n!ping - pong! (latency checker)\n!invite to get info about creating an invite link\n!user [ username ] for information on a specific user\n!about to learn about me!\n!aboutdev to learn more about my developer\n!ccchelp to learn about the Canadian Computing Challenge\n!help2 for old version of this command\n!reminder for your daily tip\n!python for a surprise!\nMore to come :)", e.getAuthor().getName() ,true);

            e.getChannel().sendMessage(avatarEmbed.build()).queue();
        }
    }
}