package com.devmind.properties;

import java.io.IOException;
import java.util.Properties;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DevMindTest {

    Properties properties = new Properties();

    {
        try {
            properties.load(getClass().getResourceAsStream("/application.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contextLoads() {
        Assertions.assertThat(properties.getProperty("devmind.name")).isEqualTo("Dev-Mind");
    }

    @Test
    public void envVar() {
        Assertions.assertThat(System.getenv("JAVA_HOME")).endsWith("/java/jdk1.8.0_40");
    }

}
