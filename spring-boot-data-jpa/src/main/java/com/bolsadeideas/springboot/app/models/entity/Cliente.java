package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)//hacemos que sea autoincrementable
	private long id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
	@NotEmpty
	@Email
	private String email;
	@NotNull
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Date createAt;
	
	
	
	/**
	 * Llama justo antes de almacenar en la DB.
	 * Fecha
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	**/
	
	
	/*
	 * Getters y Setters
	 * */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	


}
