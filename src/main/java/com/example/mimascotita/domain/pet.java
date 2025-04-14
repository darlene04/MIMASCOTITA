package com.example.mimascotita.domain;
//DEFINE ATRIBUTOS EL DOMAIN

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pet")
//cada uno de los atributos tienen que tener tu getter y setter
@Getter
@Setter
@NoArgsConstructor
public class pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // === Attributes and Constructor ===
    private String name;
    private String description;

}
