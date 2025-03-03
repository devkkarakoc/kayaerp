package com.kaya.erp.kayaerp.service.anagrup;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Anagrup;
import com.kaya.erp.kayaerp.entity.repository.anagrup.AnagrupRepository;


@Service
public class AnagrupServiceImpl implements IAnagrupService {

	@Autowired
	private AnagrupRepository anagrupRepository;

	@Override
	public List<Anagrup> getAllAnagrup() {

		return anagrupRepository.findAll();
	}

	@Override
	public Anagrup getAnagrupByIdAnagrup(Integer id) {

		if (id != null) {

			Optional<Anagrup> anagrupOptional = anagrupRepository.findById(id);

			if (anagrupOptional.isPresent()) {

				return anagrupOptional.get();
			}
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anagrup Bulunamadı: ID = " + id);
		} else {

			throw new IllegalArgumentException("Anagrup Id Giriniz!");
		}

	}
	
	@Override
	public List<Anagrup> getAnagrupByAnagrupDealer(String anagrup_dealer) {
	

		if (anagrup_dealer.isEmpty()) {
			throw new IllegalArgumentException("Anagrup Adi Giriniz!");

		}

		return anagrupRepository.getAnagrupByAnagrupDealer(anagrup_dealer);
	}
		

	
	@Override
	public Anagrup getAnagrupByAnagrupKod(String anagrup_kod) {

		if (anagrup_kod.isEmpty()) {
			throw new IllegalArgumentException("Anagrup Kodu Giriniz!");

		}

		return anagrupRepository.getAnagrupByAnagrupKod(anagrup_kod);
	}

}
	
