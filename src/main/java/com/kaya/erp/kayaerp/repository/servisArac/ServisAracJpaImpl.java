package com.kaya.erp.kayaerp.repository.servisArac;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.ServisArac;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Repository

public class ServisAracJpaImpl implements ICustomServisArac {
	
	@PersistenceContext
	   private EntityManager entityManager;
	
	@Override
	public List <ServisArac> getServisAracByMARKA(String MARKA) {
		String sql = "SELECT * FROM SERVISARAC b where b.MARKA =:MARKA";
	try {
		List <ServisArac> servisAracList = entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("MARKA", MARKA)
				.getResultList();
		if(servisAracList == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Marka Bulunamadı!");
		}
		return servisAracList;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	@Override
	public List <ServisArac> getServisAracByMODEL(String MODEL) {
		String sql = "SELECT * FROM SERVISARAC b where b.MODEL =:MODEL";
	try {
		List <ServisArac> servisAracList =entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("MODEL", MODEL)
				.getResultList();
		if(servisAracList == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Model Bulunamadı!");
		}
		return servisAracList;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	@Override
	public List <ServisArac> getServisAracByPLAKA(String PLAKA) {
		String sql = "SELECT * FROM SERVISARAC b where b.PLAKA =:PLAKA";
	try {
		List <ServisArac> servisAracList = entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("PLAKA", PLAKA)
				.getResultList();
		if(servisAracList == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Plaka Bulunamadı!");
		}
		return servisAracList;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	
	@Override
	public ServisArac getServisAracBySASI(String SASI) {
		String sql = "SELECT b FROM ServisArac b where b.SASI =:SASI";
	try {
		ServisArac servisArac =(ServisArac) entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("SASI", SASI)
				.getSingleResult();
		if(servisArac == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Sasi Bulunamadı!");
		}
		return servisArac;
	} catch (NoResultException e) {
		return null;
	    }
	}
	 
	@Override
	public List <ServisArac> getServisAracByEKLENMETARIHI(Date bastar,Date bittar) {
		String sql = "SELECT * FROM SERVISARAC b WHERE b.EKLENMETARIHI BETWEEN :bastar AND :bittar";
	try {
		List <ServisArac> servisAracList  = entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("bastar", bastar)
				.setParameter("bittar", bittar)
				.getResultList();
		if(servisAracList  == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Model Bulunamadı!");
		}
		return servisAracList ;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
}