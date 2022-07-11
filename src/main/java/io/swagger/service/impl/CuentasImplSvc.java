package io.swagger.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.constante.TipoError;
import io.swagger.model.CuentaDto;
import io.swagger.respository.ifc.ICuentaRepo;
import io.swagger.respository.model.Cuenta;
import io.swagger.service.ifc.ICuentasSvc;
import io.swagger.util.ConvertCliente;
import io.swagger.util.NegocioExcepciones;

@Service
public class CuentasImplSvc implements ICuentasSvc {

	@Autowired
	ICuentaRepo cuentaRepo;

	public CuentaDto postCuentaCrearCuenta(CuentaDto body) throws NegocioExcepciones {
		// TODO Auto-generated method stub

		Cuenta cuenta = ConvertCliente.typeToModel(body);
		cuenta = cuentaRepo.save(cuenta);
		CuentaDto cuentaDto = ConvertCliente.modelToType(cuenta);
		return cuentaDto;
	}

	@Override
	public CuentaDto putCuenta(CuentaDto body) throws NegocioExcepciones {
		// TODO Auto-generated method stub
		Cuenta cuenta = ConvertCliente.typeToModel(body);
		cuenta = cuentaRepo.save(cuenta);
		CuentaDto respuesta = ConvertCliente.modelToType(cuenta);
		return respuesta;
	}

	@Override
	public List<CuentaDto> getCuenta() throws NegocioExcepciones {
		// TODO Auto-generated method stub
		List<Cuenta> cuentas = cuentaRepo.findAll();
		List<CuentaDto> respuesta = ConvertCliente.listModelToTypse(cuentas);
		return respuesta;
	}

	@Override
	public boolean eliminarCuenta(String cuentaId) throws NegocioExcepciones {
		// TODO Auto-generated method stub
		Boolean recursoBorrado = false;
		UUID cuenta = UUID.fromString(cuentaId.trim());
		if (cuentaRepo.findById(cuenta).isPresent()) {
			cuentaRepo.deleteById(cuenta);
			;
			recursoBorrado = true;
		} else {
			throw new NegocioExcepciones("RECURSO_NO_ENCONTRADO", TipoError.FUENTE_DE_DATOS);
		}
		return recursoBorrado;
	}

}
