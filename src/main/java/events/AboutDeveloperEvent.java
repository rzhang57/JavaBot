package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AboutDeveloperEvent extends ListenerAdapter {
    public void onGuildMessageReceived (GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();

        String user = event.getAuthor().getName();

        if(messageSent.equalsIgnoreCase("$aboutdev")){
            event.getChannel().sendMessage("Hello " + user + "! My name is Ryan. I am currently 14 years of age and am an upcoming and avid java developer. I am in the 9th grade attending Sir Winston Churchill Secondary School. Dm me in private (@susboi#4344) if you have any further questions.").queue();
        }

    }
}


