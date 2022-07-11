package io.swagger.api;

import org.threeten.bp.LocalDate;

import io.swagger.model.MovimientoDto;
import io.swagger.model.MensajeSalida;
import io.swagger.model.MovimientoCliente;
import io.swagger.model.MovimientoDto;
import io.swagger.service.ifc.IMovimientoSvc;
import io.swagger.util.NegocioExcepciones;
import io.swagger.util.Validaciones;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")
@RestController
@Tag(name = "Movimientos")
public class MovimientoApiController implements MovimientoApi {

	private static final Logger log = LoggerFactory.getLogger(MovimientoApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	IMovimientoSvc movimientoSvc;

	@org.springframework.beans.factory.annotation.Autowired
	public MovimientoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<?> getMovimientoObtenerReporte(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("usuario") String usuario,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("fechaInicio") Date fechaInicio,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("FechaFinal") Date fechaFinal) {

		MensajeSalida mensaje = new MensajeSalida();

		try {
			List<MovimientoCliente> movimientoCliente = movimientoSvc.getMovimientoObtenerReporte(usuario, fechaInicio,
					fechaFinal);
			if (!movimientoCliente.isEmpty()) {
				return new ResponseEntity<>(movimientoCliente, HttpStatus.OK);

			}
			mensaje.codigo("0002");
			mensaje.setMensajeSalida("NO HAY DATOS");
			return new ResponseEntity<>(mensaje, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			mensaje.codigo("9999");
			mensaje.setMensajeSalida(e.getMessage());
			return new ResponseEntity<MovimientoCliente>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public ResponseEntity<?> postMovimiento(MovimientoDto body) {
		// TODO Auto-generated method stub
		try {
			MovimientoDto movimiento = movimientoSvc.postMovimiento(body);
			return new ResponseEntity<>(movimiento, HttpStatus.OK);
		} catch (NegocioExcepciones e) {
			log.error("ERROR EN EL PROCESO");
			return Validaciones.validarResultado(e);
		}

	}

	@Override
	public ResponseEntity<?> putMovimiento(@Valid MovimientoDto body) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			MovimientoDto movimiento = movimientoSvc.putMovimiento(body);
			return new ResponseEntity<>(movimiento, HttpStatus.OK);
		} catch (NegocioExcepciones e) {
			log.error("ERROR EN EL PROCESO");
			return Validaciones.validarResultado(e);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			mensaje.codigo("9999");
			mensaje.setMensajeSalida(e.getMessage());
			return new ResponseEntity<MensajeSalida>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> getMovimiento() {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			List<MovimientoDto> movimiento = movimientoSvc.getMovimiento();
			return new ResponseEntity<>(movimiento, HttpStatus.OK);
		} catch (NegocioExcepciones e) {
			log.error("ERROR EN EL PROCESO");
			return Validaciones.validarResultado(e);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			mensaje.codigo("9999");
			mensaje.setMensajeSalida(e.getMessage());
			return new ResponseEntity<MensajeSalida>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> eliminarMovimiento(String movimientoId) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			boolean movimiento = movimientoSvc.eliminarMovimiento(movimientoId);
			return new ResponseEntity<>(movimiento, HttpStatus.OK);
		} catch (NegocioExcepciones e) {
			log.error("ERROR EN EL PROCESO");
			return Validaciones.validarResultado(e);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			mensaje.codigo("9999");
			mensaje.setMensajeSalida(e.getMessage());
			return new ResponseEntity<MensajeSalida>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
