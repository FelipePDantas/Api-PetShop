package com.PetShop.PetCrud.service;

import com.PetShop.PetCrud.model.Animal;
import com.PetShop.PetCrud.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository repository;


    public Animal created(Animal animal){
        if (animal != null) {
            return repository.save(animal);
        }else {
            return null;
        }
    }
    public List<Animal> findAll(){
       return  repository.findAll();
    }
    public Optional<Animal> findById(Long id){
       return repository.findById(id);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }







}
