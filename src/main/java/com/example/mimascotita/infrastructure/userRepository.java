package com.example.mimascotita.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mimascotita.domain.user;

public interface userRepository extends JpaRepository<user, Long> {}
