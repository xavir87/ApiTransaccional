package io.swagger.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MovimientoCliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")

public class MovimientoCliente {
	@JsonProperty("fecha")
	private LocalDateTime fecha = null;

	@JsonProperty("cliente")
	private String cliente = null;

	@JsonProperty("numeroCuenta")
	private int numeroCuenta;

	/**
	 * Gets or Sets tipoCuenta
	 */
	public enum TipoCuentaEnum {
		AHORRO("AHORRO"),

		CORRIENTE("CORRIENTE");

		private String value;

		TipoCuentaEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TipoCuentaEnum fromValue(String text) {
			for (TipoCuentaEnum b : TipoCuentaEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("tipoCuenta")
	private TipoCuentaEnum tipoCuenta = null;

	@JsonProperty("saldoInicial")
	private Double saldoInicial = null;

	@JsonProperty("estado")
	private boolean estado;

	@JsonProperty("movimiento")
	private Double movimiento = null;

	@JsonProperty("saldoDisponible")
	private Double saldoDisponible = null;

	public MovimientoCliente fecha(LocalDateTime fecha) {
		this.fecha = fecha;
		return this;
	}

	/**
	 * Get fecha
	 * 
	 * @return fecha
	 **/
	@Schema(description = "")

	@Valid
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public MovimientoCliente cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}

	/**
	 * Get cliente
	 * 
	 * @return cliente
	 **/
	@Schema(description = "")

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public MovimientoCliente numeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		return this;
	}

	/**
	 * Get numeroCuenta
	 * 
	 * @return numeroCuenta
	 **/
	@Schema(description = "")

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public MovimientoCliente tipoCuenta(TipoCuentaEnum tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
		return this;
	}

	/**
	 * Get tipoCuenta
	 * 
	 * @return tipoCuenta
	 **/
	@Schema(description = "")

	public TipoCuentaEnum getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuentaEnum tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public MovimientoCliente saldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
		return this;
	}

	/**
	 * Get saldoInicial
	 * 
	 * @return saldoInicial
	 **/
	@Schema(description = "")

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public MovimientoCliente estado(boolean estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * Get estado
	 * 
	 * @return estado
	 **/
	@Schema(description = "")

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public MovimientoCliente movimiento(Double movimiento) {
		this.movimiento = movimiento;
		return this;
	}

	/**
	 * Get movimiento
	 * 
	 * @return movimiento
	 **/
	@Schema(description = "")

	public Double getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Double movimiento) {
		this.movimiento = movimiento;
	}

	public MovimientoCliente saldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
		return this;
	}

	/**
	 * Get saldoDisponible
	 * 
	 * @return saldoDisponible
	 **/
	@Schema(description = "")

	public Double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MovimientoCliente movimientoCliente = (MovimientoCliente) o;
		return Objects.equals(this.fecha, movimientoCliente.fecha)
				&& Objects.equals(this.cliente, movimientoCliente.cliente)
				&& Objects.equals(this.numeroCuenta, movimientoCliente.numeroCuenta)
				&& Objects.equals(this.tipoCuenta, movimientoCliente.tipoCuenta)
				&& Objects.equals(this.saldoInicial, movimientoCliente.saldoInicial)
				&& Objects.equals(this.estado, movimientoCliente.estado)
				&& Objects.equals(this.movimiento, movimientoCliente.movimiento)
				&& Objects.equals(this.saldoDisponible, movimientoCliente.saldoDisponible);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, cliente, numeroCuenta, tipoCuenta, saldoInicial, estado, movimiento,
				saldoDisponible);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MovimientoCliente {\n");

		sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
		sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
		sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
		sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
		sb.append("    saldoInicial: ").append(toIndentedString(saldoInicial)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    movimiento: ").append(toIndentedString(movimiento)).append("\n");
		sb.append("    saldoDisponible: ").append(toIndentedString(saldoDisponible)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
