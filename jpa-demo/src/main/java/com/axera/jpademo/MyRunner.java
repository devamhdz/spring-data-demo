package com.axera.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
	private UserService entityRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("initializing users");

        User u1 = new User("Paul", "Smith", "paul.smith@gmail.com");
        entityRepository.save(u1);

        User u2 = new User("Robert", "Black", "rb34@gmail.com");
        entityRepository.save(u2);

        User u3 = new User("John", "Doe", "jdoe@gmail.com");
        entityRepository.save(u3);
		
        logger.info("users created");
	}

}
