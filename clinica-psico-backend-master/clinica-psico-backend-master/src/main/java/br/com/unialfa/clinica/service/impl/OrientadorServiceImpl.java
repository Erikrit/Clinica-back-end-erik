package br.com.unialfa.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unialfa.clinica.entity.Orientador;
import br.com.unialfa.clinica.repository.OrientadorRepository;
import br.com.unialfa.clinica.service.OrientadorService;
@Service
public class OrientadorServiceImpl implements OrientadorService {

	
	
	@Autowired
	OrientadorRepository orientador;
	
	
	@Override
	public List<Orientador> listarTodos() {
		List<Orientador> orientadorL =( List<Orientador>) orientador.findAll();
		return orientadorL;
	}

	@Override
	public void salvar(Orientador orientadorS) {
		if(orientadorS != null) {
			orientador.save(orientadorS);
		}
		
	}

	@Override
	public Orientador delete(Long id) {
		Optional<Orientador> orientadors = orientador.findById(id);
		orientador.deleteById(id);
		return orientadors.get();
		
	}

	@Override
	public Optional<Orientador> findById(Long id) {
		if(id == null)
		return null;
		return orientador.findById(id);
	}

	
}
