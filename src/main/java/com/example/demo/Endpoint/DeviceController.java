package com.example.demo.Endpoint;

import com.example.demo.data.models.Device;
import com.example.demo.data.DeviceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DeviceController {
    private final DeviceRepository repository;

    DeviceController(DeviceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/devices/{serial}")
    Optional<Device> getDevice( @PathVariable String serial){
        return repository.findById(serial);
    }

    @PostMapping("/devices")
    Device addDevices(@RequestBody Device device){
        return repository.save(device);
    }

    @GetMapping("devices")
    List<Device> allDevices(){
        return (List<Device>) repository.findAll();
    }
}
