package com.kaya.erp.kayaerp.repository.gorusme;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Gorusme;
import com.kaya.erp.kayaerp.util.AppUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

public class GorusmeJpaImpl implements ICustomGorusme {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override 
	public List <Gorusme>  getGorusmeByGorusmeUsername (String gusername) {
		String sql = "Select * FROM Gorusme  WHERE  .gusername=:gusername";
		try {
			List <Gorusme> gorusmeList = entityManager
			.createNativeQuery(sql, Gorusme.class)
			.setParameter("gusername", gusername)
			.getResultList();
			
			if(AppUtil.isListNullOrEmpty(gorusmeList))  {
				 throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Gorusme kullanıcı adı Bulunamadı!");
			 }
			return gorusmeList;
		} catch (NoResultException e) {
			 return null;
	   }
    }
}
