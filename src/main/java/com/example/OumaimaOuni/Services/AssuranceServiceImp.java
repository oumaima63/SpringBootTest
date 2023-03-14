package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.Repositories.AssuranceRepository;
import com.example.OumaimaOuni.Repositories.BenificiaireRepository;
import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AssuranceServiceImp implements AssuranceService{

    @Autowired
    AssuranceRepository assuranceRepository;
    @Autowired
    BenificiaireRepository benificiaireRepository;

    public List<Assurance> retrieveAllAssurances(){
        return assuranceRepository.findAll();
    }

    @Override
    public int ajouterAssurance(Assurance a, int cinBf) {
        Benificiaire benificiaire = benificiaireRepository.findBenificiaireByCin(cinBf);
        a.setBenificiaire(benificiaire);
        assuranceRepository.save(a);
        return a.getIdAssurance();
    }

    @Override
    public void statistiques() {
         assuranceRepository.statistiques();
    }

 /*   @Override
    public float getMontantBf(int cinBf) {
        return assuranceRepository.getMontantBf(cinBf);
    }*/


}
