package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserDao UserDao;
    @RequestMapping(value="/client", method= RequestMethod.GET)
    public @ResponseBody
    Iterable<User> client() {
        return UserDao.findAll();
    }
    @GetMapping(value="/client/{id}")
    public User afficherUnClient(@PathVariable int id){
        return UserDao.findById(id);
    }
    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public void creerUnClient(@RequestBody User user){
        UserDao.save(user);
    }
    @RequestMapping(value = "/updateClient/{id}", method = RequestMethod.POST)
    public void modifierUnClient(@RequestBody User user, @PathVariable int id){
        if (null!=UserDao.findById(id)){
            UserDao.save(user);
        }
    }
    @GetMapping(value="/deleteClient/{id}")
    public void supprimerUnClient(@PathVariable int id){
        UserDao.deleteById(id);
    }
}
