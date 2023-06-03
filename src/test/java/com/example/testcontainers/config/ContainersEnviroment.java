package com.example.testcontainers.config;

import com.example.testcontainers.containers.PostgresTestContainer;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

@Testcontainers
public class ContainersEnviroment {

    @JavaDispatcher.Container
    public static PostgresTestContainer postgreSQLContainer = PostgresTestContainer.getInstance();
}
