package org.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
public class ProjectConf {
    int id = 1;
  @Bean("Category")
   Categoryes getCategory(){
     Categoryes cat =new Categoryes();
        cat.setCategoryid(1);
        cat.setCategoryName("Телефоны");
        cat.addProduct(telephone());
        return cat;
  }
  @Bean("Product1")
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Product telephone(){
      return new Product(id++,"Samsung",245000);
  }
  @Bean("Product2")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Product telephone2(){
      return new Product(id++,"Iphone",659999);
  }
  @Bean("Basket")
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Basket basket() {
      Basket basket = new Basket();
      basket.setItemid(1);
      basket.setClientId(1);
      basket.setQuantity(2);

      basket.addProduct(telephone());
      basket.addProduct(telephone2());
      return basket;
  }
  @Bean("Client")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Client client(){
      return new Client(1,"Serik","Street Pyatnizkogo",712326567);
  }
}