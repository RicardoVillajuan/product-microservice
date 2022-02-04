package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.TypeProduct;
import com.bank.repository.TypeProductRepository;
import com.bank.service.ITypeProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class TypeProductController {

	private final ITypeProductService typeProductService;
	
	@GetMapping("/gettypeproduct")
	public Flux<TypeProduct> findAll(){
		
		return typeProductService.findAll();
	}
	
	@GetMapping("/getname/{nameproduct}")
	public Flux<TypeProduct> findByName(@PathVariable("nameproduct") String nameproduct){
		
		return typeProductService.findTypeProductByName(nameproduct);
	}
	
	@PostMapping("/save")
	public Mono<TypeProduct> saveTypeProduct(@RequestBody TypeProduct typeProduct){
		
		return typeProductService.save(typeProduct);
	}
}
