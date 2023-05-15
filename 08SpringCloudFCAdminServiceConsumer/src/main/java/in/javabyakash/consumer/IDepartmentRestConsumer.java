package in.javabyakash.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("DEPT-SERVICE")
public interface IDepartmentRestConsumer {
	
	@GetMapping("/dept/info")
	public ResponseEntity<String> getDeptInfo();
}
