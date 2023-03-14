package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.entities.Assurance;

import java.util.List;

public interface AssuranceService {

    public List<Assurance> retrieveAllAssurances();

    public int ajouterAssurance(Assurance a, int cinBf);

    public void statistiques();

/*
    public float getMontantBf (int cinBf);
*/
}
