package com.mayur.spring.springorm.entity.product.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mayur.spring.springorm.product.dao.ProductDao;
import com.mayur.spring.springorm.product.entity.Product;


@Component("productdao")
public class ProductDaoimpl implements ProductDao {
  
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}


	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);	
	}


	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}


	@Override
	public Product find(int id) {
		Product product = hibernateTemplate.get(Product.class,id);
		return product;
	}


	@Override
	public List<Product> findAll() {
		List<Product> result = hibernateTemplate.loadAll(Product.class);
		return result;
	}

}
