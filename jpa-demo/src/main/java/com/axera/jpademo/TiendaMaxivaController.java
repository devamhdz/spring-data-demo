package com.axera.jpademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiendaMaxivaController {
	
	@Autowired
	private TiendaMaxivaService service;
	
	@PostMapping("/tiendas")
	public void save(@RequestBody TiendaMaxiva tienda){
		service.save(tienda);
	}
	
	@GetMapping("/tiendas")
	public List<TiendaMaxiva> findAll(){
		return service.findAll();
	}

}
