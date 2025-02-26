package com.kaya.erp.kayaerp.entity.repository.gorusme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.kaya.erp.kayaerp.entity.model.Gorusme;


@Repository
public interface GorusmeRepository extends JpaRepository<Gorusme, Integer>{
	
	   
		 @Query("SELECT b FROM Gorusme b where b.gusername = :gusername")
		 public Gorusme getGorusmeByGorusmeUsername(@Param("gusername") String gusername);
		
		
	
}
