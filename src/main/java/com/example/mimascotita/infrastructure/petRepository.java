package com.example.mimascotita.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mimascotita.domain.pet;

public interface petRepository extends JpaRepository<pet, Long> {}
