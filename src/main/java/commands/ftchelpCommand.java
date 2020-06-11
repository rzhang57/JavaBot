package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class ftchelpCommand extends Command {

        public ftchelpCommand() {
                this.name = "ftchelp";
                this.aliases = new String[]{"this is not lit"};
                this.help = "Gives information about the FTC Robotics competition";
        }

        @Override
        protected void execute(CommandEvent event) {
                event.getChannel().sendMessage("FTC is a robotics competition based off a different theme every season. Teams can consist up to 15 members ranging from grade 7 to 12. Teams are challenged to design, build, program, and operate robots to complete missions in a head-to-head challenge in an alliance format.").queue();


        }
}