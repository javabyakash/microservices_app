package in.javabyakash.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vender")
public class VenderServiceRestController {

	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/info")
	public ResponseEntity<String> getVenderInfo(){
		return ResponseEntity.ok("WELCOME TO VENDER APP! : PORT - "+port);
	}
}
