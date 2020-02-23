package com.niitapp.petsworld.dao;

import java.util.List;

import com.niitapp.petsworld.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(String productId);

	void deleteProduct(String productId);

	void addProduct(Product product);
	
	void editProduct(Product product);
	
}
