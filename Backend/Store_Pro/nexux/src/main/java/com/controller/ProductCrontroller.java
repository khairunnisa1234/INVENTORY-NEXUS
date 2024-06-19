package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.model.Product;

@RestController
public class ProductCrontroller {

	@Autowired
	ProductDao prodDao;
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducts() {
		return prodDao.getAllProducts();
	}
	
	@GetMapping("getProductById/{id}")
	public Product getProductById(@PathVariable("id") int prodId) {
		return prodDao.getProductById(prodId);
	}
	
	@PostMapping("addProduct")
	public Product addProduct(@RequestBody Product product) {
		return prodDao.addProduct(product);
	}
	
	@GetMapping("getProductByName/{prodName}")
	public List<Product> getProductByName(@PathVariable("prodName") String prodName) {
		return prodDao.getProductByName(prodName);
	}
	
	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return prodDao.updateProduct(product);
	}
	
	@DeleteMapping("deleteProductById/{prodId}")
	public String deleteProductById(@PathVariable("prodId") int prodId) {
		prodDao.deleteProductById(prodId);
		return "Product Deleted Successfully!!";
	}
	
	@DeleteMapping("deleteAllProducts")
	public String deleteAllProducts() {
		prodDao.deleteAllProducts();
		return "All Products Deleted Successfully!!";
	}
}








