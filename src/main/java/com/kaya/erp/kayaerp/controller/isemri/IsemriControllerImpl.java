package com.kaya.erp.kayaerp.controller.isemri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.erp.kayaerp.entity.model.Isemri;
import com.kaya.erp.kayaerp.service.isemri.IIsemriService;


@RestController
@RequestMapping(value="/rest/api/isemri", produces = "application/json;charset=UTF-8")
public class IsemriControllerImpl implements IIsemriController {

	@Autowired
	IIsemriService isemriService;
	
	
	@GetMapping("/getAllIsemri")
	@Override
	public List<Isemri> getAllIsEmri() {
		return isemriService.getAllIsEmri();
	}


	@Override
	@GetMapping("/getIsemriByOlusturan")
	public List<Isemri> getIsemriByOlusturan(String olusturan) {
		// TODO Auto-generated method stub
		return isemriService.getIsemriByOlusturan(olusturan);
	}


	@Override
	@PostMapping("/addAndUpdateIsemri")
	public Isemri addIsemri(@RequestBody Isemri isemri) {
		return isemriService.addIsemri(isemri);
	}
	
	

}
