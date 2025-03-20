package com.kaya.erp.kayaerp.service.isemri;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Isemri;

public interface IIsemriService {

	List<Isemri> getAllIsEmri();
	List<Isemri> getIsemriByOlusturan(String olusturan);
	
	Isemri addIsemri(Isemri isemri);
}
