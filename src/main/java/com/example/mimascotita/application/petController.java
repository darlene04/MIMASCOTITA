package com.example.mimascotita.application;

import com.example.mimascotita.domain.pet;
import com.example.mimascotita.service.petService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class petController {
    private final petService petService;

    @Autowired
    public petController(petService petService) {
        this.petService = petService;
    }

    // === Endpoints ===
    //get(obtener cosas),post(insertar en la base ),put(modificaciones),delete(borrar cosas),patch
    @PostMapping()
    public ResponseEntity<pet>createPetController(@RequestBody pet newPet){
        pet createdPet= petService.createPet(newPet);
        return new ResponseEntity<>(createdPet, HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<pet>> getAllPets(){
        List<pet> allPets = petService.getAllPets();
        return new ResponseEntity<>(allPets, HttpStatus.OK);
    }
}
