package io.swagger.service.ifc;

import java.sql.Date;
import java.util.List;


import io.swagger.model.MovimientoCliente;
import io.swagger.model.MovimientoDto;
import io.swagger.util.NegocioExcepciones;

public interface IMovimientoSvc {

	public List<MovimientoCliente> getMovimientoObtenerReporte(String usuario, Date fechaInicio, Date fechaFinal);

	public MovimientoDto postMovimiento(MovimientoDto body)throws NegocioExcepciones;
}
