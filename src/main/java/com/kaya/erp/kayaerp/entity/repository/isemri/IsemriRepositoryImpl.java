package com.kaya.erp.kayaerp.entity.repository.isemri;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.Isemri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class IsemriRepositoryImpl implements CustomIsemirleriRepository{

	

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Isemri> getIsemriByOlusturan(String olusturan) {
        String sql = "SELECT * FROM KAYAERP.dbo.Isemri_Tb WHERE olusturan = :olusturan";
        Query query = entityManager.createNativeQuery(sql, Isemri.class);
        query.setParameter("olusturan", olusturan);
        return query.getResultList();
    }
    
    
	
	
	
	
	
	
}
