package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Basic {
	
	public static Logger log =Logger.getLogger(Logger_Basic.class);
	
	public static void main(String[] args) {
		

		BasicConfigurator.configure();
		
		log.debug("debug");
		
		log.info("info");
		
		log.warn("warn");
		
		log.fatal("fatal");
	
	}

}
