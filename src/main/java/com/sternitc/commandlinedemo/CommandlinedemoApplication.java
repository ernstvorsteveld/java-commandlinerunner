package com.sternitc.commandlinedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandlinedemoApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory
            .getLogger(CommandlinedemoApplication.class);

    public static void main(String[] args) {
        LOG.info("Start CommandlinedemoApplication");
        SpringApplication.run(CommandlinedemoApplication.class, args);
        LOG.info("Finished CommandlinedemoApplication");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("About to start CommandlinedemoApplication");

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }

    }
}
