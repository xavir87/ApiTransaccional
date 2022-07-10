package io.swagger.util;

import io.swagger.constante.TipoError;

public class NegocioExcepciones extends Exception{
	private static final long serialVersionUID = 1L;

	TipoError error;
	
	public NegocioExcepciones(String mensaje, TipoError error) {
		super(mensaje);
		this.error = error;
	}
	
	public NegocioExcepciones(String mensaje, TipoError error, Throwable causa) {
		super(mensaje,causa);
		this.error = error;
	}
	
	public NegocioExcepciones(String mensaje) {
		super(mensaje);
		this.error = TipoError.ERROR_INESPERADO;
	}
	
	public TipoError getError() {
		return error;
	}
}
