package com.example.ApiVoiture.web.controller;

import com.example.ApiVoiture.dao.VoitureDao;
import com.example.ApiVoiture.model.Voiture;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
@Api(tags = "CRUD")
@EnableSwagger2
@RestController
public class VoitureController {

    @Autowired
    VoitureDao dao;

    @ApiOperation(value = "liste des voitures")
    @GetMapping(value = "/voitures")
    public List<Voiture> list_des_vehicules(){

        return dao.findAll();
    }

    @ApiOperation(value = "recuperer une voiture")
    @GetMapping(value = "/voitures/{id}")
    public Voiture choixVoiture(@PathVariable int id){

        return dao.findById(id);
    }

    @ApiOperation(value = "modifier une voiture")
    @PutMapping(value = "/voiture/update")
    public String updateVoiture(@RequestBody Voiture voiture){

        if (choixVoiture(voiture.getId()) != null) {
            dao.save(voiture);
            return "modify ok";
        }else {
            return "L'élément n'a pas était trouver.";
        }
    }
    @ApiOperation(value = "ajouter  une voiture")
    @PostMapping(value = "/voiture/add")
    public String ajouterVoiture(@RequestBody Voiture voiture){
        if (choixVoiture(voiture.getId()) == null) {
            dao.save(voiture);
            return "ajout ok";
        }else {
            return "L'élément n'a pas était trouver.";
        }
    }

    @ApiOperation(value = "supprimer une voiture")
    @DeleteMapping(value = "/voiture/delete/{id}")
    public String deletVoiture(@PathVariable int id){
        Voiture voitureDelete = choixVoiture(id);
        dao.delete(voitureDelete);

        return "delete ok";
    }

//    @DeleteMapping(value = "/voiture/delete/{id}")
//    public void deletevoiture(@PathVariable int id){
//        dao.deleteById(id);
//    }
}
