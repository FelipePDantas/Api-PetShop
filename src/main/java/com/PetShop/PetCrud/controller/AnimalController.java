package com.PetShop.PetCrud.controller;

import com.PetShop.PetCrud.model.Animal;
import com.PetShop.PetCrud.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Animal")

public class AnimalController {

    @Autowired
    AnimalService service;

    @PostMapping("/created")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity <Animal> created(@RequestBody Animal animal){
          Animal an = service.created(animal);
          return ResponseEntity.status(201).body(animal);
    }

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Animal> findAll(){
      return   service.findAll();
    }
    @GetMapping("{/id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Animal> findById(@PathVariable Long id){
        return service.findById(id);
    }

    public void delete (@PathVariable Long id){
        service.deleteById(id);
    }



}
