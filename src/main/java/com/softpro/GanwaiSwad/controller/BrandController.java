package com.softpro.GanwaiSwad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.softpro.GanwaiSwad.Model.entity.BrandEntity;
import com.softpro.GanwaiSwad.Service.BrandService;

@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/admin/brand/add")
    public String addBrandPage(Model model) {

        model.addAttribute("brand", new BrandEntity());

        return "admin/brand/add";
    }

    @PostMapping("/admin/brand/save")
    public String saveBrand(@ModelAttribute("brand") BrandEntity brand) {

        brandService.save(brand);

        return "redirect:/admin/brand/show";
    }

    @GetMapping("/admin/brand/show")
    public String showBrands(Model model) {

        model.addAttribute("brands",
                brandService.getAllBrandEntities());

        return "admin/brand/show";
    }

    @GetMapping("/admin/brand/edit/{brand_id}")
    public String editBrand(@PathVariable Integer brand_id,
                            Model model) {

        model.addAttribute("brand",
                brandService.getBrandById(brand_id));

        return "admin/brand/edit";
    }

    @PostMapping("/admin/brand/update")
    public String updateBrand(@ModelAttribute BrandEntity brand) {

        brandService.Update(brand);

        return "redirect:/admin/brand/show";
    }

    @GetMapping("/admin/brand/delete/{brand_id}")
    public String deleteBrand(@PathVariable Integer brand_id) {

        BrandEntity brand = brandService.getBrandById(brand_id);

        brandService.deleteBrand(brand);

        return "redirect:/admin/brand/show";
    }

}