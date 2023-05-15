package in.javabyakash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@GetMapping("/show")
	public String getPaymentDetails() {
		return "PAYMENT SUCCESSFULLY DONE!";
	}
	
}
