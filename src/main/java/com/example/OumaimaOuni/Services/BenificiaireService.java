package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.TypeContrat;

import java.util.List;
import java.util.Set;

public interface BenificiaireService {

    public int ajouterBeneficaire (Benificiaire bf);
    public List<Benificiaire> retrieveAllBenef();

    public Set<Benificiaire> getBeneficairesAsType(TypeContrat typeContrat);


}
