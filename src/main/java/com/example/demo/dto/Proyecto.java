package com.example.demo.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="proyecto")//en caso que la tabala sea diferente
public class Proyecto {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name="horas")
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<AsignadoA> asignadoA;
	
	
	//Constructors
	
	public Proyecto() {
	
	}


	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 */
	public Proyecto(int id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	
	//GETTERS and SETTERS

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}


	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}


	/**
	 * @return the asignadoA
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "PiezasProveedores")
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
}
