package com.example.OumaimaOuni.Controllers;

import com.example.OumaimaOuni.Services.ContratService;
import com.example.OumaimaOuni.entities.Contrat;
import com.example.OumaimaOuni.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    @Autowired
    ContratService contratService;
    @GetMapping("/getContracts/{idBf}")
    public Contrat retrieveUser(@PathVariable("idBf") Integer idBf) {
        return contratService.getContratBf(idBf);
    }

}
