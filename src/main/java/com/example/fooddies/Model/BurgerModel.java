package com.example.fooddies.Model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BurgerModel {
    @Id
    private Integer id;
    private String name;
    private String picture;
    private String instructions;
    private String ingredients;
    private String description;
}
