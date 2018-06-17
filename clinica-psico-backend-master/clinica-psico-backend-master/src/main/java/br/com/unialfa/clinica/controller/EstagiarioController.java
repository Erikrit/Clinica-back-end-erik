package br.com.unialfa.clinica.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unialfa.clinica.entity.Estagiario;
import br.com.unialfa.clinica.service.EstagiarioService;
import reactor.core.publisher.Mono;
@CrossOrigin(origins="http://localhost:4200", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")
public class EstagiarioController {

	@Autowired
	EstagiarioService estagiarioService;
	
	@RequestMapping(value="/estagiario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Estagiario> salvar(@RequestBody Estagiario estagiario) {
		System.out.println("oi" + estagiario.toString());
		estagiarioService.salvar(estagiario);
		return Mono.just(estagiario);
	}
	@RequestMapping(value="/estagiario", method = RequestMethod.GET)
	public Mono<List<Estagiario>> listarTodos() {
		return Mono.just(estagiarioService.listarTodos());
	}
	
	@RequestMapping(value="/estagiario/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Mono<Estagiario> excluir(@PathVariable("id") Long id) {
		Estagiario nota = estagiarioService.delete(id);
		return Mono.just(nota);
	}
	
}
