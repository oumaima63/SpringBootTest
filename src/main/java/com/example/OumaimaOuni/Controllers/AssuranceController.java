package com.example.OumaimaOuni.Controllers;

import com.example.OumaimaOuni.Services.AssuranceService;
import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Assurance")
public class AssuranceController {

    @Autowired
    AssuranceService assuranceService;

    @GetMapping("/retrieve-all-assurances")
    public List<Assurance> retrieveAllAssurances() {
        return assuranceService.retrieveAllAssurances();
    }


    @PostMapping("/add-assurance/{cinBf}")
    public int ajouterAssurance(@RequestBody Assurance a, @PathVariable ("cinBf") int cinBf) {
        return assuranceService.ajouterAssurance(a,cinBf);
    }

   /* @GetMapping("/retrieve-montant/{idBf}")
    public float getMontant(@PathVariable ("idBf") int idBf) {
        return assuranceService.getMontantBf(idBf);
    }
*/
}