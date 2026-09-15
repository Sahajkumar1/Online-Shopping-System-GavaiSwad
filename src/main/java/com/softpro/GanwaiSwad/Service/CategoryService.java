package com.softpro.GanwaiSwad.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpro.GanwaiSwad.Model.entity.CategoryEntity;
import com.softpro.GanwaiSwad.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryRepository categoryRepository;
	
	//Insert the Category
	public CategoryEntity save(CategoryEntity category) {
		return  categoryRepository.save(category);
	}
	
	//Select all  Category
	public List<CategoryEntity> getAllCategoryEntites(){
		return categoryRepository.findAll();
	}
	
	//Delete Method
	public void deleteCategory(CategoryEntity category) {
		categoryRepository.delete(category);
	}

	//Select Category 
	public CategoryEntity getCategoryById(Integer id) {
		return categoryRepository.findById(id).orElse(null);
	}
	
	//Update Category
	
	public CategoryEntity Update(CategoryEntity category) {
		return categoryRepository.save(category);
	}
}
