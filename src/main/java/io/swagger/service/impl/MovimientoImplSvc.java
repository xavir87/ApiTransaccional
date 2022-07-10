package io.swagger.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.constante.TipoError;
import io.swagger.model.MovimientoCliente;
import io.swagger.model.MovimientoDto;
import io.swagger.model.MovimientoDto.TipoMovimientoEnum;
import io.swagger.respository.ifc.IClienteRepo;
import io.swagger.respository.ifc.ICuentaRepo;
import io.swagger.respository.ifc.IMovimientoRepo;
import io.swagger.respository.model.Cuenta;
import io.swagger.respository.model.Movimiento;
import io.swagger.service.ifc.IMovimientoSvc;
import io.swagger.util.ConvertCliente;
import io.swagger.util.NegocioExcepciones;

@Service
public class MovimientoImplSvc implements IMovimientoSvc {

	@Autowired
	IMovimientoRepo movimientoRepo;

	@Autowired
	ICuentaRepo cuentaRepo;

	@Autowired
	IClienteRepo clienteRepo;

	@SuppressWarnings("static-access")
	public List<MovimientoCliente> getMovimientoObtenerReporte(String usuario, Date fechaInicio, Date fechaFinal) {
		// TODO Auto-generated method stub
		List<Cuenta> cuentas = cuentaRepo.consultaIdentificacion(usuario);
		List<MovimientoCliente> movimientoClientes = new ArrayList<>();
		MovimientoCliente item;
		for (Cuenta cuenta : cuentas) {
			item = new MovimientoCliente();
			Movimiento movimiento = movimientoRepo.consultaReporte(fechaInicio, fechaFinal,
					cuenta.getNumeroCuenta() + "");
			item.setCliente(cuenta.getIdentificacion());
			item.setEstado(cuenta.getEstado());
			item.setFecha(movimiento.getFecha());
			item.setMovimiento(movimiento.getValor());
			item.setNumeroCuenta(movimiento.getNumeroCuenta());
			item.setSaldoDisponible(movimiento.getSaldo());
			item.setSaldoInicial(cuenta.getSaldoInicial());
			item.setTipoCuenta(item.getTipoCuenta().fromValue(cuenta.getTipoCuenta().toString()));
			movimientoClientes.add(item);
		}

		return movimientoClientes;
	}

	@Override
	public MovimientoDto postMovimiento(MovimientoDto body) throws NegocioExcepciones {
		// TODO Auto-generated method stub

		// CONSULTA DE CUENTAS ACTIVAS
		Cuenta cuenta = cuentaRepo.consultaCuenta(body.getNumeroCuenta());
		if (cuenta != null) {
			Movimiento movimiento = movimientoRepo.consultaMovimientoCuenta(cuenta.getNumeroCuenta() + "");
			double rest = movimiento != null ? movimiento.getSaldo() : cuenta.getSaldoInicial();
			if (body.getTipoMovimiento().equals(TipoMovimientoEnum.DEBITO)) {

				body.setSaldo(rest - body.getValor());
				body.setValor(-body.getValor());
				if (body.getSaldo() < 0) {
					throw new NegocioExcepciones("Saldo no disponible", TipoError.FUENTE_DE_DATOS);
				}

			} else {
				body.setSaldo(rest + body.getValor());

			}
		}else {
			throw new NegocioExcepciones("Estimado el cliente no tiene una cuenta registrada ", TipoError.FUENTE_DE_DATOS);
		}
		Movimiento movimiento = ConvertCliente.typeToModel(body);
		body = ConvertCliente.modelToType(movimientoRepo.save(movimiento));
		return body;
	}

}
