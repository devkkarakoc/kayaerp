package com.kaya.erp.kayaerp.entity.repository.isemri;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Isemri;

public interface CustomIsemirleriRepository {
	 public List<Isemri> getIsemriByOlusturan(String olusturan);
	 
}
