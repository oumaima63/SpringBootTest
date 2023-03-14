package com.example.OumaimaOuni.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "Beneficiaire")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Benificiaire {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idBenef")
    private Integer idBenef;

    @NotNull
    @Column(name = "cin")
    private int cin ;

    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom ;

    @NotNull
    @Column(name = "profession")
    private String profession ;

    @NotNull
    @Column(name = "salaire")
    private float salaire;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="benificiaire")
    @JsonIgnore
    private Set<Assurance> assurances;

}
