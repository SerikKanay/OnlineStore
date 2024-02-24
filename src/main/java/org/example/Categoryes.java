package org.example;

public class Categoryes {
    private int categoryid;
    private String categoryName;

    public Categoryes(int categoryid,String categoryName){
        this.categoryid=categoryid;
        this.categoryName=categoryName;
    }
    public int getCategoryid(){
        return categoryid;
    }
    public void setCategoryid(int categoryid){
        this.categoryid=categoryid;
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }
}
