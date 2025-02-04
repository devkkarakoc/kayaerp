package com.kaya.erp.kayaerp.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.erp.kayaerp.entity.model.User;
import com.kaya.erp.kayaerp.entity.repository.user.UserRepository;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	 @Override
	    public User getUserById(int id) {
          Optional<User> userOptional = userRepository.findById(id);
		 	if(!userOptional.isEmpty()) {
		 		
		 		User user = userOptional.get();
		 		
		 		return user;
		 	}
		 
	        return null;
	    }

	

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Boolean checkUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.existsById(id);
	}


	@Override
	public User findByUsernameAndPassword(String unameString, String pass) {
	    User user = userRepository.findByUsernameAndPassword(unameString, pass);

	    if (user == null) {
	        throw new RuntimeException("Kullanıcı bulunamadı!"); 
	    }

	    return user;
	}

	
	
	
	
	

}
