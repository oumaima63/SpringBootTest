package com.example.OumaimaOuni.Controllers;

import com.example.OumaimaOuni.Services.BenificiaireService;
import com.example.OumaimaOuni.Services.UserService;
import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Benificiaire")
public class BenificiaireController {

    @Autowired
    BenificiaireService benificiaireService;

    @PostMapping("/add-beneficiaire")
    public int ajouterBeneficaire(@RequestBody Benificiaire bf) {
       return benificiaireService.ajouterBeneficaire(bf);
    }

    @GetMapping("/retrieve-all-benif")
    public List<Benificiaire> retrieveAllBenif() {
        return benificiaireService.retrieveAllBenef();
    }




}
