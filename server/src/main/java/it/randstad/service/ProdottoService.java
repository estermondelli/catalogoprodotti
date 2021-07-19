package it.randstad.service;

import java.util.List;

import it.randstad.model.Prodotto;

public interface ProdottoService {
	
	/**
	 * Aggiunge un prodotto nel database.
	 * 
	 * @param prodotto Il prodotto da inserire.
	 * @return Lista di tutti i prodotti.
	 */
	List<Prodotto> aggiungi(Prodotto prodotto);
	
	/**
	 * Rimuove un prodotto dal database.
	 * 
	 * @param prodotto Il prodotto da rimuovere.
	 * @return Lista di tutti i prodotti.
	 */
	List<Prodotto> rimuovi(Prodotto prodotto);
	
	/**
	 * 
	 * @return Ritorna la lista di tutti i prodotti.
	 */
	List<Prodotto> mostraTutti();
	
	/**
	 * 
	 * @param prodotto Il prodotto e/o le caratteristiche di un prodotto da ricercare.
	 * @return Ritorna la lista di tutti i prodotti che corrispondono alla ricerca.
	 */
	List<Prodotto> cerca(Prodotto prodotto);
	
}
