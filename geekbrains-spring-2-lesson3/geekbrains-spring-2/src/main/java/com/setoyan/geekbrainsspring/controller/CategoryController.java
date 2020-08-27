package com.setoyan.geekbrainsspring.controller;

import com.setoyan.geekbrainsspring.persist.repo.ProductBrandRepository;
import com.setoyan.geekbrainsspring.persist.service.ProductService;
import com.setoyan.geekbrainsspring.persist.repo.ProductColorRepository;
import com.setoyan.geekbrainsspring.persist.repo.ProductTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * categoryController
 */
@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private ProductColorRepository productColorRepository;
    @Autowired
    private ProductBrandRepository productBrandRepository;
    @Autowired
    private ProductService productService;

    @GetMapping
    public String showCategory(Model model) {
        model.addAttribute("productTypes", productTypeRepository.findAll());
        model.addAttribute("productColors", productColorRepository.findAll());
        model.addAttribute("productBrands", productBrandRepository.findAll());
        model.addAttribute("products", productService.findAll());
        return "category";
    }
}
