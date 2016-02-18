package com.devmind.properties;

import com.devmind.properties.conf.DevMindProperty;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.core.env.Environment;

public class DevMindService1Test {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private DevMindProperty devMindProperty;

    @InjectMocks
    private DevMindService devMindService;

    @Test
    public void getDevMindAdress() {
        Mockito.when(devMindProperty.getName()).thenReturn("Dev-Mind");
        Assertions.assertThat(devMindService.getDevMindInfo().get("name")).isEqualTo("Dev-Mind");
    }


}
