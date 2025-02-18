package com.kaya.erp.kayaerp.entity.repository.userBayi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kaya.erp.kayaerp.entity.model.UserBayi;

public interface UserBayiRepository extends JpaRepository<UserBayi, Integer> {

	@Query("SELECT u FROM UserBayi u where u.bayi_id = :bayi_id")
	 List<UserBayi> getUserBayiByBayiId(@Param("bayi_id") int bayi_id);
	
	
}
