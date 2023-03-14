package com.example.OumaimaOuni.Repositories;

import com.example.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
