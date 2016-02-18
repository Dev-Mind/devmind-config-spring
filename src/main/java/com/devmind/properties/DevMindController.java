package com.devmind.properties;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 * @since 28/01/16.
 */
@RestController
public class DevMindController {

    @Autowired
    private DevMindService mailService;

    @RequestMapping("/info")
    public Map<String, String> getDevMindInfo() {
        return mailService.getDevMindInfo();
    }
}
