package in.javabyakash.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchServiceRestController {
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/info")
	public String getBranchInfo() {
		return "FROM BRANCH INFO RUNNING ON SERVER PORT : "+port;
	}
	
}
