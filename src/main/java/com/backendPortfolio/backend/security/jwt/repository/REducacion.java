package com.backendPortfolio.backend.security.jwt.repository;

import com.backendPortfolio.backend.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
    Optional<Educacion> findByNombreE(String nombreE);
    boolean existsByNombreE(String nombreE);
}
