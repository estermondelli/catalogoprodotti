package it.randstad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.randstad.model.Prodotto;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
	
	
	
}
