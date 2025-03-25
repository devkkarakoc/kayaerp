package com.kaya.erp.kayaerp.repository.gorusmeAtama;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.GorusmeAtama;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;


@Repository
public class CustomGorusmeAtamaRepo implements ICustomGorusmeAtama {
	
	  @PersistenceContext
	    private EntityManager entityManager;

	@Override
	public GorusmeAtama getGorusmeAtamaByGid(Integer gid) {
		String sql = "SELECT * FROM Gorusme_Atama_Tb WHERE gid = :gid";
        try {
        	
        	GorusmeAtama gorusmeAtama =(GorusmeAtama) entityManager
                    .createNativeQuery(sql, GorusmeAtama.class)
                    .setParameter("gid", gid)
                    .getSingleResult();
        	
        	if(gorusmeAtama == null ) {
        		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Gorusme Bulunamadı");
        	}
        	
            return gorusmeAtama;
        } catch (NoResultException e) {
        	return null;
        }
	}

}
