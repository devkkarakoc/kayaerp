package com.kaya.erp.kayaerp.repository.gorusme;

import com.kaya.erp.kayaerp.entity.model.Gorusme;
import java.util.List;


public interface ICustomGorusme {
	
	public List <Gorusme> getGorusmeByGorusmeUsername( String gusername);
	
	
}