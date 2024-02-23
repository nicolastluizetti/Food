package com.Food.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Food.Domain.Model.Restaurante;
import com.Food.Domain.Model.Repository.RestauranteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> listar() {
		return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
		
	}

	@Override
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class,id);
	}

	@Override
	@Transactional
	public Restaurante salvar(Restaurante restaurante) {
		manager.merge(restaurante);
		return restaurante;
		
	}

	public void remover(Restaurante restaurante) {
		manager.remove(restaurante);
		
	}

	@Override
	public void remover(Long Id) {
		Restaurante restaurante = manager.find(Restaurante.class, Id);
		if(restaurante != null) {
			remover(restaurante);
		}
		
	}


	

	
}
