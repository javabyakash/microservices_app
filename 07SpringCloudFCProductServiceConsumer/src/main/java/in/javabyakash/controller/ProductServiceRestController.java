package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.IVenderRestConsumer;

@RestController
@RequestMapping("/product")
public class ProductServiceRestController {
	
	@Autowired
	private IVenderRestConsumer consumer;
	
	@GetMapping("/info")
	public String getVenderInfo() {
		ResponseEntity<String> venderInfo = consumer.getVenderInfo();
		return "PRODUCT SERVICE : "+venderInfo.getBody();
	}
}
