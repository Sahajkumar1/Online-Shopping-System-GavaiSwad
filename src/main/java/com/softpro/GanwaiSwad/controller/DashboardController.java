package com.softpro.GanwaiSwad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softpro.GanwaiSwad.Repository.BrandRepository;
import com.softpro.GanwaiSwad.Repository.CategoryRepository;
import com.softpro.GanwaiSwad.Repository.ProductRepository;

@Controller
public class DashboardController {
	
	   @Autowired
	    private ProductRepository productRepository;
	   @Autowired
	   private CategoryRepository categoryRepository;
	   @Autowired
	   private BrandRepository brandRepository;

    @GetMapping("/admin/dashboard")
    
    	public String dashboard(Model model) {

    	    model.addAttribute("totalProducts",
    	            productRepository.count());

    	    model.addAttribute("totalCategories",
    	            categoryRepository.count());
    	    
    	    model.addAttribute("totalBrands",
    	            brandRepository.count());

        return "admin/dashboard";

    }
   

}