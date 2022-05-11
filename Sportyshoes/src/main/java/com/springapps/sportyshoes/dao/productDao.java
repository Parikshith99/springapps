package com.springapps.sportyshoes.dao;


import java.util.List;

import com.springapps.sportyshoes.entity.Product;

public interface productDao {
	int save(Product product);

	List<Product> getProducts();

	Product getProduct(int productid);
	
}
