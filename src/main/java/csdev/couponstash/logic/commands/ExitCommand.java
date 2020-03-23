package csdev.couponstash.logic.commands;

import csdev.couponstash.model.Model;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Exiting CouponStash as requested ...";

    @Override
    public CommandResult execute(Model model, String commandText) {
        return new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true);
    }

}
