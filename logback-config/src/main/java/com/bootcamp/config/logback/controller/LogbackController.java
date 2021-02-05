package com.bootcamp.config.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logback")
public class LogbackController {
	private static final Logger logger = LoggerFactory.getLogger(LogbackController.class.getName());
	
	@GetMapping
	public String initializeBasicLogBack() {
		String type = "test variable";
		logger.debug("========= Variable: {}", type);
		logger.info("========== Initializing logback");
		logger.warn("========== Warn");
		logger.error("========= Error");
	    return "Basic Logger Initialized";
	}
}
