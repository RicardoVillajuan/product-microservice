package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Product;
import com.bank.repository.ProductRepository;
import com.bank.service.IProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

	private final IProductService productService;
	
	@GetMapping("/listproduct")
	public Flux<Product> findAll(){
		
		return productService.findAll();
	}
	
	@PostMapping("/update")
	public Mono<Product> saveProduct(@RequestBody Product product){
		
		return productService.save(product);
	}
	
	@PostMapping("/delete/{id}")
	void deleteProduct(@PathVariable String id){
		
		productService.deleteById(id);
	}
	
	@PostMapping("/save")
	public Mono<Product> saveTypeProduct(@RequestBody Product product){
		
		return productService.save(product);
	}
}
