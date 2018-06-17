package br.com.unialfa.clinica.service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.clinica.entity.Estagiario;


public interface EstagiarioService {
	
	List<Estagiario> listarTodos();
	void salvar(Estagiario estagiarios);
	
	
	Estagiario  delete(Long id);
	
	Optional<Estagiario> findById(Long id);
	

	
	
}
