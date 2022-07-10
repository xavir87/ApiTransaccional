package io.swagger.service.ifc;

import io.swagger.model.CuentaDto;
import io.swagger.util.NegocioExcepciones;

public interface ICuentasSvc {

	public CuentaDto postCuentaCrearCuenta(CuentaDto body) throws NegocioExcepciones;
}
