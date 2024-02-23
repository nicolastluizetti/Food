package com.Food.Domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.Food.Domain.Exception.EntidadeEmUsoException;
import com.Food.Domain.Exception.EntidadeNaoEncontradaException;
import com.Food.Domain.Model.Restaurante;
import com.Food.Domain.Model.Repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		return restauranteRepository.salvar(restaurante);
	}
	
	public void excluir(Long restauranteId) {
		try {
			restauranteRepository.remover(restauranteId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
				String.format("Não existe um cadastro de restaurante com código %d", restauranteId));
		
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
				String.format("Restaurante de código %d não pode ser removida, pois está em uso", restauranteId));
		}
	}

}
