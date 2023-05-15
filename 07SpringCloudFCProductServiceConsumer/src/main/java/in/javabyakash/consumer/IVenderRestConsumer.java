package in.javabyakash.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VENDER-SERVICE")
public interface IVenderRestConsumer {
	
	@GetMapping("/vender/info")
	public ResponseEntity<String> getVenderInfo();
	
}
