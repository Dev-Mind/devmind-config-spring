package com.devmind.properties;

import java.util.HashMap;
import java.util.Map;

import com.devmind.properties.conf.DevMindProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 28/01/16.
 */
@Service
public class DevMindService {

    @Value("${devmind.name}")
    private String name;
    @Value("${devmind.twitter}")
    private String twitter;
    @Value("${JAVA_HOME}")
    private String java;

    @Value("${devmind.filename}")
    private String filename;

    public Map<String, String> getDevMindInfo1() {
        Map<String, String> infos = new HashMap<>();
        infos.put("name", name);
        infos.put("twitter", twitter);
        infos.put("java", java);
        return infos;
    }

    public String getFilename() {
        return filename;
    }


    @Autowired
    private Environment environment;

    public String getDevMindAdress() {
        return String.format("Society %s in city %s",
                environment.getRequiredProperty("devmind.name"),
                environment.getProperty("devmind.city", "Saint Etienne"));
    }

    @Autowired
    private DevMindProperty devMindProperty;

    public Map<String, String> getDevMindInfo() {
        Map<String, String> infos = new HashMap<>();
        infos.put("name", devMindProperty.getName());
        infos.put("twitter", devMindProperty.getTwitter());
        return infos;
    }
}
