package br.com.broker.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({ BrokerOutput.class})
public class BrokerConfig {

}