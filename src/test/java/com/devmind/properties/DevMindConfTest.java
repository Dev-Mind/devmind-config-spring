package com.devmind.properties;

import com.devmind.properties.conf.DevMindConf;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = DevMindConf.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DevMindConfTest {

    @Autowired
    private Environment environment;

    @Test
    public void getProperty() {
        Assertions.assertThat(environment.getRequiredProperty("devmind.name")).isEqualTo("Dev-Mind");
        Assertions.assertThat(environment.getProperty("devmind.city", "Saint Etienne")).isEqualTo("Saint Etienne");
        Assertions.assertThat(environment.getProperty("devmind.city")).isNull();
    }

}
