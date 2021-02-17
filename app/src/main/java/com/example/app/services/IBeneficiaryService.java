package com.example.app.services;

import com.example.app.entities.Beneficiary;
import java.util.List;
import java.util.Optional;

public interface IBeneficiaryService {
    List<Beneficiary> findAll();
    Optional<Beneficiary> findById(Long id);
    Beneficiary save(Beneficiary beneficiary);
    void delete(Optional<Beneficiary> beneficiary);
}
