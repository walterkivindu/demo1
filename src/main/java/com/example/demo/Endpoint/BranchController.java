package com.example.demo.Endpoint;

import com.example.demo.data.BranchRepository;
import com.example.demo.data.models.Branch;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BranchController {
    private final BranchRepository repository;

    BranchController(BranchRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/branches/{id}")
    Optional<Branch> getBranch(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping("/branches")
    Branch addBranch(@RequestBody Branch branch){
        return repository.save(branch);
    }

    @GetMapping("/branches")
    List<Branch> allBranches(){
        return (List<Branch>) repository.findAll();
    }
}
