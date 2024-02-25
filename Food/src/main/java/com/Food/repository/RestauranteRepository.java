package com.Food.repository;

import java.util.List;

import com.Food.Model.Restaurante;

public interface RestauranteRepository {
	

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);

}
