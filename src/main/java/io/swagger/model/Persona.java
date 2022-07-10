package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Persona
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")


public class Persona   {
  @JsonProperty("nombre")
  private String nombre = null;

  /**
   * Gets or Sets genero
   */
  public enum GeneroEnum {
    MASCULINO("MASCULINO"),
    
    FEMENINO("FEMENINO");

    private String value;

    GeneroEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GeneroEnum fromValue(String text) {
      for (GeneroEnum b : GeneroEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("genero")
  private GeneroEnum genero = null;

  @JsonProperty("edad")
  private String edad = null;

  @JsonProperty("identificacion")
  private String identificacion = null;

  @JsonProperty("direccion")
  private String direccion = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("id")
  private UUID id = null;

  public Persona nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Persona genero(GeneroEnum genero) {
    this.genero = genero;
    return this;
  }

  /**
   * Get genero
   * @return genero
   **/
  @Schema(description = "")
  
    public GeneroEnum getGenero() {
    return genero;
  }

  public void setGenero(GeneroEnum genero) {
    this.genero = genero;
  }

  public Persona edad(String edad) {
    this.edad = edad;
    return this;
  }

  /**
   * Get edad
   * @return edad
   **/
  @Schema(description = "")
  
    public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public Persona identificacion(String identificacion) {
    this.identificacion = identificacion;
    return this;
  }

  /**
   * Get identificacion
   * @return identificacion
   **/
  @Schema(description = "")
  
  @Pattern(regexp="[0-9]*")   public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  public Persona direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * Get direccion
   * @return direccion
   **/
  @Schema(description = "")
  
    public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Persona telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
   **/
  @Schema(description = "")
  
    public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Persona id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.nombre, persona.nombre) &&
        Objects.equals(this.genero, persona.genero) &&
        Objects.equals(this.edad, persona.edad) &&
        Objects.equals(this.identificacion, persona.identificacion) &&
        Objects.equals(this.direccion, persona.direccion) &&
        Objects.equals(this.telefono, persona.telefono) &&
        Objects.equals(this.id, persona.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, genero, edad, identificacion, direccion, telefono, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    edad: ").append(toIndentedString(edad)).append("\n");
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
