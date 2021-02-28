package br.com.broker.bean;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer implements Serializable {

	private static final long serialVersionUID = -2986254117985413841L;
	
	private Long id;
	
	private String name;
	
	private String endereco;
	
	private String sexo;

}

