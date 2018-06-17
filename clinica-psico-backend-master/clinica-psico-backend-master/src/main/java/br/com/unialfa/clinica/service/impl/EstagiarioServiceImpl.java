package br.com.unialfa.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unialfa.clinica.entity.Estagiario;
import br.com.unialfa.clinica.entity.Orientador;
import br.com.unialfa.clinica.repository.EstagiarioRepository;
import br.com.unialfa.clinica.service.EstagiarioService;

@Service
public class EstagiarioServiceImpl implements EstagiarioService {

	@Autowired
	EstagiarioRepository repository;
	
	@Override
	public List<Estagiario> listarTodos() {
		List<Estagiario> estagiarios = (List<Estagiario>) repository.findAll(); 
		return estagiarios;
	}

	@Override
	public void salvar(Estagiario estagiario) {
		if(estagiario != null) {
			repository.save(estagiario);
		}
		
	}

	@Override
	public Estagiario delete(Long id) {
		Optional<Estagiario> orientadors = repository.findById(id);
		repository.deleteById(id);
		return orientadors.get();
		
	}

	@Override
	public Optional<Estagiario> findById(Long id) {
		if(id == null)
			return null;
		return repository.findById(id);
	}

	
}
