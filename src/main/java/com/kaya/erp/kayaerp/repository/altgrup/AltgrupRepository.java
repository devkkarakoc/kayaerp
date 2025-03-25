package com.kaya.erp.kayaerp.repository.altgrup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.kaya.erp.kayaerp.entity.model.Altgrup;

import jakarta.transaction.Transactional;



public interface AltgrupRepository extends JpaRepository<Altgrup,Integer> {
	
	@Modifying 
	@Transactional 
	@Query("Select e from Altgrup e where e.altgrupDealer=:altgrupdealer")
	List<Altgrup> getAltgrupByAltgrupDealer(@Param("altgrupdealer")String altgrupdealer);
	
	@Query("Select o from Altgrup o where o.altgrupKodu=:altgrupkodu")
	List<Altgrup> getAltgrupByAltgrupKodu(@Param("altgrupkodu")String altgrupkodu);
	
	@Query ("Select n from Altgrup n where n.altgrupAdi=:altgrupAdi")
	List<Altgrup> getAltgrupByAltgrupAdi(@Param("altgrupAdi")String altgrupAdi);
	

	@Query ("Select p from Altgrup p where p.altgrupKodu=:altgrupKodu and p.anagrupId=:anagrupId  ")
	List<Altgrup> getAltgrupByAltgrupAnagrupId(@Param("altgrupKodu")String altgrupKodu,@Param("anagrupId")Integer anagrupId );
	
	
	@Query("SELECT m FROM Altgrup m WHERE m.anagrupId =:anagrupId")
	List<Altgrup> getAltgrupByAllAltgrupAnagrupId(@Param("anagrupId") Integer anagrup_id);
	
	
}

