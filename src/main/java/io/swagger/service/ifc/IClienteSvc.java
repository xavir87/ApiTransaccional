package io.swagger.service.ifc;

import io.swagger.model.ClienteDto;
import io.swagger.util.NegocioExcepciones;

public interface IClienteSvc {

	public ClienteDto crearCliente(ClienteDto cliente) throws NegocioExcepciones;
}
