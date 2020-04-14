package com.axera.jpademo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaMaxivaService {
	
	@Autowired
	private TiendaMaxivaRepository tiendaMaxivaRepository;
	
	public void save(TiendaMaxiva tiendaMaxiva){
		tiendaMaxivaRepository.save(tiendaMaxiva);
	}
	
	public List<TiendaMaxiva> findAll(){
		Iterable<TiendaMaxiva> it = tiendaMaxivaRepository.findAll();
		List<TiendaMaxiva> tiendas = new ArrayList<TiendaMaxiva>();
		for(TiendaMaxiva tienda : it){
			tiendas.add(tienda);
		}
		return tiendas;
	}

}
