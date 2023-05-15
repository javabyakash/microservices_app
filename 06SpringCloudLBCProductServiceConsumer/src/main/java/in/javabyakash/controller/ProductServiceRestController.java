package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.PaymentServiceRestConsumer;

@RestController
@RequestMapping("/product")
public class ProductServiceRestController {
	
	@Autowired
	private PaymentServiceRestConsumer consumer;
	
	@GetMapping("/info")
	public String getProuctInfo() {
		return "Make this Product yours by paying via "+consumer.getPaymentInfo();
	}
}
