package org.example.controller;

import org.example.aspect.ToLog;
import org.example.dto.CategoryDTO;
import org.example.dto.ProductDTO;
import org.example.dto.UserDTO;
import org.example.entity.Category;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.example.service.CategoryService;

import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final ProductService productService;
    private final CategoryService categoryService;
    private final UserService userService;
    public HomeController(ProductService productService, CategoryService categoryService, UserService userService){
        this.categoryService=categoryService;
        this.productService=productService;
        this.userService = userService;
    }

    @GetMapping
    public String getHome() {
        return "Hello Welcome Home!";
    }
    @ToLog
    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "hello welcome"+name+"!!!";
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }
    @ToLog
    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/category")
    public String addCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.addCategory(categoryDTO);
    }
    @PostMapping("/user")
    public String addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
}
