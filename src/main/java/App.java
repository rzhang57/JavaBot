import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import commands.InviteCommand;
import commands.Ping;
import commands.UserInfo;
import commands.helpCommand;
import events.*;
import features.Status;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class App extends ListenerAdapter {
        public static void main(String [] args) throws Exception{

                JDA jda = new JDABuilder(AccountType.BOT).setToken("NjY5Nzc3ODY2NDA5Mzc3ODEy.Xio_gg.zc3pKBrb-DP_mjU4NsTcuFjakX0").build();

                CommandClientBuilder builder = new CommandClientBuilder();

                builder.setOwnerId("669777866409377812");
                builder.setPrefix("$");
                builder.addCommand(new ServerInfo());
                builder.setHelpWord("helpme");
                CommandClient client = builder.build();

                //We no longer need to register each command class here, we just register the command client
                jda.addEventListener(client);


               //my old commands
                jda.addEventListener((new Ping()));
                jda.addEventListener(new PythonBadEvent());
                jda.addEventListener(new helpEvent());
                jda.addEventListener((new aboutEvent()));
                jda.addEventListener(new Status());
                jda.addEventListener(new Reminders());
                jda.addEventListener(new cccEvent());
                jda.addEventListener(new HelloEvent());
                jda.addEventListener(new AboutDeveloperEvent());
                jda.addEventListener(new InviteCommand());
                jda.addEventListener(new UserInfo());
                jda.addEventListener(new helpCommand());

        }
}
