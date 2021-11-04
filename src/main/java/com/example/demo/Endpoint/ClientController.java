package com.example.demo.Endpoint;

import com.example.demo.data.BranchRepository;
import com.example.demo.data.ClientRepository;
import com.example.demo.data.models.Branch;
import com.example.demo.data.models.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    private final ClientRepository repository;

    ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clients/{id}")
    Optional<Client> getClient(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping("/clients")
    Client addClient(@RequestBody Client client){
        return repository.save(client);
    }

    @GetMapping("/clients")
    List<Client> allClients(){
        return (List<Client>) repository.findAll();
    }
}
