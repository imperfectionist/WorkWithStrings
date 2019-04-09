package org.itstep;

import java.util.logging.Logger;

import org.itstep.service.MultiplicationService;

public class ApplicationRunner {
	
	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());
	
	public static void main(String[] args) {
		
		logger.info("\n" + MultiplicationService.getMultiplicationText(1234, 123456));
	}

}
