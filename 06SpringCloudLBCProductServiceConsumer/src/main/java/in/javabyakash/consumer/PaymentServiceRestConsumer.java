package in.javabyakash.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentServiceRestConsumer {
	
	//1. Autowired LoadBalancerClient
	@Autowired
	private LoadBalancerClient client;
	
	public String getPaymentInfo() {
		//2. Get SI from Eureka using SID
		ServiceInstance si = client.choose("PAYMENT-SERVICE");	
		
		//3. Read URI
		URI uri = si.getUri();
		
		//4. Create URL (URI+Path)
		String url = uri+"/payment/info";
		
		//5. Create RestTemplate object to make Http call
		RestTemplate rt = new RestTemplate();
		
		//6. Make Http call
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		//7. Read body
		String body = responseEntity.getBody();
		
		//8. Return
		return body;
	}
	
}
