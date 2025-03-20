package com.kaya.erp.kayaerp.service.servisarac;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.ServisArac;



public interface IServisAracService {
	
	
	public List <ServisArac> getAllServisArac();
    public ServisArac getServisAracByIdServisArac(Long ARACID);
    public List<ServisArac> getServisAracByServisAracMarka(String MARKA);
    public List<ServisArac> getServisAracByServisAracModel(String MODEL);
    public List<ServisArac> getServisAracByServisAracPlaka(String PLAKA);
    public ServisArac getServisAracByServisAracSasi(String SASI);
    public List <ServisArac> getServisAracByServisAracEklenmeTarihi(String bastar ,String bittar);
    public ServisArac addServisArac(ServisArac servisArac);
    public List <ServisArac> addServisAracList (List <ServisArac> servisAracList);
    public void deleteServisArac(Long ARACID);
}