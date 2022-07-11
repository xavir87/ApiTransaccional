package io.swagger.api;

import io.swagger.model.ClienteDto;
import io.swagger.model.MensajeSalida;
import io.swagger.service.ifc.IClienteSvc;
import io.swagger.util.NegocioExcepciones;
import io.swagger.util.Validaciones;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")
@RestController
@Tag(name = "Clientes")
public class ClienteApiController implements ClienteApi {

	private static final Logger log = LoggerFactory.getLogger(ClienteApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	IClienteSvc clienteSvc;

	@org.springframework.beans.factory.annotation.Autowired
	public ClienteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<?> postClienteCrearCliente(ClienteDto body) {
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			ClienteDto clienteDto = clienteSvc.crearCliente(body);
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
	public ResponseEntity<?> putCliente(ClienteDto body) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			ClienteDto clienteDto = clienteSvc.putObtenerCliente(body);
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
	public ResponseEntity<?> getCliente() {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			List<ClienteDto> clienteDto = clienteSvc.getCliente();
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
	public ResponseEntity<?> eliminarCliente(String clienteId) {
		// TODO Auto-generated method stub
		MensajeSalida mensaje = new MensajeSalida();
		try {
			log.info("INICIO DEL PROCESO");
			boolean clienteDto = clienteSvc.eliminarCliente(clienteId);
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
