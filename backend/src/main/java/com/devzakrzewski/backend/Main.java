package com.devzakrzewski.backend;
import com.devzakrzewski.backend.Config.DatabaseConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {

    DatabaseConnection databaseConnection;
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Override
    public void run(String... args) throws Exception {

      logger.atLevel(Level.ERROR).log("Test");












    }


}
