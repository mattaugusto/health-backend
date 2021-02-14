package com.example.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.repositories.BeneficiaryRepository;

import java.util.List;

import com.example.app.entities.Beneficiary;

@RestController
public class BeneficiaryController {

    private final BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryController() {
        this.beneficiaryRepository = new BeneficiaryRepository();
    }

    @GetMapping("api/beneficiaries")
    public List<Beneficiary> get(@RequestParam(required = false) Long id) {
        return id != null
            ?  this.beneficiaryRepository.getBeneficiary(id)
            :  this.beneficiaryRepository.getAllBeneficiaries();
	}

}

