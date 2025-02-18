package com.kaya.erp.kayaerp.service.role;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kaya.erp.kayaerp.entity.model.Role;
import com.kaya.erp.kayaerp.entity.repository.role.RoleRepository;

@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private RoleRepository roleService;
	
	@Override
	public List<Role> getAllRoles() {
		
		return roleService.findAll();
		
	}

	@Override
	public Role getRoleById(int id) {
		 Role role = new Role();
		Optional<Role> optionalRoleOptional = roleService.findById(id);
		if(optionalRoleOptional.isPresent()) {
			role = optionalRoleOptional.get();
			return role;
		}
		
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Role Bulunamadı: ID = " + id);
	}

	@Override
	public Role addRoleAndReturnEntity(Role role) {
		
		
		if(role==null) {
			throw new IllegalArgumentException("Kullanıcı Rolu Giriniz!");
			
		}
		
		Role addedrole = roleService.save(role);
		return addedrole;
		
		
		
		
	}

	
	
	
	
}
