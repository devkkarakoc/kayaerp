package com.kaya.erp.kayaerp.service.bayi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.entity.repository.bayi.BayiRepository;

@Service
public class BayiServiceImpl implements IBayiService {

	@Autowired
	private BayiRepository bayiRepository;

	@Override
	public List<Bayi> getAllBayi() {

		return bayiRepository.findAll();
	}

	@Override
	public Bayi getBayiByIdBayi(Integer id) {

		if (id != null) {

			Optional<Bayi> bayiOptional = bayiRepository.findById(id);

			if (bayiOptional.isPresent()) {

				return bayiOptional.get();
			}
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bayi Bulunamadı: ID = " + id);
		} else {

			throw new IllegalArgumentException("Bayi Id Giriniz!");
		}

	}

	@Override
	public Bayi getBayiByBayiKodu(String bayi_kod) {

		if (bayi_kod.isEmpty()) {
			throw new IllegalArgumentException("Bayi Kodu Giriniz!");

		}

		return bayiRepository.getBayiByBayiKodu(bayi_kod);
	}

	@Override
	public Bayi saveBayi(Bayi newBayi) {

		if (newBayi == null) {
			throw new IllegalArgumentException("Bayi  Giriniz!");
		}

		return bayiRepository.save(newBayi);
	}

}
