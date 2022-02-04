package com.bank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "typeproduct")
public class TypeProduct {
	
	@Id
	private String id;
	private String nameproduct;
	
	
	
	 
	 
}
