package in.javabyakash.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BranchServiceRestConsumer {

	// 1. Autowired LoadBalancerClient
	@Autowired
	private LoadBalancerClient client;

	public String getBranchInfo() {
		// 2. Read SI
		ServiceInstance si = client.choose("BRANCH-SERVICE");
		
		// 3. Read URI
		URI uri = si.getUri();
		
		// 4. Create URL (URI+PATH)
		String url = uri+"/branch/info";
		
		// 5. Create RestTemplate Object to make http call
		RestTemplate rt = new RestTemplate();
		
		// 6. Make Http Call
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		// 7. Get Body
		String body = response.getBody();
		
		// 8. Return
		return body;
	}

}
