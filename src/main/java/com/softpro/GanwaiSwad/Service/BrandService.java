package com.softpro.GanwaiSwad.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpro.GanwaiSwad.Model.entity.BrandEntity;
import com.softpro.GanwaiSwad.Repository.BrandRepository;


@Service
public class BrandService {
	@Autowired
	public BrandRepository brandRepository;
	
	// Insert the User 
	public BrandEntity save(BrandEntity brand) {
		return brandRepository.save(brand);
	}
	// Select all User
	public List<BrandEntity> getAllBrandEntities(){
		return brandRepository.findAll();
	}
	
	//Delete Method
	public void deleteBrand(BrandEntity brand) {
		brandRepository.delete(brand);
	}
	
	//Select Brand
	public BrandEntity getBrandById(Integer id) {
		return brandRepository.findById(id).orElse(null);
		
	}
	
	//Update User
	public BrandEntity Update(BrandEntity brand) {
		return brandRepository.save(brand);
	}

}
