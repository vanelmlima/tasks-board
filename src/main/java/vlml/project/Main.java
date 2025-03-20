package vlml.project;

import vlml.project.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static vlml.project.persistence.config.ConnectionConfig.getConnection;


public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
    }
}
