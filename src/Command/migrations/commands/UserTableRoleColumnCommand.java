package Command.migrations.commands;

import java.util.List;
import java.util.Map;

public class UserTableRoleColumnCommand extends MigrationCommand{
    public UserTableRoleColumnCommand(Map<String, List<String>> database) {
        super(database);
    }

    /**
     *
     */
    @Override
    public void execute() {
        List<String > columns = database.get("User");
        columns.add("Role");
    }

    /**
     *
     */
    @Override
    public void undo() {
        List<String> columns = database.get("User");
        columns.remove("Role");
    }
}
