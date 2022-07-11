package io.swagger.respository.ifc;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.respository.model.Movimiento;

@Repository
public interface IMovimientoRepo extends JpaRepository<Movimiento, UUID>{

	@Query(value = "select * from movimiento u where u.fecha \\:\\:DATE between :fecha1 and :fecha2 \\:\\:DATE and NUMERO_CUENTA =:cuenta order by fecha ", nativeQuery = true)
	List<Movimiento> consultaReporte(@Param("fecha1") Date fecha, @Param("fecha2") Date fecha2,
			@Param("cuenta") String cuenta);
	
	@Query(value = "SELECT * FROM movimiento WHERE NUMERO_CUENTA  = :cuenta order by fecha desc  limit 1", nativeQuery = true)
	Movimiento consultaMovimientoCuenta(@Param("cuenta") String cuenta);
}
