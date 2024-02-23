package com.Food.Domain.Model.Repository;

import java.util.List;

import com.Food.Domain.Model.Cidade;

public interface CidadeRepository {
	
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);


}
