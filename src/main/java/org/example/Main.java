package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

public class  Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConf.class);
        Product product = context.getBean(Product.class);
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());

        Categoryes category = context.getBean(Categoryes.class);
        System.out.println("Category ID: " + category.getCategoryid());
        System.out.println("Category Name: " + category.getCategoryName());
    }
}