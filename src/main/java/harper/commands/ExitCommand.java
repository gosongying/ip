package harper.commands;

import harper.utils.TaskList;
import harper.utils.Ui;
import harper.utils.Storage;

public class ExitCommand extends Command {

    public ExitCommand() {
        super(true);
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.exit();
    }
}