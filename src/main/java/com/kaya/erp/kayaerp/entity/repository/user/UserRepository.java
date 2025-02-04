package com.kaya.erp.kayaerp.entity.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kaya.erp.kayaerp.entity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	 @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
	 User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
