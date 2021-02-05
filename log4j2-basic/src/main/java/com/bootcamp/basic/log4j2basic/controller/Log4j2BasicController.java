package com.bootcamp.basic.log4j2basic.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log4j2")
public class Log4j2BasicController {
	private static final Logger logger = LogManager.getLogger(Log4j2BasicController.class);
	
	@GetMapping
	public String initializeBasicLogBack() {
		logger.debug("========== Debug");
		logger.info("========== Initializing logback");
		logger.warn("========== Warn");
		logger.error("========= Error");
	    return "Basic Logger Initialized";
	}
}
