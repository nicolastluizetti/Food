package com.Food.Domain.Model.Repository;

import java.util.List;

import com.Food.Domain.Model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Long Id);


}
