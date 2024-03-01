package org.example.controller;

import org.example.dto.CategoryDTO;
import org.example.dto.ProductDTO;
import org.example.entity.Category;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.example.service.CategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final ProductService productService;
    private final CategoryService categoryService;
    public HomeController(ProductService productService,CategoryService categoryService){
        this.categoryService=categoryService;
        this.productService=productService;
    }

    @GetMapping
    public String getHome() {
        return "Hello Welcome Home!";
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }
    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/category")
    public String addCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.addCategory(categoryDTO);
    }
    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
}
