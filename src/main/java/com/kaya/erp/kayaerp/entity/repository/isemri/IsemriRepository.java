package com.kaya.erp.kayaerp.entity.repository.isemri;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kaya.erp.kayaerp.entity.model.Isemri;



public interface IsemriRepository extends JpaRepository<Isemri, Long>, CustomIsemirleriRepository {

	
}
