package br.com.broker.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface BrokerOutput {
	
	String EXCHANGE_CUSTOMER = "publishCustomerExchange";
	
	@Output(BrokerOutput.EXCHANGE_CUSTOMER)
	MessageChannel publishCustomerExchange();
	
}
