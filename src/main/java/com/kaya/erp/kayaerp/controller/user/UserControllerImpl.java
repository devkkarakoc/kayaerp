package com.kaya.erp.kayaerp.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.erp.kayaerp.entity.model.User;
import com.kaya.erp.kayaerp.service.user.IUserService;

@RestController
@RequestMapping("/rest/api/user")
public class UserControllerImpl implements IUserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping(path = "/list/{id}")
	@Override
	public User getUserById(@PathVariable(name="id")int id) {
		// TODO Auto-generated method stub
		return userService.getUserById(id);
	}

	@GetMapping(path = "/find")
	@Override
	public User findByUsernameAndPassword(@RequestParam String uname,@RequestParam String pass) {
		// TODO Auto-generated method stub
		return userService.findByUsernameAndPassword(uname, pass);
	}

}
