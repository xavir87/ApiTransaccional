package io.swagger.service.ifc;

import java.util.List;

import io.swagger.model.ClienteDto;
import io.swagger.util.NegocioExcepciones;

public interface IClienteSvc {

	public ClienteDto crearCliente(ClienteDto cliente) throws NegocioExcepciones;

	public ClienteDto putObtenerCliente(ClienteDto body)throws NegocioExcepciones;
	
	public List<ClienteDto> getCliente()throws NegocioExcepciones;
	
	public boolean eliminarCliente(String clienteId)throws NegocioExcepciones;
}
