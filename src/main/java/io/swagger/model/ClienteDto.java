package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Persona;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")

public class ClienteDto extends Persona {
	
	
	@JsonIgnore
	@JsonProperty("clienteid")
	private UUID clienteid;

	@JsonProperty("contrasena")
	private String contrasena = null;

	@JsonProperty("estado")
	private boolean estado;

	public ClienteDto clienteid(UUID clienteid) {
		this.clienteid = clienteid;
		return this;
	}

	/**
	 * Get clienteid
	 * 
	 * @return clienteid
	 **/
	@Schema(description = "")

	@Valid
	public UUID getClienteid() {
		return clienteid;
	}

	public void setClienteid(UUID clienteid) {
		this.clienteid = clienteid;
	}

	public ClienteDto contrasena(String contrasena) {
		this.contrasena = contrasena;
		return this;
	}

	/**
	 * Get contrasena
	 * 
	 * @return contrasena
	 **/
	@Schema(description = "")

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public ClienteDto estado(boolean estado) {
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
		ClienteDto cliente = (ClienteDto) o;
		return Objects.equals(this.clienteid, cliente.clienteid) && Objects.equals(this.contrasena, cliente.contrasena)
				&& Objects.equals(this.estado, cliente.estado) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clienteid, contrasena, estado, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Cliente {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    clienteid: ").append(toIndentedString(clienteid)).append("\n");
		sb.append("    contrasena: ").append(toIndentedString(contrasena)).append("\n");
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
