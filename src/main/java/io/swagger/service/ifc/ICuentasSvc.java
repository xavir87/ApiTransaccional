package io.swagger.service.ifc;

import java.util.List;

import io.swagger.model.CuentaDto;
import io.swagger.util.NegocioExcepciones;

public interface ICuentasSvc {

	public CuentaDto postCuentaCrearCuenta(CuentaDto body) throws NegocioExcepciones;

	public CuentaDto putCuenta(CuentaDto body) throws NegocioExcepciones;

	public List<CuentaDto> getCuenta() throws NegocioExcepciones;

	public boolean eliminarCuenta(String cuentaId) throws NegocioExcepciones;
}
