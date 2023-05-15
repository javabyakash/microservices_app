package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.javabyakash.consumer.EmpRestConsumer;

@RestController
@RequestMapping("/dept")
public class DeptRestController {
	
	@Autowired
	private EmpRestConsumer consumer;
	
	@GetMapping("/show")
	public ResponseEntity<String> getDeptInfo(){
		String data = consumer.getData();
		return ResponseEntity.ok("FROM DEPT SERVICE! "+data);
	}

}
