package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CuentaDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")

public class CuentaDto {
	@JsonProperty("id")
	private UUID id = null;

	@JsonProperty("numeroCuenta")
	private Integer numeroCuenta = null;

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
	private double saldoInicial;

	@JsonProperty("estado")
	private boolean estado ;

	@JsonProperty("identificacion")
	private String identificacion = null;

	public CuentaDto identificacion(String identificacion) {
		this.identificacion = identificacion;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")

	@Valid
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public CuentaDto id(UUID id) {
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

	public CuentaDto numeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		return this;
	}

	/**
	 * Get numeroCuenta
	 * 
	 * @return numeroCuenta
	 **/
	@Schema(description = "")

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public CuentaDto tipoCuenta(TipoCuentaEnum tipoCuenta) {
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

	public CuentaDto saldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
		return this;
	}

	/**
	 * Get saldoInicial
	 * 
	 * @return saldoInicial
	 **/
	@Schema(description = "")

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Integer saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public CuentaDto estado(boolean estado) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CuentaDto cuentaDto = (CuentaDto) o;
		return Objects.equals(this.id, cuentaDto.id) && Objects.equals(this.numeroCuenta, cuentaDto.numeroCuenta)
				&& Objects.equals(this.tipoCuenta, cuentaDto.tipoCuenta)
				&& Objects.equals(this.saldoInicial, cuentaDto.saldoInicial)
				&& Objects.equals(this.estado, cuentaDto.estado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numeroCuenta, tipoCuenta, saldoInicial, estado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CuentaDto {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
		sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
		sb.append("    saldoInicial: ").append(toIndentedString(saldoInicial)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
