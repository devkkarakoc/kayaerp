package com.kaya.erp.kayaerp.service.altgrup;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Altgrup;
import com.kaya.erp.kayaerp.entity.repository.altgrup.AltgrupRepository;


@Service
public class AltgrupServiceImpl implements IAltgrupService {

	@Autowired
	private AltgrupRepository altgrupRepository;

	@Override
	public List<Altgrup> getAllAltgrup() {

		return altgrupRepository.findAll();
	}

	@Override
	public Altgrup getAltgrupByIdAltgrup(Integer id) {

		if (id != null) {

			Optional<Altgrup> altgrupOptional = altgrupRepository.findById(id);

			if (altgrupOptional.isPresent()) {

				return altgrupOptional.get();
			}
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Altgrup Bulunamadı: ID = " + id);
		} else {

			throw new IllegalArgumentException("Altgrup Id Giriniz!");
		}

	}

	@Override
	public List<Altgrup>getAltgrupByAltgrupAdi(String altgrupAdi) {
		
		return altgrupRepository.getAltgrupByAltgrupAdi(altgrupAdi);
	}

	
	
	@Override
	public List<Altgrup> getAltgrupByAltgrupDealer(String altgrup_dealer) {
		if (altgrup_dealer.isEmpty()) {
			throw new IllegalArgumentException("Altgrup Dealer Giriniz!");

		}

		return altgrupRepository.getAltgrupByAltgrupDealer(altgrup_dealer);
	}
	
	@Override
	public List<Altgrup> getAltgrupByAltgrupKodu(String altgrup_kodu) {
		
		if (altgrup_kodu.isEmpty()) {
			throw new IllegalArgumentException("Altgrup Dealer Giriniz!");

		}

		return altgrupRepository.getAltgrupByAltgrupKodu(altgrup_kodu);
	}


	@Override
	public List<Altgrup> getAltgrupByAllAltgrupAnagrupId(Integer anagrup_id) {
		return altgrupRepository.getAltgrupByAllAltgrupAnagrupId(anagrup_id);
	}

	@Override
	public List<Altgrup> getAltgrupByAltgrupAnagrupId(String altgrup_kodu ,Integer anagrup_id ) {
		return altgrupRepository.getAltgrupByAltgrupAnagrupId(altgrup_kodu, anagrup_id);
	}

	

	

	
	
}