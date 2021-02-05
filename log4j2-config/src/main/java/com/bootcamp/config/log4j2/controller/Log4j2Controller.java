package com.bootcamp.config.log4j2.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log4j2")
public class Log4j2Controller {
	private static final Logger logger = LogManager.getLogger(Log4j2Controller.class);
	
	@GetMapping
	public String initializeBasicLogBack() {
		String data = "test data";
		logger.debug("========== Debug data value: {}", data);
		logger.info("========== Initializing logback");
		logger.warn("========== Warn");
		logger.error("========= Error");
	    return "Basic Logger Initialized";
	}
}
