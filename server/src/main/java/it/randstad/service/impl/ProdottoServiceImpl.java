package it.randstad.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.randstad.model.Prodotto;
import it.randstad.repository.ProdottoRepository;
import it.randstad.service.ProdottoService;

@Service
@Transactional
public class ProdottoServiceImpl implements ProdottoService {
	
	@Autowired
	private ProdottoRepository prodottoRepository;
	
	@Override
	public List<Prodotto> aggiungi(Prodotto prodotto) {
		if(prodotto != null) prodottoRepository.save(prodotto);
		return prodottoRepository.findAll();
	}

	@Override
	public List<Prodotto> rimuovi(Prodotto prodotto) {
		if(prodotto != null) prodottoRepository.delete(prodotto);
		return prodottoRepository.findAll();
	}

	@Override
	public List<Prodotto> mostraTutti() {
		return prodottoRepository.findAll();
	}

	@Override
	public List<Prodotto> cerca(Prodotto prodotto) {
		List<Prodotto> list = new ArrayList<Prodotto>();
		
		if(prodotto.getCodice() != null
				|| prodotto.getDescrizione() != null) {
			if((list = prodottoRepository.findByCodice(prodotto.getCodice())).isEmpty()) {
				list = prodottoRepository.findByDescrizioneContaining(prodotto.getDescrizione());
			}
		}
		
		return list;
	}
	
	
	
}
