package it.randstad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.randstad.model.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
	
	List<Prodotto> findByCodice(Long codice);
	
	List<Prodotto> findByDescrizioneContaining(String descrizione);
	
	List<Prodotto> findByCodiceOrDescrizioneContaining(Long codice, String descrizione);
	
}
