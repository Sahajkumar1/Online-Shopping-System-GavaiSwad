package com.softpro.GanwaiSwad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.softpro.GanwaiSwad.Model.entity.ProductEntity;
import com.softpro.GanwaiSwad.Repository.BrandRepository;
import com.softpro.GanwaiSwad.Repository.CategoryRepository;
import com.softpro.GanwaiSwad.Repository.ProductRepository;
import com.softpro.GanwaiSwad.Service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    // =========================
    // Add Product Page
    // =========================
    @GetMapping("/admin/product/add")
    public String addProductPage(Model model) {

        model.addAttribute("product", new ProductEntity());

        // Dashboard Counts
        model.addAttribute("totalProducts", productRepository.count());
        model.addAttribute("totalCategories", categoryRepository.count());
        model.addAttribute("totalBrands", brandRepository.count());

        // Dropdown Data
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("brands", brandRepository.findAll());

        return "admin/product/add";
    }

    // =========================
    // Save Product
    // =========================
    @PostMapping("/admin/product/save")
    public String saveProduct(@ModelAttribute("product") ProductEntity product) {

        productService.save(product);

        return "redirect:/admin/product/show";
    }

    // =========================
    // Show Products
    // =========================
    @GetMapping("/admin/product/show")
    public String showProducts(Model model) {

        model.addAttribute("products",
                productService.getAllProductEntities());

        return "admin/product/show";
    }

    // =========================
    // Edit Product
    // =========================
    @GetMapping("/admin/product/edit/{product_id}")
    public String editProduct(@PathVariable Integer product_id,
                              Model model) {

        model.addAttribute("product",
                productService.getProductById(product_id));

        // Dropdown Data
        model.addAttribute("categories",
                categoryRepository.findAll());

        model.addAttribute("brands",
                brandRepository.findAll());

        return "admin/product/edit";
    }

    // =========================
    // Update Product
    // =========================
    @PostMapping("/admin/product/update")
    public String updateProduct(@ModelAttribute ProductEntity product) {

        productService.Update(product);

        return "redirect:/admin/product/show";
    }

    // =========================
    // Delete Product
    // =========================
    @GetMapping("/admin/product/delete/{product_id}")
    public String deleteProduct(@PathVariable Integer product_id) {

        ProductEntity product =
                productService.getProductById(product_id);

        productService.deleteProduct(product);

        return "redirect:/admin/product/show";
    }

}