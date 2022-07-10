package io.swagger.respository.ifc;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import io.swagger.respository.model.Cliente;

@Repository
public interface IClienteRepo extends JpaRepository<Cliente, UUID> {

	@Query(value = "select *	from cliente u where u.identificacion = :identificacion", nativeQuery = true)
	List<Cliente> consultaIdentificacion(@Param("identificacion") String identificacion);

}
