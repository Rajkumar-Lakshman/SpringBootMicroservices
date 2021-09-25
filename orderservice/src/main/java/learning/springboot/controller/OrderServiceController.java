package learning.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderServiceController {
	
	@RequestMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("Hey there! I am from Order Service...",HttpStatus.OK);
	}

}
