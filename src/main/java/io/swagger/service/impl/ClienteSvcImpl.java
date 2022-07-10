package io.swagger.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.ClienteDto;
import io.swagger.respository.ifc.IClienteRepo;
import io.swagger.respository.model.Cliente;
import io.swagger.service.ifc.IClienteSvc;
import io.swagger.util.ConvertCliente;
import io.swagger.util.NegocioExcepciones;

@Service
public class ClienteSvcImpl implements IClienteSvc {

	@Autowired
	IClienteRepo clienteRepo;

	@Override
	public ClienteDto crearCliente(@Valid ClienteDto clienteDto) throws NegocioExcepciones{
		// TODO Auto-generated method stub
		Cliente cliente = ConvertCliente.typeToModel(clienteDto);
		cliente = clienteRepo.save(cliente);
		ClienteDto respuesta = ConvertCliente.modelToType(cliente);
		return respuesta;
	}

}
