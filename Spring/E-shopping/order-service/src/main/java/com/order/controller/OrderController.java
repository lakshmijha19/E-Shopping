package com.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.document.Order;
import com.order.repository.OrderRepository;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderRepository repository;
	
	
	@PostMapping("/bookOrder")
	public void addOrder(@RequestBody Order order) {
		repository.save(order);
	}
	
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders(){
		List<Order> orders= new ArrayList<>();
		repository.findAll().forEach(orders::add);
		return orders;
	}
	
}

