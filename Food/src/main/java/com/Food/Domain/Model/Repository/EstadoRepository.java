package com.Food.Domain.Model.Repository;

import java.util.List;

import com.Food.Domain.Model.Estado;

public interface EstadoRepository {
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Long estadoId);


}
