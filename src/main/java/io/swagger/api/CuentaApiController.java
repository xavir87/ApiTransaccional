package io.swagger.api;


import io.swagger.model.CuentaDto;
import io.swagger.model.MensajeSalida;
import io.swagger.service.ifc.ICuentasSvc;
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
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")
@RestController
@Tag(name = "Cuentas")
public class CuentaApiController implements CuentaApi {

	private static final Logger log = LoggerFactory.getLogger(CuentaApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	ICuentasSvc cuentasSvc;

	@org.springframework.beans.factory.annotation.Autowired
	public CuentaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<?> postCuentaCrearCuenta(
			@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody CuentaDto body) {
		String accept = request.getHeader("Accept");
		MensajeSalida mensaje = new MensajeSalida();

		try {
			log.info("INICIO DEL PROCESO");
			CuentaDto cuenta = cuentasSvc.postCuentaCrearCuenta(body);
			return new ResponseEntity<>(cuenta, HttpStatus.OK);
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
	public ResponseEntity<?> putCuenta(@Valid CuentaDto body) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			CuentaDto clienteDto = cuentasSvc.putCuenta(body);
			return new ResponseEntity<>(clienteDto, HttpStatus.OK);
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
	public ResponseEntity<?> getCuenta() {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			List<CuentaDto> clienteDto = cuentasSvc.getCuenta();
			return new ResponseEntity<>(clienteDto, HttpStatus.OK);
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
	public ResponseEntity<?> eliminarCuenta(String CuentaId) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			boolean clienteDto = cuentasSvc.eliminarCuenta(CuentaId);
			return new ResponseEntity<>(clienteDto, HttpStatus.OK);
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
