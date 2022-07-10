package io.swagger.respository.ifc;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.respository.model.Persona;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, UUID> {

}
