package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.TypeContrat;
import com.example.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface BenificiaireRepository extends JpaRepository<Benificiaire,Integer> {

//public Benificiaire findBenificiaireByIdBenef(int idBenif);

    public Benificiaire findBenificiaireByCin(int idBenif);


    @Query("select b from Benificiaire b join b.assurances a join a.contrat c where c.type =:typeContrat")
    public Set<Benificiaire> getBeneficairesAsType(TypeContrat typeContrat);


}
