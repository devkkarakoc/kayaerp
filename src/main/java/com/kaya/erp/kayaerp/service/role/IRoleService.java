package com.kaya.erp.kayaerp.service.role;

import java.util.List;

import com.kaya.erp.kayaerp.entity.model.Role;

public interface IRoleService {

	public List<Role> getAllRoles();
	
	public Role getRoleById(int id);
	
	public Role addRoleAndReturnEntity(Role role);
	
}
