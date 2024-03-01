package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private  int itemid;
    private  int clientId;
    private int quantity;
    private List<Product> products = new ArrayList<>();
    public Basket(){
        super();
    }
    public Basket(int itemid, int clientId,int quantity){
        super();
        this.itemid=itemid;
        this.clientId=clientId;
        this.quantity=quantity;
    }
    public int getItemid(){
        return itemid;
    }
    public void setItemid(int itemid){
        this.itemid=itemid;
    }
    public int getClientId(){
        return clientId;
    }
    public void setClientId(int clientId){
        this.clientId=clientId;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemid=" + itemid +
                ", clientId=" + clientId +
                ", quantity=" + quantity +
                ", products=" + products +
                '}';
    }
}
