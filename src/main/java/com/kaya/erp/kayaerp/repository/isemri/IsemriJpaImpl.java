package com.kaya.erp.kayaerp.repository.isemri;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Isemri;
import com.kaya.erp.kayaerp.util.AppUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class IsemriJpaImpl implements ICustomIsemirleri{

	

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Isemri> getIsemriByOlusturan(String olusturan) {
    	
        String sql = "SELECT * FROM KAYAERP.dbo.Isemri_Tb WHERE olusturan = :olusturan";
        Query query = entityManager.createNativeQuery(sql, Isemri.class);
        query.setParameter("olusturan", olusturan);
        return query.getResultList();
    }

	@Override
	public List<Isemri> getIsemriByTarih(Date bastar,Date bittar) {
		
		
		  String sql = "SELECT * FROM KAYAERP.dbo.Isemri_Tb WHERE TARIH >= :bastar and TARIH <=:bittar";
	        Query query = entityManager.createNativeQuery(sql, Isemri.class);
	        query.setParameter("bastar", bastar);
	        query.setParameter("bittar", bittar);
	        
	        List<Isemri> isemriDbIsemris = query.getResultList();
	        
	        if(AppUtil.isListNullOrEmpty(isemriDbIsemris)) {
	        	
	        	return isemriDbIsemris;
	        }else {
	        	throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bu tarih aralıgında Isemri Bulunamadı!");
	        	
	        }
	         
	}
    
	
	
	
	
	
	
}
