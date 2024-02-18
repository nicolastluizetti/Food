package com.Food.Domain.Model.Repository;

import java.util.List;

import com.Food.Domain.Model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);


}
