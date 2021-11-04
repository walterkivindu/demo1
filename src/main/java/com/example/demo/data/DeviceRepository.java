package com.example.demo.data;

import com.example.demo.data.models.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, String> {
}
