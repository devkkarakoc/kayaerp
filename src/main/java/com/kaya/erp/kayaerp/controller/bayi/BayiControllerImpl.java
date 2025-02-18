package com.kaya.erp.kayaerp.controller.bayi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.erp.kayaerp.entity.model.Bayi;
import com.kaya.erp.kayaerp.service.bayi.IBayiService;


@RestController
@RequestMapping(value="/rest/api/bayi", produces = "application/json;charset=UTF-8")
public class BayiControllerImpl implements IBayiController {

	@Autowired
	private IBayiService bayiService;
	
	@GetMapping("/getAllBayi")
	public List<Bayi> getAllBayi() {
		
		return bayiService.getAllBayi();
	}

	
	@GetMapping("/getBayiById/{id}")
	@Override
	public Bayi getBayiByIdBayi(@PathVariable(name = "id") Integer id) {
		
		return bayiService.getBayiByIdBayi(id);
	}

	@GetMapping("/getBayiBayiKod")
	@Override
	public Bayi getBayiByBayiKodu(@RequestParam String bayi_kod) {
		// TODO Auto-generated method stub
		return bayiService.getBayiByBayiKodu(bayi_kod);
	}

	
	@PostMapping("/saveBayi")
	@Override
	public Bayi saveBayi(@RequestBody Bayi newBayi) {
		
		return bayiService.saveBayi(newBayi);
	}

	
	
}
