package com.mayur.spring.springorm.entity.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mayur.spring.springorm.product.dao.ProductDao;
import com.mayur.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springorm/entity/product/test/Config.xml");
		ProductDao dao = (ProductDao) context.getBean("productdao");
		// Product product = new Product();
//		product.setId(1);
//		product.setName("nokia");
//		product.setDesc("good product");
//		product.setPrice(200);

		// dao.create(product);
		// dao.update(product);
		// dao.delete(product);

//		Product result = dao.find(2);
//	System.out.println(result);
		List<Product> result = dao.findAll();
		System.out.println(result);
	}
}
