package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ServerInfo extends Command {

        public ServerInfo(){
                this.name = "serverinfo";
                this.aliases = new String[]{"server"};
                this.help = "Gives information about the server.";
        }

        @Override
        protected void execute(CommandEvent event) {
                //Makes an array that will hold all of the members
                String[] test = new String[event.getGuild().getMembers().size()];
                for(int i = 0; i < event.getGuild().getMembers().size();i++){
                        test[i] = event.getGuild().getMembers().get(i).getEffectiveName();
                }

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();

                //The Embed with all of the server info
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setAuthor(event.getGuild().getName());
                eb.setThumbnail("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/300px-Java_programming_language_logo.svg.png");
                eb.addField("Server Owner:", event.getGuild().getOwner().getEffectiveName(), true);
                eb.addField("Member Count:", Integer.toString(event.getGuild().getMembers().toArray().length), true);
                eb.setDescription("**Members:** \n" + Arrays.toString(test) + "\n **Invite link:** \n" + "https://discord.gg/3stGDun");
                eb.setFooter("Request made at " + formatter.format(date), event.getGuild().getIconUrl() );



        }
}