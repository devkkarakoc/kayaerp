package com.kaya.erp.kayaerp.service.gorusme;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Gorusme;
import com.kaya.erp.kayaerp.entity.repository.gorusme.GorusmeRepository;

@Service
public class GorusmeServiceImpl implements IGorusmeService {

	@Autowired
	private GorusmeRepository gorusmeRepository;

	@Override
	public List<Gorusme> getAllGorusme() {

		return gorusmeRepository.findAll();
	}

	@Override
	public Gorusme getGorusmeByIdGorusme(Integer id) {

		if (id != null) {

			Optional<Gorusme> gorusmeOptional = gorusmeRepository.findById(id);

			if (gorusmeOptional.isPresent()) {

				return gorusmeOptional.get();
			}
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Gorusme Bulunamadı: ID = " + id);
		} else {

			throw new IllegalArgumentException("Gorusme Id Giriniz!");
		}
		
		
	}

	@Override
	public List<Gorusme> getGorusmeByGorusmeUsername(String gusername) {
		
		return gorusmeRepository.getGorusmeByGorusmeUsername(gusername);
	}


	
		
	



}