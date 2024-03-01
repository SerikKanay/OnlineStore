package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoryes {
    private int categoryid;
    private String categoryName;

    public Categoryes(int categoryid,String categoryName){
        this.categoryid=categoryid;
        this.categoryName=categoryName;
    }
    List<Product> product = new ArrayList<>();
    public Categoryes(){
    }
    public Categoryes(Product p){
      product.add(p);
    }
    public int getCategoryid(){
        return categoryid;
    }
    public void setCategoryid(int categoryid){
        this.categoryid=categoryid;
    }

    public List<Product> getProduct() {
        return product;
    }
    public void  addProduct(Product p){
        product.add(p);
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }
    @Override
    public String toString(){
        return "Category{ id: "+categoryid+"Name: "+categoryName+" \n product"+product+" }";
    }
}
