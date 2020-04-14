package com.axera.jpademo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {

        Iterable<User> it = userRepository.findAll();
        List<User> users =  new ArrayList<>();
        for(User user : it){
        	users.add(user);
        }
        return users;
    }

    public Long count() {

        return userRepository.count();
    }

    public void deleteById(Long userId) {

        userRepository.deleteById(userId);
    }
    
    public void save(User user){
    	userRepository.save(user);
    }

}
