package com.kaya.erp.kayaerp.repository.isemri;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kaya.erp.kayaerp.entity.model.Isemri;



public interface IIsemriJpa extends JpaRepository<Isemri, Long>, ICustomIsemirleri {

	
}
