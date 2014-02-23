/**
 * 
 */
package com.energy.monitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.energy.monitor.data.ModbusDevice;
import com.energy.monitor.repository.ModbusDeviceRepository;

/**
 * This example Spring MVC controller is simply here to demonstrate the spring
 * MVC controller setup.
 * 
 * @author adrian
 * 
 */
@Controller
public class ExampleController {
	
	@Autowired
	private ModbusDeviceRepository modbusDeviceRepository;

	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/device/{address}")
	@ResponseBody
	String findDeviceDetails(@PathVariable String address) {
		ModbusDevice device = modbusDeviceRepository.findByAddress(address);
		return device.getName();
	}

}
