package Command.migrations.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UserTableCommand extends MigrationCommand {

    public UserTableCommand(Map<String, List<String>> database) {
        super(database);
    }

    /**
     *
     */
    @Override
    public void execute() {
        List<String> columns = new ArrayList<>(Arrays.asList("Id", "Name", "Email"));
        database.put("User", columns);
    }

    /**
     *
     */
    @Override
    public void undo() {
        database.remove("User");
    }
}
