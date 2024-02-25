package com.Food.repository;

import java.util.List;

import com.Food.Model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Long id);
	
}
