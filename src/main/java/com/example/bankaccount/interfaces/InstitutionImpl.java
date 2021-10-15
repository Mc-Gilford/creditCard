package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.institution.Institution;

import java.util.List;
import java.util.UUID;

public interface InstitutionImpl {
    public Institution getInstitutionn(UUID id);
    public List<Institution>  getInstitutions();
    public void createInstitution(Institution institution);
}
