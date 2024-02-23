package com.Food.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Food.Domain.Model.Estado;
import com.Food.Domain.Model.Repository.EstadoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Estado> listar() {
		return manager.createQuery("from Estado", Estado.class)
				.getResultList();
	}
	
	@Override
	public Estado buscar(Long id) {
		return manager.find(Estado.class, id);
	}
	
	@Transactional
	@Override
	public Estado salvar(Estado estado) {
		return manager.merge(estado);
	}
	
	@Transactional
	public void remover(Estado estado) {
		estado = buscar(estado.getId());
		manager.remove(estado);
	}
	
	@Override
	public void remover(Long Id) {

	}

}
