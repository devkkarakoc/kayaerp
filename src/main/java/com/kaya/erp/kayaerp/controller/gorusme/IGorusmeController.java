package com.kaya.erp.kayaerp.controller.gorusme;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Gorusme;

public interface IGorusmeController  {

	
	public List<Gorusme> getAllGorusme();
	public Gorusme getGorusmeByIdGorusme(Integer id);
	//public Gorusme getGorusmeByGorusmeUsername(String gusername);

	
	
}
