/**
 * 
 */
package com.energy.monitor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.energy.monitor.data.ModbusDevice;

/**
 * @author adrian
 *
 */
public interface ModbusDeviceRepository extends MongoRepository<ModbusDevice, String> {
	public ModbusDevice findByAddress(String address);
}
