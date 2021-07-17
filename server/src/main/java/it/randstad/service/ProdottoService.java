package it.randstad.service;

import java.util.List;

import it.randstad.model.Prodotto;

public interface ProdottoService {
	
	List<Prodotto> aggiungi(Prodotto prodotto);
	
	List<Prodotto> rimuovi(Prodotto prodotto);
	
	List<Prodotto> mostraTutti();
	
	List<Prodotto> cerca(Prodotto prodotto);
	
}
