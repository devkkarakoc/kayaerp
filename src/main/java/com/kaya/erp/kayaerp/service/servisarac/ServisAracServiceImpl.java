package com.kaya.erp.kayaerp.service.servisarac;

//import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import com.kaya.erp.kayaerp.entity.model.ServisArac;
import com.kaya.erp.kayaerp.entity.repository.servisArac.ServisAracRepository;

@Service
public class ServisAracServiceImpl implements IServisAracService {

	@Autowired
	private ServisAracRepository ServisAracRepository;

	@Override
	public List<ServisArac> getAllServisArac() {

		return ServisAracRepository.findAll();
	}

	@Override
	public ServisArac getServisAracByIdServisArac(Long ARACID) {
		if (ARACID != null) {

			Optional<ServisArac> servisaracOptional = ServisAracRepository.findById(ARACID);
			
				if (servisaracOptional.isPresent()) {

				return servisaracOptional.get();
			}
					throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Servis Arac Bulunamadı: ID = " + ARACID);
	} else {
				
				throw new IllegalArgumentException("Stok Id Giriniz!");
			}

	   }
	
	@Override
	public List <ServisArac> getServisAracByServisAracMarka(String MARKA) {
		if (MARKA.isEmpty()) {
		throw new IllegalArgumentException("Marka Adi Giriniz!");
			
				}
	
	return ServisAracRepository.getServisAracByServisAracMarka(MARKA);
	}

	@Override
	public List<ServisArac> getServisAracByServisAracModel(String MODEL) {
		if (MODEL.isEmpty()) {
			throw new IllegalArgumentException("Model Adi Giriniz!");
				
					}
		
		return ServisAracRepository.getServisAracByServisAracModel(MODEL);
	}

	@Override
	public List<ServisArac> getServisAracByServisAracPlaka(String PLAKA) {
		if (PLAKA.isEmpty()) {
			throw new IllegalArgumentException("Plaka Adi Giriniz!");
				
					}
		
		return ServisAracRepository.getServisAracByServisAracPlaka(PLAKA);
	}

	@Override
	public ServisArac getServisAracByServisAracSasi(String SASI) {
		if (SASI.isEmpty()) {
			throw new IllegalArgumentException("Sasi Adi Giriniz!");
				
					}
		
		return ServisAracRepository.getServisAracByServisAracSasi(SASI);
	}

	//@Override
	//public List<ServisArac> getServisAracByServisAracEklenmeTarihi(Date bastar,Date bittar) {
		
//		Timestamp bastarTimespamp = new java.sql.Timestamp(bastar.getTime());
//		Timestamp bittarTimespamp = new java.sql.Timestamp(bittar.getTime());
//		
		
		//return ServisAracRepository.getServisAracByServisAracEklenmeTarihi(bastar, bittar);
	//}
	
	@Override
	public List<ServisArac> getServisAracByServisAracEklenmeTarihi(Date bastar, Date bittar) {
	    return ServisAracRepository.getServisAracByServisAracEklenmeTarihi(bastar, bittar);
	}

	
	@Override
    public ServisArac addServisArac(ServisArac servisArac) {
        if (servisArac.getMARKA() == null || servisArac.getMARKA().isEmpty()) {
            throw new IllegalArgumentException("Marka Adı Giriniz!");
        }
        if (servisArac.getMODEL() == null || servisArac.getMODEL().isEmpty()) {
            throw new IllegalArgumentException("Model Adı Giriniz!");
        }
        return ServisAracRepository.save(servisArac); // Veriyi kaydediyoruz
    }
	
}