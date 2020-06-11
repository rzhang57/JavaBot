package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class sayCommand extends Command {
    public sayCommand() {
        this.help = "$say <message>";
        this.aliases = new String[]{"$s"};
        this.name = "say";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.getChannel().sendMessage(event.getMessage().getContentDisplay().split("\\s+", 2)[1]).queue();
    }
}