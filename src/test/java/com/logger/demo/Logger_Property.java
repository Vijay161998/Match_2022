package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Property {
	
    public static Logger log =Logger.getLogger(Logger_Basic.class);
	
	public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");

	log.debug("debug");

	log.info("info");
	
	log.warn("warn");
	
	log.fatal("fatal");
	
	}

}
