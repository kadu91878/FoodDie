package com.example.fooddies.Aplication.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BurgersUploadRequest {

    private  String name;
    private  String picture;
    private  String instructions;
    private  String ingredients;
    private  String description;
}
