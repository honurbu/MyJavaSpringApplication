package com.project.myJava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.Product;
import com.project.myJava.repositories.ProductRepository;
import com.project.myJava.services.Implements.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository _productRepository;
	
	@Override
	public void addProduct(Product product) {
		_productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return _productRepository.findAll();
	}

	@Override
	public Product getProductId(int productId) {
		
		return _productRepository.findById(productId).orElse(null);
		
	}

}
