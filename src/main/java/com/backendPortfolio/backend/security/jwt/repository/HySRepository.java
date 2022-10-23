package com.backendPortfolio.backend.security.jwt.repository;

import com.backendPortfolio.backend.entity.HyS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HySRepository extends JpaRepository<HyS, Integer> {

    Optional<HyS> findByName(String name);

     boolean existsByName(String name);
}
