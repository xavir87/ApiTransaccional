package io.swagger.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.MensajeSalida;

public class Validaciones {

	public static ResponseEntity<MensajeSalida> validarResultado(NegocioExcepciones ex) {
		ResponseEntity<MensajeSalida> respuesta;
		switch (ex.getError()) {

		case SOLICITUD_INVALIDA:
			respuesta = new ResponseEntity<>(new MensajeSalida().codigo("400").mensajeSalida(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case SERVICIO_INACCESIBLE:
			respuesta = new ResponseEntity<>(new MensajeSalida().codigo("502").mensajeSalida(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		case FUENTE_DE_DATOS:
			respuesta = new ResponseEntity<>(new MensajeSalida().codigo("503").mensajeSalida(ex.getMessage()),
					HttpStatus.SERVICE_UNAVAILABLE);
			break;
		default:
			respuesta = new ResponseEntity<>(new MensajeSalida().codigo("500").mensajeSalida(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		}

		return respuesta;
	}
}
