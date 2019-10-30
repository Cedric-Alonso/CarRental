package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private int numero_permis;
    private Date date_permis;

    public User() {
    }

    public User(String nom, String prenom, Date date_naissance, int numero_permis, Date date_permis) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.numero_permis = numero_permis;
        this.date_permis = date_permis;
    }

    public User(int id, String nom, String prenom, Date date_naissance, int numero_permis, Date date_permis) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.numero_permis = numero_permis;
        this.date_permis = date_permis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public int getNumero_permis() {
        return numero_permis;
    }

    public void setNumero_permis(int numero_permis) {
        this.numero_permis = numero_permis;
    }

    public Date getDate_permis() {
        return date_permis;
    }

    public void setDate_permis(Date date_permis) {
        this.date_permis = date_permis;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance=" + date_naissance +
                ", numero_permis=" + numero_permis +
                ", date_permis=" + date_permis +
                '}';
    }
}
