package io.swagger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
