package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@RestController
@RequestMapping(path = "products")
public class ProductController 
{
		@Autowired
		private ProductRepository repository;
		
		@GetMapping(produces = "application/json")
		public List<Product> getProducts()
		{
			return repository.findAll();
		}
		
		@GetMapping(value="/category/{id}", produces = "application/json")
		public List<Product> getProductCategoryById(@PathVariable Long id)
		{
			return repository.findByCategoryId(id);
		}
}
