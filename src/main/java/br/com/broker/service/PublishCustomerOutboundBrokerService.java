package br.com.broker.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.broker.bean.Customer;
import br.com.broker.config.BrokerOutput;
import br.com.broker.port.PortOutbound;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@EnableBinding(BrokerOutput.class)
public class PublishCustomerOutboundBrokerService implements PortOutbound {

	private static final long serialVersionUID = -6435658138064433047L;
	
	private final BrokerOutput output;
	
	@Override
	public void sendMessageCustomer(Customer customer) {
		Message<Customer> msg = MessageBuilder.withPayload(customer).build();
		output.publishCustomerExchange().send(msg);
	}

}
