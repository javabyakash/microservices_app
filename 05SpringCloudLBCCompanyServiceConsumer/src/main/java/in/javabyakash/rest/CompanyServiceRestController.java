package in.javabyakash.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.BranchServiceRestConsumer;

@RestController
@RequestMapping("/company")
public class CompanyServiceRestController {
	
	@Autowired
	private BranchServiceRestConsumer consumer;
	
	@GetMapping("/data")
	public String getBranchInfo() {
		return "COMPANY CONSUMES SERVICE "+consumer.getBranchInfo();
	}
}
