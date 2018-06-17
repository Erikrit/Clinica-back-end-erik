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

import br.com.unialfa.clinica.entity.Orientador;
import br.com.unialfa.clinica.entity.VincularEstagiario;
import br.com.unialfa.clinica.service.OrientadorService;
import br.com.unialfa.clinica.service.VincularService;
import reactor.core.publisher.Mono;
@CrossOrigin(origins="http://localhost:4200", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")

public class OrientadorController {

	@Autowired
	OrientadorService orientadorSerivice;
	
	@Autowired
	VincularService vincular;
	
	@RequestMapping(value="/orientador", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Orientador> salvar(@RequestBody Orientador orientador) {
		System.out.println("oi" + orientador.toString());
		orientadorSerivice.salvar(orientador);
		
		return Mono.just(orientador);
	}
	@RequestMapping(value="/orientador", method = RequestMethod.GET)
	public Mono<List<Orientador>> listarTodos() {
		return Mono.just(orientadorSerivice.listarTodos());
	}
	
	@RequestMapping(value="/orientador/vincular", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<VincularEstagiario> savlarVinculo(@RequestBody VincularEstagiario vincula){
		System.out.println("oi" + vincula.toString());
		vincular.salvarVinculo(vincula);
		
		return Mono.just(vincula);
			}
	
	@RequestMapping(value="/orientador/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Mono<Orientador> excluir(@PathVariable("id") Long id) {
		Orientador nota = orientadorSerivice.delete(id);
		return Mono.just(nota);
	}
	
	
	
}
