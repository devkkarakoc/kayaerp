package com.kaya.erp.kayaerp.controller.stok;

import java.util.List;


import com.kaya.erp.kayaerp.entity.model.Stok;

public interface IStokController {

	
	public List<Stok> getAllStok();
	public Stok getStokByIdStok(Integer id);
	public Stok getStokByStokName(String stok_name);
	

}
