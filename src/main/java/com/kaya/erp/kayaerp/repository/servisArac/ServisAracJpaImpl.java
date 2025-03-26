package com.kaya.erp.kayaerp.repository.servisArac;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.ServisArac;
import com.kaya.erp.kayaerp.util.AppUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Repository

public class ServisAracJpaImpl implements ICustomServisArac {
	
	@PersistenceContext
	 private EntityManager entityManager;
	
//	@Override
//	public List <ServisArac> getServisAracByMARKA(String MARKA) {
//		String sql = "SELECT * FROM SERVISARAC b where b.MARKA =:MARKA";
//	try {
//		List <ServisArac> servisAracList = entityManager
//				.createNativeQuery(sql, ServisArac.class)
//				.setParameter("MARKA", MARKA)
//				.getResultList();
//		if(servisAracList == null) {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Marka Bulunamadı!");
//		}
//		return servisAracList;
//	} catch (NoResultException e) {
//		return null;
//	    }
//	}
	
	@Override
	public List <ServisArac> getServisAracByMARKA(String MARKA) {
		String sql = "SELECT * FROM SERVISARAC where MARKA =:MARKA";
	try {
		List <ServisArac> servisAracList  = entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("MARKA", MARKA)
				.getResultList();
		if(AppUtil.isListNullOrEmpty(servisAracList)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Marka Bulunamadı!");
		}
		return servisAracList ;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	@Override
	public List <ServisArac> getServisAracByMODEL(String MODEL) {
		String sql = "SELECT * FROM SERVISARAC where MODEL =:MODEL";
	try {
		List <ServisArac> servisAracList =entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("MODEL", MODEL)
				.getResultList();
		if(AppUtil.isListNullOrEmpty(servisAracList)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Model Bulunamadı!");
		}
		return servisAracList;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	@Override
	public List <ServisArac> getServisAracByPLAKA(String PLAKA) {
		String sql = "SELECT * FROM SERVISARAC where PLAKA =:PLAKA";
	try {
		List <ServisArac> servisAracList = entityManager
				.createNativeQuery(sql, ServisArac.class)
				.setParameter("PLAKA", PLAKA)
				.getResultList();
		if(AppUtil.isListNullOrEmpty(servisAracList)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Plaka Bulunamadı!");
		}
		return servisAracList;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
	
	//@Override
	//public ServisArac getServisAracBySASI(String SASI) {
//		String sql = "SELECT * FROM SERVISARAC  where SASI =:SASI";
//	try {
//	   List<ServisArac>	 servisArac = entityManager
//				.createNativeQuery(sql, ServisArac.class)
//				.setParameter("SASI", SASI)
//				.getResultList();
//		
//	   if(AppUtil.isListNullOrEmpty(servisArac)) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sasi Bulunamadı!");
//		}
//		return servisArac.get(0);
//	} catch (NoResultException e) {
//		return null;
//	    }
//	}
	 
	@Override
	public ServisArac getServisAracBySASI(String SASI) {
	    String sql = "SELECT * FROM SERVISARAC WHERE SASI = :SASI";
	    try {
	        // Tekil bir sonuç almak için getSingleResult kullanıyoruz
	        ServisArac servisArac = (ServisArac) entityManager
	                .createNativeQuery(sql, ServisArac.class)
	                .setParameter("SASI", SASI)
	                .getSingleResult();

	      
	        return servisArac;
	    } catch (NoResultException e) {
	    	
	    
	    	 throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sasi Bulunamadı!");
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
		if(AppUtil.isListNullOrEmpty(servisAracList)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Eklenme Tarihi Bulunamadı!");
		}
		return servisAracList ;
	} catch (NoResultException e) {
		return null;
	    }
	}
	
}