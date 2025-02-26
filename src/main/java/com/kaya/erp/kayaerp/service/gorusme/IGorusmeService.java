package com.kaya.erp.kayaerp.service.gorusme;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Gorusme;

public interface IGorusmeService {
	
	public List<Gorusme> getAllGorusme();
	public Gorusme getGorusmeByIdGorusme(Integer id);
	public Gorusme getGorusmeByGorusmeUsername(String gusername);
	
}
