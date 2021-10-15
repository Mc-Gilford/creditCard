package com.example.bankaccount.dao;

import com.example.bankaccount.entity.institution.Institution;
import com.example.bankaccount.interfaces.InstitutionImpl;

import java.util.List;
import java.util.UUID;

public class DaoInstitution implements InstitutionImpl {
    @Override
    public Institution getInstitutionn(UUID id) {
        return null;
    }

    @Override
    public List<Institution> getInstitutions() {
        return null;
    }

    @Override
    public void createInstitution(Institution institution) {

    }
}
