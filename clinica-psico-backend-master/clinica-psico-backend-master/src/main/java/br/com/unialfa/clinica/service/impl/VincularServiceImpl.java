package br.com.unialfa.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unialfa.clinica.entity.VincularEstagiario;
import br.com.unialfa.clinica.repository.RepositorioVinculo;
import br.com.unialfa.clinica.service.VincularService;
@Service
public class VincularServiceImpl implements VincularService{
	@Autowired
	RepositorioVinculo vincular;
	
	
	@Override
	public void delete(Long id) {
		if(id ==null) 
			return;vincular.deleteById(id);
		
		
	}

	@Override
	public Optional<VincularEstagiario> findById(Long id) {
		if(id == null)
		return null;
		return vincular.findById(id);
	}

	@Override
	public void salvarVinculo(VincularEstagiario estagiarios) {
			if(estagiarios !=null) {
				vincular.save(estagiarios);
			}
		
	}

	@Override
	public List<VincularEstagiario> listaVinculo() {
		List<VincularEstagiario> vincula = (List<VincularEstagiario>) vincular.findAll();
		return vincula;
	}

}
