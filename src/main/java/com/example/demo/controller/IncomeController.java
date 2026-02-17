package com.example.demo.controller;

import com.example.demo.model.Income;
import com.example.demo.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/income")
@CrossOrigin("*")
public class IncomeController {

    @Autowired
    private IncomeRepository repository;

    @GetMapping
    public List<Income> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Income add(@RequestBody Income income) {
        return repository.save(income);
    }

    // New: Delete individual record by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping("/clear")
    public void clearAll() {
        repository.deleteAll();
    }
}