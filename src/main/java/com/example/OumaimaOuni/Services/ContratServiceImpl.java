package com.example.OumaimaOuni.Services;


import com.example.OumaimaOuni.Repositories.BenificiaireRepository;
import com.example.OumaimaOuni.Repositories.ContratRepository;
import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.Contrat;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements ContratService{

    @Autowired
    ContratRepository contratRepository;

    @Autowired
    BenificiaireRepository benificiaireRepository;

    @Override
    public Contrat getContratBf(int idBf) {
    return contratRepository.getContratBf(idBf).get(0);
    }
}
