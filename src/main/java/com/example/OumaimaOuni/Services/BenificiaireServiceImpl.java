package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.Repositories.BenificiaireRepository;
import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BenificiaireServiceImpl implements BenificiaireService {

    @Autowired
    BenificiaireRepository benificiaireRepository;

    public int ajouterBeneficaire(Benificiaire bf) {
        Benificiaire savedBeneficiaire = benificiaireRepository.save(bf);
        return savedBeneficiaire.getIdBenef();
    }

    public List<Benificiaire> retrieveAllBenef(){
        return benificiaireRepository.findAll();
    }


}