package com.kaya.erp.kayaerp.controller.servisarac;

//import java.security.Timestamp;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import org.springframework.stereotype.Controller;


import com.kaya.erp.kayaerp.entity.model.ServisArac;
import com.kaya.erp.kayaerp.service.servisarac.IServisAracService;

@RestController
@RequestMapping(value="/rest/api/servisarac", produces = "application/json;charset=UTF-8")
public class ServisAracControllerImpl implements IServisAracController {
	@Autowired
	private IServisAracService servisaracService;
	
	@GetMapping("/getAllServisArac")
	public List<ServisArac> getAllServisArac() {
		
		return servisaracService.getAllServisArac();
	}

	
	@GetMapping("/getServisAracById/{ARACID}")
	@Override
	public ServisArac getServisAracByIdServisArac(@PathVariable(name = "ARACID") Long ARACID) {
		
		return servisaracService.getServisAracByIdServisArac(ARACID);
	} 
	
	@GetMapping("/getServisAracByServisAracMarka")
	@Override
	public List<ServisArac> getServisAracByServisAracMarka(String MARKA) {
		
		return servisaracService.getServisAracByServisAracMarka(MARKA);
	}

	@GetMapping("/getServisAracByServisAracModel")
	@Override
	public List<ServisArac> getServisAracByServisAracModel(String MODEL) {
		
		return servisaracService.getServisAracByServisAracModel(MODEL);
	}

	@GetMapping("/getServisAracByServisAracPlaka")
	@Override
	public List<ServisArac> getServisAracByServisAracPlaka(String PLAKA) {
		
		return servisaracService.getServisAracByServisAracPlaka(PLAKA);
	}

	@GetMapping("/getServisAracByServisAracSasi")
	@Override
	public ServisArac getServisAracByServisAracSasi(String SASI) {
	
		return servisaracService.getServisAracByServisAracSasi(SASI);
	}

	//@GetMapping("/getServisAracByServisAracEklenmeTarihi")
	//@Override
	//public List<ServisArac> getServisAracByServisAracEklenmeTarihi(Date bastar ,Date bittar) {
	//	return servisaracService.getServisAracByServisAracEklenmeTarihi(bastar,bittar);
	//}


    @GetMapping("/getServisAracByServisAracEklenmeTarihi")
    @Override
    public List<ServisArac> getServisAracByServisAracEklenmeTarihi(
        @RequestParam("bastar") String bastar, 
        @RequestParam("bittar") String bittar) {
        
        // Tarih formatını düzgün bir şekilde dönüştürmeliyiz
        Date bastarDate = parseDate(bastar);
        Date bittarDate = parseDate(bittar);

        return servisaracService.getServisAracByServisAracEklenmeTarihi(bastarDate, bittarDate);
    }

    // String'i Date'e dönüştüren yardımcı metot
    private Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(dateStr);
        } catch (ParseException e) {
            // Hata durumunda null döndürüyoruz, ama burada bir hata mesajı verebilirsiniz
            return null;
        }
    }
    
    @PostMapping("/addServisArac")
    public ServisArac addServisArac(@RequestBody ServisArac servisArac) {
        return servisaracService.addServisArac(servisArac);
    }
    
 

	
}