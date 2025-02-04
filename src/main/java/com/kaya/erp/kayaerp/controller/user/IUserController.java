package com.kaya.erp.kayaerp.controller.user;

import com.kaya.erp.kayaerp.entity.model.User;

public interface IUserController {
	
	public User getUserById(int id);

	public User findByUsernameAndPassword(String uname,String pass);
	
}
