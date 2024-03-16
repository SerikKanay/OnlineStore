package org.example.dto;

public class ProductDTO {
    private String name;
    private Long category;

    public ProductDTO(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }
    public ProductDTO(String name){
        this.name=name;
    }
}
