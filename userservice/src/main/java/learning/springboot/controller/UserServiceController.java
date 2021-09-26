package learning.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	private Logger log = LoggerFactory.getLogger(UserServiceController.class);
	
	@RequestMapping("/test")
	public ResponseEntity<String> test(){
		log.info("UserService - test endpoint called");
		return new ResponseEntity<String>("Hey there! I am from User Service", HttpStatus.OK);
	}

}
