package com.example.demo;

import com.example.demo.data.BranchRepository;
import com.example.demo.data.ClientRepository;
import com.example.demo.data.CountryRepository;
import com.example.demo.data.DeviceRepository;
import com.example.demo.data.models.Branch;
import com.example.demo.data.models.Client;
import com.example.demo.data.models.Country;
import com.example.demo.data.models.Device;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    //Save seed data
    @Bean
    public CommandLineRunner demo(CountryRepository countryRepository, BranchRepository branchRepository,
                                  ClientRepository clientRepository, DeviceRepository deviceRepository) {
        return (args) -> {
            var country = new Country();
            country.setName("Kenya");
            country.setCode("254");
            countryRepository.save(country);

            var branch = new Branch();
            branch.setName("Branch One");
            branch.setCountry(country);
            branchRepository.save(branch);

            var device = new Device();
            device.setBranch(branch);
            device.setModel("M12435");
            device.setSerialNumber("123456");
            deviceRepository.save(device);

            var client = new Client();
            client.setName("Client one");
            client.setBranchList(List.of(branch));
            clientRepository.save(client);

        };
    }

}
