package com.softpro.GanwaiSwad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.softpro.GanwaiSwad.Model.entity.BrandEntity;
import com.softpro.GanwaiSwad.Model.entity.CategoryEntity;
import com.softpro.GanwaiSwad.Service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/admin/category/add")
    public String category(Model model) {

        model.addAttribute("category", new CategoryEntity());

        return "/admin/category/add";
    }

    @PostMapping("/admin/category/save")
    public String addCategory(@ModelAttribute("category") CategoryEntity category) {

        categoryService.save(category);

        return "redirect:/admin/category/show";
    }

    @GetMapping("/admin/category/show")
    public String categoryShow(Model model) {

        model.addAttribute("categorys",
                categoryService.getAllCategoryEntites());

        return "/admin/category/show";
    }

    @GetMapping("/admin/category/delete/{cat_id}")
    public String deleteCategory(@PathVariable Integer cat_id) {

        categoryService.getCategoryById(cat_id);

        return "redirect:/admin/category/show";
    }

    @GetMapping("/admin/category/edit/{cat_id}")
    public String editCategory(@PathVariable Integer cat_id,
                               Model model) {

        model.addAttribute("category",
                categoryService.getCategoryById(cat_id));

        return "/admin/category/edit";
    }

    @PostMapping("/admin/category/show")
    public String updateCategory(
            @ModelAttribute CategoryEntity category) {

        categoryService.Update(category);

        return "redirect:/admin/category/show";
    }

}