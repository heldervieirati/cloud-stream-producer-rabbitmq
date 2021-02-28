package br.com.broker.bean;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Customer implements Serializable {

	private static final long serialVersionUID = -2986254117985413841L;
	
	private Long id;
	
	private String name;
	
	private String endereco;
	
	private String sexo;
	
	@Override
	public String toString() {
		return super.toString();
	}
}

