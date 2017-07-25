package xyz.gnarbot.gnar.commands.executors.fun;

import xyz.gnarbot.gnar.commands.Category;
import xyz.gnarbot.gnar.commands.Command;
import xyz.gnarbot.gnar.commands.CommandDispatcher;
import xyz.gnarbot.gnar.commands.CommandExecutor;
import xyz.gnarbot.gnar.utils.Context;

@Command(
        id = 4,
        aliases = "8ball",
        usage = "(question)",
        description = "Ask for your wildest dreams!", category = Category.FUN
)
public class EightBallCommand extends CommandExecutor {
    private final String[] responses = {
            "It is certain.", "It is decidedly so.", "Without a doubt.", "Yes, definitely.", "You may rely on it.",
            "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy try again.",
            "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.",
            "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."
    };

    @Override
    public void execute(Context context, String label, String[] args) {
        if (args.length == 0) {
            CommandDispatcher.INSTANCE.sendHelp(context, getInfo());
            return;
        }

        context.send().embed()
                .setDescription("\uD83C\uDFB1 " + responses[(int) (Math.random() * responses.length)])
                .action().queue();
    }
}
