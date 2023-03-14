package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.Assurance;
import com.example.OumaimaOuni.entities.Contrat;
import com.example.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {

   // public float getMontantBf (int cinBf);

    @Query("select count(a) from Benificiaire b join b.assurances a group by (b.idBenef) order by count (a) DESC" )
    public void statistiques ();
}
