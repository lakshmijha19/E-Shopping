package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductCategory;
import com.product.repository.ProductCategoryRepository;

@RestController
@RequestMapping(path = "category")
public class ProductCategoryController 
{
	@Autowired
	private ProductCategoryRepository repository;
	
	@GetMapping("/get")
	public List<ProductCategory> getProductCategory()
	{
		return repository.findAll();
	}
	
}
