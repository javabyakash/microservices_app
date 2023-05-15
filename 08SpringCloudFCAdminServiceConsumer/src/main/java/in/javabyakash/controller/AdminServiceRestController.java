package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.IDepartmentRestConsumer;

@RestController
@RequestMapping("/admin")
public class AdminServiceRestController {
	
	@Autowired
	private IDepartmentRestConsumer consumer;
	
	@GetMapping("/info")
	public String getDeptInfo() {
		return "ADMING SERVICE CALLING "+consumer.getDeptInfo().getBody();
	}
}
