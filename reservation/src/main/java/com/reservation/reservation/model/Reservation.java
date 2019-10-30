package com.reservation.reservation.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int iduser;
    private int idvoiture;
    private Date datedebut;
    private Date datefin;
    private Boolean reserve;
    private int kmestime;
    private int kmretour;

    public Reservation() { }

    public Reservation(int iduser, int idvoiture, Date datedebut, Date datefin, Boolean reserve, int kmestime, int kmretour) {
        this.iduser = iduser;
        this.idvoiture = idvoiture;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.reserve = reserve;
        this.kmestime = kmestime;
        this.kmretour = kmretour;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getiduser() {
        return iduser;
    }

    public void setiduser(int iduser) {
        this.iduser = iduser;
    }

    public int getidvoiture() {
        return idvoiture;
    }

    public void setidvoiture(int idvoiture) {
        this.idvoiture = idvoiture;
    }

    public Date getdatedebut() {
        return datedebut;
    }

    public void setdatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Boolean getReserve() {
        return reserve;
    }

    public void setReserve(Boolean reserve) {
        this.reserve = reserve;
    }

    public int getKmestime() {
        return kmestime;
    }

    public void setKmestime(int kmestime) {
        this.kmestime = kmestime;
    }

    public int getKmretour() {
        return kmretour;
    }

    public void setKmretour(int kmretour) {
        this.kmretour = kmretour;
    }
}
