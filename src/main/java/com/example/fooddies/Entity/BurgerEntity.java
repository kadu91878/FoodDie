package com.example.fooddies.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class BurgerEntity {
    @Id
    private Integer id;
    private String name;
    private String picture;
    private String instructions;
    private String ingredients;
    private String description;

}
