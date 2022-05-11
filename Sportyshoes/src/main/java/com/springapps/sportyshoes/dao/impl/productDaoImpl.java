package com.springapps.sportyshoes.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.sportyshoes.dao.productDao;
import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.User;

@Repository
public class productDaoImpl implements productDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int save(Product product) {
		return (int) this.hibernateTemplate.save(product);
	}

	@Override
	public List<Product> getProducts() {
		 List<Product> products = hibernateTemplate.loadAll(Product.class);
			return products;
	}

	@Override
	public Product getProduct(int productid) {
		Product product = hibernateTemplate.get(Product.class, productid);
		return product;
	}

	

}
