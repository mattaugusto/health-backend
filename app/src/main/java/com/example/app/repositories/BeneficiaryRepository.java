package com.example.app.repositories;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.example.app.entities.Beneficiary;

public class BeneficiaryRepository {

    private final List<Beneficiary> mockBeneficiaries = new ArrayList<Beneficiary>(
        Arrays.asList(
            new Beneficiary(1, "Benef 1"),
            new Beneficiary(2, "Benef 2"),
            new Beneficiary(3, "Benef 3"),
            new Beneficiary(4, "Benef 4"),
            new Beneficiary(5, "Benef 5")
        )
    );

    public List<Beneficiary> getAllBeneficiaries() {
        return this.mockBeneficiaries;
    }

    public List<Beneficiary> getBeneficiary(Long id) {
        ArrayList<Beneficiary> beneficiaries = new ArrayList<Beneficiary>();

        for (Beneficiary benef : this.mockBeneficiaries) {
            if (benef.getId() == id) {
                beneficiaries.add(benef);
                break;
            }
        }
        
        return beneficiaries;
    }
}
