package it.randstad.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.randstad.model.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
	
	Optional<Prodotto> findByCodice(long codice);
	
	List<Prodotto> findByDescrizioneContaining(String descrizione);
	
}
