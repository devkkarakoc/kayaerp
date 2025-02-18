package com.kaya.erp.kayaerp.service.bayi;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Bayi;

public interface IBayiService {
	
	public List<Bayi> getAllBayi();
	public Bayi getBayiByIdBayi(Integer id);
	public Bayi getBayiByBayiKodu(String bayi_kod);
	public Bayi saveBayi(Bayi newBayi);
	
}
