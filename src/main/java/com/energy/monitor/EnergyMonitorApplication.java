package com.energy.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.energy.monitor.data.ModbusDevice;
import com.energy.monitor.repository.ModbusDeviceRepository;

/**
 * Spring boot application startup. This class is the bootstrap point for the
 * whole application and enables some default configuration settings such as
 * spring class path component scanning and auto configuration.
 * 
 */
@ComponentScan
@EnableConfigurationProperties
@EnableAutoConfiguration
public class EnergyMonitorApplication implements CommandLineRunner {

	@Autowired
	private ModbusDeviceRepository modbusDeviceRepository;

	/**
	 * Main method
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EnergyMonitorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		modbusDeviceRepository.deleteAll();
		modbusDeviceRepository.save(new ModbusDevice("device1", "1"));
		modbusDeviceRepository.save(new ModbusDevice("device2", "2"));
		modbusDeviceRepository.save(new ModbusDevice("device3", "3"));
		modbusDeviceRepository.save(new ModbusDevice("device4", "4"));
	}
}
