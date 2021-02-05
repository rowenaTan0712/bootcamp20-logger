package com.bootcamp.basic.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logback")
public class BasicLogbackController {
	private static final Logger logger = LoggerFactory.getLogger(BasicLogbackController.class.getName());
	
	@GetMapping
	public String initializeBasicLogBack() {
		logger.debug("Console logback xml Debug");
		logger.info("Console logback xml Info");
		logger.warn("Console logback xml Warn");
		logger.error("Console logback xml Error");
	    return "Basic Logger Initialized";
	}
}
