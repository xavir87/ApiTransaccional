package io.swagger.service.impl;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.constante.TipoError;
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
	public ClienteDto crearCliente(@Valid ClienteDto clienteDto) throws NegocioExcepciones {
		// TODO Auto-generated method stub
		Cliente cliente = ConvertCliente.typeToModel(clienteDto);
		cliente = clienteRepo.save(cliente);
		ClienteDto respuesta = ConvertCliente.modelToType(cliente);
		return respuesta;
	}

	@Override
	public ClienteDto putObtenerCliente(ClienteDto body) {
		// TODO Auto-generated method stub
		Cliente cliente = ConvertCliente.typeToModel(body);
		cliente = clienteRepo.saveAndFlush(cliente);
		ClienteDto respuesta = ConvertCliente.modelToType(cliente);
		return respuesta;
	}

	@Override
	public List<ClienteDto> getCliente() throws NegocioExcepciones {
		// TODO Auto-generated method stub

		List<Cliente> cliente = clienteRepo.findAll();
		List<ClienteDto> respuesta = ConvertCliente.listModelToType(cliente);
		return respuesta;
	}

	@Override
	public boolean eliminarCliente(String clienteId) throws NegocioExcepciones {
		// TODO Auto-generated method stub
		Boolean recursoBorrado = false;
		UUID cliente = UUID.fromString(clienteId.trim());
		if (clienteRepo.findById(cliente).isPresent()) {
			clienteRepo.deleteById(cliente);;
			recursoBorrado = true;
		} else {
			throw new NegocioExcepciones("RECURSO_NO_ENCONTRADO", TipoError.FUENTE_DE_DATOS);
		}
		return recursoBorrado;
	}

}
