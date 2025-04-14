package com.example.mimascotita.service;
//LOGICA DE TU NEGOCIO
import com.example.mimascotita.domain.pet;
import com.example.mimascotita.infrastructure.petRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petService {
    private final petRepository petRepository;

    @Autowired
    public petService(petRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    // === Functions of service ===
    public pet createPet(pet newPet){
    return petRepository.save(newPet);
    //funcion para guardadar un nuevo animal es petrepository.save(name,description)
    }
    //un empoint para que me liste todas las mascotas
    public List<pet> getAllPets(){
        return petRepository.findAll();
    }
}
