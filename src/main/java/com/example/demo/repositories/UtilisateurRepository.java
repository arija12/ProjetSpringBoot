package com.example.demo.repositories;

import com.example.demo.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{


    Optional<Utilisateur> findById(Integer id);


    Optional<Utilisateur> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


// 3LECHH

    }