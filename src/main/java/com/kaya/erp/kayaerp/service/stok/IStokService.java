package com.kaya.erp.kayaerp.service.stok;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.entity.model.Stok;



public interface IStokService {
	
	public List<Stok> getAllStok();
	public Stok getStokByIdStok(Integer id);
	public Stok getStokByStokName(String stok_name);
	
}


