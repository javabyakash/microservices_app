package in.javabyakash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	@GetMapping("/data")
	public String getEmployeeDetails() {
		return "EMPLOYEE DETAILS SAVED SUCCESSFULLY!";
	}
}
