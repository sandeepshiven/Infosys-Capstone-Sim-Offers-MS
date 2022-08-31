package com.infytel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.infytel.entity.SimOffers;

@Repository
public interface SimOffersRepository extends JpaRepository<SimOffers, Long> {
	
	public List<SimOffers> findBySimId(Long simId);
	
}
