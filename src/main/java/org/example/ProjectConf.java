package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConf {
    @Bean
    public Product product() {
        return new Product(1, "Iphone", 350000);
    }

    @Bean
    public Categoryes category() {
        return new Categoryes(1, "samsung");
    }
}
