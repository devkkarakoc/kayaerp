package com.kaya.erp.kayaerp.repository.gorusme;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.Gorusme;

import jakarta.transaction.Transactional;



@Repository
public interface GorusmeRepository extends JpaRepository<Gorusme, Integer> {

    
	 @Modifying
	 @Transactional 
	 @Query("Select g FROM Gorusme g WHERE  g.gusername=:gusername")
	 List<Gorusme> getGorusmeByGorusmeUsername(@Param("gusername") String gusername);
	
}


