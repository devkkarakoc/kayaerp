package com.kaya.erp.kayaerp.repository.servisArac;

import com.kaya.erp.kayaerp.entity.model.ServisArac;

import java.util.Date;
import java.util.List;

public interface ICustomServisArac {
	
	public List <ServisArac> getServisAracByMARKA(String MARKA);
	
	public List <ServisArac> getServisAracByMODEL(String MODEL);
	
	public List <ServisArac> getServisAracByPLAKA(String PLAKA);
	
	public ServisArac getServisAracBySASI(String SASI);
	
	public List <ServisArac> getServisAracByEKLENMETARIHI(Date bastar,Date bittar);
	
}