package com.example.demo.Endpoint;

import com.example.demo.data.models.Country;
import com.example.demo.data.CountryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    private final CountryRepository repository;

    CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    List<Country> allCountries(){
        return (List<Country>) repository.findAll();
    }
    @GetMapping("/countries/{code}")
    Optional<Country> getCountry(@PathVariable String code){
        return repository.findById(code);
    }

    @PostMapping("/countries")
    Country addCountry(@RequestBody Country country){
        return repository.save(country);
    }
}
