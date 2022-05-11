package com.springapps.sportyshoes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.sportyshoes.dao.productDao;
import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.User;
import com.springapps.sportyshoes.service.productService;

@Service
public class ProductServiceImpl implements productService {

	@Autowired
	private productDao productdao;

	@Override
	@Transactional
	public int save(Product product) {
		return productdao.save(product);
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = (List<Product>) productdao.getProducts();
		return products;
	}

	@Override
	public Product getProduct(int productid) {
		Product product=productdao.getProduct(productid);
		return product;
	}

	
}
