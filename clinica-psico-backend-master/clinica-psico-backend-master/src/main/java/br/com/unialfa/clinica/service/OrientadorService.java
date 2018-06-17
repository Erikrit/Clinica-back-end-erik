package br.com.unialfa.clinica.service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.clinica.entity.Orientador;

public interface OrientadorService  {
	
	
	List<Orientador> listarTodos();
	
	void salvar(Orientador orientador);
	
	Orientador delete(Long id);
	
	Optional<Orientador> findById(Long id);
	

}
