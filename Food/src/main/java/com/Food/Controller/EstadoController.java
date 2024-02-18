package com.Food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Food.Domain.Model.Estado;
import com.Food.Domain.Model.Repository.EstadoRepository;

@RestController
@RequestMapping("/Estados")
public class EstadoController {

	@Autowired
	private EstadoRepository EstadoRepository;
	
	@GetMapping
	public List<Estado> listar() {
		return EstadoRepository.listar();
	}
	
}
