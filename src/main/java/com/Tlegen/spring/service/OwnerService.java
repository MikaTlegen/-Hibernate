package com.Tlegen.spring.service;


import com.Tlegen.spring.model.Owner;
import com.Tlegen.spring.repository.OwnerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OwnerService {


    private final OwnerRepo ownerRepository;


    @Autowired
    public OwnerService(OwnerRepo ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }


    public Owner getOwnerById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }


    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }


    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }


    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}


