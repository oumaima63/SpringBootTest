package com.example.OumaimaOuni.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Assurance")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assurance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idAssurance")
    private Integer idAssurance;

    @Column(name = "designation")
    private String designation;

    @Column(name = "montant")
    private float montant;

    @ManyToOne(cascade = CascadeType.ALL)
    Contrat contrat;

    @ManyToOne
    Benificiaire benificiaire;
}
