package com.example.OumaimaOuni.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Contrat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contrat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idContat")
    private Integer idContat;

    @Column(name = "matricule")
    private String matricule;

    @Temporal(TemporalType.DATE)
    private Date dateEffet;

    @Enumerated(EnumType.STRING)
    private TypeContrat type;
}
