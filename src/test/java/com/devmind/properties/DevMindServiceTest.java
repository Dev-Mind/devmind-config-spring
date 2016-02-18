package com.devmind.properties;

import com.devmind.properties.conf.DevMindConf;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class DevMindServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private Environment environment;

    @InjectMocks
    private DevMindService devMindService;

    @Test
    public void getDevMindAdress() {
        Mockito.when(environment.getRequiredProperty("devmind.name")).thenReturn("Dev-Mind");
        Mockito.when(environment.getProperty("devmind.city", "Saint Etienne")).thenReturn("Lyon");

        Assertions.assertThat(devMindService.getDevMindAdress()).isEqualTo("Society Dev-Mind in city Lyon");
    }


}
