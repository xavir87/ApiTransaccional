package io.swagger.respository.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorOptions;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dytype")
@DiscriminatorOptions(force = true)
@DiscriminatorValue("Cliente")
@OnDelete(action = OnDeleteAction.CASCADE)
@Table(name = "cliente")
public class Cliente extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cliente_id", unique = true)
	private UUID clienteid;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="estado")
	private boolean estado;

	public UUID getClienteid() {
		return clienteid;
	}

	public void setClienteid(UUID clienteid) {
		this.clienteid = clienteid;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
