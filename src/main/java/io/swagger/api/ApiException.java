package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")
public class ApiException extends Exception {
    private static final long serialVersionUID = 1L;
	public ApiException (int code, String msg) {
        super(msg);
    }
}
