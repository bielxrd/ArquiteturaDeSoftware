package Command.migrations;

import Command.migrations.commands.ProductTableCommand;
import Command.migrations.commands.UserTableCommand;
import Command.migrations.commands.UserTableRoleColumnCommand;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MigrationClient {
    public static void main(String[] args) {
        Map<String, List<String>> database = new LinkedHashMap<>();
        MigrationResolver resolver = new MigrationResolver();
        resolver.addMigration(new UserTableCommand(database));
        resolver.addMigration(new ProductTableCommand(database));
        resolver.addMigration(new UserTableRoleColumnCommand(database));

        System.out.println("Initial database: " + database);
        resolver.up();
        System.out.println("Database after migrations: " + database);
        resolver.up();
        System.out.println("Database after second migration: " + database);
        resolver.up();
        System.out.println("Database after third migration: " + database);
        resolver.down();
        System.out.println("Database after undoing last migration: " + database);
        resolver.down();
        System.out.println("Database after undoing second last migration: " + database);
        resolver.down();
        System.out.println("Database after undoing all migrations: " + database);
        resolver.latest();
        System.out.println("Database after applying all migrations: " + database);
        resolver.rollback();
        System.out.println("Database after rolling back all migrations: " + database);
    }
}
