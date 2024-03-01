package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

public class  Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConf.class);
        Categoryes cat = (Categoryes) context.getBean("Category");
        System.out.println(cat);

        Product product1 =(Product) context.getBean("Product1");
        System.out.println(product1);

        Product product2 =(Product) context.getBean("Product2");
        System.out.println(product2);

        Basket basket = (Basket) context.getBean("Basket");
        System.out.println(basket);

        Client client = (Client) context.getBean("Client");
        System.out.println(client);
    }
}