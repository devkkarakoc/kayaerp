package com.kaya.erp.kayaerp.controller.gorusme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.erp.kayaerp.entity.model.Gorusme;
import com.kaya.erp.kayaerp.service.gorusme.IGorusmeService;


@RestController
@RequestMapping(value="/rest/api/gorusme", produces = "application/json;charset=UTF-8")
public class GorusmeControllerImpl implements IGorusmeController {

	@Autowired
	private IGorusmeService gorusmeService;
	
	@GetMapping("/getAllGorusme")
	public List<Gorusme> getAllGorusme() {
		
		return gorusmeService.getAllGorusme();
	}

	
	@GetMapping("/getGorusmeById/{id}")
	@Override
	public Gorusme getGorusmeByIdGorusme(@PathVariable(name = "id") Integer id) {
		
		return gorusmeService.getGorusmeByIdGorusme(id);
	}

//	@GetMapping("/getGorusmeByGorusmeUsername")
//	@Override
//	public Gorusme getGorusmeByGorusmeUsername(@RequestParam String gusername) {
//		// TODO Auto-generated method stub
//		return gorusmeService.getGorusmeByGorusmeUsername(gusername);
//	}


	
	
	
	
	
}