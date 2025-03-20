package com.kaya.erp.kayaerp.entity.repository.servisArac;

//import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




import com.kaya.erp.kayaerp.entity.model.ServisArac;

@Repository
public interface ServisAracRepository extends JpaRepository<ServisArac, Long>{

	 
	 @Query("SELECT b FROM ServisArac b where b.MARKA =:MARKA")
	 List <ServisArac> getServisAracByServisAracMarka(@Param("MARKA") String MARKA);
	
	 @Query("SELECT b FROM ServisArac b where b.MODEL =:MODEL")
	 List <ServisArac> getServisAracByServisAracModel(@Param("MODEL") String MODEL);
	
	 @Query("SELECT b FROM ServisArac b where b.PLAKA =:PLAKA")
	 List<ServisArac> getServisAracByServisAracPlaka(@Param("PLAKA") String PLAKA);
	

	 @Query("SELECT b FROM ServisArac b where b.SASI =:SASI")
	 public ServisArac getServisAracByServisAracSasi(@Param("SASI") String SASI);
	 
	
	// @Query("SELECT b FROM ServisArac b WHERE b.EKLENMETARIHI BETWEEN :bastar AND :bittar")
	// List<ServisArac> getServisAracByServisAracEklenmeTarihi(@Param("bastar")Date bastar,@Param("bittar")Date bittar );
	 
	 @Query("SELECT b FROM ServisArac b WHERE b.EKLENMETARIHI BETWEEN :bastar AND :bittar") 
	 List<ServisArac> getServisAracByServisAracEklenmeTarihi(@Param("bastar") Date bastar, @Param("bittar") Date bittar);
	 

}

//@Query("SELECT b FROM SERVISARAC b where b.EKLENMETARIHI = :EKLENMETARIHI and b.EKLENMETARIHI=:EKLENMETARIHI ")
//@Query("SELECT b FROM SERVISARAC b WHERE b.EKLENMETARIHI BETWEEN :startDate AND :endDate")
//List<SERVISARAC> findByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

  

