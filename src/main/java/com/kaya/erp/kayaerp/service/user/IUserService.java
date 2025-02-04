package com.kaya.erp.kayaerp.service.user;

import com.kaya.erp.kayaerp.entity.model.User;


public interface IUserService {
	
	public User getUserById(int id);
	
	public User saveUser(User user);
	
	public Boolean checkUserById(int id);

	public User findByUsernameAndPassword(String unameString ,String pass);
	

}
