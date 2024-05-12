package com.testRunner;

import com.capabilities.ServerManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/java/com/resources",
        glue = "com.stepDefinitions",
        plugin = "pretty")

public class TestRunner {

    @BeforeClass
    public static void startServer() throws IOException {
        if (ServerManager.getServer() == null) {
            ServerManager.startServer();
        }
    }

    @AfterClass
    public static void stopServer() {
        if (ServerManager.getServer() != null) {
            ServerManager.getServer().stop();
        }
    }
}
