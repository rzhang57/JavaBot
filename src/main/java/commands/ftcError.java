package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class ftcError extends Command {

    public ftcError() {
        this.name = "ftc";
        this.aliases = new String[]{"ftchelpcool"};
        this.help = "please";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.getChannel().sendMessage("Command not recognized. Please refer to $help for further information").queue();


    }
}