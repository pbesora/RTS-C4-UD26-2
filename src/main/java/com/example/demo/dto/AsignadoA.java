package com.example.demo.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class AsignadoA {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cientifico")
    Cientifico cientifico;
 
    @ManyToOne
    @JoinColumn(name = "proyecto")
    Proyecto proyecto;
	
	
	//Constructors
	
	public AsignadoA() {
	
	}


	/**
	 * @param id
	 * @param cientifico
	 * @param proyecto
	 */
	public AsignadoA(int id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
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
	 * @return the cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}


	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}


	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}


	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}


	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

	
	
	
	
}












	

