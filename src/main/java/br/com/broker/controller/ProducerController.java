package br.com.broker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.broker.bean.Customer;
import br.com.broker.service.PublishCustomerOutboundBrokerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class ProducerController {
	
	private final PublishCustomerOutboundBrokerService publishCustomerOutboundBrokerService;

	@PostMapping("/producer")
	@ResponseBody
	public ResponseEntity<String> producer(@RequestBody Customer request) {
		Long id = request.getId();
		log.debug("POST producer - " + id + " - Start -> request: " + request.toString());

		try {
			publishCustomerOutboundBrokerService.sendMessageCustomer(request);

			return new ResponseEntity<>("OK", HttpStatus.OK);
		} catch (Exception e) {
			log.error("POST producer - " + id + " - Error: " + e.getMessage());
			log.error("ID: " + id, e);
			return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
