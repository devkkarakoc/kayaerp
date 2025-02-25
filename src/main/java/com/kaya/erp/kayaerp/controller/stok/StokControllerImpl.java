package com.kaya.erp.kayaerp.controller.stok;

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
import com.kaya.erp.kayaerp.entity.model.Stok;
import com.kaya.erp.kayaerp.service.stok.IStokService;


@RestController
@RequestMapping(value="/rest/api/stok", produces = "application/json;charset=UTF-8")
public class StokControllerImpl implements IStokController {

	@Autowired
	private IStokService stokService;
	
	@GetMapping("/getAllStok")
	public List<Stok> getAllStok() {
		
		return stokService.getAllStok();
	}
	
	@GetMapping("/getStokById/{id}")
	@Override
	public Stok getStokByIdStok(@PathVariable(name = "id") Integer id) {
		
		return stokService.getStokByIdStok(id);
	}

	@GetMapping("/getStokStokName")
	@Override
	public Stok getStokByStokName(@RequestParam String stok_name) {
		// TODO Auto-generated method stub
		return stokService.getStokByStokName(stok_name);
	}

	
}
