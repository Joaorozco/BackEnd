package com.backendPortfolio.backend.Security.Repository;

import com.backendPortfolio.backend.Security.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
