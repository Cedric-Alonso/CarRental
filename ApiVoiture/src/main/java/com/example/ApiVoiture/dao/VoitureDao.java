package com.example.ApiVoiture.dao;


import com.example.ApiVoiture.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureDao extends JpaRepository<Voiture, Integer> {

    Voiture findById(int id);
}
