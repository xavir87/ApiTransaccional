package io.swagger.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * MoviminetoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")

public class MovimientoDto {
	@JsonProperty("id")
	private UUID id = null;

	@JsonProperty("fecha")
	private LocalDateTime fecha = null;

	/**
	 * Gets or Sets tipoMovimiento
	 */
	public enum TipoMovimientoEnum {
		CREDITO("CREDITO"),

		DEBITO("DEBITO");

		private String value;

		TipoMovimientoEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TipoMovimientoEnum fromValue(String text) {
			for (TipoMovimientoEnum b : TipoMovimientoEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("tipoMovimiento")
	private TipoMovimientoEnum tipoMovimiento = null;

	@JsonProperty("valor")
	private Double valor = null;

	@JsonProperty("saldo")
	private Double saldo = null;

	@JsonProperty("identificacion")
	private String identificacion = null;

	@JsonProperty("numeroCuenta")
	private Integer numeroCuenta;

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public MovimientoDto identificacion(String identificacion) {
		this.identificacion = identificacion;
		return this;
	}

	/**
	 * Get identificacion
	 * 
	 * @return identificacion
	 **/
	@Schema(description = "")

	@Valid
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public MovimientoDto id(UUID id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")

	@Valid
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public MovimientoDto fecha(LocalDateTime fecha) {
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

	public MovimientoDto tipoMovimiento(TipoMovimientoEnum tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
		return this;
	}

	/**
	 * Get tipoMovimiento
	 * 
	 * @return tipoMovimiento
	 **/
	@Schema(description = "")

	public TipoMovimientoEnum getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimientoEnum tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public MovimientoDto valor(Double valor) {
		this.valor = valor;
		return this;
	}

	/**
	 * Get valor
	 * 
	 * @return valor
	 **/
	@Schema(description = "")

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimientoDto saldo(Double saldo) {
		this.saldo = saldo;
		return this;
	}

	/**
	 * Get saldo
	 * 
	 * @return saldo
	 **/
	@Schema(description = "")

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MovimientoDto movimientoDto = (MovimientoDto) o;
		return Objects.equals(this.id, movimientoDto.id) && Objects.equals(this.fecha, movimientoDto.fecha)
				&& Objects.equals(this.tipoMovimiento, movimientoDto.tipoMovimiento)
				&& Objects.equals(this.valor, movimientoDto.valor) && Objects.equals(this.saldo, movimientoDto.saldo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fecha, tipoMovimiento, valor, saldo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MoviminetoDto {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
		sb.append("    tipoMovimiento: ").append(toIndentedString(tipoMovimiento)).append("\n");
		sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
		sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
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
