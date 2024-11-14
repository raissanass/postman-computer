package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Computer;
import com.example.demo.repository.ComputerRepository;

@RestController
public class ComputerController {

    @Autowired
    private ComputerRepository computerRepository;

   
    @GetMapping("/ind")
    public String index() {
        return "welcome";
    }

   
    @PostMapping("/saveComputer")
    public Computer saveComputer(@RequestBody Computer computer) {
        return computerRepository.save(computer);
    }

    
    @GetMapping("/getAllComputers")
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    
    @GetMapping("/getComputer/{id}")
    public Computer getComputerById(@PathVariable int id) {
        return computerRepository.findById(id).orElse(null);
    }

    
    @DeleteMapping("/deleteComputer/{id}")
    public String deleteComputer(@PathVariable int id) {
        if (computerRepository.existsById(id)) {
            computerRepository.deleteById(id);
            return "Success delete";
        }
        return "Computer not found";
    }
}
