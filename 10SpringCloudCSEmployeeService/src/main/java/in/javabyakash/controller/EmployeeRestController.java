package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmployeeRestController {
	@Value("${my.app.name}")
	private String title;
	
	@GetMapping("/showAppName")
	public ResponseEntity<String> showTitle(){
		return new ResponseEntity<>("Emp Service Gets App Name : '"+title+"' From ConfiServer",HttpStatus.OK);
	}
}
