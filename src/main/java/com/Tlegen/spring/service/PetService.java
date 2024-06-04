package com.Tlegen.spring.service;

import com.Tlegen.spring.model.Pet;
import com.Tlegen.spring.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PetService {


    private final PetRepo petRepository;


    @Autowired
    public PetService(PetRepo petRepository) {
        this.petRepository = petRepository;
    }


    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }


    public Pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }


    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }


    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }


    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }
}