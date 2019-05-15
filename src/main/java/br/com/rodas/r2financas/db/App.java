package br.com.rodas.r2financas.db;

import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
            .dataSource("jdbc:postgresql://localhost:5432/r2financas", "postgres", "100senha")
            .schemas("rodrigopizzi@gmail.com")
            .load();
        
        flyway.migrate();
    }
}
