package org.example.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    public Category(){
    }
    public Category(long id,String name){
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Product> getProductlist() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @OneToMany(mappedBy = "category")
    private  List<Product> productList;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
