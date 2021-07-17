package it.randstad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.randstad.model.Prodotto;
import it.randstad.service.ProdottoService;

@CrossOrigin("*")
@RestController
public class ProdottoController {
	
	@Autowired
	private ProdottoService prodottoService;
	
	@RequestMapping("/aggiungi")
	@ResponseBody
	public List<Prodotto> aggiungi(@RequestBody Prodotto prodotto) {
		return prodottoService.aggiungi(prodotto);
	}
	
	@RequestMapping("/rimuovi")
	@ResponseBody
	public List<Prodotto> rimuovi(@RequestBody Prodotto prodotto) {
		return prodottoService.rimuovi(prodotto);
	}
	
	@RequestMapping("/mostra")
	@ResponseBody
	public List<Prodotto> mostra() {
		return prodottoService.mostra();
	}
	
}
