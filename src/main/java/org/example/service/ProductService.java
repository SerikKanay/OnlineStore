package org.example.service;

import org.example.dto.ProductDTO;
import org.example.entity.Category;
import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    private final CategoryService categoryService;

    public ProductService(ProductRepository repository, CategoryService categoryService) {
        this.repository = repository;
        this.categoryService = categoryService;
    }

    public String addProduct(ProductDTO dto) {
        if (!dto.getName().isBlank() && dto.getName().length() > 3) {
            Product product = new Product();
            product.setProductName(dto.getName());

            Category category = categoryService.getCategoryById(dto.getCategory());
            product.setCategory(category);

            repository.save(product);
        }
        return "ADDED";
    }

    public List<Product> getAllProduct() {
        return repository.findAll();
    }
}
