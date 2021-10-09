package com.casestudy;

import org.junit.Before;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.order.controller.OrderController;
import com.order.repository.OrderRepository;

public class TestCase extends OrderMicroserviceApplicationTests
{
	@Mock
    private OrderRepository repository;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
		new OrderController();
	}
	
	private void initMocks(TestCase testCase) {}

	@Test
	@Order(1)
	public void getAllOrders()
	{}
}
