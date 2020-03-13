package com.a84.garageauto.m;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {
    boolean existsByNom(String nom);
    Utilisateur findByNom(String nom);
}
