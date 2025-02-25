package com.kaya.erp.kayaerp.entity.repository.stok;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.entity.model.Stok;

@Repository
public interface StokRepository extends JpaRepository<Stok, Integer>{

	 
	 @Query("SELECT b FROM Stok b where b.stokName = :stok_name")
	 public Stok getStokByStokName(@Param("stok_name") String stok_name);
	
	 
	 
	 
	
}
