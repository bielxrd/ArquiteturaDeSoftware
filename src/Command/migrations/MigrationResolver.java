package Command.migrations;

import Command.migrations.commands.MigrationCommand;

import java.util.ArrayList;
import java.util.List;

public class MigrationResolver {
    private List<MigrationCommand> migrations;

    private int nextMigrationIndex;

    public MigrationResolver() {
        migrations = new ArrayList<>();
        nextMigrationIndex = 0;
    }

    public void addMigration(MigrationCommand migration) {
        migrations.add(migration);
    }

    public void up() {
        if (nextMigrationIndex < migrations.size()) {
            MigrationCommand migration = migrations.get(nextMigrationIndex);
            migration.execute();
            nextMigrationIndex++;
        } else {
            System.out.println("No more migrations to apply.");
        }
    }

    public void down() {
        if (nextMigrationIndex > 0) {
            nextMigrationIndex--;
            MigrationCommand migration = migrations.get(nextMigrationIndex);
            migration.undo();
        } else {
            System.out.println("No more migrations to undo.");
        }
    }

    public void latest() {
        while (nextMigrationIndex < migrations.size()) {
            up();
        }
    }

    public void rollback() {
        while (nextMigrationIndex > 0) {
            down();
        }
    }
}
