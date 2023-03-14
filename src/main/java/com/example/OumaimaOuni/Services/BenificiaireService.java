package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;

import java.util.List;

public interface BenificiaireService {

    public int ajouterBeneficaire (Benificiaire bf);
    public List<Benificiaire> retrieveAllBenef();

}
