package com.kaya.erp.kayaerp.entity.repository.bayi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.Bayi;

@Repository
public interface BayiRepository extends JpaRepository<Bayi, Integer>{
	//hql
	//tsql
	 @Query("SELECT b FROM Bayi b where b.bayiKodu = :bayi_kodu")
	 public Bayi getBayiByBayiKodu(@Param("bayi_kodu") String bayi_kodu);
	
	 
	 
	 
	
}
