package br.com.broker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

@SpringBootApplication(exclude = RabbitAutoConfiguration.class)
public class CloudStreamProducerRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamProducerRabbitmqApplication.class, args);
	}

}
