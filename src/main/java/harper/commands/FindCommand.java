package harper.commands;

import harper.utils.Storage;
import harper.utils.TaskList;
import harper.utils.Ui;

/**
 * Represents a find command.
 */
public class FindCommand extends Command {
    private String keyword;

    //CHECKSTYLE.OFF: MissingJavadocMethod
    public FindCommand(String keyword) {
        super();
        this.keyword = keyword;
    }

    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) {
        assert !this.keyword.isEmpty() : "Keyword must be non-empty";
        String taskListString = taskList.findTasks(this.keyword);
        return ui.printMatchingTasks(taskListString);
    }
}
