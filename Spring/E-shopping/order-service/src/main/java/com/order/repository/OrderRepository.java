package com.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.order.document.Order;

public interface OrderRepository extends MongoRepository<Order,Integer>
{

}
