package br.com.unialfa.clinica.service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.clinica.entity.VincularEstagiario;

public interface VincularService {
	
	void  delete(Long id);
	
	Optional<VincularEstagiario> findById(Long id);
	

	void salvarVinculo(VincularEstagiario estagiario);
	List<VincularEstagiario> listaVinculo();
}
