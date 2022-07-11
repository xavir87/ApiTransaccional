package io.swagger.util;

import java.util.List;
import java.util.stream.Collectors;

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

	public static List<ClienteDto> listModelToType(List<Cliente> clientes) {
		return clientes.stream().map(cliente -> (modelToType(cliente))).collect(Collectors.toList());
	}

	public static List<MovimientoDto> listModelToTyps(List<Movimiento> movimientos) {
		return movimientos.stream().map(movimiento -> (modelToType(movimiento))).collect(Collectors.toList());
	}
	
	public static List<CuentaDto> listModelToTypse(List<Cuenta> cuentas) {
		return cuentas.stream().map(movimiento -> (modelToType(movimiento))).collect(Collectors.toList());
	}
}
