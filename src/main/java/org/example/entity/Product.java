package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Table(name = "product")
@Entity
public class Product {
    @Getter
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Getter
    @Column(name = "name")
    private String ProductName;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cat_id")
    private Category category;

}
