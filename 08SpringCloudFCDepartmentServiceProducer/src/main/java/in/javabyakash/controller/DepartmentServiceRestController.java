package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentServiceRestController {
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/info")
	public ResponseEntity<String> getDeptInfo(){
		return ResponseEntity.ok("DEPARTMENT SERVICE! PORT - "+port);
	}
}
