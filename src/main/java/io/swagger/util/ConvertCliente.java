package io.swagger.util;

import org.modelmapper.ModelMapper;

import io.swagger.model.ClienteDto;
import io.swagger.model.CuentaDto;
import io.swagger.model.MovimientoDto;
import io.swagger.respository.model.Cliente;
import io.swagger.respository.model.Cuenta;
import io.swagger.respository.model.Movimiento;



public class ConvertCliente {

	public static ClienteDto modelToType(Cliente cliente) {
		return new ModelMapper().map(cliente, ClienteDto.class);
	}
	
	public static Cliente typeToModel(ClienteDto cliente) {
		return new ModelMapper().map(cliente, Cliente.class);
	}
	
	public static CuentaDto modelToType(Cuenta cuenta) {
		return new ModelMapper().map(cuenta, CuentaDto.class);
	}
	
	public static Cuenta typeToModel(CuentaDto cuenta) {
		return new ModelMapper().map(cuenta, Cuenta.class);
	}
	
	public static MovimientoDto modelToType(Movimiento movimiento) {
		return new ModelMapper().map(movimiento, MovimientoDto.class);
	}
	
	public static Movimiento typeToModel(MovimientoDto movimiento) {
		return new ModelMapper().map(movimiento, Movimiento.class);
	}
}
