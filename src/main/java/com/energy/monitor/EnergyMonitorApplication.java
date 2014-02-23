package com.energy.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring boot application startup. This class is the bootstrap point for the
 * whole application and enables some default configuration settings such as
 * spring class path component scanning and auto configuration.
 * 
 */
@ComponentScan
@EnableConfigurationProperties
@EnableAutoConfiguration
public class EnergyMonitorApplication {
	
	/**
	 * Main method
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EnergyMonitorApplication.class, args);
	}
}
