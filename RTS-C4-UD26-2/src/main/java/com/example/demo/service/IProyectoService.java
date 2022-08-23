package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;



public interface IProyectoService {

	//Metodos del CRUD
		public List<Proyecto> listarProyectos(); //Listar All 
		
		public Proyecto guardarProyecto(Proyecto proyecto);	//Guarda un Proyecto CREATE
		
		public Proyecto proyectoXID(int id); //Leer datos de un Proyecto READ
		
		public Proyecto actualizarProyecto(Proyecto proyecto); //Actualiza datos del Proyecto UPDATE
		
		public void eliminarProyecto(int id);// Elimina el Proyecto DELETE
	

}


