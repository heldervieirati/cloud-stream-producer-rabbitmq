package br.com.broker.port;

import java.io.Serializable;

import br.com.broker.bean.Customer;

public interface PortOutbound extends Serializable {
	void sendMessageCustomer(Customer customer);
}
