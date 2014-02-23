/**
 * 
 */
package com.energy.monitor.data;

import org.springframework.data.annotation.Id;

/**
 * @author adrian
 * 
 */
public class ModbusDevice {

	@Id
	private String id;
	private String name;
	private String address;

	public ModbusDevice(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ModbusDevice [id=" + id + ", name=" + name + ", address="
				+ address + "]";
	}

	
}
