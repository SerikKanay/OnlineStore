package org.example;

public class Client {
    private int id;
    private String name;
    private String address;
    private Number phone;

    public Client(int id,String name,String address,Number phone){
        this.id =id;
        this.name=name;
        this.address=address;
        this.phone = phone;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Number getPhone(){
        return phone;
    }
    public void setPhone(Number phone){
        this.phone = phone;
    }
}
