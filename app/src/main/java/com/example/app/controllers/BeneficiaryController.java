package com.example.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.services.IBeneficiaryService;
import com.example.app.entities.Beneficiary;

@RestController
public class BeneficiaryController {

    @Autowired
    private IBeneficiaryService beneficiaryService;

    @GetMapping("api/beneficiaries")
    public List<Beneficiary> get() {
        return this.beneficiaryService.findAll();
    }

    @GetMapping("api/beneficiaries/{id}")
    public Optional<Beneficiary> getById(@PathVariable("id") Long id) {
        return this.beneficiaryService.findById(id);
	}

    @PostMapping(path = "api/beneficiaries", consumes = "application/json", produces = "application/json")
    public Beneficiary save(@RequestBody Beneficiary beneficiary) {
        return this.beneficiaryService.save(beneficiary);
	}

    @PutMapping(path = "api/beneficiaries/{id}", consumes = "application/json", produces = "application/json")
    public Beneficiary update(@PathVariable Long id, @RequestBody Beneficiary beneficiary) {
        beneficiary.setId(id);
        return this.beneficiaryService.save(beneficiary);
	}

    @DeleteMapping("api/beneficiaries/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Beneficiary> beneficiary = this.beneficiaryService.findById(id);
        this.beneficiaryService.delete(beneficiary);
	}

}

