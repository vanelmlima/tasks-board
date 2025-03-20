package vlml.project.persistence.migration;


import lombok.RequiredArgsConstructor;

import java.sql.Connection;

@RequiredArgsConstructor
public class MigrationStrategy {
    private final Connection connection;

    private void executeMigration(){

    }
}
