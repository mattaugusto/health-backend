package com.example.app.services;

import java.util.List;
import java.util.Optional;

import com.example.app.entities.Beneficiary;
import com.example.app.repositories.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService implements IBeneficiaryService {
    
    @Autowired
    private BeneficiaryRepository repository;

    @Override
    public List<Beneficiary> findAll() {
        var beneficiaries = (List<Beneficiary>) repository.findAll();

        return beneficiaries;
    }

    @Override
    public Optional<Beneficiary> findById(Long id) {
        var beneficiary = (Optional<Beneficiary>) repository.findById(id);
        
        return beneficiary;
    }

    @Override
    public Beneficiary save(Beneficiary beneficiary) {
        Beneficiary beneficiarySaved = repository.save(beneficiary);
        
        return beneficiarySaved;
    }

    @Override
    public void delete(Optional<Beneficiary> beneficiary) {
        beneficiary.ifPresentOrElse((value) -> {
                repository.delete(value);
            },() -> {
                System.out.println("Value is empty");
        });  
    }
}
