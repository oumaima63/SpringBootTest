package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    @Query("SELECT c FROM Benificiaire b join b.assurances a join a.contrat c WHERE b.idBenef = :idBf ORDER BY c.dateEffet ASC")
    public List<Contrat> getContratBf(@Param("idBf") int idBf);

}
