package com.kaya.erp.kayaerp.controller.Role;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Role;

public interface IRoleController {

	public List<Role> getAllRoles();
	
	public Role getRoleById(int id);
}
