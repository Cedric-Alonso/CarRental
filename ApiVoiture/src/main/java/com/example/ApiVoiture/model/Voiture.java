package com.example.ApiVoiture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String marque;
    private String modele;
    private String immatriculation;
    private String couleur;
    private int prixreserv;
    private int cvfiscaux;
    private int tarifkm;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getprixreserv() {
        return prixreserv;
    }

    public void setprixreserv(int prixreserv) {
        this.prixreserv = prixreserv;
    }

    public int getcvfiscaux() {
        return cvfiscaux;
    }

    public void setcvfiscaux(int cvfiscaux) {
        this.cvfiscaux = cvfiscaux;
    }

    public int gettarifkm() {
        return tarifkm;
    }

    public void settarifkm(int tarifkm) {
        this.tarifkm = tarifkm;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prixreserv=" + prixreserv +
                ", cvfiscaux=" + cvfiscaux +
                ", tarifkm=" + tarifkm +
                '}';
    }
}
