package com.devmind.properties.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 15/02/16.
 */
@Configuration
@PropertySource("classpath:/monfichier.properties")
@Profile("production")
public class DevMindConf {
}
