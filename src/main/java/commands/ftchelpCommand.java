package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class ftchelpCommand extends Command {

        public ftchelpCommand() {
                this.name = "ftchelp";
                this.aliases = new String[]{"ftc"};
                this.help = "Gives information about the FTC Robotics competition";
        }

        @Override
        protected void execute(CommandEvent event) {
                event.getChannel().sendMessage("FTC is a robotics competition for highschool students.").queue();


        }
}