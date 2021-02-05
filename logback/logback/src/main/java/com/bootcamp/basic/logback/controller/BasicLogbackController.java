package com.bootcamp.basic.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

@RestController
@RequestMapping("/logback")
public class BasicLogbackController {
	private static final Logger logger = LoggerFactory.getLogger(BasicLogbackController.class.getName());
	
	@GetMapping
	public String initializeBasicLogBack() {
	    logger.info("Hello world");
	    return "Basic Logger Initialized";
	}
	
	@GetMapping("/status")
	public String internalStatus() {
	    logger.info("Getting the Internal Status...");
	    
	    // print internal state
	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
		return "Status released";
	}
}
