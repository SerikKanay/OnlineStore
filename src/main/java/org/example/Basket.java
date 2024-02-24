package org.example;

public class Basket {
    private  int itemid;
    private  int clientId;
    private int quantity;
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
}
