package com.kaya.erp.kayaerp.service.stok;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.entity.model.Stok;
import com.kaya.erp.kayaerp.entity.repository.stok.StokRepository;

@Service
public class StokServiceImpl implements IStokService {

	@Autowired
	private StokRepository stokRepository;

	@Override
	public List<Stok> getAllStok() {

		return stokRepository.findAll();
	}

	@Override
	public Stok getStokByIdStok(Integer id) {

		if (id != null) {

			Optional<Stok> stokOptional = stokRepository.findById(id);

			if (stokOptional.isPresent()) {

				return stokOptional.get();
			}
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Stok Bulunamadı: ID = " + id);
		} else {

			throw new IllegalArgumentException("Stok Id Giriniz!");
		}

	}
	
	@Override
	public Stok getStokByStokName(String stok_name) {

		if (stok_name.isEmpty()) {
			throw new IllegalArgumentException("Stok Adi Giriniz!");

		}

		return stokRepository.getStokByStokName(stok_name);
	}

}
