package com.softpro.GanwaiSwad.Service;

import com.softpro.GanwaiSwad.Repository.BrandRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpro.GanwaiSwad.Model.entity.BrandEntity;
import com.softpro.GanwaiSwad.Model.entity.ProductEntity;
import com.softpro.GanwaiSwad.Repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	public ProductRepository productRepository;

	
	  // Insert the User
	 public ProductEntity save(ProductEntity product) {
		 return productRepository.save(product);
	 }
	 
	 // Select all User
	 public List<ProductEntity> getAllProductEntities(){
		 return productRepository.findAll(); 
}
	 
	  // Delete Method
	 
 public void deleteProduct(ProductEntity product) {
		 productRepository.delete(product);
	 }

	    //Select Brand
 
 public ProductEntity getProductById(Integer id) {
	 return productRepository.findById(id).orElse(null);
}
	 
	 //Update User 
	 public ProductEntity Update(ProductEntity product) {
		 return productRepository.save(product);
	 }
}