package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service03ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service03ApiGatewayApplication.class, args);
	}

}
