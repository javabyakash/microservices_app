package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentServiceRestController {
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/info")
	public String getPaymentInfo() {
		return "Debit Card, Cash On Delivery, UPI(PhonePay/GPay) and EMI : Port "+port ;
	}
}
