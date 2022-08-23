package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientifico")
public class Cientifico {

	//Attributes
	@Id
	private String id;
	@Column(name = "nom_apels")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<AsignadoA> asignadoA;
	
	//Constructors
	
	public Cientifico() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Cientifico(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	
	//GETTERS and SETTERS
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asignadoA
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	/**
	 * @param asignadoA the asignadoA to set
	 */
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	
	
	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", nombre=" + nombre + "]";
	}

}
