package com.forman.theathletic.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
public class LogConfig {
    private final Logger logger = LoggerFactory.getLogger("LoggerController의 로그");

    @GetMapping(value = "/log")
    public void log() {
        logger.info("logging!");
    }
}
