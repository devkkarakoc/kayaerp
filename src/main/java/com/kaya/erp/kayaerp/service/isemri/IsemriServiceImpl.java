package com.kaya.erp.kayaerp.service.isemri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.erp.kayaerp.entity.model.Isemri;
import com.kaya.erp.kayaerp.repository.isemri.IIsemriJpa;

@Service
public class IsemriServiceImpl implements IIsemriService {

	@Autowired
	IIsemriJpa isemriRepository;

	@Override
	public List<Isemri> getAllIsEmri() {

		return isemriRepository.findAll();
	}

	@Override
	public List<Isemri> getIsemriByOlusturan(String olusturan) {

		return isemriRepository.getIsemriByOlusturan(olusturan);
	}

	@Override
	public Isemri addIsemri(Isemri isemri) {
		// TODO Auto-generated method stub
		return isemriRepository.save(isemri);
	}

}
