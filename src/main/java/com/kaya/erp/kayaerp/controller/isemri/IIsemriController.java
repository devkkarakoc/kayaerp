package com.kaya.erp.kayaerp.controller.isemri;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Isemri;

public interface IIsemriController {

	
	List<Isemri> getAllIsEmri();
	
	List<Isemri> getIsemriByOlusturan(String olusturan);
	
	Isemri addIsemri(Isemri isemri);
}
