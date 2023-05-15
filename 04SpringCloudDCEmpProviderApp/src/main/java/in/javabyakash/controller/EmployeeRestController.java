package in.javabyakash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@GetMapping("/show")
	public ResponseEntity<String> getEmpInfo() {
		return ResponseEntity.ok("FROM EMPLOYEE SERVICE!");
	}

}
