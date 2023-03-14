package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.Benificiaire;
import com.example.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenificiaireRepository extends JpaRepository<Benificiaire,Integer> {
}
