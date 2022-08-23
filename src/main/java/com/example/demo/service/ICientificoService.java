package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientifico;

public interface ICientificoService {

	//Metodos del CRUD
		public List<Cientifico> listarCientificos(); //Listar All 
		
		public Cientifico guardarCientifico(Cientifico cientifico);	//Guarda un Cientifico CREATE
		
		public Cientifico cientificoXID(String id); //Leer datos de un Cientifico READ
		
		public Cientifico actualizarCientifico(Cientifico cientifico); //Actualiza datos del cientifico UPDATE
		
		public void eliminarCientifico(String id);// Elimina el cientifico DELETE
	
}


