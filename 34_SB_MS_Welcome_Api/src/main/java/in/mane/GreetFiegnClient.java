package in.mane;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//(1) name => Only alphanumeric characters and hyphens [-a-zA-Z0-9] (2) No underscores _ (3) Cannot start or end with a hyphen

//@FeignClient(url = "http://localhost:9091/",  name = "greet") //working
@FeignClient(name = "GREET-API") // service name (Recommended)
public interface GreetFiegnClient {

	@GetMapping("/greet")
	public String invokeGreetApi();
}
