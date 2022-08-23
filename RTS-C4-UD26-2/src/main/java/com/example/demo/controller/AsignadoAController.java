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

import com.example.demo.dto.AsignadoA;
import com.example.demo.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignadoA")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignadoA")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignadoA) {
		
		return asignadoAServiceImpl.guardarAsignadoA(asignadoA);
	}
	
	
	@GetMapping("/asignadoA/{id}")
	public AsignadoA AsignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA AsignadoA_xid= new AsignadoA();
		
		AsignadoA_xid=asignadoAServiceImpl.asignadoAXID(id);
		
		System.out.println("AsignadoA XID: "+AsignadoA_xid);
		
		return AsignadoA_xid;
	}
	
	@PutMapping("/asignadoA/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA AsignadoA) {
		
		AsignadoA AsignadoA_seleccionado= new AsignadoA();
		AsignadoA AsignadoA_actualizado= new AsignadoA();
		
		AsignadoA_seleccionado= asignadoAServiceImpl.asignadoAXID(id);
		
		
		AsignadoA_seleccionado.setCientifico(AsignadoA.getCientifico());
		AsignadoA_seleccionado.setProyecto(AsignadoA.getProyecto());
		
		AsignadoA_actualizado = asignadoAServiceImpl.actualizarAsignadoA(AsignadoA_seleccionado);
		
		System.out.println("El AsignadoA actualizado es: "+ AsignadoA_actualizado);
		
		return AsignadoA_actualizado;
	}
	
	@DeleteMapping("/asignadoA/{id}")
	public void eleiminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
	
}
