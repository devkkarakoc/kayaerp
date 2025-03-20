package com.kaya.erp.kayaerp.entity.repository.stokKarti;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.entity.model.StokKarti;
import com.kaya.erp.kayaerp.entity.model.UserBayi;

@Repository
public interface StokKartiRepository extends JpaRepository<StokKarti, Integer>{

	 
	 @Query("SELECT b FROM StokKarti b where b.sadi = :sadi")
	 List <StokKarti> getStokKartiByStokKartiAdi(@Param("sadi") String sadi);
	
	 
	
	
	 
	
}
