package com.project.myJava.services.Implements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.Product;

@Service
public interface IProductService {
	 	
		void addProduct(Product product);
	    List<Product> getAllProducts();
	    Product getProductId(int productId);
}
