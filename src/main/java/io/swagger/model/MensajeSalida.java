package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MensajeSalida
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")


public class MensajeSalida   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("mensajeSalida")
  private String mensajeSalida = null;

  public MensajeSalida codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
   **/
  @Schema(description = "")
  
    public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MensajeSalida mensajeSalida(String mensajeSalida) {
    this.mensajeSalida = mensajeSalida;
    return this;
  }

  /**
   * Get mensajeSalida
   * @return mensajeSalida
   **/
  @Schema(description = "")
  
    public String getMensajeSalida() {
    return mensajeSalida;
  }

  public void setMensajeSalida(String mensajeSalida) {
    this.mensajeSalida = mensajeSalida;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MensajeSalida mensajeSalida = (MensajeSalida) o;
    return Objects.equals(this.codigo, mensajeSalida.codigo) &&
        Objects.equals(this.mensajeSalida, mensajeSalida.mensajeSalida);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, mensajeSalida);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MensajeSalida {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    mensajeSalida: ").append(toIndentedString(mensajeSalida)).append("\n");
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
