package com.springapps.sportyshoes.service;

import java.util.List;

import com.springapps.sportyshoes.entity.Product;

public interface productService {
	int save(Product product);
	List<Product> getProducts();
	Product getProduct(int productid);
}
