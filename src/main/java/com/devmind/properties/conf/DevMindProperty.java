package com.devmind.properties.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 13/02/16.
 */
@Component
@ConfigurationProperties(prefix="devmind")
public class DevMindProperty {
    private String name;
    private String twitter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
