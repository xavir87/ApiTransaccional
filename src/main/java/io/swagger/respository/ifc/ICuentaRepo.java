package io.swagger.respository.ifc;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.swagger.respository.model.Cuenta;

public interface ICuentaRepo extends JpaRepository<Cuenta, UUID> {

	@Query(value = "select *	from cuenta u where u.identificacion = :identificacion", nativeQuery = true)
	List<Cuenta> consultaIdentificacion(@Param("identificacion") String identificacion);

	@Query(value = "select *from cuenta u where u.NUMERO_CUENTA = :cuenta", nativeQuery = true)
	Cuenta consultaCuenta(@Param("cuenta") Integer cuenta);
}
