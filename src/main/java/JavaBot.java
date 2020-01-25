import commands.Ping;
import events.*;
import features.Status;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class JavaBot {

    public static void main(String[] args) throws Exception     {

        JDA jda = new JDABuilder("NjY5Nzc3ODY2NDA5Mzc3ODEy.Xio_gg.zc3pKBrb-DP_mjU4NsTcuFjakX0").build();

        jda.addEventListener((new Ping()));
        jda.addEventListener(new PythonBadEvent());
        jda.addEventListener(new helpEvent());
        jda.addEventListener((new aboutEvent()));
        jda.addEventListener(new Status());
        jda.addEventListener(new Reminders());
        jda.addEventListener(new cccEvent());




    }

}
