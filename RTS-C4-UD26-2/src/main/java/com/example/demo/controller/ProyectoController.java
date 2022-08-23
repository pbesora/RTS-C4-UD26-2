package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Proyecto;
import com.example.demo.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarCcursos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyecto ProyectoXID(@PathVariable(name="id") int id) {
		
		Proyecto Proyecto_xid= new Proyecto();
		
		Proyecto_xid=proyectoServiceImpl.proyectoXID(id);
		
		System.out.println("Proyecto XID: "+Proyecto_xid);
		
		return Proyecto_xid;
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")int id,@RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();
		
		proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id);
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		
		proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(proyecto_seleccionado);
		
		System.out.println("El Proyecto actualizado es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyecto/{id}")
	public String eliminarProyecto(@PathVariable(name="id")int id) {
		try {
			proyectoServiceImpl.eliminarProyecto(id);
			return "Proyecto eliminado";
		} catch (Exception e) {
			return "La proyecto no se puede eliminar referencia a piezas_proyectos";
		}
	}
	
	
}
