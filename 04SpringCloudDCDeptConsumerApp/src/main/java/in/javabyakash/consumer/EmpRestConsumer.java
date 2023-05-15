package in.javabyakash.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmpRestConsumer {
	
	// 1. Autowired DiscoveryClient object
	@Autowired
	private DiscoveryClient client;

	public String getData() {
		// 2. Get Service Instance from Eureka using DiscoveryClient
		List<ServiceInstance> list = client.getInstances("EMPLOYEE-APP");
		
		// 3. Read one instance from list index#0
		ServiceInstance si = list.get(0);
		
		// 4. Read URI from SI
		URI uri = si.getUri();
		
		// 5. Create URL using URI and PATH
		String url = uri+"/emp/show";
		
		// 6. Create RestTemplate object
		RestTemplate rt = new RestTemplate();
		
		// 7. Make http call with EmpRestConsumer
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		// 8. Read body from responseEntity
		String body = responseEntity.getBody();
		
		// 9. Return back to Consumer's RestController
		return body;
	}

}
