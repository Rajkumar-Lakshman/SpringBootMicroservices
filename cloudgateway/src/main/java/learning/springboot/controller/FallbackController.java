package learning.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	@RequestMapping(value="/userFallBack")
	public Mono<String> userServiceFallBack(){
		return Mono.just("User service is taking too long to respond or is down.Please try after sometime");
	}
	
	@RequestMapping(value="/orderFallBack")
	public Mono<String> orderServiceFallBack(){
		return Mono.just("Order service is taking too long to respond or is down.Please try after sometime");
	}
	
	@RequestMapping(value="/paymentFallBack")
	public Mono<String> paymentServiceFallBack(){
		return Mono.just("Payment service is taking too long to respond or is down.Please try after sometime");
	}

}
