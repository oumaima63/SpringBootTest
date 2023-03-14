package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Contrat;
import com.example.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {

   // public float getMontantBf (int cinBf);

/*    @Query("SELECT ((a.montant)/12) FROM Assurance a join Benificiaire b WHERE b.idBenef = :idBf ")
    public float getContratBf(@Param("idBf") int idBf);*/
}
