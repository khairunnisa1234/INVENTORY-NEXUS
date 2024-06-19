package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;

@Service
public class ProductDao {
	
	@Autowired		//Dependency Injection for ProductRepository
	ProductRepository prodRepo;

	public List<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	public Product getProductById(int prodId) {
		Product product = new Product(0, "Product Not Found", 0.0);
		return prodRepo.findById(prodId).orElse(product);
	}

	public Product addProduct(Product product) {
		return prodRepo.save(product);
	}

	public List<Product> getProductByName(String productName) {
		return prodRepo.findByName(productName);
	}

	public Product updateProduct(Product product) {
		return prodRepo.save(product);
	}

	public void deleteProductById(int prodId) {
		prodRepo.deleteById(prodId);
	}

	public void deleteAllProducts() {
		prodRepo.deleteAll();
	}
	
	

}




