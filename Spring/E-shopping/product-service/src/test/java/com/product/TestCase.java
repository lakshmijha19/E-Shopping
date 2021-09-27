package com.product;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.product.controller.ProductController;
import com.product.repository.ProductRepository;

public class TestCase extends ProductServiceApplicationTests 
{	
	@Mock
    private ProductRepository repository;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
		new ProductController();
	}
	
	private void initMocks(TestCase testCase) {}

	@Test
	public void getProducts()
	{}
}
