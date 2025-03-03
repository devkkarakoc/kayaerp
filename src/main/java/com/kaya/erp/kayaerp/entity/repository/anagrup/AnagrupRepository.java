package com.kaya.erp.kayaerp.entity.repository.anagrup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.kaya.erp.kayaerp.entity.model.Anagrup;

import jakarta.transaction.Transactional;



public interface AnagrupRepository extends JpaRepository<Anagrup,Integer> {
	@Modifying 
	@Transactional 
	@Query("Select d from Anagrup d where d.anagrupDealer=:anagrup_dealer")
	 List<Anagrup> getAnagrupByAnagrupDealer(@Param("anagrup_dealer")String anagrup_dealer);
	
	@Query("Select  k from Anagrup k where k.anagrupKod=:anagrup_kod")
	 Anagrup getAnagrupByAnagrupKod(@Param("anagrup_kod") String anagrup_kod);
	

	
}

