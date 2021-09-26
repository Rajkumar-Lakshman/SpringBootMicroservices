package learning.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderServiceController {
	
	private Logger log = LoggerFactory.getLogger(OrderServiceController.class);
	
	@RequestMapping("/test")
	public ResponseEntity<String> test(){
		log.info("OrderService - test endpoint called");
		return new ResponseEntity<String>("Hey there! I am from Order Service...",HttpStatus.OK);
	}

}
